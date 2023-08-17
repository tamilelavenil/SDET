package restAssured_JIRA;
import io.restassured.RestAssured;
import org.testng.TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Base_Class {
	public static String id;
	@BeforeMethod
	public void Base() {
		RestAssured.baseURI = "https://testjirafeb2023.atlassian.net";
		
	RestAssured.authentication = RestAssured.preemptive().basic("Feb2023restAPI@gmail.com","ATATT3xFfGF0d39TsozfFQWR0Hvr0UfPqKKtyFJxQvnaGGtSvez8FvO"
				+ "vhfzSTapOBEUGx0ZAdIbWfM5tjeU8rFw7Rh72pbanmBdYhtysnC3yH89HMn-lXz9PTGKVKtWFV2vp6GyZ_75P27LqLCAbHxqOjYds1SNn5oFZQFDi3ufeUI3cJwdCy20=5543D93F"); 
	
	
	
	
	
	
	}

	

}
