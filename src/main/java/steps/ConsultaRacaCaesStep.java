package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import logic.ConsultaRacaCaesLogic;
import utils.AssertUtils;

public class ConsultaRacaCaesStep {

    private static Response response;
    private static final String SRC_TEST_RESOURCE_SCHEMA_LIST_DOG = "schemas\\consulta-racas-cachorros-sucesso.json";

    @Given("que realize requisição GET buscando a lista de todos cães")
    public void consultoListaRacas() {
        response = ConsultaRacaCaesLogic.consultaListaRacaCachorros();
    }

    @Then("retorna status code {int} com a lista completa dos cães")
    public void retornaListaRacas(int statusCode) {
        response = AssertUtils.assertSchemaValidation(statusCode, response, SRC_TEST_RESOURCE_SCHEMA_LIST_DOG);
    }
}
