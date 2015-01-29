/**
 * 
 */
package com.suanming.utils.bagua;

/**
 * @author liusen
 * 
 */

public class Ganzhipiyinzhuanhuan {

	public int hanziToPinYin(String hanzi) {

		switch (hanzi) {
		case "甲":
			return 1;
		case "乙":
			return 2;
		case "丙":
			return 3;
		case "丁":
			return 4;
		case "戊":
			return 5;
		case "己":
			return 6;
		case "庚":
			return 7;
		case "辛":
			return 8;
		case "壬":
			return 9;
		case "癸":
			return 10;
		case "子":
			return 1;
		case "丑":
			return 2;
		case "寅":
			return 3;
		case "卯":
			return 4;
		case "辰":
			return 5;
		case "巳":
			return 6;
		case "午":
			return 7;
		case "未":
			return 8;
		case "申":
			return 9;
		case "酉":
			return 10;
		case "戌":
			return 11;
		case "亥":
			return 12;
			default:
				return 00;
		}
	}
}
