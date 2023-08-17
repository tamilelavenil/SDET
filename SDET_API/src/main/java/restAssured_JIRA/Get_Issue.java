package restAssured_JIRA;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Issue extends Base_Class {

	
	@Test(dependsOnMethods = "api.Create_Issue.Create")
	public void Get() {
		
		Response response = RestAssured.given().contentType("application/json").get("/rest/api/2/issue/"+id);
		response.then().assertThat().statusCode(200);
		response.prettyPrint();
		
	}
	
	
	
}
