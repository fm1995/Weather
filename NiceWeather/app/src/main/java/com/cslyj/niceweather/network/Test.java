package com.cslyj.niceweather.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.cslyj.niceweather.network.pojo.weather.Result;
import com.cslyj.niceweather.network.pojo.weather.Root;
import com.google.gson.Gson;

public class Test {
	public static void main(String[] args) {
		String json = getJsonStr();
		json.replaceAll("\n", "").replaceAll("\t", "").replaceAll("\r", "");
		//System.out.println(json);
		
		Gson gson = new Gson();
		Root data = gson.fromJson(json, Root.class);
		 Result result =data.getResult();
		System.out.println("data=" + result.getData());
	}

	private static String getJsonStr() {
		InputStream inputStream = Test.class.getClassLoader()
				.getResourceAsStream("weather.json");
		BufferedReader br = new BufferedReader(new InputStreamReader(
				inputStream));

		StringBuffer sb = new StringBuffer();
		String json = "";
		try {
			String line = "";
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

			json = sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return json;
	}
}
