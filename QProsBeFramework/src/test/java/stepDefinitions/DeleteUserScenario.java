package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.Utils;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class DeleteUserScenario extends Utils {

    RequestSpecification request ;

    Response response ;


    @Given("the user add the username of the account that want be deleted")
    public void the_user_add_the_username_of_the_account_that_want_be_deleted() throws IOException {

        request = given().spec(requestBuilder());
    }
    @When("the user submits the searched information about the account he wants to delete {string}")
    public void the_user_submits_the_searched_information_about_the_account_he_wants_to_delete(String username) {

        response = request.when().get("/api/v3/user/" + username);
    }
    @When("verify the api status code and the user is deleted successfully")
    public void verify_the_api_status_code_and_the_user_is_deleted_successfully() {

        response.then().spec(responseSpecification());
    }
}
