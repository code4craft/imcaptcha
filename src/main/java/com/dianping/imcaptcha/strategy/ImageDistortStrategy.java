package com.dianping.imcaptcha.strategy;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dianping.imcaptcha.service.ImageStorageService;

/**
 * @author yihua.huang@dianping.com
 * @date 2013-1-17
 */
@Component
public class ImageDistortStrategy implements ImageProcessStrategy {

	/**
	 * 
	 */
	private static final int THRESHOLD = 5;
	@Autowired
	private ImageStorageService imageStorageService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dianping.imcaptcha.strategy.ImageProcessStrategy#isValid(int,
	 * int)
	 */
	public boolean isValid(int userAnswer, int standardAnswer) {
		return Math.abs(userAnswer - standardAnswer) < THRESHOLD;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dianping.imcaptcha.strategy.ImageProcessStrategy#getImage()
	 */
	public ImageAnswerPair getImage() {
		int answer = 0;
		WaveFilter filter = new WaveFilter();
		BufferedImage bufferedImage = imageStorageService.getRaw();
		filter.filter(bufferedImage, bufferedImage);
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		try {
			ImageIO.write(bufferedImage, "jpg", bs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ImageAnswerPair(new ByteArrayInputStream(bs.toByteArray()), answer);
	}
}
