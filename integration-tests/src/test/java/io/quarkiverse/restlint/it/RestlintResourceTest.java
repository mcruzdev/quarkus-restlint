package io.quarkiverse.restlint.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class RestlintResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/restlint")
                .then()
                .statusCode(200)
                .body(containsString("Hello"));
    }
}
