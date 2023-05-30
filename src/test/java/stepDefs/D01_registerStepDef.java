package stepDefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static stepDefs.Hooks.*;

public class D01_registerStepDef {

    @Given("user go to register page")
    public void userGoToRegisterPage() {
        p03homePage.clickRegisterBtn();
    }

    @Given("user select gender type")
    public void user_select_gender_type() {
        p01_register.chooseGender("male");

    }

    @Given("user enter first name {string} and last name {string}")
    public void user_enter_first_name_and_last_name(String FirstName, String lastName) {
        p01_register.insertFirstname("automation");
        p01_register.insertLastname("tester");
    }

    @Given("user enter date of birth")
    public void user_enter_date_of_birth() {
        p01_register.selectDate("1", "10", "2004");

    }

    @Given("user enter email {string} field")
    public void user_enter_email_field(String Email) {
        p01_register.insertEmail("test@example.com");

    }

    @Given("user fills Password fields {string} {string}")
    public void user_fills_password_fields(String password, String confirmPassword) {
        p01_register.insertPassword("P@ssw0rd");
        p01_register.confirmPassword("P@ssw0rd");
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        p01_register.clickRegisterBtn();
    }

    @Then("success message is displayed")
    public void success_message_is_displayed() {
        String expectedMsg = "Your registration completed";
        String actualMsg = p01_register.checkSuccesMsg();

        String expectedColor = "rgba(76, 177, 124, 1";
        String actualColor = p01_register.checksuccessMsgColor();
        softAssert.assertEquals(actualColor, expectedColor);


    }


}
