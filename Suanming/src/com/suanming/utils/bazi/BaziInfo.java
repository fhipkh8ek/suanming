package com.suanming.utils.bazi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BaziInfo {

	
	
	/**
	 * 
	 * @author:vxin
	 * @time:2015年1月24日下午1:29:07
	 * @Description: 通过日期获取阴历日期
	 * @param inDate
	 *            输入：1990-02-05
	 * @return :String 返回:1,10
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
