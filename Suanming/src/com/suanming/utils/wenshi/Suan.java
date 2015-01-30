package com.suanming.utils.wenshi;

import com.suanming.utils.bagua.*;
import com.suanming.utils.base.PropertyUtil;

public class Suan {

	public static void main(String[] args) {

		SuanGuaInfo suanGuaInfo = new SuanGuaInfo("午", 11, 3, 7, "丙", "午",
				"er", "丑");

		SuoDeGua sdg = new SuoDeGua();

		String pailie;

		SanGuaDingWei sgd = new SanGuaDingWei(suanGuaInfo);

		sdg = sgd.sanGuan();

		pailie = sdg.pailieAsse();

		if (pailie.split("@")[3].equals("kong")) {

			System.out.println("你所要问的事目前吉凶未定，请您改日再测。");

		}

		else {

			String[] result = new String[7];
			result = PropertyUtil.getValue(pailie, "wenshi.properties").split(
					"@");
			String jielun = result[0];
			String guiren = result[1];
			String xiaoren = result[2];
			String jifang = result[3];
			String xiongfang = result[4];
			String jishi = result[5];
			String xiongshi = result[6];

			System.out.println("结论:" + jielun);
			System.out.println("贵人:" + guiren);
			System.out.println("小人:" + xiaoren);
			System.out.println("吉方:" + jifang);
			System.out.println("凶方:" + xiongfang);
			System.out.println("吉时:" + jishi);
			System.out.println("凶时:" + xiongshi);

		}

	}
}
