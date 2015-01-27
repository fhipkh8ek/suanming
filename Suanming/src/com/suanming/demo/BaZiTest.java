package com.suanming.demo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.suanming.utils.Lunar;

public class BaZiTest {

	//出生日期
	private static String inDate = "1990-02-05";
	//出生时辰
	//{ 1:"子", 2:"丑", 3:"寅", 4:"卯", 5:"辰", 6:"巳", 7:"午", 8:"未", 9:"申",10:"酉", 11:"戌", 12:"亥" }
	private static int inTime = 3;
	
	
	public static void main(String[] args) {
		// 获取阴历日期
		String chineseDate = new BaZiTest().getChineseDate(inDate);
		System.out.println(chineseDate);
		//八字信息
		String bazi = new BaZiTest().getBaziInfo(inDate,inTime);
		System.out.println(bazi);
	}

	
	
	/**
	 * 
	 * @author:vxin
	 * @time:2015年1月24日下午1:29:07
	 * @Description: 通过日期获取阴历日期
	 * @param inDate
	 *            输入：1990-02-05
	 * @return :String 返回:一九九零年正月初十
	 */
	public String getChineseDate(String inDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		try {
			cal.setTime(dateFormat.parse(inDate));
		} catch (ParseException e) {
			return null;
		}
		Lunar lunar = new Lunar(cal);
		return lunar.chineseDatetoString();
	}

	/**
	 * 
	 * @author:vxin
	 * @time:2015年1月24日下午1:32:41
	 * @Description: 获取八字信息
	 * @return :String
	 */
	public String getBaziInfo(String inDate,int hour) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		try {
			cal.setTime(sdf.parse(inDate));
		} catch (ParseException e) {
			return null;
		}
		Lunar lunar = new Lunar(cal);
		return lunar.getYearGanZhi(hour);
	}

}
