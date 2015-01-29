package com.suanming.utils.base;

import java.text.SimpleDateFormat;
import java.util.Date;


public class BaseUtils {
	
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
	* @Title: bubbleSort
	* @Description: 冒泡排序
	* @param array
	* @autor:weixin
	* @time:2015年1月28日 下午3:25:21
	 */
	public static double[] bubbleSort(double[] array) {
		double temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-i-1; j++) {
				if (array[j] < array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
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
			for (int j = 0; j < array.length-i-1; j++) {
				if (array[j] < array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}

	//合、冲
	public static String getChongHe(String dizhi) {
		if (dizhi.equals("子")) {
			return "丑@午";
		}else if (dizhi.equals("丑")) {
			return "子@未";
		}else if (dizhi.equals("寅")) {
			return "亥@申";
		}else if (dizhi.equals("卯")) {
			return "戌@酉";
		}else if (dizhi.equals("辰")) {
			return "酉@戌"; 
		}else if (dizhi.equals("巳")) {
			return "申@亥";
		}else if (dizhi.equals("午")) {
			return "未@子";
		}else if (dizhi.equals("未")) {
			return "午@丑";
		}else if (dizhi.equals("申")) {
			return "巳@寅";
		}else if (dizhi.equals("酉")) {
			return "辰@卯";
		}else if (dizhi.equals("戌")) {
			return "卯@辰";
		}else {
			return "寅@巳";
		}
	}
}
