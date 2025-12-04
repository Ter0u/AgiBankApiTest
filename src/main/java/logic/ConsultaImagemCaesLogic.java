package logic;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.YamlUtils;

import java.util.HashMap;

public class ConsultaImagemCaesLogic {

    private static Response response;

    public static Response consultaListaDeImagensRacaCachorros(){
        HashMap<String,String> map = new HashMap<>();
        response = RestAssured.given()
                .get(YamlUtils.get("consultaImagensDeRacas.url"))
                .then()
                .extract().response();
        return response;
    }

}
