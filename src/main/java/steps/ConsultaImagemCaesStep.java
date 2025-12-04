package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import logic.ConsultaImagemCaesLogic;
import utils.AssertUtils;

public class ConsultaImagemCaesStep {

    private static Response response;
    private static final String SRC_TEST_RESOURCE_SCHEMA_LIST_DOG_IMAGES = "schemas\\consulta-lista-imagem-sucesso.json";

    @Given("que realize requisição GET para o endpoint de imagens de cães")
    public void consultoListaDeImagemDeRacasDeCaes() {
        response = ConsultaImagemCaesLogic.consultaListaDeImagensRacaCachorros();
    }

    @Then("retorna status code {int} com uma lista de imagem dos cães")
    public void retornaListaDeImagemDeRacasDeCaes(int statusCode) {
       response = AssertUtils.assertSchemaValidation(statusCode, response, SRC_TEST_RESOURCE_SCHEMA_LIST_DOG_IMAGES);
    }
}
