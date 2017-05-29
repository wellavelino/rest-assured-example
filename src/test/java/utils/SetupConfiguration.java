package utils;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by wellingtonsantos on 5/29/17.
 */
public class SetupConfiguration {

    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
}
