package com.tests.api;

import org.testng.annotations.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetUserApiTest {

    @Test
    public void getSingleUser() {

        Response response =
            given()
                .baseUri("https://jsonplaceholder.typicode.com")
            .when()
                .get("/users/1");

        System.out.println("Status Code: " + response.getStatusCode());
        response.getBody().prettyPrint();

        response.then().statusCode(200);
    }
}
