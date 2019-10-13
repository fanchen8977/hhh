package com.fanchen.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		String string = StreamUtil.readTextFile(new FileInputStream(new File("d:/info.txt")));
		System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		String string = StreamUtil.readTextFile(new File("d:/info.txt"));
		System.out.println(string);
	}

}
