package com.fanchen.utils;

import java.io.File;

public class FileUtil {
	
	/**
	 * 给定一个文件名，返回该文件名的扩展名
	 * @param fileName
	 * @return
	 */
	public static String getExtendName(String fileName) {
		if(null!=fileName && fileName.length()>0)		
		return fileName.substring(fileName.lastIndexOf("."));
		return null;
		
	}
	/**
	 * 返回操作系统临时目录
	 */
	public static File getTempDirectory() {
		String file = System.getProperty("java.io.tmpdir");
		return new File(file);
	}
	
	/**
	 * 返回操作系统用户目录
	 */
	
	public static File getUserDirectory() {
		String file = System.getProperty("user.home");	
		return new File(file);
	}
}
