package com.lits.tests;

import com.lits.helper.EnvProps;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class WebServiceTest {

    private EnvProps envProps = new EnvProps();

    @Test
    public void testGetCurrencies() {

        given()
                .log().all() // will print requests

                .when()
                .get(envProps.getApiCurrencyRateForCurrentDate())

                .then()
                .log().all() // will print responses
                .assertThat()
                .statusCode(200);
    }


    @Test
    public void testGetCurrencyForDate() {

        given()
                .log().all()
                .get(envProps.getApiCurrencyRateForDate())

                .then().log().all().statusCode(200)

                .and().assertThat();

    }
}
