package logic;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.YamlUtils;

public class ConsultaRacaCaesLogic {

    private static Response response;

    public static Response consultaListaRacaCachorros(){
        HashMap<String,String> map = new HashMap<>();
        response = RestAssured.given()
                .get(YamlUtils.get("consultaListaTodasRacas.url"))
                .then()
                .extract().response();
        return response;
    }

}
