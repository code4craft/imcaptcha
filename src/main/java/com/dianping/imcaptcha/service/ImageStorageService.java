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
	private String rawPath = "E:\\imcaptcha\\raw";
	private String modifiedPath = "E:\\imcaptcha\\modified";
	private List<File> rawFiles = new ArrayList<File>();
	private List<File> modifiedFiles = new ArrayList<File>();
	private AtomicInteger atomicInteger = new AtomicInteger();
	private Logger logger = Logger.getLogger(getClass());

	public BufferedImage getRaw() {
		int index = atomicInteger.incrementAndGet();
		if (rawFiles.size() <= 0) {
			return null;
		}
		if (index >= rawFiles.size()) {
			atomicInteger.set(0);
			index = 0;
		}
		try {
			File rawFile = rawFiles.get(index);
			logger.info("get image " + rawFile);
			return ImageIO.read(rawFile);
		} catch (IOException e) {
			logger.warn("read file error!");
		}
		return null;
	}

	public BufferedImage getModified() {
		int index = atomicInteger.incrementAndGet();
		if (modifiedFiles.size() <= 0) {
			return null;
		}
		if (index >= modifiedFiles.size()) {
			atomicInteger.set(0);
			index = 0;
		}
		try {
			return ImageIO.read(modifiedFiles.get(index));
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
		File rawFile = new File(rawPath);
		File modifiedFile = new File(modifiedPath);
		loadImageFiles(rawFile, rawFiles);
		loadImageFiles(modifiedFile, modifiedFiles);
	}

	private final void loadImageFiles(File dir, List<File> files) {
		File[] listFiles = dir.listFiles();
		if (listFiles != null) {
			for (File subFile : listFiles) {
				if (subFile.isDirectory()) {
					loadImageFiles(subFile, files);
				} else {
					files.add(subFile);
				}
			}
		}
	}
}
