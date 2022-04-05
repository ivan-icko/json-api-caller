package main;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main4 {

	public static void main(String[] args) {
		JsonObject weather=new JsonObject();
		
		
		JsonObject location=new JsonObject();
		location.addProperty("name", "New York");
		location.addProperty("country", "United states of America");
		
		JsonObject current=new JsonObject();
		current.addProperty("temperature", 22);
		current.addProperty("wind_speed", 22);
		current.addProperty("pressure", 1);
		current.addProperty("humidity", 47);
		
		
		weather.add("location", location);
		weather.add("current", current);
		
		try(FileWriter out = new FileWriter("rucni_upis.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			gson.toJson(weather, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
