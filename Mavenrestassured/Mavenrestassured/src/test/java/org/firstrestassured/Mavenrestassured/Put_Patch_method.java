package org.firstrestassured.Mavenrestassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Put_Patch_method {

@Test
	
	public void put() {
		
	
		JSONObject request = new JSONObject();
		request.put("name", "kashyap");
		request.put("job", "QA");

		System.out.println(request.toJSONString());

		baseURI="https://reqres.in/api";
		
		given().
		header("Content-Type","applicationjason").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		put("users/2").
		then().
		statusCode(200);
		//log().all();
	}

@Test

public void patch() {
	

	JSONObject request = new JSONObject();
	request.put("name", "kashyap");
	request.put("job", "QA");

	System.out.println(request.toJSONString());

	baseURI="https://reqres.in";
	
	given().
	header("Content-Type","applicationjason").
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
	body(request.toJSONString()).
	when().
	patch("api/users/2").
	then().
	statusCode(200).
	log().all();
}

@Test

public void delete() {
	


	baseURI="https://reqres.in";

	when().
	delete("api/users/2").
	then().
	statusCode(204);
	//log().all();
}
}
