package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.p03homePage;

public class D03_currenciesStepDef {
    @When("Select Euro currency from the dropdown list on the top left of home page")
    public void select_euro_currency_from_the_dropdown_list_on_the_top_left_of_home_page() {
        p03homePage.selectCurrency();
    }

    @Then("verify Euro Symbol \\(€) is shown on the {int} products displayed in Home page")
    public void verify_euro_symbol_€_is_shown_on_the_products_displayed_in_home_page(Integer int1) {
        Assert.assertTrue(p03homePage.CheckEuroInPc().get(0).getText().contains("€"));
        Assert.assertTrue(p03homePage.CheckEuroInMac().get(1).getText().contains("€"));
        Assert.assertTrue(p03homePage.CheckEuroInHtc().get(2).getText().contains("€"));
        Assert.assertTrue(p03homePage.CheckEuroInGiftCard().get(3).getText().contains("€"));
    }


}
