package com.fanchen.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String str = " ";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str = "11";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		fail("Not yet implemented");
	}

	@Test
	public void testRandomChineseStringInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerateChineseName() {
		fail("Not yet implemented");
	}

}
