package restAssured_JIRA;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Create_Issue extends Base_Class	{

	@Test
	
	public void Create() {
	Response response = RestAssured.given().contentType("application/json")
							
							.when()
							.body("{\r\n"
									+ "    \"fields\": {\r\n"
									+ "    \"project\":\r\n"
									+ "                {\r\n"
									+ "                    \"key\": \"TES\"\r\n"
									+ "                },\r\n"
									+ "    \"summary\": \"create issue in RA project\",\r\n"
									+ "    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
									+ "    \"issuetype\": {\r\n"
									+ "                    \"name\": \"Bug\"\r\n"
									+ "                }\r\n"
									+ "    }\r\n"
									+ "}\r\n"
									+ "")
							.post("/rest/api/2/issue/");
		response.prettyPrint();
		response.then().assertThat().statusCode(201);
	//	response.then().assertThat().body("key",Matchers.equalTo("TES-2826"));
		id= response.jsonPath().get("id");
		System.out.println(id);
		
		
		
		}
}
