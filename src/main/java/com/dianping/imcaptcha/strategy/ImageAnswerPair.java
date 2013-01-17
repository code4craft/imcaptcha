package com.dianping.imcaptcha.strategy;

import java.io.InputStream;

/**
 * @author yihua.huang@dianping.com
 * @date 2013-1-16
 */
public class ImageAnswerPair {

	private final InputStream image;

	private final int answer;

	/**
	 * @param inputStream
	 * @param answer
	 */
	public ImageAnswerPair(InputStream image, int answer) {
		super();
		this.image = image;
		this.answer = answer;
	}

	public InputStream getImage() {
		return image;
	}

	public int getAnswer() {
		return answer;
	}

}
