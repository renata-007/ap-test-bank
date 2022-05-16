	package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ApiPost;

public class ApiPostTest {

	ApiPost apipost = new ApiPost();

	@Dado("acessar api")
	public void acessar_api() {
		apipost.acessarApi("https://teste-pratico/qa/deposito");

	}

	@Quando("escolho operacao pix")
	public void escolho_operacao_pix() {
		apipost.bodyResponsePix(null);
	}

	@Entao("valido status sucesso {int}")
	public void valido_status_sucesso(Integer int1) {
		apipost.statuscodeOperacaoPix(200);

	}

	@Quando("operacao vazia")
	public void operacao_vazia() {
		apipost.bodyResponsePix(null);
	}

	@Entao("valido status code insucesso {int}")
	public void valido_status_code_insucesso(Integer int1) {
		apipost.statuscodeOperacaovazia();


	}

}
