package com.lits.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class WebServiceTest {

    public static final String CURRRENT_DAY_URL = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";

    @Test
    public void testGetCurrencies() {

        given()
                .log().all() // will print requests

                .when()
                .get(CURRRENT_DAY_URL)

                .then()
                .log().all() // will print responses
                .assertThat()
                .statusCode(200);
    }


    @Test
    public void testGetCurrencyForDate() {

        given()
                .log().all()
                .get("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json&date=20190831")

                .then().log().all().statusCode(200)

                .and().assertThat();

    }
}
