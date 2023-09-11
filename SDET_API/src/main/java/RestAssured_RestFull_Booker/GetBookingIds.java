package RestAssured_RestFull_Booker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetBookingIds {

	public static void main(String[] args) {
		RestAssured.baseURI="https://restful-booker.herokuapp.com/";
		
		Response response = RestAssured.get("/booking");
		
		response.prettyPrint();
		
		response.then().assertThat().statusCode(200);
										

	}

}
