package com.suanming.utils.qiancheng.twoDemension;

public class stacticMethod {

	public static String WUxing(String rigan, String shishen) {

		String[][] shishenWuXing = {

				
				//比肩
				{ "jia", "yi", "bing", "ding", "wu", "ji", "geng", "xin","ren", "gui" },
				//劫财		
				{ "yi", "jia", "ding", "bing", "ji", "wu", "xin", "geng","gui", "ren" },
				//食神		
				{ "bing", "ding", "wu", "ji", "geng", "xin", "ren", "gui","jia", "yi" },
				//伤官		
				{ "ding", "bing", "ji", "wu", "xin", "geng", "gui", "ren","yi", "jia" },
				//正财		
				{ "ji", "wu", "xin", "geng", "gui", "ren", "yi", "jia", "ding","bing" },
				//偏财		
				{ "wu", "ji", "geng", "xin", "ren", "gui", "jia", "yi", "bing","ding" },
				//正官		
				{ "xin", "geng", "gui", "ren", "yi", "jia", "ding","bing","ding", "wu"},
				//七杀	
				{ "geng", "xin", "ren", "gui", "jia", "yi", "bing", "ding","wu", "ji" },
				//正印		
				{ "gui", "ren", "yi", "jia", "ding", "bing", "ji", "wu", "xin","geng" },
				//偏印		
				{ "ren", "gui", "jia", "yi", "bing", "ding", "wu", "ji","geng", "xin" },
						

		};

		return shishenWuXing[shuzi(shishen)][shuzi(rigan)];

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
		System.out.println(WUxing("geng", "zhengyin"));

	}
}
