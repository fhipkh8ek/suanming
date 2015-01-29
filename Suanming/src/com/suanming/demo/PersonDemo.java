package com.suanming.demo;

import com.suanming.utils.personal.DayYunshi;

public class PersonDemo {

	public static void main(String[] args) {
		//出生日期
		String inDate = "1990-02-05";
		//出生时辰
		Integer inHour = 3;
		
		//八字信息
		System.out.println(new DayYunshi().getBaziInfo(inDate, inHour));
		//幸运色
		System.out.println(new DayYunshi().getColor(inDate));
		//适宜、忌
		System.out.println(new DayYunshi().getGoodAndBad());
		//幸运数字(不变)
		System.out.println(new DayYunshi().getNum(inDate));
		//吉凶时辰
		System.out.println(new DayYunshi().getJiAndXiong());
		//幸运方向
		System.out.println(new DayYunshi().getFangXiang());
	}
	
	
}
