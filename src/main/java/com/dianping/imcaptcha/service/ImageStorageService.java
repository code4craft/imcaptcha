package com.dianping.imcaptcha.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author yihua.huang@dianping.com
 * @date 2013-1-17
 */
@Component
public class ImageStorageService implements InitializingBean {
	private String rawPath = "/Users/cairne/imcaptcha/raw/";
	private String cachePath = "/Users/cairne/imcaptcha/cache/";
	private List<File> files = new ArrayList<File>();
	private AtomicInteger atomicInteger = new AtomicInteger();
	private Logger logger = Logger.getLogger(getClass());

	public BufferedImage getRaw() {
		int index = atomicInteger.incrementAndGet();
		if (index >= files.size()) {
			atomicInteger.set(0);
			index = 0;
		}
		try {
			return ImageIO.read(files.get(index));
		} catch (IOException e) {
			logger.warn("read file error!");
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() throws Exception {
		File file = new File(rawPath);
		loadImageFiles(file);
	}

	private final void loadImageFiles(File dir) {
		File[] listFiles = dir.listFiles();
		if (listFiles != null) {
			for (File subFile : listFiles) {
				if (subFile.isDirectory()) {
					loadImageFiles(subFile);
				} else {
					files.add(subFile);
				}
			}
		}
	}
}
