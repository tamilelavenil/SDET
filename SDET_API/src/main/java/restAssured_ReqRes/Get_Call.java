package restAssured_ReqRes;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Get_Call {
	@Test
	public void Get() {
		//RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		Response response = RestAssured.given().contentType("application/json").get("https://covid-19.dataflowkit.com/v1");
		response.then().assertThat().statusCode(200);
		response.prettyPrint();
	}

}
