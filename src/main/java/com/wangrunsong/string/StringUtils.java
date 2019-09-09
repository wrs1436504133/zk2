package com.wangrunsong.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	/*
	 *  方法功能：将字符串转换成html文本，如果遇到“\n”换行换符，则要将这一段文本使用<p></p>标签
	 * 包起来。如果遇到“\n\r”两个在一起按上面\n处理。如果只遇到一个“\r”则替换成<br/>标签。
	 * 使用场景：网页文本框传到后台的字符串就可能就会回车换行。
	 * */
	public static void toHeml(String str){
		//实现代码
		
		StringBuffer buffer = new StringBuffer();
		String[] split = str.split("(\r\n)");
		for (String string : split) {
			buffer.append("<p>");
			buffer.append(string);
			buffer.append("</p>");
		}
		System.out.println(buffer.toString());
	}
	
	//手机号码
	public static boolean isPhone(String phone){
		Pattern pattern = Pattern.compile("^1[3|4|5|7|8][0-9]\\d{8}$");
		Matcher matcher = pattern.matcher(phone);
		if(matcher.matches()){
			return true;
		}
		return false;
	}
	
	//是否为邮箱
	public static boolean isEmail(String email){
		 Pattern pattern = Pattern.compile("^([a-z0-9A-Z]+)@([a-z0-9A-Z]+\\.)+[a-zA-Z]{2,}$");
		 Matcher matcher = pattern.matcher(email);
		 if(matcher.matches()){
			 return true;
		 }
		return false;
	}
	
	//判断是否为空
	public static boolean isBlank(String blank){
		if(blank!=null&&blank.length()>0&&blank.trim().length()>0){
			return true;
		}
		return false;
	}
}
