package com.dianping.imcaptcha.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

/**
 * @author yihua.huang@dianping.com
 * @date 2013-1-16
 */
@Component
public class AnswerContainer {

	// TODO: expired time etc.
	private Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();

	public void set(String token, int answer) {
		map.put(token, answer);
	}

	public Integer get(String token) {
		return map.get(token);
	}

}
