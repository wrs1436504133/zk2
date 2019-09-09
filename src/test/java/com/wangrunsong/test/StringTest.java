package com.wangrunsong.test;

import org.junit.Test;

import com.wangrunsong.string.StringUtils;

public class StringTest {
	
	@Test
	public void isPhone(){
		boolean phone = StringUtils.isPhone("18511758342");
		System.out.println(phone);
		
	}
}
