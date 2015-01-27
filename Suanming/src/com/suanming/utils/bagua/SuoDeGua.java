/**
 * 
 */
package com.suanming.utils.bagua;

/**
 * @author liusen
 * 
 */
public class SuoDeGua {

	public String getKongwang() {
		return kongwang;
	}

	public void setKongwang(String kongwang) {
		this.kongwang = kongwang;
	}

	private String kongwang;
	private String shanggua;
	private String xiagua;
	private String biangua;
	private String huguashang;
	private String huguaxia;
	private String tigua;
	private String yonggua;
	private String wenti;
	private String jiejieTigua;

	public String getWenti() {
		return wenti;
	}

	public String getJiejieTigua() {
		return jiejieTigua;
	}

	public void setJiejieTigua(String jiejieTigua) {
		this.jiejieTigua = jiejieTigua;
	}

	public void setWenti(String wenti) {
		this.wenti = wenti;
	}

	public String getHuguashang() {
		return huguashang;
	}

	public void setHuguashang(String huguashang) {
		this.huguashang = huguashang;
	}

	public String getHuguaxia() {
		return huguaxia;
	}

	public void setHuguaxia(String huguaxia) {
		this.huguaxia = huguaxia;
	}

	public String getShanggua() {
		return shanggua;
	}

	public void setShanggua(String shanggua) {
		this.shanggua = shanggua;
	}

	public String getXiagua() {
		return xiagua;
	}

	public void setXiagua(String xiagua) {
		this.xiagua = xiagua;
	}

	public String getBiangua() {
		return biangua;
	}

	public void setBiangua(String biangua) {
		this.biangua = biangua;
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

	public String jijieDir(String jijieTigua) {

		if (jijieTigua.equals("wang") || jijieTigua.equals("xiang")) {

			return "hao";

		}

		else {

			return "huai";

		}

	}
}
