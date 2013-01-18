package com.dianping.imcaptcha.service;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dianping.imcaptcha.strategy.ImageAnswerPair;
import com.dianping.imcaptcha.strategy.ImageDistortStrategy;
import com.dianping.imcaptcha.strategy.ImageProcessStrategy;

/**
 * @author yihua.huang@dianping.com
 * @date 2013-1-16
 */
@Component
public class ImageService {

	@Autowired
	private ImageProcessStrategy imageProcessStrategy;

	@Autowired
	private ImageDistortStrategy imageDistortStrategy;

	@Autowired
	private AnswerContainer answerContainer;

	public boolean isValid(String token, int answer) {
		Integer standardAnswer = answerContainer.get(token);
		if (standardAnswer == null) {
			return false;
		}
		boolean valid = imageProcessStrategy.isValid(answer, standardAnswer);
		answerContainer.clearAnswer(token);
		return valid;
	}

	public InputStream getImage(String token) {
		ImageAnswerPair imageAnswerPair = imageProcessStrategy.getImage();
		answerContainer.set(token, imageAnswerPair.getAnswer());
		return imageAnswerPair.getImage();
	}

	public InputStream getImage(String token, int answer) {
		ImageAnswerPair imageAnswerPair = imageDistortStrategy.getImage(answer);
		answerContainer.set(token, imageAnswerPair.getAnswer());
		return imageAnswerPair.getImage();
	}
}
