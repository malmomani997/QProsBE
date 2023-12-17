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


public class CreateUserScenario extends Utils {

    RequestSpecification request ;

    Response response ;

    TestDataBuild data = new TestDataBuild();


    @Given("the user add his information with {int} , {string} , {string} , {string} , {string} , {string}")
    public void the_user_add_his_information_with(Integer id, String username, String firstname, String lastname, String email, String phone)  throws IOException {
     request = given().spec(requestBuilder()).body(data.createdUser(id ,username,firstname,lastname,email,phone));

    }
    @When("the user submits the information")
    public void the_user_submits_the_information() {

       response = request.when().post("/api/v3/user");
       response.then().spec(responseSpecification()).extract().response();

    }
    @Then("verify that the user is created with the correct information {int} , {string} , {string}")
    public void verify_that_the_user_is_created_with_the_correct_information(int id, String username, String email) {

        int resID = getJsonPathInt(response , "id");
        String resUserName = getJsonPath(response , "username");
        String resEmail = getJsonPath(response , "email");

        Assert.assertEquals("The response ID didnt match the user given ID ",resID , id );
        Assert.assertEquals("The response Username didnt match the user given Username " ,resUserName, username );
        Assert.assertEquals("The response Email didnt match the user given Email ",resEmail , email);

    }
}