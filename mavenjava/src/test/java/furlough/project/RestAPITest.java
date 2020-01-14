package furlough.project;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestAPITest {

	@Test
	public void weatherAPI()
	{
		RestAssured.baseURI="http://restapi.demoqa.com";

		given().
		when().
			get("/utilities/weatherfull/city/jammu").
			
			then().assertThat().statusCode(200);
		System.out.print("WEATHER API");
	}
	
}
