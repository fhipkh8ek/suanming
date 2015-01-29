package com.suanming.utils.wenren;

import java.util.HashMap;
import java.util.Map;

import com.suanming.utils.wenren.vo.BaZiShiShenValue;

public class DiagramACalculate {

	/**
	 * 
	 * @Title: getTenGodScore
	 * @Description: 计算十神得分
	 * @param: @param bzInfo
	 * @param: @return
	 * @return: Map<String,Integer>
	 * @autor:liusen
	 * @time:2015年1月28日 上午11:50:16
	 */
	public Map<String, Double> getTenGodScore(String bzInfo) {
		BaZiShiShenValue baZiShiShenValue = new BaZiShiShenValue();
		Map<String, Double> map = new HashMap<String, Double>();

		ShiShenDefineAndCal shenDefineAndCal = new ShiShenDefineAndCal();

		baZiShiShenValue = shenDefineAndCal.doDefineAndCal(bzInfo);

		double shen = baZiShiShenValue.getBijian()
				+ baZiShiShenValue.getJiecai();
		double shi = baZiShiShenValue.getShishen()
				+ baZiShiShenValue.getShangguan();
		double cai = baZiShiShenValue.getZhengcai()
				+ baZiShiShenValue.getPiancai();
		double guan = baZiShiShenValue.getQisha()
				+ baZiShiShenValue.getZhengguan();
		double yin = baZiShiShenValue.getZhengyin()
				+ baZiShiShenValue.getPianyin();

		map.put("shen", shen);
		map.put("shi", shi);
		map.put("cai", cai);
		map.put("guan", guan);
		map.put("yin", yin);

		return map;
	}
}
