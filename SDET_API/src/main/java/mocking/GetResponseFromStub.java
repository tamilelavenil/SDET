package mocking;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class GetResponseFromStub {

	@Test
	public void stub() {
		
		RestAssured.baseURI="http://localhost/api/now/table";
		RequestSpecification inputRequest = RestAssured.given()
		.contentType("application/json")
		.when()
		.body("{\r\n"
				+ "    \"short_description\": \"Tested Incident using stub\"\r\n"
				+ "}");
		
		//Send the request
		 Response response = inputRequest.post("/incident");
		response.prettyPrint();
		System.out.println(response.getStatusCode());
	}
}
