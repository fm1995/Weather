package com.cslyj.niceweather.network.pojo.weather;

import java.util.List;

public class Data {

	private Realtime realtime;

	private Life life;

	private List<Weather> weather;

	private Pm25 pm25;

	private String date;

	private int isForeign;

	
	@Override
	public String toString() {
		return "Data [realtime=" + realtime + ", life=" + life + ", weather="
				+ weather + ", pm25=" + pm25 + ", date=" + date
				+ ", isForeign=" + isForeign + "]";
	}

	public void setRealtime(Realtime realtime) {

		this.realtime = realtime;

	}

	public Realtime getRealtime() {

		return this.realtime;

	}

	public void setLife(Life life) {

		this.life = life;

	}

	public Life getLife() {

		return this.life;

	}

	public void setWeather(List<Weather> weather) {

		this.weather = weather;

	}

	public List<Weather> getWeather() {

		return this.weather;

	}

	public void setPm25(Pm25 pm25) {

		this.pm25 = pm25;

	}

	public Pm25 getPm25() {

		return this.pm25;

	}

	public void setDate(String date) {

		this.date = date;

	}

	public String getDate() {

		return this.date;

	}

	public void setIsForeign(int isForeign) {

		this.isForeign = isForeign;

	}

	public int getIsForeign() {

		return this.isForeign;

	}
}
