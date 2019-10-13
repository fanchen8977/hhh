package com.fanchen.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {

	
	/**
	 * 批量关闭流，参数能传无限个
	 * 例如传入FileInputStream对象，jdbc中Connection对象都可以关闭
	 */
	public static void closeAll(AutoCloseable ... ac) {
		
		if(null!=ac && ac.length>0) {
			for (AutoCloseable autoCloseable : ac) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	/**
	 * 传入一个文本文件对象，默认为utf-8编码，返回该文件内容，要求
	 * 方法内部调用上面第一个方法关闭流
	 */
	public static String readTextFile(InputStream src) {
		
		String str="";
		
		byte[] b = new byte[1024];
		
		int x=0;
		
		try {
			while((x=src.read(b))!=-1) {
				str +=new String(b, 0, x, "utf-8");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(src);
		}
		
		
		return str;
		
	}
	/**
	 * 传入文本文件对象，返回该文件内容，并且要求内部调用上面第2个方法
	 * 这是典型的方法重载
	 */
	public static String readTextFile(File txtFile) {		
		try {
			return readTextFile(new FileInputStream(txtFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
		return null;
	}

}
