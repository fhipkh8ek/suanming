package com.suanming.utils.wenren;

import com.suanming.utils.wenren.vo.BaZiShiShenValue;

public class ShiShenOp {

	public BaZiShiShenValue doReturn(String[] gan, String rigan,
			String nianzhi, String yuezhi, String rizhi, String shizhi) {

		BaZiShiShenValue bsv = new BaZiShiShenValue();
		ShiShenDefine sDefine = new ShiShenDefine();
		ValueDefine vDefine = new ValueDefine();

		String tiangan[] = { "jia", "yi", "bing", "ding", "wu", "ji", "geng",
				"xin", "ren", "gui" };

		for (int i = 0; i < tiangan.length; i++) {

			String shiShen = sDefine.doDefine(rigan + tiangan[i]);

			if (shiShen.equals("bijian")) {
				bsv.multbijian(vDefine.doDefine(tiangan[i] + yuezhi));

			} else if (shiShen.equals("jiecai")) {
				bsv.multjiecai(vDefine.doDefine(tiangan[i] + yuezhi));

			} else if (shiShen.equals("zhengcai")) {
				bsv.multzhengcai(vDefine.doDefine(tiangan[i] + yuezhi));

			} else if (shiShen.equals("piancai")) {
				bsv.multpiancai(vDefine.doDefine(tiangan[i] + yuezhi));

			} else if (shiShen.equals("zhengguan")) {
				bsv.multzhengguan(vDefine.doDefine(tiangan[i] + yuezhi));

			} else if (shiShen.equals("qisha")) {
				bsv.multqisha(vDefine.doDefine(tiangan[i] + yuezhi));

			} else if (shiShen.equals("zhengyin")) {
				bsv.multzhengyin(vDefine.doDefine(tiangan[i] + yuezhi));

			} else if (shiShen.equals("pianyin")) {
				bsv.multpianyin(vDefine.doDefine(tiangan[i] + yuezhi));

			}
		}

		/*
		 * for (int i = 0; i < gan.length; i++) {
		 * 
		 * String shiShen = sDefine.doDefine(rigan + tiangan[i]);
		 * 
		 * if (shiShen.equals("bijian")) { bsv.addbijianS();
		 * 
		 * } else if (shiShen.equals("jiecai")) { bsv.addjiecaiS();
		 * 
		 * } else if (shiShen.equals("zhengcai")) { bsv.addzhengcaiS();
		 * 
		 * } else if (shiShen.equals("piancai")) { bsv.addpiancaiS();
		 * 
		 * } else if (shiShen.equals("zhengguan")) { bsv.addzhengguanS();
		 * 
		 * } else if (shiShen.equals("qisha")) { bsv.addqishaS();
		 * 
		 * } else if (shiShen.equals("zhengyin")) { bsv.addzhengyinS();
		 * 
		 * } else if (shiShen.equals("pianyin")) { bsv.addpianyinS();
		 * 
		 * } }
		 */

		String shiShenN = sDefine.doDefine(rigan + nianzhi);

		switch (shiShenN) {
		case "bijian":
			bsv.addbijianN();

			break;

		case "jiecai":
			bsv.addjiecaiN();
			break;

		case "shishen":
			bsv.addshishenN();
			break;

		case "shangguan":
			bsv.addshangguanN();
			break;

		case "zhengcai":
			bsv.addzhengcaiN();
			break;
		case "piancai":
			bsv.addpiancaiN();
			break;

		case "zhengguan":
			bsv.addzhengguanN();
			break;
		case "qisha":
			bsv.addqishaN();
			break;
		case "zhengyin":
			bsv.addzhengyinN();
			break;
		case "pianyin":
			bsv.addpianyinN();
			break;

		default:
			break;
		}

		String shiShenY = sDefine.doDefine(rigan + yuezhi);

		switch (shiShenY) {
		case "bijian":
			bsv.addbijianY();

			break;

		case "jiecai":
			bsv.addjiecaiY();
			break;

		case "shishen":
			bsv.addshishenY();
			break;

		case "shangguan":
			bsv.addshangguanY();
			break;

		case "zhengcai":
			bsv.addzhengcaiY();
			break;
		case "piancai":
			bsv.addpiancaiY();
			break;

		case "zhengguan":
			bsv.addzhengguanY();
			break;
		case "qisha":
			bsv.addqishaY();
			break;
		case "zhengyin":
			bsv.addzhengyinY();
			break;
		case "pianyin":
			bsv.addpianyinY();
			break;

		default:
			break;
		}

		String shiShenR = sDefine.doDefine(rigan + rizhi);

		switch (shiShenR) {
		case "bijian":
			bsv.addbijianR();

			break;

		case "jiecai":
			bsv.addjiecaiR();
			break;

		case "shishen":
			bsv.addshishenR();
			break;

		case "shangguan":
			bsv.addshangguanR();
			break;

		case "zhengcai":
			bsv.addzhengcaiR();
			break;
		case "piancai":
			bsv.addpiancaiR();
			break;

		case "zhengguan":
			bsv.addzhengguanR();
			break;
		case "qisha":
			bsv.addqishaR();
			break;
		case "zhengyin":
			bsv.addzhengyinR();
			break;
		case "pianyin":
			bsv.addpianyinR();
			break;

		default:
			break;
		}

		String shiShenS = sDefine.doDefine(rigan + shizhi);

		switch (shiShenS) {
		case "bijian":
			bsv.addbijianS();

			break;

		case "jiecai":
			bsv.addjiecaiS();
			break;

		case "shishen":
			bsv.addshishenS();
			break;

		case "shangguan":
			bsv.addshangguanS();
			break;

		case "zhengcai":
			bsv.addzhengcaiS();
			break;
		case "piancai":
			bsv.addpiancaiS();
			break;

		case "zhengguan":
			bsv.addzhengguanS();
			break;
		case "qisha":
			bsv.addqishaS();
			break;
		case "zhengyin":
			bsv.addzhengyinS();
			break;
		case "pianyin":
			bsv.addpianyinS();
			break;

		default:
			break;
		}

		return bsv;

	}
}
