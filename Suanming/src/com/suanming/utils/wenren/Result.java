package com.suanming.utils.wenren;

import java.util.HashMap;
import java.util.Map;

import com.suanming.utils.base.BaseUtils;
import com.suanming.utils.base.PropertyUtil;
import com.suanming.utils.bazi.BaziInfo;

public class Result {
	
	/**
	 * 
	* @Title: get2God
	* @Description: 获取两个五行
	* @param map
	* @autor:weixin
	* @time:2015年1月28日 下午3:22:23
	 */
	private  String[] get2God(String bzInfo) {
		//五神分数//
		Map<String, Double> map = new DiagramACalculate().getTenGodScore(bzInfo);
		//2个五行
		String wxValues = getScore(map);
		return wxValues.split("@");
	}
	
	/**
	 * 
	* @Title: getScore
	* @Description: 五神计算分数，,从大->小
	* @param map
	* @return:返回两个五行:表，里
	* @autor:weixin
	* @time:2015年1月28日 下午3:40:37
	 */
	private String getScore(Map<String, Double> map) {
		double[] values = new double[5];
		//身
		double shen = map.get("shen");
		//官
		double guan = map.get("guan");
		//印
		double yin  = map.get("yin");
		//食
		double shi  = map.get("shi");
		//财
		double cai  = map.get("cai");
		
		//五行结果map
		Map<Double, String> wxMap = new HashMap<Double, String>();
		//计算公式:金
		double jin  = shen-guan+yin-shi-cai;
		wxMap.put(jin, "jin");
		//计算公式:木
		double mu   = -shen+guan+yin+shi+cai;
		wxMap.put(mu, "mu");
		//计算公式：水
		double shui = shen-guan+yin+shi+cai;
		wxMap.put(shui, "shui");
		//计算公式：火
		double huo  = shen-guan-yin+shi+cai;
		wxMap.put(huo, "huo");
		//计算公式：土
		double tu   = shen+guan+yin-shi-cai;
		wxMap.put(tu, "tu");
		
		values[0] = jin;
		values[1] = mu;
		values[2] = shui;
		values[3] = huo;
		values[4] = tu;
		
		//冒泡
		values = BaseUtils.bubbleSort(values);
		
		//表
		String out = wxMap.get(values[0]);
		//里
		String in = wxMap.get(values[1]);
		
		return out+"@"+in;
	}
	
	/**
	 * 
	* @Title: getDuanyu
	* @Description: 获取短语
	* @param first :第一个人八字
	* @param second:第二个人八字
	* @return:返回三段短语
	* @autor:weixin
	* @time:2015年1月28日 下午4:21:44
	 */
	public String getDuanyu(String first,String second) {
		String[] firstWx = get2God(first);
		String[] SecondWx = get2God(second);
		
		//表断语
		String outNote = firstWx[0] + "@" + SecondWx[0];
		//里断语
		String inNote = firstWx[1] +"@"+ SecondWx[1];
		//总结
		String sumNote = "";
		
		//属性文件
		String fir = PropertyUtil.getValue(outNote+"@"+inNote, "suanren.properties");
		System.out.println(fir);
		
		
		return outNote+"@"+inNote+"@";
	}
}
