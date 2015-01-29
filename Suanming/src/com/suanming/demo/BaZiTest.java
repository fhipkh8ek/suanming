package com.suanming.demo;



import com.suanming.utils.bazi.BaziInfo;

public class BaZiTest {

	//出生日期
	private static String inDate = "1990-02-05";
	//出生时辰
	//{ 1:"子", 2:"丑", 3:"寅", 4:"卯", 5:"辰", 6:"巳", 7:"午", 8:"未", 9:"申",10:"酉", 11:"戌", 12:"亥" }
	private static int inTime = 3;
	
	
	public static void main(String[] args) {
		// 获取阴历日期
		String chineseDate = new BaziInfo().getChineseDate(inDate);
		System.out.println(chineseDate);
		//八字信息
		String bazi = new BaziInfo().getBaziInfo(inDate,inTime);
		System.out.println(bazi);
	}


}
