/**
 * 
 */
package com.suanming.utils.bagua;

/**
 * @author liusen
 * 
 */
public class KongWangCal {

	public String kwCal(int cha) {

		switch (cha) {
		case 1:

			return "zichou";

		case 3:

			return "yinmao";

		case 5:

			return "chensi";

		case 7:

			return "wuwei";

		case 9:

			return "shenyou";

		case 11:

			return "xuhai";

		default:
			return "hh";
		}

	}

}
