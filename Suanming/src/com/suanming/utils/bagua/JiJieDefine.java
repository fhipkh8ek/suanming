/**
 * 
 */
package com.suanming.utils.bagua;

/**
 * @author liusen
 *
 */
public class JiJieDefine {
	
	public String seasenDefine(String jijie){
		
 if (jijie.equals("子")||jijie.equals("亥")) {
	 
	 return "winter";
 }
	 else if (jijie.equals("巳")||jijie.equals("午")) {
		
		 return " summer";
	}
 
	 else if (jijie.equals("申")||jijie.equals("酉")) {
		
		 return "autumn";
		 
	} 
 
	 else if (jijie.equals("寅")||jijie.equals("卯")) {
		
		 return "spring";
	}
	
	 else if (jijie.equals("辰")||jijie.equals("戌")||jijie.equals("丑")||jijie.equals("未")) {
		
		 return "four";
	}
 
	 else {
		return "ll";
	}
}
	
}

