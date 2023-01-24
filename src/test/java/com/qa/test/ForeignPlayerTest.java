package com.qa.test;

import java.io.IOException;
import java.text.ParseException;
import org.json.simple.JSONArray;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.utilities.Constants;
import com.qa.utilities.Utilities;

public class ForeignPlayerTest {

	// Test to validate that the team has only 4 foreign players
	
	@Test
	public void foreignPlayersTest() throws IOException, ParseException, Throwable	{
		
		JSONArray array = Utilities.readFile(Constants.Json_File_Path, Constants.Attribute_Value);
		int foreignCountValue = Utilities.getForeignPlayerCount(array,Constants.Country_Attribute,Constants.Country_Name );
		Assert.assertEquals(foreignCountValue, Constants.Expected_Foreign_Players);
		System.out.println("In RCB team, there are " + foreignCountValue + " foreign players");
		
	}
	
}
