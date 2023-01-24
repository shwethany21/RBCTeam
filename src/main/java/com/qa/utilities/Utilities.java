package com.qa.utilities;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utilities {
	
	public static JSONArray readFile(String path, String attribute) throws Exception, ParseException {
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader(path);
		Object obj = parser.parse(reader);
		JSONObject rcbjsonobj = (JSONObject) obj;
		JSONArray array = (JSONArray) rcbjsonobj.get(attribute);
		return array;
	}
	
	public static int getForeignPlayerCount(JSONArray array, String countryValue, String cName) {
		int count = 0, foreigncount = 0;
		for (int i = 0; i < array.size(); i++){
			JSONObject player = (JSONObject) array.get(i);
			String country = (String) player.get(countryValue);
			if (country.equalsIgnoreCase(cName)){
				count++;
			} else 	{
				foreigncount++;
			}} System.out.println("Total " + cName + " players are : " + count);
		return foreigncount;	
	} 
	
	public static int getWicketKeepersCount(JSONArray array, String roleValue, String wicketKeeperValue) {
		int WicketKeeper = 0;
		for (int i = 0; i < array.size(); i++)	{
			JSONObject player = (JSONObject) array.get(i);
			String role = (String) player.get(roleValue);
			if (role.equalsIgnoreCase(wicketKeeperValue)){
				WicketKeeper++;
			}} return WicketKeeper;
	}

}
