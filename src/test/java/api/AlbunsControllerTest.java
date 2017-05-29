package api;

import org.junit.Test;
import utils.SetupConfiguration;


import static io.restassured.RestAssured.given;

/**
 * Created by wellingtonsantos on 5/29/17.
 */
public class AlbunsControllerTest extends SetupConfiguration {

    @Test
    public void shouldReturn404WithNoContent() {
        String index = "0";
        given()
                .when()
                .get("/posts")
                .then()
                .statusCode(404);
    }
}
