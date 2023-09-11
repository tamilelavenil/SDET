package RestAssured_RestFull_Booker;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateBooking {
@Test
	public void getId() {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
		
		Response response = RestAssured.given().contentType("application/json")
										.when()
										.body("{\r\n"
												+ "    \"firstname\" : \"Jim\",\r\n"
												+ "    \"lastname\" : \"Brown\",\r\n"
												+ "    \"totalprice\" : 111,\r\n"
												+ "    \"depositpaid\" : true,\r\n"
												+ "    \"bookingdates\" : {\r\n"
												+ "        \"checkin\" : \"2018-01-01\",\r\n"
												+ "        \"checkout\" : \"2019-01-01\"\r\n"
												+ "    },\r\n"
												+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
												+ "}")
										.post("/booking");
			
		
		response.prettyPrint();
	}
}
