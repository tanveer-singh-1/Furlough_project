import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;

public class firstExperiment {

	public static void main(String[] args) {


RestAssured.baseURI="http://restapi.demoqa.com";

given().
when().
	get("/utilities/weatherfull/city/jammu").
	
	then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
	
	}

}
