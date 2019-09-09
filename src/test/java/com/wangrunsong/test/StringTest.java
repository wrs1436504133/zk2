package com.wangrunsong.test;

import org.junit.Test;

import com.wangrunsong.string.StringUtils;

public class StringTest {
	
	@Test
	public void isPhone(){
		boolean phone = StringUtils.isPhone("18511758342");
		System.out.println(phone);
	}
	
	@Test
	public void isEmail(){
		boolean phone = StringUtils.isEmail("1436504133@qq.com");
		System.out.println(phone);
	}
	@Test
	public void isBlank(){
		boolean phone = StringUtils.isBlank("a");
		System.out.println(phone);
	}
}
