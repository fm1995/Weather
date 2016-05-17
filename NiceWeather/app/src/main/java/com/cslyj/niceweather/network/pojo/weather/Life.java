package com.cslyj.niceweather.network.pojo.weather;

public class Life {
	private String date;


	private Info info;


	@Override
	public String toString() {
		return "Life [date=" + date + ", info=" + info + "]";
	}

	public void setDate(String date){

	this.date = date;

	}

	public String getDate(){

	return this.date;

	}

	public void setInfo(Info info){

	this.info = info;

	}

	public Info getInfo(){

	return this.info;

	}
}
