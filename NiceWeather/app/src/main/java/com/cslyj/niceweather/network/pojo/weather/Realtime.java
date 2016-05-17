package com.cslyj.niceweather.network.pojo.weather;

import java.util.Map;

public class Realtime {
	
	private Map<String, String> wind;


	private String time;


	 private Map<String, String> weather;


	private int dataUptime;


	private String date;


	private String city_code;


	private String city_name;


	private int week;


	private String moon;


	@Override
	public String toString() {
		return "Realtime [wind=" + wind + ", time=" + time + ", weather="
				+ weather + ", dataUptime=" + dataUptime + ", date=" + date
				+ ", city_code=" + city_code + ", city_name=" + city_name
				+ ", week=" + week + ", moon=" + moon + "]";
	}

	public Map<String, String> getWind() {
		return wind;
	}

	public void setWind(Map<String, String> wind) {
		this.wind = wind;
	}

	public void setTime(String time){

	this.time = time;

	}

	public String getTime(){

	return this.time;

	}

	  

	public Map<String, String> getWeather() {
		return weather;
	}

	public void setWeather(Map<String, String> weather) {
		this.weather = weather;
	}

	public void setDataUptime(int dataUptime){

	this.dataUptime = dataUptime;

	}

	public int getDataUptime(){

	return this.dataUptime;

	}

	public void setDate(String date){

	this.date = date;

	}

	public String getDate(){

	return this.date;

	}

	public void setCity_code(String city_code){

	this.city_code = city_code;

	}

	public String getCity_code(){

	return this.city_code;

	}

	public void setCity_name(String city_name){

	this.city_name = city_name;

	}

	public String getCity_name(){

	return this.city_name;

	}

	public void setWeek(int week){

	this.week = week;

	}

	public int getWeek(){

	return this.week;

	}

	public void setMoon(String moon){

	this.moon = moon;

	}

	public String getMoon(){

	return this.moon;

	}
}
