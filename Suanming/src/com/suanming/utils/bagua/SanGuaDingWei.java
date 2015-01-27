/**
 * 
 */
package com.suanming.utils.bagua;

import java.io.File;

import com.suanming.utils.base.PropertyUtil;

/**
 * @author liusen
 * 
 */
public class SanGuaDingWei {

	private int nianshu;
	private int yueshu;
	private int rishu;
	private int shishu;
	private String shanggua;
	private String xiagua;
	private String bianguashu;
	private String bianguaming;
	private int shangguashu;
	private int xiaguashu;
	private int dongyao;
	private String biangua;
	private String bianguacheng;
	private String tigua;
	private String yonggua;
	private String huguashang;
	private String huguaxia;
	private String kongwang;
	private String jijie;
	private String wenti;

	public String getJijie() {
		return jijie;
	}

	public void setJijie(String jijie) {
		this.jijie = jijie;
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

	public String gettigua() {
		return tigua;
	}

	public void settigua(String tigua) {
		this.tigua = tigua;
	}

	public String getyonggua() {
		return yonggua;
	}

	public void setyonggua(String yonggua) {
		this.yonggua = yonggua;
	}


	public SanGuaDingWei(SuanGuaInfo sInfo) {

		String nianzhi = sInfo.getNianzhi();

		KongWangCal kCal = new KongWangCal();
		Ganzhipiyinzhuanhuan gH = new Ganzhipiyinzhuanhuan();
		int yushu;
		this.nianshu = Integer.parseInt(PropertyUtil.getValue(nianzhi,
				"nianshu.properties"));

		this.shishu = Integer.parseInt((PropertyUtil.getValue(
				Integer.toString(sInfo.getshiShu()), "shishu.properties")));
		this.yueshu = sInfo.getYueshu();
		this.rishu = sInfo.getYueshu();
		this.shangguashu = (nianshu + yueshu + rishu) % 8;
		this.xiaguashu = (nianshu + yueshu + rishu + shishu) % 8;

		yushu = (nianshu + yueshu + rishu + shishu) % 6;

		if (yushu == 0) {

			this.dongyao = 6;

		}

		else {

			this.dongyao = yushu;
		}

		int ganzhicha;
		int dizhishu = gH.hanziToPinYin(sInfo.getRigan());
		int tianganshu = gH.hanziToPinYin(sInfo.getRizhi());

		if (dizhishu <= tianganshu) {
			ganzhicha = (dizhishu + 12) - tianganshu - 1;
		} else {
			ganzhicha = dizhishu - tianganshu - 1;
		}

		this.kongwang = kCal.kwCal(ganzhicha);

		this.jijie = sInfo.getJijie();

	}

	public SuoDeGua sanGuan() {

		GuaQiPanDuan gPanDuan = new GuaQiPanDuan();
		SuoDeGua sDG = new SuoDeGua();
		KongWangJudg kwg = new KongWangJudg();

		String huguashangshu;
		String huguaxiashu;

		this.shanggua = PropertyUtil.getValue(Integer.toString(this.shangguashu),
				"shugua.properties");

		this.xiagua = PropertyUtil.getValue(Integer.toString(this.xiaguashu),
				"shugua.properties");

		huguashangshu = PropertyUtil
				.getValue(shanggua, "baguamingshu.properties")
				.substring(1, 3)
				.concat(new File(PropertyUtil.getValue(xiagua,
						"baguamingshu.properties")).toString().substring(0, 1));
		this.huguashang = PropertyUtil.getValue(huguashangshu,
				"baguashuming.properties");

		huguaxiashu = PropertyUtil
				.getValue(shanggua, "baguamingshu.properties")
				.substring(2, 3)
				.concat(new File(PropertyUtil.getValue(xiagua,
						"baguamingshu.properties")).toString().substring(0, 2));
		this.huguaxia = PropertyUtil
				.getValue(huguaxiashu, "baguashuming.properties");

		if (dongyao <= 3) {
			this.bianguashu = PropertyUtil.getValue((xiagua),
					"baguamingshu.properties");
			this.bianguaming = PropertyUtil.getValue(bianguashu,
					"baguashuming.properties");
			this.biangua = PropertyUtil.getValue(
					bianguaming.trim().concat(Integer.toString(dongyao)),
					"biangua.properties");
			this.bianguacheng = PropertyUtil.getValue(biangua,
					"baguashuming.properties");
			this.tigua = this.shanggua;
			this.yonggua = this.xiagua;
		}

		else {
			this.bianguashu = PropertyUtil.getValue((xiagua),
					"baguamingshu.properties");
			this.bianguaming = PropertyUtil.getValue(bianguashu,
					"baguashuming.properties").trim()
					+ (Integer.toString(dongyao - 3));
			this.biangua = PropertyUtil.getValue(bianguaming, "biangua.properties");
			this.bianguacheng = PropertyUtil.getValue(biangua,
					"baguashuming.properties");
			this.tigua = this.xiagua;
			this.yonggua = this.shanggua;
		}
		sDG.setBiangua(this.bianguacheng);
		sDG.setHuguashang(this.huguashang);
		sDG.setHuguaxia(this.huguaxia);
		sDG.setShanggua(this.shanggua);
		sDG.setTigua(this.tigua);
		sDG.setYonggua(this.yonggua);
		sDG.setKongwang(kwg.doJudg(this.kongwang, this.tigua, this.yonggua));
		sDG.setJiejieTigua(gPanDuan.doJudg(this.tigua, this.jijie));
		sDG.setWenti(this.wenti);

		return sDG;

	}

	public String getBianguacheng() {
		return bianguacheng;
	}

	public void setBianguacheng(String bianguacheng) {
		this.bianguacheng = bianguacheng;
	}

	public int getNianshu() {
		return nianshu;
	}

	public void setNianshu(int nianshu) {
		this.nianshu = nianshu;
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

	public int getShishu() {
		return shishu;
	}

	public void setShishu(int shishu) {
		this.shishu = shishu;
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

	public String getBianguashu() {
		return bianguashu;
	}

	public void setBianguashu(String bianguashu) {
		this.bianguashu = bianguashu;
	}

	public String getBianguaming() {
		return bianguaming;
	}

	public void setBianguaming(String bianguaming) {
		this.bianguaming = bianguaming;
	}

	public int getShangguashu() {
		return shangguashu;
	}

	public void setShangguashu(int shangguashu) {
		this.shangguashu = shangguashu;
	}

	public int getXiaguashu() {
		return xiaguashu;
	}

	public void setXiaguashu(int xiaguashu) {
		this.xiaguashu = xiaguashu;
	}

	public int getDongyao() {
		return dongyao;
	}

	public void setDongyao(int dongyao) {
		this.dongyao = dongyao;
	}

	public String getBiangua() {
		return biangua;
	}

	public void setBiangua(String biangua) {
		this.biangua = biangua;
	}

	
	public String jijieDir(String jijieTigua) {

		if (jijieTigua.equals("wang") || jijieTigua.equals("xiang")) {

			return "hao";

		}

		else {

			return "huai";

		}

	}
	
	public static void main(String[] args) {
		SuanGuaInfo sInfo = new SuanGuaInfo("午", 12, 5, 9, "辛", "丑", "wu", "丑");
		SanGuaDingWei sGuaDingWei = new SanGuaDingWei(sInfo);
		SuoDeGua sdg = sGuaDingWei.sanGuan();
		System.out.println(sdg.getBiangua());
		System.out.println(sdg.getTigua());
		System.out.println(sdg.getYonggua());
		System.out.println(sdg.getJiejieTigua());
		System.out.println(sdg.getKongwang());
	}
}
