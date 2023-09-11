package RestAssured_RestFull_Booker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UpdateBooking {

	public static void main(String[] args) {
		RestAssured.baseURI= "https://restful-booker.herokuapp.com/";
	
		Response response = RestAssured.given().contentType("application/json").accept("application/json").cookie("abc123")
									   .body("{\r\n"
									   		+ "    \"firstname\" : \"James\",\r\n"
									   		+ "    \"lastname\" : \"Brown\",\r\n"
									   		+ "    \"totalprice\" : 111,\r\n"
									   		+ "    \"depositpaid\" : true,\r\n"
									   		+ "    \"bookingdates\" : {\r\n"
									   		+ "        \"checkin\" : \"2018-01-01\",\r\n"
									   		+ "        \"checkout\" : \"2019-01-01\"\r\n"
									   		+ "    },\r\n"
									   		+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
									   		+ "}")
									   .put("booking/2299");
		response.prettyPrint();
		
		System.out.println(response.statusCode());

	}

}
