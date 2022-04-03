package org.firstrestassured.Mavenrestassured;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class Post_method {

	@Test
	public void post_data() {
		
	
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
		post("users/2").
		then().
		statusCode(201).
		log().all();
	}
}
