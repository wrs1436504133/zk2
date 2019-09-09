package com.wangrunsong.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	/*
	 *  �������ܣ����ַ���ת����html�ı������������\n�����л�������Ҫ����һ���ı�ʹ��<p></p>��ǩ
	 * �����������������\n\r��������һ������\n�������ֻ����һ����\r�����滻��<br/>��ǩ��
	 * ʹ�ó�������ҳ�ı��򴫵���̨���ַ����Ϳ��ܾͻ�س����С�
	 * */
	public static void toHeml(String str){
		//ʵ�ִ���
		
		StringBuffer buffer = new StringBuffer();
		String[] split = str.split("(\r\n)");
		for (String string : split) {
			buffer.append("<p>");
			buffer.append(string);
			buffer.append("</p>");
		}
		System.out.println(buffer.toString());
	}
	
	//�ֻ�����
	public static boolean isPhone(String phone){
		Pattern pattern = Pattern.compile("^1[3|4|5|7|8][0-9]\\d{8}$");
		Matcher matcher = pattern.matcher(phone);
		if(matcher.matches()){
			return true;
		}
		return false;
	}
	
	//�Ƿ�Ϊ����
	public static boolean isEmail(String email){
		 Pattern pattern = Pattern.compile("^([a-z0-9A-Z]+)@([a-z0-9A-Z]+\\.)+[a-zA-Z]{2,}$");
		 Matcher matcher = pattern.matcher(email);
		 if(matcher.matches()){
			 return true;
		 }
		return false;
	}
	
	//�ж��Ƿ�Ϊ��
	public static boolean isBlank(String blank){
		if(blank!=null&&blank.length()>0&&blank.trim().length()>0){
			return true;
		}
		return false;
	}
}
