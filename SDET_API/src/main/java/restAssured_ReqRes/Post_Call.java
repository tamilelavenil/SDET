package restAssured_ReqRes;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Post_Call {

	public static void main(String[] args) {
		Response response = RestAssured.given().contentType("application/json")
				.when()
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\",\r\n"
						+ "    \"id\": \"579\",\r\n"
						+ "    \"createdAt\": \"2023-09-08T00:45:31.445Z\"\r\n"
						+ "}")
				.post("https://reqres.in/api/users");
		response.then().assertThat().statusCode(201);
		response.prettyPrint();
	}

}
