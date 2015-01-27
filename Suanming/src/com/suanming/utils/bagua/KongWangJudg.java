/**
 * 
 */
package com.suanming.utils.bagua;

/**
 * @author liusen
 * 
 */
public class KongWangJudg {

	public String doJudg(String tigua, String kongwang, String yonggua) {

		if (kongwang.equals("chensi")) {

			if (tigua.equals("xun") || yonggua.equals("xun")) {

				return "kong";

			}

		}

		else {
			return "shi";
		}

		if (kongwang.equals("zichou")) {

			if (tigua.equals("kan") || yonggua.equals("gen")
					|| yonggua.equals("kan") || tigua.equals("gen")) {

				return "kong";

			} else {

				return "shi";

			}
		}

		if (kongwang.equals("yinmao")) {

			if (tigua.equals("zhen") || yonggua.equals("zhen")
					|| yonggua.equals("gen") || tigua.equals("gen")) {

				return "kong";

			} else {

				return "shi";

			}
		}

		if (kongwang.equals("wuwei")) {

			if (tigua.equals("li") || yonggua.equals("li")
					|| yonggua.equals("kun") || tigua.equals("kun")) {

				return "kong";

			} else {

				return "shi";

			}
		}

		if (kongwang.equals("shenyou")) {

			if (tigua.equals("kun") || yonggua.equals("dui")
					|| yonggua.equals("kun") || tigua.equals("dui")) {

				return "kong";

			} else {

				return "shi";

			}
		}

		if (kongwang.equals("xuhai")) {

			if (tigua.equals("qian") || yonggua.equals("qian")) {

				return "kong";

			} else {

				return "shi";

			}
		}

		else {

			return "false";

		}

	}
}
