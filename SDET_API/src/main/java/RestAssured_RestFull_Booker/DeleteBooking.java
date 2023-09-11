package RestAssured_RestFull_Booker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteBooking {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		
		RestAssured.authentication = RestAssured.preemptive().basic("basic", "YWRtaW46cGFzc3dvcmQxMjM=");
		
		Response response = RestAssured.delete("/booking/2299");
		
		response.prettyPrint();
		
		response.getStatusCode();

	}

}
