package com.suanming.utils.wenshi;

import java.text.ParseException;


import com.suanming.utils.bagua.*;
import com.suanming.utils.base.BaseUtils;
import com.suanming.utils.base.PropertyUtil;
import com.suanming.utils.bazi.BaziInfo;
import com.suanming.utils.wenshi.pojo.Matter;

//算命问事
public class Suan {

	/**
	 * 
	 * @Title: getMatterResult
	 * @Description: 获取结果
	 * @param inDate
	 * @throws ParseException
	 * @autor:weixin
	 * @time:2015年1月30日 下午4:14:28
	 */
	public Matter getMatterResult(String type) throws ParseException {
		Matter matter = new Matter();
		String chineseTime = new BaziInfo().getBaziInfo(
				BaseUtils.getNowTime(2), 1);
		// 年支
		String nianzhi = chineseTime.substring(1, 2);
		// 阴历
		String chinese = new BaziInfo().getChineseDate(BaseUtils.getNowTime(2));
		String chineseMonth = chinese.split(",")[0];
		String chineseDay = chinese.split(",")[1];
		// 时辰
		String time = BaseUtils.dizhiToNum(BaseUtils.getNowTime(4));
		// 日干支
		String riGan = chineseTime.substring(4, 5);
		String riZhi = chineseTime.substring(5, 6);
		// 月支
		String yueZhi = chineseTime.substring(3, 4);

		
		//取断语
		SuanGuaInfo suanGuaInfo = new SuanGuaInfo(nianzhi,
				Integer.parseInt(chineseMonth), Integer.parseInt(chineseDay),
				Integer.parseInt(time), riGan, riZhi, type, yueZhi);
		SuoDeGua sdg = new SuoDeGua();
		String pailie;
		SanGuaDingWei sgd = new SanGuaDingWei(suanGuaInfo);
		sdg = sgd.sanGuan();
		pailie = sdg.pailieAsse();
		if (pailie.split("@")[3].equals("kong")) {
			matter.setOther("你所要问的事目前吉凶未定，请您改日再测。");
		}
		else {
			String[] result = PropertyUtil.getValue(pailie, "wenshi.properties").split("@");
			matter.setAssess(result[0]);
			matter.setGoodGuy(result[1]);
			matter.setBadGuy(result[2]);
			matter.setGoodDirect(result[3]);
			matter.setBadDirect(result[4]);
			matter.setGoodTime(result[5]);
			matter.setBadTime(result[6]);
		}
		return matter;
	}
}
