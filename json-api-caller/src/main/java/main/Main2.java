package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import domain.Current;
import domain.Location;
import domain.Weather;

public class Main2 {

	public static void main(String[] args) {
		Weather w1=new Weather();
		Current c1=new Current();
		Location l1=new Location();
		l1.setCountry("United state of America");
		l1.setName("New York");
		c1.setHumidity(50);
		c1.setPressure(1000);
		c1.setTemperature(14);
		c1.setWind_speed(20);
		w1.setCurrent(c1);
		w1.setLocation(l1);
		
		Weather w2=new Weather();
		Current c2=new Current();
		Location l2=new Location();
		l2.setCountry("United state of America");
		l2.setName("Los Angeles");
		c2.setHumidity(30);
		c2.setPressure(999);
		c2.setTemperature(33);
		c2.setWind_speed(2);
		w2.setCurrent(c2);
		w2.setLocation(l2);
		
		Weather[] weathers = {w1, w2};
		
		try (PrintWriter out = new PrintWriter(new FileWriter("weathers.json"))) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			out.print(gson.toJson(weathers));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
