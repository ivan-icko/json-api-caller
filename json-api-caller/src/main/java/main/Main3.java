package main;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import domain.Weather;

public class Main3 {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr =new FileReader("weathers.json");
			Gson gson=new GsonBuilder().setPrettyPrinting().create();
			
			Type refl=new TypeToken<LinkedList<Weather>>() {}.getType();
			
			List<Weather> weathers=new LinkedList<Weather>();
			weathers=gson.fromJson(fr,refl);
			
			for(Weather w:weathers) {
				System.out.println(w);
			}
			
			
		} catch (Exception e) {
				e.printStackTrace();
		}
	}
}
