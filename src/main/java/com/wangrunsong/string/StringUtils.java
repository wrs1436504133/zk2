package com.wangrunsong.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	/*
	 *  �������ܣ����ַ���ת����html�ı������������\n�����л�������Ҫ����һ���ı�ʹ��<p></p>��ǩ
	 * �����������������\n\r��������һ������\n�������ֻ����һ����\r�����滻��<br/>��ǩ��
	 * ʹ�ó�������ҳ�ı��򴫵���̨���ַ����Ϳ��ܾͻ�س����С�
	 * */
	public static String toHeml(String text){
		//ʵ�ִ���
		
		return "";
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
		 
		return false;
	}
}
