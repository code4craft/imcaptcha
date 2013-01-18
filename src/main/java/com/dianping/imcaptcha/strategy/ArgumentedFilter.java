package com.dianping.imcaptcha.strategy;

import java.awt.image.BufferedImage;

/**
 * @author yihua.huang@dianping.com
 * @date 2013-1-18
 */
public interface ArgumentedFilter {

	public BufferedImage filterArgu(BufferedImage src, BufferedImage dst,
			float argu);

}
