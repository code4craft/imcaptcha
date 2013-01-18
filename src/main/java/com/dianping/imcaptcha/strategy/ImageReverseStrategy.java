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

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;

import com.dianping.imcaptcha.service.ImageStorageService;

/**
 * TODO Comment of ImageReverseStrategy
 * 
 * @author yihua.huang
 * 
 */
public class ImageReverseStrategy implements ImageProcessStrategy {

	@Autowired
	private ImageStorageService imageStorageService;

	/**
	 * (non-Jsdoc)
	 * 
	 * @see com.dianping.imcaptcha.strategy.ImageProcessStrategy#getImage()
	 */
	@Override
	public ImageAnswerPair getImage() {
		int answer = 0;
		ReverseWaveFilter filter = new ReverseWaveFilter();
		BufferedImage bufferedImage = imageStorageService.getModified();
		filter.filter(bufferedImage, bufferedImage);
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		try {
			ImageIO.write(bufferedImage, "jpg", bs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ImageAnswerPair(new ByteArrayInputStream(bs.toByteArray()),
				answer);
	}

	/**
	 * (non-Jsdoc)
	 * 
	 * @see com.dianping.imcaptcha.strategy.ImageProcessStrategy#isValid(int,
	 *      int)
	 */
	@Override
	public boolean isValid(int userAnswer, int standardAnswer) {
		return false;
	}

}
