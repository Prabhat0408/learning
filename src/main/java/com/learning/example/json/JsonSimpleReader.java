package com.learning.example.json;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimpleReader {
	private static String dir = System.getProperty("user.dir");

	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		JSONParser parser = new JSONParser();
		Reader reader = new FileReader(dir+"\\data.json");

		Object jsonObj = parser.parse(reader);
		//one way
		//JSONObject jsonObject = (JSONObject) jsonObj;
		
		//other wasy
		JSONObject  jsonObject=new JSONObject();
		
		

		String name = (String) jsonObject.get("name");
		System.out.println("Name = " + name);

		long age = (Long) jsonObject.get("age");
		System.out.println("Age = " + age);

		JSONArray cities = (JSONArray) jsonObject.get("cities");
		
		//JsonArray cant be cast to List Note: u can direct convert jsonarray to list so create list and element into it from JsonArry
		JSONArray users = (JSONArray) jsonObject.get("users");
		
		
		
		System.out.println(users.size());
		
		@SuppressWarnings("unchecked")
		Iterator<String> it = cities.iterator();
		while (it.hasNext()) {
			System.out.println("City = " + it.next());
		}
		reader.close();
	}

}



