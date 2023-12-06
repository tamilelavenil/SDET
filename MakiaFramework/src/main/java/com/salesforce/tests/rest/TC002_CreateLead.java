package com.salesforce.tests.rest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.restassured.api.base.RESTAssuredBase;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class TC002_CreateLead extends RESTAssuredBase{
	
	@BeforeTest//Reporting
	public void setValues() {
		testcaseName = "Create New Lead";
		testDescription = "Create New Lead using REST API";
		authors = "Hari";
		category = "REST";
		//dataProvider
		dataFileName = "TC001";
	    dataFileType = "JSON";
	}

	@Test(dataProvider = "fetchData")
	public void createLead(File file) {	
		 Response response = postWithBodyAsFileAndUrl(file, "Lead"); 
		 String id = response.jsonPath().get("id");
		 System.out.println(id);
		verifyResponseCode(response, 201);
		
		 
		
	}


}




















