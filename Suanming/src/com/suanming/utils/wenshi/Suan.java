package com.suanming.utils.wenshi;

import com.suanming.utils.bagua.*;

public class Suan {

	public static void main(String[] args) {

		SuanGuaInfo suanGuaInfo = new SuanGuaInfo("午", 11, 4, 7, "辛", "酉",
				"wu", "戌");

		SuoDeGua sdg = new SuoDeGua();

		String pailie;

		SanGuaDingWei sgd = new SanGuaDingWei(suanGuaInfo);

		sdg = sgd.sanGuan();

		pailie = sdg.pailieAsse();

		System.out.println(pailie);

	}
}
