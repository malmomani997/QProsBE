package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import resources.Utils;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class GetUserScenario extends Utils {
    RequestSpecification request ;

    Response response ;


    @Given("the user add to look for it and get it")
    public void the_user_add_to_look_for_it_and_get_it() throws IOException {

      request = given().spec(requestBuilder());
    }

    @When("the user submits the searched information {string}")
    public void the_user_submits_the_searched_information(String username) {

        response = request.when().get("/api/v3/user/" + username);
        response.then().spec(responseSpecification()).extract().response();
    }
    @Then("verify that the returned information matches the user you searched for {int} , {string} , {string}")
    public void verify_that_the_returned_information_matches_the_user_you_searched_for(int id, String username, String email) {

        int resID = getJsonPathInt(response , "id");
        String resUserName = getJsonPath(response , "username");
        String resEmail = getJsonPath(response , "email");

        Assert.assertEquals("The response ID didnt match the user given ID ",resID , id );
        Assert.assertEquals("The response Username didnt match the user given Username " ,resUserName, username );
        Assert.assertEquals("The response Email didnt match the user given Email ",resEmail , email);

    }
}
