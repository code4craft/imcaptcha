package com.dianping.imcaptcha.strategy;


/**
 * @author yihua.huang@dianping.com
 * @date 2013-1-16
 */
public interface ImageProcessStrategy {

	public boolean isValid(int userAnswer, int standardAnswer);

	public ImageAnswerPair getImage();

}
