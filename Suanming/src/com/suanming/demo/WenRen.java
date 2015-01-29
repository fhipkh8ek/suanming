package com.suanming.demo;

import com.suanming.utils.bazi.BaziInfo;
import com.suanming.utils.wenren.Result;

public class WenRen {

	public static void main(String[] args) {
		
		BaziInfo baziInfo = new BaziInfo();
		//八字
		String wxbz = baziInfo.getBaziInfo("1988-1-7",4);
		
		String lsbz = baziInfo.getBaziInfo("1991-8-31", 8);
		
		
		Result result = new Result();
		String duanyu = result.getDuanyu(wxbz, lsbz);
		
		System.out.println(duanyu);
		
	}
	
}
