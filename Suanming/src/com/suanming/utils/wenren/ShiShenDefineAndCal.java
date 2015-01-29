package com.suanming.utils.wenren;

import com.suanming.utils.base.PropertyUtil;
import com.suanming.utils.wenren.vo.BaZiShiShenValue;
import com.suanming.utils.wenren.ShiShenOp;

public class ShiShenDefineAndCal {

	public BaZiShiShenValue doDefineAndCal(String bzInfo) {

		BaZiShiShenValue bsv = new BaZiShiShenValue();
		ShiShenOp sOp = new ShiShenOp();

		String nianGan = PropertyUtil.getValue(bzInfo.substring(0, 1), "tianganPinyin.properties");
		String nianZhi = PropertyUtil.getValue(bzInfo.substring(1, 2), "dizhiPinyin.properties");
		String yueGan = PropertyUtil.getValue(bzInfo.substring(2, 3), "tianganPinyin.properties");
		String yueZhi = PropertyUtil.getValue(bzInfo.substring(3, 4), "dizhiPinyin.properties");
		String riGan = PropertyUtil.getValue(bzInfo.substring(4, 5), "tianganPinyin.properties");
		String riZhi = PropertyUtil.getValue(bzInfo.substring(5,6), "dizhiPinyin.properties");
		String shiGan = PropertyUtil.getValue(bzInfo.substring(6, 7), "tianganPinyin.properties");
		String shiZhi = PropertyUtil.getValue(bzInfo.substring(7, 8), "dizhiPinyin.properties");

		String[] gan = new String[2];
		String[] zhi = new String[2];

		gan[0] = nianGan;
		gan[1] = yueGan;
		gan[2] = shiGan;

		zhi[0] = nianZhi;
		zhi[1] = riZhi;
		zhi[2] = shiZhi;

		bsv = sOp.doReturn(gan, riGan, zhi, yueZhi);
		return bsv;
	}
}
