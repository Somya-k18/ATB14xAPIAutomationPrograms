package org.example.ex_04_RA_HTTPMethods.ex_02_POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting_Lab09_POST_BDDstyle {
    @Test
    public void test_POST_Auth_Token(){

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all()
                .body(payload)

                .when().post()

                .then().log().all().statusCode(200);
    }
}
