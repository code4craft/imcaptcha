package com.dianping.imcaptcha.service;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dianping.imcaptcha.strategy.ImageAnswerPair;
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
	private AnswerContainer answerContainer;

	public boolean isValid(String token, int answer) {
		Integer standardAnswer = answerContainer.get(token);
		if (standardAnswer == null) {
			return false;
		}
		return imageProcessStrategy.isValid(answer, standardAnswer);
	}

	public InputStream getImage(String token) {
		ImageAnswerPair imageAnswerPair = imageProcessStrategy.getImage();
		answerContainer.set(token, imageAnswerPair.getAnswer());
		return imageAnswerPair.getImage();
	}
}
