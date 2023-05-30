package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.Color;

import static stepDefs.Hooks.*;

public class D02_loginStepDef {
    @Given("user go to login page")
    public void user_go_to_login_page() {
        p03homePage.clickLoginBtn();
    }

    @Given("user login with valid Email and Password")
    public void user_login_with_valid_Email_and_Password() {
        p02_login.insertValidEmail();
        p02_login.insertValidPassword();

    }

    @Given("user press on login button")
    public void user_press_on_login_button() {
        p02_login.clickLoginBtn();
    }

    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        softAssert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
        softAssert.assertTrue(p03homePage.checkMyaccount());


    }


    @And("user login with invalid Email and Password")
    public void userLoginWithInvalidEmailAndPassword() {
        p02_login.insrtInvalidEmail();
        p02_login.insertValidPassword();
        p02_login.clickLoginBtn();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        String actualMsg = p02_login.checkErrMsg().concat("Login was unsuccessful.");
        softAssert.assertEquals(actualMsg, "Login was unsuccessful.");
        softAssert.assertEquals(Color.fromString(p02_login.checkErrMsgColor()).asHex(), "#e4434b");
    }
}
