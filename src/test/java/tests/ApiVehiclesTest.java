package tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isA;

import java.util.ArrayList;

import org.hamcrest.Matchers;
import org.junit.Test;

import core.BaseTest;

public class ApiVehiclesTest extends BaseTest {

	@Test
	public void validarRetornoApi() {
		ArrayList<String> list = given()
		.when()
			.get("/Vehicles?Page=1")
		.then()
			.extract().path("");
		
		System.out.println(list);
	}
	
	@Test
	public void validarCampoID() {
		given()
		.when()
			.get("/Vehicles?Page=1")
		.then()
			.body("ID[0]", is(1))
			.body("ID[0]", isA(Integer.class))
			.body("ID", isA(ArrayList.class));
	}

	@Test
	public void validarCampoMake() {
		given()
		.when()
			.get("/Vehicles?Page=1")
		.then()
			.body("Make[0]", Matchers.is("Honda"))
			.body("Make[0]", Matchers.isA(String.class))
			.body("Make", Matchers.isA(ArrayList.class));
	}
	
	@Test
	public void validarCampoModel() {
		given()
		.when()
			.get("/Vehicles?Page=1")
		.then()
			.body("Model[0]", Matchers.is("City"))
			.body("Make[0]", Matchers.isA(String.class))
			.body("Make", Matchers.isA(ArrayList.class));
	}
	
	@Test
	public void validarCampoVersion() {
		given()
		.when()
			.get("/Vehicles?Page=1")
		.then()
			.body("Version[0]", Matchers.is("2.0 EXL 4X4 16V GASOLINA 4P AUTOMÁTICO"))
			.body("Version[0]", Matchers.isA(String.class))
			.body("Version", Matchers.isA(ArrayList.class));
	}
	
	@Test
	public void validarCampoYearModel() {
		given()
		.when()
			.get("/Vehicles?Page=1")
		.then()
			.body("YearModel[0]", Matchers.is(2018))
			.body("YearModel[0]", Matchers.isA(Integer.class))
			.body("YearModel", Matchers.isA(ArrayList.class));
	}
	
	@Test
	public void validarCampoYearFab() {
		given()
		.when()
			.get("/Vehicles?Page=1")
		.then()
			.body("YearFab[0]", Matchers.is(2017))
			.body("YearFab[0]", Matchers.isA(Integer.class))
			.body("YearFab", Matchers.isA(ArrayList.class));
	}

	
	
	
	
}
