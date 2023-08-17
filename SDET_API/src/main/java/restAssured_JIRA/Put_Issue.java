package restAssured_JIRA;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Put_Issue extends Base_Class{

	@Test(dependsOnMethods = "api.Create_Issue.Create")
	public void Put() {
		File filename = new File("./src/test/resources/putfile_restassured.json");
		Response response = RestAssured.given().contentType("application/json")
							
				.when()
				.body(filename)
				.put("/rest/api/2/issue/"+id);
	
		response.then().assertThat().statusCode(204);
		response.prettyPrint();
	}
}
