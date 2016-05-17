package com.cslyj.niceweather.network.pojo.weather;

/**
 * Created by Barry on 2016/5/14.
 */
public class Result {
     private Data data;


    public void setData(Data data){

        this.data = data;

    }

    public Data getData(){

        return this.data;

    }

	@Override
	public String toString() {
		return "Result [data=" + data + "]";
	}

	 
	
  
}
