package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import domain.Weather;

public class Main1 {

	public static String ACCESS_KEY = "";

	public static void main(String[] args) {

		try {

			
			  URL url = new URL("http://api.weatherstack.com/current?access_key=" +
			  ACCESS_KEY + "&query=New York"); 
			  HttpURLConnection con = (HttpURLConnection)url.openConnection(); 
			  con.setRequestMethod("GET");
			  
			  
			  BufferedReader ulaz = new BufferedReader(new InputStreamReader(con.getInputStream()));
			  
			  Gson gson = new GsonBuilder().create();
			  
			  JsonObject result = gson.fromJson(ulaz, JsonObject.class);
			  
			  
			  Weather test=gson.fromJson(result, Weather.class);
			 
			  
			  ulaz.close(); 
			  System.out.println(test);
			 

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
