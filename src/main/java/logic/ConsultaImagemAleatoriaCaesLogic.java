package logic;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.YamlUtils;

import java.util.HashMap;

public class ConsultaImagemAleatoriaCaesLogic {

    private static Response response;

    public static Response consultaImagemAleatoriaDeRacaCachorro(){
        HashMap<String,String> map = new HashMap<>();
        response = RestAssured.given()
                .get(YamlUtils.get("consultaImagemAleatoriaDeRacas.url"))
                .then()
                .extract().response();
        return response;
    }

}
