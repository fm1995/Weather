package com.cslyj.niceweather.network.pojo.weather;

import java.util.Arrays;

public class Weather {
	 
	private String date;


	 private Info info;


	private String week;


	private String nongli;


	@Override
	public String toString() {
		return "Weather [date=" + date + ", info=" + info + ", week=" + week
				+ ", nongli=" + nongli + "]";
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

	public void setWeek(String week){

	this.week = week;

	}

	public String getWeek(){

	return this.week;

	}

	public void setNongli(String nongli){

	this.nongli = nongli;

	}

	public String getNongli(){

	return this.nongli;

	}
	/*
	 class Info {
		 private String[] night ;


		private String[] day ;
		private String[] dawn ;



		@Override
		public String toString() {
			return "Info [night=" + Arrays.toString(night) + ", day="
					+ Arrays.toString(day) + ", dawn=" + Arrays.toString(dawn)
					+ "]";
		}

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
	}*/
}
