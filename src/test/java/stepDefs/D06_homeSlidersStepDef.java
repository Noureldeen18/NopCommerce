package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.driver;
import static stepDefs.Hooks.p03homePage;

public class D06_homeSlidersStepDef {
    @When("I click on the first slider")
    public void i_click_on_the_first_slider() {
        p03homePage.clickIphone14();

    }

    @Then("I should be redirected to iphone 14 pro max page")
    public void iShouldBeRedirectedToIphonePage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");
    }

    @When("I click on the second slider")
    public void i_click_on_the_second_slider() {
        p03homePage.clickS22();

    }

    @Then("I should be redirected to s22 ultra page")
    public void iShouldBeRedirectedToNokiaLumiaPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
    }


}
