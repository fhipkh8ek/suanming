/**
 * 
 */
package com.suanming.utils.bagua;

/**
 * @author liusen
 * 
 */
public class SuanGuaInfo {

	private String nianzhi;
	private int yueshu;
	private int rishu;
	private int shishu;
	private String rigan;
	private String rizhi;
	private String wenti;
	private String jijie;
    private String pailie;
	
	public String getJijie() {
		return jijie;
	}

	public void setJijie(String jijie) {
		this.jijie = jijie;
	}

	public SuanGuaInfo(String nianzhi, int yueshu, int rishu, int shishu,
			String rigan, String rizhi, String wenti, String yuezhi) {
		JiJieDefine jDefine = new JiJieDefine();

		this.nianzhi = nianzhi;
		this.yueshu = yueshu;
		this.rishu = rishu;
		this.shishu = shishu;
		this.rigan = rigan;
		this.rizhi = rizhi;
		this.wenti = wenti;
		this.jijie = jDefine.seasenDefine(yuezhi);
		
	}

	public String getNianzhi() {
		return nianzhi;
	}

	public void setNianzhi(String nianzhi) {
		this.nianzhi = nianzhi;
	}

	public int getYueshu() {
		return yueshu;
	}

	public void setYueshu(int yueshu) {
		this.yueshu = yueshu;
	}

	public int getRishu() {
		return rishu;
	}

	public void setRishu(int rishu) {
		this.rishu = rishu;
	}

	public int getshiShu() {
		return shishu;
	}

	public void setshiShu(int shishu) {
		this.shishu = shishu;
	}

	public String getRigan() {
		return rigan;
	}

	public void setRigan(String rigan) {
		this.rigan = rigan;
	}

	public String getRizhi() {
		return rizhi;
	}

	public void setRizhi(String rizhi) {
		this.rizhi = rizhi;
	}

	public String getWenti() {
		return wenti;
	}

	public void setWenti(String wenti) {
		this.wenti = wenti;
	}

	public int getShishu() {
		return shishu;
	}

	public void setShishu(int shishu) {
		this.shishu = shishu;
	}

	public String getPailie() {
		return pailie;
	}

	public void setPailie(String pailie) {
		this.pailie = pailie;
	}
	
}
