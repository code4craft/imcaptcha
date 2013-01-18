package com.dianping.imcaptcha.strategy;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dianping.imcaptcha.service.ImageStorageService;

/**
 * @author yihua.huang@dianping.com
 * @date 2013-1-17
 */
@Component
public class ImageDistortStrategy implements ImageProcessStrategy {

	private int MIN_FACTOR = 50;
	private int RANGE = 100;

	private Logger logger = Logger.getLogger(getClass());

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
		int answer = randomAnswer();
		logger.info("generate answer: " + answer);
		ArgumentedFilter filter = new TaijiFilter();
		BufferedImage bufferedImage = imageStorageService.getRaw();
		filter.filterArgu(bufferedImage, bufferedImage, answer);
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		try {
			ImageIO.write(bufferedImage, "jpg", bs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ImageAnswerPair(new ByteArrayInputStream(bs.toByteArray()),
				answer);
	}

	private int randomAnswer() {
		Random random = new Random();
		return MIN_FACTOR + random.nextInt(RANGE);
	}

	public ImageAnswerPair getImage(int answer) {
		ArgumentedFilter filter = new TaijiFilter();
		BufferedImage bufferedImage = imageStorageService.getRaw();
		filter.filterArgu(bufferedImage, bufferedImage, answer);
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		try {
			ImageIO.write(bufferedImage, "jpg", bs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ImageAnswerPair(new ByteArrayInputStream(bs.toByteArray()),
				answer);
	}
}
