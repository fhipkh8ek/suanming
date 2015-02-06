package com.suanming.utils.qiancheng.twoDemension;

public class stacticMethod {

	public static String WUxing(String rigan, String shishen) {

		String[][] shishenWuXing = {

				{ "jia", "yi", "bing", "ding", "wu", "ji", "geng", "xin",
						"ren", "gui" },
				{ "yi", "jia", "ding", "bing", "ji", "wu", "xin", "geng",
						"gui", "ren" },
				{ "bing", "ding", "wu", "ji", "geng", "xin", "ren", "gui",
						"jia", "yi" },
				{ "ding", "bing", "ji", "wu", "xin", "geng", "gui", "ren",
						"yi", "jia" },
				{ "ji", "wu", "xin", "geng", "gui", "ren", "yi", "jia", "ding",
						"bing" },
				{ "wu", "ji", "geng", "xin", "ren", "gui", "jia", "yi", "bing",
						"ding" },
				{ "xin", "geng", "gui", "ren", "yi", "jia", "ding", "bing",
						"ding", "wu" },
				{ "geng", "xin", "gui", "ren", "yi", "jia", "ding", "bing",
						"wu", "ji" },
				{ "gui", "ren", "yi", "jia", "ding", "bing", "ji", "wu", "xin",
						"geng" },
				{ "ren", "gui", "jia", "yi", "bing", "ding", "wu", "ji",
						"geng", "xin" },

		};

		return shishenWuXing[shuzi(rigan)][shuzi(shishen)];

	}

	public static int shuzi(String pinyin) {

		switch (pinyin) {
		case "jia":
			return 0;
		case "yi":
			return 1;
		case "bing":
			return 2;
		case "ding":
			return 3;
		case "wu":
			return 4;
		case "ji":
			return 5;
		case "geng":
			return 6;
		case "xin":
			return 7;
		case "ren":
			return 8;
		case "gui":
			return 9;
		case "bijian":
			return 0;
		case "jiecai":
			return 1;
		case "shishen":
			return 2;
		case "shangguan":
			return 3;
		case "zhengcai":
			return 4;
		case "piancai":
			return 5;
		case "zhengguan":
			return 6;
		case "qisha":
			return 7;
		case "zhengyin":
			return 8;
		case "pianyin":
			return 9;
		default:
			return 20;
		}
	}

	public static void main(String[] args) {
		System.out.println(WUxing("jia", "shishen"));

	}
}
