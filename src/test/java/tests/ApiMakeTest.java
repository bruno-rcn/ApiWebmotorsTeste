package tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isA;

import java.util.ArrayList;

import org.hamcrest.Matchers;
import org.junit.Test;

import core.BaseTest;

public class ApiMakeTest extends BaseTest {

	@Test
	public void validarRetornoApi() {
		ArrayList<String> list = given()
		.when()
			.get("/Make")
		.then()
			.extract().path("");
		
		System.out.println(list);
	}
	
	@Test
	public void validarCampoID() {
		given()
		.when()
			.get("/Make")
		.then()
			.body("ID[0]", is(1))
			.body("ID[0]", isA(Integer.class))
			.body("ID", isA(ArrayList.class));
	}

	@Test
	public void validarCampoName() {
		given()
		.when()
			.get("/Make")
		.then()
			.body("Name[0]", Matchers.is("Chevrolet"))
			.body("Name[0]", Matchers.isA(String.class))
			.body("Name", Matchers.isA(ArrayList.class));
	}
}
