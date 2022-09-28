package com.sample;

import com.sample.model.Message;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class HelloWorldTest {

  @Test
  public void HelloRuleTest() {
    Message msg;
    msg = given()
      .body(
        "{\n" +
                "  \"messages\": [\n" +
                "    {\n" +
                "      \"status\": 0,\n" +
                "      \"message\": \"Hello World\"\n" +
                "    }\n" +
                "  ]\n" +
                "}"
      )
      .contentType(ContentType.JSON)
    .when()
      .post("/helloworld/first")
    .then()
      .statusCode(200)
      .extract()
      .as(Message.class);

    System.out.println(msg);
    assertThat(msg.getMessage(), equalTo("Goodbye Cruel World"));
  }
}
