package com.dianping.imcaptcha.action;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.dianping.imcaptcha.service.ImageService;

/**
 * @author yihua.huang@dianping.com
 * @date 2013-1-16
 */
public class ValidateAction extends BaseTokenAction {

	private int answer;

	private int code;

	@Autowired
	private ImageService answerService;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		if (StringUtils.isBlank(getToken())) {
			code = 403;
			return SUCCESS;
		}
		code = answerService.isValid(getToken(), answer) ? 200 : 500;
		return SUCCESS;
	}

	public int getCode() {
		return code;
	}

}
