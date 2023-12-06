package com.framework.testng.api.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SalesforceMethods extends SeleniumBase {

		
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.getSheet(excelFileName);
	}

	@BeforeMethod
	public void preCondition() throws FileNotFoundException, IOException {
		setNode();
			
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File("./src/main/resources/config.properties")));
	
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
	
			startApp("chrome", false, "https://login.salesforce.com/");
	
	}

	@AfterMethod
	public void postCondition() {
		close();

	}

}
