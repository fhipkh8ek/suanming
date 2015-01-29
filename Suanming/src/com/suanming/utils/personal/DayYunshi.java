package com.suanming.utils.personal;


import java.util.ArrayList;
import java.util.List;

import com.suanming.utils.base.BaseUtils;
import com.suanming.utils.base.PropertyUtil;
import com.suanming.utils.bazi.BaziInfo;

public class DayYunshi {

	
	//颜色
	private static final String[] COLORS = {"红","橙","黄","绿","黑","白","紫","蓝"};
	//适宜、忌
	private static final String[] GANDB = {"开业","安葬","安床","求子","祈福","开光","祭祀"
		,"相亲","出行","约会","装修","搬家","置业","结婚","求财","交易","合伙"};
	
	
	
	/**
	 * 
	* @Title: getColor
	* @Description: 幸运色
	* @param: inDate:个人出生日期格式:2015-01-05
	* @return: String   
	* @autor:weixin
	* @time:2015年1月27日 上午11:13:27
	 */
	public String getColor(String inDate) {
		//当前的日柱地支
		BaziInfo baziInfo = new BaziInfo();
		String dayZhi = baziInfo.getChineseDate(BaseUtils.getNowTime(2)).split(",")[1];
		Integer day_dz = Integer.parseInt(dayZhi);
		
		//个人的日柱地支
		String dayZhi2 = baziInfo.getBaziInfo(inDate, 1).substring(5,6);
		String value = PropertyUtil.getKeyByValue(dayZhi2, "dizhi.properties");
		Integer p_dz = Integer.parseInt(value);
		
		return COLORS[(p_dz+day_dz)%8];
	}
	
	/**
	 * 
	* @Title: getGoodAndBad
	* @Description: 获取适宜、忌
	* @autor:weixin
	* @return:适宜@忌
	* @time:2015年1月27日 下午1:59:15
	 */
	public String getGoodAndBad() {
		String good = "";
		String bad = "";
		
		//适宜、忌list
		List<String> list = new ArrayList<String>();
		//转换成list
		for (String string : DayYunshi.GANDB) {
			list.add(string);
		}
		
		String time = BaseUtils.getNowTime(2).split("-")[2];
		Integer tV = Integer.parseInt(time);
		
		//适宜
		good = GANDB[tV%17];
		
		if (tV==1) {
			bad = GANDB[0];
		}else {
			bad = GANDB[(tV-1)%17];
		}
		
		return good+"@"+bad;
		
	}
	
	/**
	 * 
	* @Title: getNum
	* @Description: 获取幸运数
	* @autor:weixin
	* @time:2015年1月27日 下午2:48:05
	 */
	public String getNum(String inDate) {
		//个人的日柱地支
		BaziInfo baziInfo = new BaziInfo();
		String dayZhi2 = baziInfo.getBaziInfo(inDate, 1).substring(5,6);
		String value = PropertyUtil.getKeyByValue(dayZhi2, "dizhi.properties");
		return value;
	}
	
	/**
	 * 
	* @Title: getJiAndXiong
	* @Description: 获取吉凶时辰
	* @return: 吉@凶
	* @autor:weixin
	* @time:2015年1月27日 下午3:08:37
	 */
	public String getJiAndXiong() {
		//当前的日柱地支
		BaziInfo baziInfo = new BaziInfo();
		String dayZhi = baziInfo.getBaziInfo(BaseUtils.getNowTime(2), 1).substring(5,6);
		String chonghe = BaseUtils.getChongHe(dayZhi);
		
		String ji = chonghe.split("@")[0];
		String xiong = chonghe.split("@")[1];
		
		ji = PropertyUtil.getValue(ji, "shichen.properties");
		xiong = PropertyUtil.getValue(xiong, "shichen.properties");
		
		return ji+"@"+xiong;
	}
	
	/**
	 * 
	* @Title: getBaziInfo
	* @Description: 八字
	* @param inDate
	* @param hour
	* @autor:weixin
	* @time:2015年1月27日 下午3:28:08
	 */
	public String getBaziInfo(String inDate,int hour) {
		return new BaziInfo().getBaziInfo(inDate, hour);
	}
	
	
	public static void main(String[] args) {
		//出生日期
		String inDate = "1990-02-05";
		//出生时辰
		Integer inHour = 3;
		
		//八字信息
		System.out.println(new DayYunshi().getBaziInfo(inDate, inHour));
		//幸运色
		System.out.println(new DayYunshi().getColor(inDate));
		//适宜、忌
		System.out.println(new DayYunshi().getGoodAndBad());
		//幸运数字(不变)
		System.out.println(new DayYunshi().getNum(inDate));
		//吉凶时辰
		System.out.println(new DayYunshi().getJiAndXiong());
		
		
	}
	
}
