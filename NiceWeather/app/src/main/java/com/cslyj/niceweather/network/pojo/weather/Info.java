package com.cslyj.niceweather.network.pojo.weather;

import java.util.Arrays;

public class Info {
	private String[] kongtiao ;


	private String[] yundong ;


	private String[] ziwaixian ;


	private String[] ganmao ;


	private String[] xiche ;


	private String[] wuran ;


	private String[] chuanyi ;

	
	//
	 private String[] night ;


		private String[] day ;
		private String[] dawn ;


 

		public String[] getDawn() {
			return dawn;
		}

		public void setDawn(String[] dawn) {
			this.dawn = dawn;
		}

		public void setNight(String[] night){

		this.night = night;

		}

		public String[] getNight(){

		return this.night;

		}

		public void setDay(String[] day){

		this.day = day;

		}

		public String[] getDay() {

			return this.day;

		} 
		//

	 


	public String[] getKongtiao() {
		return kongtiao;
	}


	@Override
	public String toString() {
		return "Info [kongtiao=" + Arrays.toString(kongtiao) + ", yundong="
				+ Arrays.toString(yundong) + ", ziwaixian="
				+ Arrays.toString(ziwaixian) + ", ganmao="
				+ Arrays.toString(ganmao) + ", xiche=" + Arrays.toString(xiche)
				+ ", wuran=" + Arrays.toString(wuran) + ", chuanyi="
				+ Arrays.toString(chuanyi) + ", night="
				+ Arrays.toString(night) + ", day=" + Arrays.toString(day)
				+ ", dawn=" + Arrays.toString(dawn) + "]";
	}

	public void setKongtiao(String[] kongtiao) {
		this.kongtiao = kongtiao;
	}


	public String[] getYundong() {
		return yundong;
	}


	public void setYundong(String[] yundong) {
		this.yundong = yundong;
	}


	public String[] getZiwaixian() {
		return ziwaixian;
	}


	public void setZiwaixian(String[] ziwaixian) {
		this.ziwaixian = ziwaixian;
	}


	public String[] getGanmao() {
		return ganmao;
	}


	public void setGanmao(String[] ganmao) {
		this.ganmao = ganmao;
	}


	public String[] getXiche() {
		return xiche;
	}


	public void setXiche(String[] xiche) {
		this.xiche = xiche;
	}


	public String[] getWuran() {
		return wuran;
	}


	public void setWuran(String[] wuran) {
		this.wuran = wuran;
	}


	public String[] getChuanyi() {
		return chuanyi;
	}


	public void setChuanyi(String[] chuanyi) {
		this.chuanyi = chuanyi;
	}
	
	
	
}
