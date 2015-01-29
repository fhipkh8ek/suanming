package com.suanming.utils.wenren;

import com.suanming.utils.base.*;

public class ShiShenDefine {

	public String doDefine(String zuHe) {

		String shishenCata = "";

		shishenCata = PropertyUtil.getValue(zuHe, "shishenMap.properties");

		return shishenCata;
	}

}
