package RestAssured_RestFull_Booker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetBookingDetailsWithId {

	public static void main(String[] args) {
		RestAssured.baseURI="https://restful-booker.herokuapp.com/";
		
		Response response = RestAssured.get("/Booking/641");
		
		response.prettyPrint();
		
		System.out.println(response.then().assertThat().statusCode(200));

	}

}
