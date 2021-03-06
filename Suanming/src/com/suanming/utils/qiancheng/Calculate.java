package com.suanming.utils.qiancheng;

import java.util.ArrayList;
import java.util.List;

import com.suanming.utils.base.PropertyUtil;
import com.suanming.utils.qiancheng.twoDemension.stacticMethod;
import com.suanming.utils.wenren.ShiShenDefineAndCal;
import com.suanming.utils.wenren.vo.BaZiShiShenValue;

public class Calculate {
	public List<String> getTenGodScore(String bzInfo) {
		BaZiShiShenValue baZiShiShenValue = new BaZiShiShenValue();
		List<String> list = new ArrayList<String>();
		ShiShenDefineAndCal shenDefineAndCal = new ShiShenDefineAndCal();

		String riGan = PropertyUtil.getValue(bzInfo.substring(4, 5),
				"tianganPinyin.properties");

		baZiShiShenValue = shenDefineAndCal.doDefineAndCal(bzInfo);

		list.add("shen" + "," + stacticMethod.WUxing(riGan, "bijian") + ","
				+ (baZiShiShenValue.getBijian() + baZiShiShenValue.getBijian()));
		list.add("shi"
				+ ","
				+ stacticMethod.WUxing(riGan, "shishen")
				+ ","
				+ (baZiShiShenValue.getShishen() + baZiShiShenValue
						.getShangguan()));
		list.add("cai"
				+ ","
				+ stacticMethod.WUxing(riGan, "zhengcai")
				+ ","
				+ (baZiShiShenValue.getZhengcai() + baZiShiShenValue
						.getPiancai()));
		list.add("guan"
				+ ","
				+ stacticMethod.WUxing(riGan, "zhengguan")
				+ ","
				+ (baZiShiShenValue.getZhengguan() + baZiShiShenValue
						.getQisha()));
		list.add("yin"
				+ ","
				+ stacticMethod.WUxing(riGan, "zhengyin")
				+ ","
				+ (baZiShiShenValue.getZhengyin() + baZiShiShenValue
						.getPianyin()));

		return list;
	}
}
