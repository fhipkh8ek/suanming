package com.suanming.demo;

import com.suanming.utils.bazi.BaziInfo;
import com.suanming.utils.wenren.Result;

public class WenRen {

	public static void main(String[] args) {
		
		BaziInfo baziInfo = new BaziInfo();
		//八字
		String wxbz = baziInfo.getBaziInfo("1990-03-05", 3);
		
		String lsbz = baziInfo.getBaziInfo("1986-1-11", 1);
		
		
		Result result = new Result();
		String duanyu = result.getDuanyu(wxbz, lsbz);
		
		System.out.println(duanyu);
		
	}
	
}
