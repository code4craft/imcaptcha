package com.dianping.imcaptcha.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author yihua.huang@dianping.com <br>
 * @date: 13-7-31 <br>
 *        Time: 下午1:58 <br>
 */
public class DemoAction extends ActionSupport {

    private int id;

	@Override
	public String execute() throws Exception {
		return "success";
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
