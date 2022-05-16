package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.StringContains;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiPost {

	public Response acessarApi(String uri) {

			return response = RestAssured.post(uri);

	}

	Response response;

	public void statuscodeOperacaoPix(int status) {

		int statuscode = response.getStatusCode();
		assertEquals(200, statuscode);
		response.asString();

		RequestSpecification request = RestAssured.given().auth().preemptive().basic(null, null);
		request.header(null);
		JSONObject json = new JSONObject();
		json.put("Identificador", "Referência da conta");
		json.put("Data do Depósito", "AAAA-MM-DD");
		json.put("Hora", "HH-MM-SS");
		json.put("Valor", "Valor");
		json.put("Tipo da Operacao", "Pix");

		request.body(json.toJSONString());
	}

	public void statuscodeOperacaoVazia() {

		int statuscode = response.getStatusCode();
		assertEquals(400, statuscode);
		response.asString();

	}

	public void bodyResponsePix(String texto) {
		
		String bodyResponse = response.asString();
		assertThat(bodyResponse, StringContains.containsString(texto));
		


	
	}

}
