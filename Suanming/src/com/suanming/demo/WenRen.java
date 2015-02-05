package com.suanming.demo;

import com.suanming.utils.bazi.BaziInfo;
import com.suanming.utils.wenren.Result;

public class WenRen {

	public static void main(String[] args) {

		BaziInfo baziInfo = new BaziInfo();
		// 八字
		String wxbz = baziInfo.getBaziInfo("1992-12-07", 11);

		String lsbz = baziInfo.getBaziInfo("1990-2-28", 9);

		Result result = new Result();
		String duanyu = result.getDuanyu(wxbz, lsbz, "");

		System.out.println(duanyu);
	}
}
