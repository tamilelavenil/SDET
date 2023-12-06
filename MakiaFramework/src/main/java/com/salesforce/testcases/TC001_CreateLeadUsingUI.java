package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.restassured.api.base.RESTAssuredBase;
import com.framework.testng.api.base.SalesforceMethods;
import com.salesforce.pages.LoginPage;

import io.restassured.response.Response;

public class TC001_CreateLeadUsingUI extends SalesforceMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "Create New Lead using UI";
		testDescription ="Create new lead using Web";
		authors="Hari";
		category ="Smoke";
		excelFileName="CreateLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void createNewAccount(String username, String password) {
		
		/*
		 * Response response = RESTAssuredBase.postWithJsonAsBody(
		 * "{\"FirstName\":\"Hari\",\"LastName\":\"R\",\"Company\":\"Qeagle\"}",
		 * "Lead"); String id = response.jsonPath().get("id"); System.out.println(id);
		 * RESTAssuredBase.verifyResponseCode(response, 201);
		 */
		
		
		  new LoginPage()
		  .typeUsername(username)
		  .typePassword(password)
		  .clickLogIn()
		  .verifyHomePage();
		 
	}

}
