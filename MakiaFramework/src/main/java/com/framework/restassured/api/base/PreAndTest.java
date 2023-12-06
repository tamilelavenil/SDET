package com.framework.restassured.api.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.framework.utils.DataLibrary;
import com.framework.utils.Reporter;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PreAndTest extends Reporter{	
	  
	
	@BeforeMethod
	public void beforeMethod() throws FileNotFoundException, IOException {
			
		setNode();
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File("./src/main/resources/config.properties")));
	
		//RestAssured.baseURI="https://login.salesforce.com/services/oauth2/token";
		
		   Response response = RestAssured.given()
	                .formParam("grant_type", "password")
	                .formParam("client_id", prop.getProperty("client_id"))
	                .formParam("client_secret", prop.getProperty("client_secret"))
	                .formParam("username", prop.getProperty("username"))
	                .formParam("password", prop.getProperty("password"))
	                .contentType("application/x-www-form-urlencoded")
	                .post("https://login.salesforce.com/services/oauth2/token");
		    response.prettyPrint();
		    String accessToken = response.jsonPath().get("access_token");
		    
		    RestAssured.baseURI="https://"+prop.getProperty("server")+"/"+prop.getProperty("resources")+"/";
			RestAssured.authentication=RestAssured.oauth2(accessToken);
	
	
	}
	
	
	@DataProvider(name="fetchData")
	public  Object[][] getData(){
		if(dataFileType.equalsIgnoreCase("Excel"))
			return DataLibrary.getSheet(dataFileName);	
		else if(dataFileType.equalsIgnoreCase("JSON")){
			Object[][] data = new Object[1][1];
			data[0][0] = new File("./data/"+dataFileName+"."+dataFileType);
			System.out.println(data[0][0]);
			return data;
		}else {
			return null;
		}
			
	}
	
	
}
