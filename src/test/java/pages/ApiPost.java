package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.StringContains;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiPost {

	Response response;

	public Response acessarApi(String string) {

		return response = RestAssured.post();

	}

	public void statusCode(int status) {

		int statusCode = response.getStatusCode();
		assertEquals(status, statusCode);
	}

	public void body(String texto) {

		String bodyResponse = response.asString();
		assertThat(bodyResponse, StringContains.containsString(texto));
	}

}
