package org.example.ex_04_RA_HTTPMethods.ex_01_GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab07_GET_BDDstyle {
    @Test
    public void test_GET_Positive(){
        String pincode="110048";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/"+pincode)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);
    }
}
