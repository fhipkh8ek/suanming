package com.suanming.utils.wenren.vo;

import com.suanming.utils.base.PropertyUtil;

public class ValueDefine {

	public double doDefine(String zuhe) {

		double value;

		value = Double.parseDouble(PropertyUtil.getValue(zuhe,
				"xiuqiusi.properties"))
				+ Double.parseDouble(PropertyUtil.getValue(zuhe,
						"zhangsheng.properties"));

		return value;
	}
}
