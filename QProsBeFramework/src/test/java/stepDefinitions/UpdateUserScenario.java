package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import resources.TestDataBuild;
import resources.Utils;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class UpdateUserScenario extends Utils {

    RequestSpecification request;
    Response response;
    TestDataBuild data = new TestDataBuild();

    @Given("the user add his information with {string} , {string} , {string}")
    public void the_user_add_his_information_with(String updatedUsername, String firstname, String phone) throws IOException {
        request = given().spec(requestBuilder()).body(data.updateUser(updatedUsername, firstname, phone));
    }

    @When("the user submits the searched information {string} thats needed to be updated")
    public void the_user_submits_the_searched_information_thats_needed_to_be_updated(String username) {
        response = request.when().put("/api/v3/user/" + username);
        response.then().spec(responseSpecification()).extract().response();
    }

    @Then("verify that the returned information matches the user you searched for {string} , {string} , {string}")
    public void verify_that_the_returned_information_matches_the_user_you_searched_for(String username, String firstname, String phone) {
        String resUserName = getJsonPath(response, "username");
        String resFirstName = getJsonPath(response, "firstName");
        String resPhone = getJsonPath(response, "phone");

        Assert.assertEquals(resUserName, username);
        Assert.assertEquals(resFirstName, firstname);
        Assert.assertEquals(resPhone, phone);
    }
}