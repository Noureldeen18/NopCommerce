package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.*;

public class D04_searchStepDef {
    @When("user enters {string} Name in the search box")
    public void userEntersNameInTheSearchBox(String productName) {
        p03homePage.searhBySearchBox(productName);
        p03homePage.clickSearchBtn();
    }

    @Then("user should see relevant results for product")
    public void userShouldSeeRelevantResultsForProduct() {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        Assert.assertTrue(p04_serchResults.searchResults() > 0);
        


    }

    @When("user enters product {string} in the search box")
    public void userEntersProductInTheSearchBox(String productSku) {
        p03homePage.searhBySearchBox(productSku);
        p03homePage.clickSearchBtn();
    }


    @Then("user should see the product with matching {string}")
    public void userShouldSeeTheProductWithMatching(String sku) {
        p04_serchResults.clickSearchResults();
        p04_serchResults.checkSku(sku);

    }


}
