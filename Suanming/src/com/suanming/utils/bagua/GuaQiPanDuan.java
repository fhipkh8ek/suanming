/**
 * 
 */
package com.suanming.utils.bagua;

/**
 * @author liusen
 * 
 */
public class GuaQiPanDuan {

	public String doJudg(String gua, String jijie) {

		if (gua.equals("qian") || gua.equals("dui")) {

			if (jijie.equals("autumn")) {

				return "wang";

			}

			else if (jijie.equals("four")) {

				return "xiang";

			}

			else if (jijie.equals("winter")) {

				return "xiu";
			}

			else if (jijie.equals("spring")) {

				return "qiu";
			}

			else if (jijie.equals("summer")) {

				return "si";

			}

		}

		else if (gua.equals("xun") || gua.equals("zhen")) {

			if (jijie.equals("spring")) {

				return "wang";
			}

			else if (jijie.equals("winter")) {

				return "xiang";

			}

			else if (jijie.equals("summer")) {

				return "xiu";

			}

			else if (jijie.equals("four")) {

				return "qiu";
			}

			else if (jijie.equals("autumn")) {

				return "si";
			}

		}

		else if (gua.equals("gen") || gua.equals("kun")) {

			if (jijie.equals("four")) {

				return "wang";

			}

			else if (jijie.equals("summer")) {

				return "xiang";
			}

			else if (jijie.equals("autumn")) {

				return "xiu";

			}

			else if (jijie.equals("winter")) {

				return "qiu";

			}

			else if (jijie.equals("spring")) {

				return "si";

			}

		}

		else if (gua.equals("kan")) {

			if (jijie.equals("winter")) {

				return "wang";

			}

			else if (jijie.equals("autumn")) {

				return "xiang";

			}

			else if (jijie.equals("spring")) {

				return "xiu";

			}

			else if (jijie.equals("summer")) {

				return "qiu";

			}

			else if (jijie.equals("four")) {

				return "si";
			}
		}

		else if (gua.equals("li")) {

			if (jijie.equals("winter")) {

				return "si";

			}

			else if (jijie.equals("autumn")) {

				return "qiu";

			}

			else if (jijie.equals("spring")) {

				return "xiangs";

			}

			else if (jijie.equals("summer")) {

				return "wang";

			}

			else if (jijie.equals("four")) {

				return "xiu";
			}
		}

		return jijie;

	}
}
