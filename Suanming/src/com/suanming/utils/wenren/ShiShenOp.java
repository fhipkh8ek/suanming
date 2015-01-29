package com.suanming.utils.wenren;

import com.suanming.utils.wenren.vo.BaZiShiShenValue;

public class ShiShenOp {

	public BaZiShiShenValue doReturn(String[] tiangan, String rigan,
			String[] dizhi, String yuezhi) {

		BaZiShiShenValue bsv = new BaZiShiShenValue();
		ShiShenDefine sDefine = new ShiShenDefine();
		ValueDefine vDefine = new ValueDefine();

		for (int i = 0; i < tiangan.length; i++) {

			String shiShen = sDefine.doDefine(tiangan[i] + rigan);

			if (shiShen.equals("bijian")) {

				bsv.multbijian(vDefine.doDefine(tiangan[i] + yuezhi));

			}

			else if (shiShen.equals("jiecai")) {

				bsv.multjiecai(vDefine.doDefine(tiangan[i] + yuezhi));
			}

			else if (shiShen.equals("zhengcai")) {

				bsv.multzhengcai(vDefine.doDefine(tiangan[i] + yuezhi));
			}

			else if (shiShen.equals("piancai")) {

				bsv.multpiancai(vDefine.doDefine(tiangan[i] + yuezhi));
			}

			else if (shiShen.equals("zhengguan")) {
				bsv.multzhengguan(vDefine.doDefine(tiangan[i] + yuezhi));
			}

			else if (shiShen.equals("qisha")) {

				bsv.multqisha(vDefine.doDefine(tiangan[i] + yuezhi));
			} else if (shiShen.equals("zhengyin")) {
				bsv.multzhengyin(vDefine.doDefine(tiangan[i] + yuezhi));
			} else if (shiShen.equals("pianyin")) {
				bsv.multpianyin(vDefine.doDefine(tiangan[i] + yuezhi));
			}
		}

		for (int j = 0; j < dizhi.length; j++) {

			String shiShen = sDefine.doDefine(rigan+dizhi[j]);

			if (shiShen.equals("bijian")) {

				bsv.addbijian();

			}

			else if (shiShen.equals("jiecai")) {

				bsv.addjiecai();
			}

			else if (shiShen.equals("zhengcai")) {

				bsv.addzhengcai();
			}

			else if (shiShen.equals("piancai")) {

				bsv.addpiancai();
			}

			else if (shiShen.equals("zhengguan")) {
				bsv.addzhengguan();
			}

			else if (shiShen.equals("qisha")) {

				bsv.addqisha();
			} else if (shiShen.equals("zhengyin")) {
				bsv.addzhengyin();
			} else if (shiShen.equals("pianyin")) {
				bsv.addpianyin();
			}

		}

		String shiShen = sDefine.doDefine(rigan + yuezhi);

		switch (shiShen) {
		case "bijian":
			bsv.addbijianT();

			break;

		case "jiecai":
			bsv.addjiecaiT();
			break;

		case "shishen":
			bsv.addshishenT();
			break;

		case "shangguan":
			bsv.addshangguan();
			break;

		case "zhengcai":
			bsv.addzhengcaiT();
			break;
		case "piancai":
			bsv.addpiancaiT();
			break;

		case "zhengguan":
			bsv.addzhengguan();
			break;
		case "qisha":
			bsv.addqishaT();
			break;
		case "zhengyin":
			bsv.addzhengyinT();
			break;
		case "pianyin":
			bsv.addpianyinT();
			break;

		default:
			break;
		}

		return bsv;

	}
}
