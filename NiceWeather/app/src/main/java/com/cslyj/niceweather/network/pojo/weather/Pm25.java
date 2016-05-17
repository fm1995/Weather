package com.cslyj.niceweather.network.pojo.weather;

public class Pm25 {
	private String key;


	private int show_desc;


	private Pmm25 pm25;


	private String dateTime;


	private String cityName;


	@Override
	public String toString() {
		return "Pm25 [key=" + key + ", show_desc=" + show_desc + ", pm25="
				+ pm25 + ", dateTime=" + dateTime + ", cityName=" + cityName
				+ "]";
	}

	public void setKey(String key){

	this.key = key;

	}

	public String getKey(){

	return this.key;

	}

	public void setShow_desc(int show_desc){

	this.show_desc = show_desc;

	}

	public int getShow_desc(){

	return this.show_desc;

	}

	public void setPm25(Pmm25 pm25) {
		this.pm25 = pm25;
	}
	public Pmm25 getPm25() {
		return pm25;
	}

	public void setDateTime(String dateTime){

	this.dateTime = dateTime;

	}

	public String getDateTime(){

	return this.dateTime;

	}

	public void setCityName(String cityName){

	this.cityName = cityName;

	}

	public String getCityName(){

	return this.cityName;

	}
}
