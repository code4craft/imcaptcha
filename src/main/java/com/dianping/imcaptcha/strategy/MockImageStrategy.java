package com.dianping.imcaptcha.strategy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author yihua.huang@dianping.com
 * @date 2013-1-16
 */
public class MockImageStrategy implements ImageProcessStrategy {

	private String filename = "/Users/cairne/captcha.jpeg";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dianping.imcaptcha.strategy.ImageProcessStrategy#isValid(int,
	 * int)
	 */
	public boolean isValid(int userAnswer, int standardAnswer) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dianping.imcaptcha.strategy.ImageProcessStrategy#getImage()
	 */
	public ImageAnswerPair getImage() {
		try {
			FileInputStream fileInputStream = new FileInputStream(filename);
			return new ImageAnswerPair(fileInputStream, 0);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
