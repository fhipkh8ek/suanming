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

		list.add("bijian" + "," + stacticMethod.WUxing(riGan, "bijian") + ","
				+ baZiShiShenValue.getBijian());
		list.add("jiecai" + "," + stacticMethod.WUxing(riGan, "jiecai") + ","
				+ baZiShiShenValue.getJiecai());
		list.add("shishen" + "," + stacticMethod.WUxing(riGan, "shishen") + ","
				+ baZiShiShenValue.getShishen());
		list.add("shangguan" + "," + stacticMethod.WUxing(riGan, "shangguan")
				+ "," + baZiShiShenValue.getShangguan());
		list.add("zhengcai" + "," + stacticMethod.WUxing(riGan, "zhengcai")
				+ "," + baZiShiShenValue.getZhengcai());
		list.add("piancai" + "," + stacticMethod.WUxing(riGan, "piancai") + ","
				+ baZiShiShenValue.getPiancai());
		list.add("zhengguan" + "," + stacticMethod.WUxing(riGan, "zhengguan")
				+ "," + baZiShiShenValue.getZhengguan());
		list.add("qisha" + "," + stacticMethod.WUxing(riGan, "qisha") + ","
				+ baZiShiShenValue.getQisha());
		list.add("zhengyin" + "," + stacticMethod.WUxing(riGan, "zhengyin")
				+ "," + baZiShiShenValue.getZhengyin());
		list.add("pianyin" + "," + stacticMethod.WUxing(riGan, "pianyin") + ","
				+ baZiShiShenValue.getPianyin());
		return list;
	}
}
