/**
 * 
 */
package com.suanming.utils.bagua;

/**
 * @author liusen
 * 
 */
public class JudgMent {

	private String guaqi;
	private String tigua;
	private String yonggua;
	private String biangua;
	private String kongwang;
	private String wentizhonglei;

	public String getGuaqi() {
		return guaqi;
	}

	public void setGuaqi(String guaqi) {
		this.guaqi = guaqi;
	}

	public String getTigua() {
		return tigua;
	}

	public void setTigua(String tigua) {
		this.tigua = tigua;
	}

	public String getYonggua() {
		return yonggua;
	}

	public void setYonggua(String yonggua) {
		this.yonggua = yonggua;
	}

	public String getBiangua() {
		return biangua;
	}

	public void setBiangua(String biangua) {
		this.biangua = biangua;
	}

	public String getKongwang() {
		return kongwang;
	}

	public void setKongwang(String kongwang) {
		this.kongwang = kongwang;
	}

	public String getWentizhonglei() {
		return wentizhonglei;
	}

	public void setWentizhonglei(String wentizhonglei) {
		this.wentizhonglei = wentizhonglei;
	}

	public JudgMent(SuoDeGua sd) {

		this.yonggua = sd.getYonggua();
		this.tigua = sd.getTigua();
		this.kongwang = sd.getKongwang();
	}

	public void assembleIt() {

	}

}
