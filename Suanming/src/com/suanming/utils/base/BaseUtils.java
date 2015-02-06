package com.suanming.utils.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import freemarker.cache.StringTemplateLoader;

public class BaseUtils {

	public static final String[] jiazhi = { 
		"甲子", "乙丑", "丙寅", "丁卯", "戊辰", "己巳",
		"庚午", "辛未", "壬申", "癸酉", "甲戌", "乙亥", 
		"丙子", "丁丑", "戊寅", "己卯", "庚辰", "辛巳", 
		"壬午", "癸未", "甲申", "乙酉", "丙戌", "丁亥", 
		"戊子", "己丑", "庚寅", "辛卯", "壬辰", "癸巳", 
		"甲午", "乙未", "丙申", "丁酉", "戊戌", "己亥", 
		"庚子", "辛丑", "壬寅", "癸卯", "甲辰", "乙巳", 
		"丙午", "丁未", "戊申", "己酉", "庚戌", "辛亥", 
		"壬子", "癸丑", "甲寅", "乙卯", "丙辰", "丁巳", 
		"戊午", "己未", "庚申", "辛酉", "壬戌", "癸亥" 
		};
	/**
	 * 
	 * @Title: getNowTime
	 * @Description: 返回当前时间
	 * @param type
	 * @return
	 * @autor:weixin
	 * @time:2015年1月27日 下午1:30:55
	 */
	public static String getNowTime(int type) {
		switch (type) {
		case 1:
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return sdf1.format(new Date());
		case 2:
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			return sdf2.format(new Date());
		case 3:
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHH:mm:ss");
			return sdf3.format(new Date());
		case 4:
			SimpleDateFormat sdf4 = new SimpleDateFormat("HH:mm:ss");
			return sdf4.format(new Date());
		default:
			SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return sdf5.format(new Date());
		}
	}

	/**
	 * 
	 * @Title: compareDate
	 * @Description: 判断两个日期
	 * @param date1
	 * @param date2
	 * @throws ParseException
	 * @autor:weixin
	 * @time:2015年1月30日 下午4:36:40
	 * @return 0:相等 1:第一个 > 第二个 2:第一个< 第二个
	 */
	public static int compareDate(String date1, String date2)
			throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
		Date newdate1 = simpleDateFormat.parse(date1);
		Date newdate2 = simpleDateFormat.parse(date2);
		if (newdate1.getTime() > newdate2.getTime()) {
			return 1;
		} else if (newdate1.getTime() < newdate2.getTime()) {
			return -1;
		} else {
			return 0;
		}
	}

	/**
	 * 
	 * @Title: judgeTimeIn
	 * @Description: 判断一个日期是否在时间段中
	 * @param date
	 * @param start
	 * @param end
	 * @return : 1:在 0：不在
	 * @throws ParseException
	 * @autor:weixin
	 * @time:2015年1月30日 下午4:42:14
	 */
	public static int judgeTimeIn(String date, String start, String end)
			throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
		Date newDate = simpleDateFormat.parse(date);
		Date newStart = simpleDateFormat.parse(start);
		Date newEnd = simpleDateFormat.parse(end);

		if (newDate.getTime() >= newStart.getTime()
				&& newDate.getTime() <= newEnd.getTime()) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * 
	 * @Title: bubbleSort
	 * @Description: 冒泡排序
	 * @param array
	 * @autor:weixin
	 * @time:2015年1月28日 下午3:25:21
	 */
	public static double[] bubbleSort(double[] array) {
		double temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * 
	 * @Title: bubbleSort
	 * @Description: 冒泡排序
	 * @param array
	 * @autor:weixin
	 * @time:2015年1月28日 下午3:35:19
	 */
	public static Integer[] bubbleSort(Integer[] array) {
		Integer temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	// 合、冲
	public static String getChongHe(String dizhi) {
		if (dizhi.equals("子")) {
			return "丑@午";
		} else if (dizhi.equals("丑")) {
			return "子@未";
		} else if (dizhi.equals("寅")) {
			return "亥@申";
		} else if (dizhi.equals("卯")) {
			return "戌@酉";
		} else if (dizhi.equals("辰")) {
			return "酉@戌";
		} else if (dizhi.equals("巳")) {
			return "申@亥";
		} else if (dizhi.equals("午")) {
			return "未@子";
		} else if (dizhi.equals("未")) {
			return "午@丑";
		} else if (dizhi.equals("申")) {
			return "巳@寅";
		} else if (dizhi.equals("酉")) {
			return "辰@卯";
		} else if (dizhi.equals("戌")) {
			return "卯@辰";
		} else {
			return "寅@巳";
		}
	}

	/**
	 * 
	 * @Title: getFangXiang
	 * @Description: 返回方向
	 * @param dizhi
	 * @autor:weixin
	 * @time:2015年1月29日 下午5:35:48
	 */
	public static String getFangXiang(String dizhi) {
		if (dizhi.equals("子")) {
			return "北";
		} else if (dizhi.equals("丑") || dizhi.equals("寅")) {
			return "东北";
		} else if (dizhi.equals("卯")) {
			return "东方";
		} else if (dizhi.equals("辰") || dizhi.equals("巳")) {
			return "东南";
		} else if (dizhi.equals("午")) {
			return "南";
		} else if (dizhi.equals("未") || dizhi.equals("酉")) {
			return "西南";
		} else if (dizhi.equals("酉")) {
			return "西";
		} else {
			return "西北";
		}
	}

	/**
	 * 
	 * @Title: getShiChen
	 * @Description: 地支转换成时辰数字
	 * @param now
	 * @return
	 * @throws ParseException
	 * @autor:weixin
	 * @time:2015年1月30日 下午4:50:14
	 */
	public static String dizhiToNum(String now) throws ParseException {
		if (BaseUtils.judgeTimeIn(now, "21:00:00", "00:59:59") > 0) {
			return "1";
		} else if (BaseUtils.judgeTimeIn(now, "01:00:00", "02:59:59") > 0) {
			return "2";
		} else if (BaseUtils.judgeTimeIn(now, "03:00:00", "04:59:59") > 0) {
			return "3";
		} else if (BaseUtils.judgeTimeIn(now, "05:00:00", "06:59:59") > 0) {
			return "4";
		} else if (BaseUtils.judgeTimeIn(now, "07:00:00", "08:59:59") > 0) {
			return "5";
		} else if (BaseUtils.judgeTimeIn(now, "09:00:00", "10:59:59") > 0) {
			return "6";
		} else if (BaseUtils.judgeTimeIn(now, "11:00:00", "12:59:59") > 0) {
			return "7";
		} else if (BaseUtils.judgeTimeIn(now, "13:00:00", "14:59:59") > 0) {
			return "8";
		} else if (BaseUtils.judgeTimeIn(now, "15:00:00", "16:59:59") > 0) {
			return "9";
		} else if (BaseUtils.judgeTimeIn(now, "17:00:00", "18:59:59") > 0) {
			return "10";
		} else if (BaseUtils.judgeTimeIn(now, "19:00:00", "20:59:59") > 0) {
			return "11";
		} else {
			return "12";
		}
	}

	public static void main(String[] args) throws ParseException {

		System.out.println(compareDate(getNowTime(4), "18:00:00"));

	}

}
