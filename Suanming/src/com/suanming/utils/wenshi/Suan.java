package com.suanming.utils.wenshi;

import com.suanming.utils.bagua.*;
import com.suanming.utils.base.PropertyUtil;

public class Suan {

	public static void main(String[] args) {

		SuanGuaInfo suanGuaInfo = new SuanGuaInfo("未",11, 8, 7, "辛", "酉",
				"er", "戌");

		SuoDeGua sdg = new SuoDeGua();

		String pailie;

		SanGuaDingWei sgd = new SanGuaDingWei(suanGuaInfo);

		sdg = sgd.sanGuan();

		pailie = sdg.pailieAsse();
		
		 if (pailie.split("@")[3].equals("kong")){
			
			 
			 
			 System.out.println("你所要问的事目前吉凶未定，请您改日再测。");
			 
		}
		
		 
		 else{
			 
			 System.out.println(PropertyUtil.getValue(pailie, "wenshi.properties"));
		 }
	
	}
}
