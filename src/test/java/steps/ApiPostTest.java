package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.ApiPost;

public class ApiPostTest {

	ApiPost apipost = new ApiPost();

	@Dado("acessar api")
	public void acessar_api() {
		apipost.acessarApi("https://teste-pratico/qa/deposito");

	}

	@Entao("valido status code de retorno {int}")
	public void valido_status_code_de_retorno(Integer int1) {
		apipost.statusCode(400);

	}

	@Entao("operacao preenchida Pix")
	public void operacao_preenchida_pix() {
		apipost.body("Pix");

	}

}
