package com.dianping.imcaptcha.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author yihua.huang@dianping.com
 * @date 2013-1-16
 */
public abstract class BaseTokenAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String token;

	public void setToken(String token) {
		this.token = token;
	}

	protected String getToken() {
		return token;
	}

}
