/**
 * Project: imcaptcha
 * 
 * File Created at 2013-1-17
 * $Id$
 * 
 * Copyright 2010 dianping.com.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Dianping Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with dianping.com.
 */
package com.dianping.imcaptcha.strategy;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

import com.jhlabs.image.ImageMath;
import com.jhlabs.image.TransformFilter;

/**
 * TODO Comment of WaveFilter
 * 
 * @author yihua.huang
 * 
 */
public class WaveFilter extends TransformFilter {

	private float factor = 50;

	/**
	 * 
	 */
	public WaveFilter() {
		super();
	}

	/**
	 * @param factor
	 * @param radius
	 */
	public WaveFilter(float factor, float radius) {
		super();
		this.factor = factor;
	}

	public BufferedImage filter(BufferedImage src, BufferedImage dst) {
		int width = src.getWidth();
		int height = src.getHeight();
		int type = src.getType();
		WritableRaster srcRaster = src.getRaster();

		originalSpace = new Rectangle(0, 0, width, height);
		transformedSpace = new Rectangle(0, 0, width, height);
		transformSpace(transformedSpace);

		if (dst == null) {
			ColorModel dstCM = src.getColorModel();
			dst = new BufferedImage(dstCM, dstCM.createCompatibleWritableRaster(transformedSpace.width,
					transformedSpace.height), dstCM.isAlphaPremultiplied(), null);
		}
		WritableRaster dstRaster = dst.getRaster();

		int[] inPixels = getRGB(src, 0, 0, width, height, null);

		if (interpolation == NEAREST_NEIGHBOUR)
			return filterPixelsNN(dst, width, height, inPixels, transformedSpace);

		int srcWidth = width;
		int srcHeight = height;
		int srcWidth1 = width - 1;
		int srcHeight1 = height - 1;
		int outWidth = transformedSpace.width;
		int outHeight = transformedSpace.height;
		int outX, outY;
		int index = 0;
		int[] outPixels = new int[outWidth];
		float radius = srcHeight * 1.0f / 2 / (float) Math.PI;
		outX = transformedSpace.x;
		outY = transformedSpace.y;
		float[] out = new float[2];

		for (int y = 0; y < outHeight; y++) {
			for (int x = 0; x < outWidth; x++) {
				transformInverse(outX + x, outY + y, out, radius);
				int srcX = (int) Math.floor(out[0]);
				int srcY = (int) Math.floor(out[1]);
				float xWeight = out[0] - srcX;
				float yWeight = out[1] - srcY;
				int nw, ne, sw, se;

				if (srcX >= 0 && srcX < srcWidth1 && srcY >= 0 && srcY < srcHeight1) {
					// Easy case, all corners are in the image
					int i = srcWidth * srcY + srcX;
					nw = inPixels[i];
					ne = inPixels[i + 1];
					sw = inPixels[i + srcWidth];
					se = inPixels[i + srcWidth + 1];
				} else {
					// Some of the corners are off the image
					nw = getPixel(inPixels, srcX, srcY, srcWidth, srcHeight);
					ne = getPixel(inPixels, srcX + 1, srcY, srcWidth, srcHeight);
					sw = getPixel(inPixels, srcX, srcY + 1, srcWidth, srcHeight);
					se = getPixel(inPixels, srcX + 1, srcY + 1, srcWidth, srcHeight);
				}
				outPixels[x] = ImageMath.bilinearInterpolate(xWeight, yWeight, nw, ne, sw, se);
			}
			setRGB(dst, 0, y, transformedSpace.width, 1, outPixels);
		}
		return dst;
	}

	final private int getPixel(int[] pixels, int x, int y, int width, int height) {
		if (x < 0 || x >= width || y < 0 || y >= height) {
			switch (edgeAction) {
			case ZERO:
			default:
				return 0;
			case WRAP:
				return pixels[(ImageMath.mod(y, height) * width) + ImageMath.mod(x, width)];
			case CLAMP:
				return pixels[(ImageMath.clamp(y, 0, height - 1) * width) + ImageMath.clamp(x, 0, width - 1)];
			}
		}
		return pixels[y * width + x];
	}

	/**
	 * (non-Jsdoc)
	 * 
	 * @see com.jhlabs.image.TransformFilter#transformInverse(int, int, float[])
	 */
	@Override
	protected void transformInverse(int x, int y, float[] out) {
	}

	protected void transformInverse(int x, int y, float[] out, float radius) {
		out[0] = (float) (x - factor * Math.sin(y / radius));
		out[1] = y;
	}

}
