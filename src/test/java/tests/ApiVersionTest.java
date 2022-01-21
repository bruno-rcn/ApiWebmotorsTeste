package tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isA;

import java.util.ArrayList;

import org.hamcrest.Matchers;
import org.junit.Test;

import core.BaseTest;

public class ApiVersionTest extends BaseTest {
	
	@Test
	public void validarRetornoApi() {
		ArrayList<String> list = given()
		.when()
			.get("/Version?ModelID=1")
		.then()
			.extract().path("");
		
		System.out.println(list);
	}
	
	@Test
	public void validarCampoModelID() {
		given()
		.when()
			.get("/Version?ModelID=1")
		.then()
			.statusCode(200)
			.body("ModelID[0]", Matchers.is(1))
			.body("ModelID[0]", Matchers.isA(Integer.class))
			.body("ModelID", Matchers.isA(ArrayList.class));
	}
	
	@Test
	public void validarCampoID() {
		given()
		.when()
			.get("/Version?ModelID=1")
		.then()
			.body("ID[0]", is(6))
			.body("ID[0]", isA(Integer.class))
			.body("ID", isA(ArrayList.class));
	}

	@Test
	public void validarCampoName() {
		given()
		.when()
			.get("/Version?ModelID=1")
		.then()
			.body("Name[0]", Matchers.is("1.5 DX 16V FLEX 4P AUTOMÁTICO"))
			.body("Name[0]", Matchers.isA(String.class))
			.body("Name", Matchers.isA(ArrayList.class));
	}

}
