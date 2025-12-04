package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import logic.ConsultaImagemAleatoriaCaesLogic;
import utils.AssertUtils;

public class ConsultaImagemAleatoriaCaesStep {

    private static Response response;
    private static final String SRC_TEST_RESOURCE_SCHEMA_RANDOM_DOG_IMAGES = "schemas\\consulta-imagem-aleatoria-sucesso.json";

    @Given("que realize requisição GET para o endpoint de imagem aleatória")
    public void consultoImagemAleatoriaDeRacasDeCaes() {
        response = ConsultaImagemAleatoriaCaesLogic.consultaImagemAleatoriaDeRacaCachorro();
    }

    @Then("retorna status code {int} com imagem aleatória de cão")
    public void retornaImagemAleatoriaDeRacasDeCaes(int statusCode) {
        response = AssertUtils.assertSchemaValidation(statusCode, response, SRC_TEST_RESOURCE_SCHEMA_RANDOM_DOG_IMAGES);
    }
}
