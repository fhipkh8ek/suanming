package com.suanming.utils.qiancheng;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.suanming.utils.base.BaseUtils;
import com.suanming.utils.base.PropertyUtil;

public class Result {

	public String duanYu(String baziInfo) {

		String shitu = "";
		String hangye = "";
		String muban = "";

		Calculate calculate = new Calculate();
		List<String> list = calculate.getTenGodScore(baziInfo);
		Map<Double, String> fenshenMap = new HashMap<Double, String>();
		fenshenMap.put(Double.parseDouble(list.get(0).split(",")[2]),
				list.get(0).split(",")[0]);
		fenshenMap.put(Double.parseDouble(list.get(1).split(",")[2]),
				list.get(1).split(",")[0]);
		fenshenMap.put(Double.parseDouble(list.get(2).split(",")[2]),
				list.get(2).split(",")[0]);
		fenshenMap.put(Double.parseDouble(list.get(3).split(",")[2]),
				list.get(3).split(",")[0]);
		fenshenMap.put(Double.parseDouble(list.get(4).split(",")[2]),
				list.get(4).split(",")[0]);

		Map<String, String> shenxingMap = new HashMap<String, String>();
		shenxingMap.put(list.get(0).split(",")[0], list.get(0).split(",")[1]);
		shenxingMap.put(list.get(1).split(",")[0], list.get(1).split(",")[1]);
		shenxingMap.put(list.get(2).split(",")[0], list.get(2).split(",")[1]);
		shenxingMap.put(list.get(3).split(",")[0], list.get(3).split(",")[1]);
		shenxingMap.put(list.get(4).split(",")[0], list.get(4).split(",")[1]);

		double[] fenshu = new double[5];
		double[] fenshupaixu = new double[3];
		String[] wushenpaixu = new String[3];
		String[] shenxingpaixu = new String[3];

		for (int i = 0; i < fenshu.length; i++) {

			fenshu[i] = Double.parseDouble(list.get(i).split(",")[2]);

		}

		fenshupaixu[0] = BaseUtils.bubbleSort(fenshu)[0];
		fenshupaixu[1] = BaseUtils.bubbleSort(fenshu)[1];
		fenshupaixu[2] = BaseUtils.bubbleSort(fenshu)[2];

		for (int i = 0; i < fenshupaixu.length; i++) {

			wushenpaixu[i] = fenshenMap.get(fenshupaixu[i]);

		}

		for (int i = 0; i < shenxingpaixu.length; i++) {

			shenxingpaixu[i] = shenxingMap.get(wushenpaixu[i]);

		}

		// System.out.println(wushenpaixu[0] + "@" + wushenpaixu[1] + "@"
		// + wushenpaixu[2]);
		shitu = PropertyUtil.getValue(wushenpaixu[0] + "@" + wushenpaixu[1]
				+ "@" + wushenpaixu[2], "qiancheng.properties");
		// System.out.println(shitu);

		muban = PropertyUtil.getValue(wushenpaixu[0] + "@" + wushenpaixu[1]
				+ "@" + wushenpaixu[2], "zhiye.properties");

		hangye = PropertyUtil.getValue(wuxingDefine(shenxingpaixu[0]) + "@"
				+ wuxingDefine(shenxingpaixu[1]), "qiancheng.properties");

		if (shitu.equals("")) {

			return "对不起，暂时没有收录您的命例，您可以发起在线咨询#对不起暂时无法计算您的行业#对不起暂时无法得到您的职业模板";
		} else {
			return shitu + "#" + hangye + "#" + muban;
		}
	}

	public static void main(String[] args) {

		Result result = new Result();
		System.out.println(result.duanYu("丁卯壬寅甲午乙丑"));

	}

	public String wuxingDefine(String tiangan) {

		String wuxing = "";

		if (tiangan.equals("jia") || tiangan.equals("yi")) {

			wuxing = "mu";

		}

		else if (tiangan.equals("bing") || tiangan.endsWith("ding")) {

			wuxing = "huo";
		}

		else if (tiangan.equals("wu") || tiangan.equals("ji")) {

			wuxing = "tu";
		}

		else if (tiangan.equals("jin") || tiangan.equals("xin")) {

			wuxing = "jin";
		}

		else if (tiangan.equals("ren") || tiangan.equals("gui")) {

			wuxing = "shui";
		}

		return wuxing;
	}
}
