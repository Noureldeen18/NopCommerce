package stepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static stepDefs.Hooks.*;

public class D01_registerStepDef {

    @Given("user clicks on register button")
    public void userClicksOnRegisterButton() {
        p03homePage.clickRegisterBtn();
    }

    @And("user select {}")
    public void userSelectGenderType(String genderType) {
        p01_register.chooseGender(genderType);

    }

    @And("user enter {string} and {string}")
    public void userEnterFirstNameAndLastName(String firstName, String lastName) {
        p01_register.insertFirstname(firstName);
        p01_register.insertLastname(lastName);
    }

    @Given("user enter date of birth")
    public void user_enter_date_of_birth() {
        p01_register.selectDate("1", "10", "2004");

    }

    @And("user enter {string}")
    public void userEnterEmail(String email) {
        p01_register.insertEmail(email);

    }

    @And("user fills {string} fields")
    public void userFillsPasswordFields(String password) {
        p01_register.insertPassword(password);
        p01_register.confirmPassword(password);
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        p01_register.clickRegisterBtn();
    }

    @Then("success message is displayed")
    public void success_message_is_displayed() {
        String expectedMsg = "Your registration completed";
        String actualMsg = p01_register.checkSuccesMsg();
        softAssert.assertEquals(actualMsg, expectedMsg);

        String expectedColor = "rgba(76, 177, 124, 1";
        String actualColor = p01_register.checksuccessMsgColor();
        softAssert.assertEquals(actualColor, expectedColor);

        softAssert.assertAll();


    }


}
