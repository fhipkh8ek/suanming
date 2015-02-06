package com.suanming.demo;

import java.util.List;

import com.suanming.utils.bazi.BaziInfo;
import com.suanming.utils.qiancheng.Calculate;

public class Qiancheng {
	
	/**
	* @Title: main
	* @Description: TODO
	* @param args
	* @autor:weixin
	* @time:2015年2月5日 下午5:33:18
	*/
	public static void main(String[] args) {
		
		Calculate calculate = new Calculate();
		String bzInfo = new BaziInfo().getBaziInfo("1990-2-25",3);
		System.out.println("八字："+bzInfo);
//		List<String> list = calculate.getTenGodScore(bzInfo);
//		
//		for (String string : list) {
//			System.out.println(string);
//		}
		
	}

}
