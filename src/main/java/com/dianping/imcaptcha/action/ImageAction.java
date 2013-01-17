package com.dianping.imcaptcha.action;

import java.io.InputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.dianping.imcaptcha.service.ImageService;

/**
 * @author yihua.huang@dianping.com
 * @date 2013-1-16
 */
public class ImageAction extends BaseTokenAction {

	@Autowired
	private ImageService imageService;

	private int code;

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
		InputStream image = imageService.getImage(getToken());
		ServletOutputStream outputStream = ServletActionContext.getResponse().getOutputStream();
		IOUtils.copy(image, outputStream);
		return SUCCESS;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.struts2.interceptor.ServletResponseAware#setServletResponse
	 * (javax.servlet.http.HttpServletResponse)
	 */
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	public int getCode() {
		return code;
	}

}
