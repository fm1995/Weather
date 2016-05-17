package com.cslyj.niceweather.network.pojo.weather;

public class Pmm25 {
	private String curPm;


	private String pm25;


	private String pm10;


	private int level;


	private String quality;


	private String des;


	
	@Override
	public String toString() {
		return "Pmm25 [curPm=" + curPm + ", pm25=" + pm25 + ", pm10=" + pm10
				+ ", level=" + level + ", quality=" + quality + ", des=" + des
				+ "]";
	}

	public void setCurPm(String curPm){

	this.curPm = curPm;

	}

	public String getCurPm(){

	return this.curPm;

	}

	public void setPm25(String pm25){

	this.pm25 = pm25;

	}

	public String getPm25(){

	return this.pm25;

	}

	public void setPm10(String pm10){

	this.pm10 = pm10;

	}

	public String getPm10(){

	return this.pm10;

	}

	public void setLevel(int level){

	this.level = level;

	}

	public int getLevel(){

	return this.level;

	}

	public void setQuality(String quality){

	this.quality = quality;

	}

	public String getQuality(){

	return this.quality;

	}

	public void setDes(String des){

	this.des = des;

	}

	public String getDes(){

	return this.des;

	}
}
