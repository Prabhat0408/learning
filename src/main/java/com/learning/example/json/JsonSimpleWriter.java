package com.learning.example.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSimpleWriter {
		
	private static String dir = System.getProperty("user.dir");
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		
		obj.put("name", "Pankaj Kumar");
		obj.put("age", new Integer(32));

		JSONArray cities = new JSONArray();
		cities.add("New York");
		cities.add("Bangalore");
		cities.add("San Francisco");

		obj.put("cities", cities);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("user1");
		list.add("user2");
		list.add("user3");
		
		obj.put("users", list);
		

		try {
			Path path = Paths.get(dir+"\\data.json");
			System.out.println(path.toAbsolutePath());
			File f = new File(dir+"\\data.json");
			if(f.exists()) {
				f.delete();
			}
			
			
			FileWriter file = new FileWriter(dir+"\\data.json");
			file.write(obj.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print(obj.toJSONString());

	}

}


		


