package com.qa.test;

import java.io.IOException;
import java.text.ParseException;
import org.json.simple.JSONArray;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.utilities.Constants;
import com.qa.utilities.Utilities;

public class WicketKeeperTest {

	// Test to validate that there is at least one wicket keeper
	
	@Test
	public void wicketKeeperTest() throws IOException, ParseException, Throwable{
		JSONArray array = Utilities.readFile(Constants.Json_File_Path, Constants.Attribute_Value);	
		int wicketKeeperCount = Utilities.getWicketKeepersCount(array, Constants.Role_Attribute, Constants.Wicket_Keeper_Attribute);
		Assert.assertNotEquals(wicketKeeperCount, Constants.Not_Zero_Wicket_Keeper);
		System.out.println( "There are "+ wicketKeeperCount + " wicket Keeper in the RBC Team");
	}

}
