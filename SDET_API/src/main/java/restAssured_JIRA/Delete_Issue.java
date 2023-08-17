package restAssured_JIRA;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete_Issue extends Base_Class {

	
	@Test(dependsOnMethods = "api.Create_Issue.Create")
	public void Delete() {
		
		Response response = RestAssured.delete("/rest/api/2/issue/"+id);	
		response.then().assertThat().statusCode(204);
		response.prettyPrint();
		
	}
	
	
	
}
