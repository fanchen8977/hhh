package com.fanchen.utils;

import java.io.File;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		
		String file = "1706d.txt";
		String name = FileUtil.getExtendName(file);
		System.out.println(name);
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		
		System.out.println(file);
	}

}
