import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.ecommerce.request.generator.UserRequest;
import org.testng.annotations.Test;

import static org.ecommerce.request.builder.RequestBuilder.getUserData;

public class CreateUserTest {

    @Test
    public void testCreateUser() {
        String baseURI = "https://automationexercise.com";
        String endpoint = "/api/createAccount";


        RestAssured.baseURI = baseURI;
        UserRequest user = getUserData();

        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post(endpoint)
                .then()
                .log()
                .body()
                .statusCode(200);
    }
    }
