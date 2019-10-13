package com.fanchen.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test//月初
	public void testGetDateByInitMonth() {	
		Calendar c = Calendar.getInstance();
		c.set(2018, 5, 5, 15, 45, 56);
		
		
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

	@Test
	public void testGetDateByFullMonth() {	
		Date date = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

}
