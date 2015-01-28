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
	

}
