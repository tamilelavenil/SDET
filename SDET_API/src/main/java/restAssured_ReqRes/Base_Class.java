package restAssured_ReqRes;

import io.restassured.RestAssured;
import org.testng.TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base_Class {
	public static String id;
	@BeforeMethod
	public void Base() {
		RestAssured.baseURI = "https://covid-19.dataflowkit.com/";
		RestAssured.authentication = RestAssured.preemptive().basic("", ""); 

	}

}
