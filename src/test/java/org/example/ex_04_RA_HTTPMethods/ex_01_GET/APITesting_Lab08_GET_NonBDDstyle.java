package org.example.ex_04_RA_HTTPMethods.ex_01_GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab08_GET_NonBDDstyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pincode;

    @Test
    public void test_GET_NON_BDDStyle(){
        pincode = "110048";
        // Divide your program into 3 parts
        // Given Part 1

        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pincode);
        
        //When Part 2
        response = r.when().log().all().get();
        System.out.println(response.asString());

        //Then Part 3
        vr = response.then().log().all();
        vr.statusCode(200);
        // Write the further testcases or assertions also here.


    }
}
