package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static stepDefs.Hooks.driver;
import static stepDefs.Hooks.p03homePage;

public class D03_currenciesStepDef {
    @When("Select Euro currency from the dropdown list on the top left of home page")
    public void select_euro_currency_from_the_dropdown_list_on_the_top_left_of_home_page() {
        p03homePage.selectCurrency();
    }

    @Then("verify Euro Symbol \\(€) is shown on the {int} products displayed in Home page")
    public List<String> getCurrenciesForAllProducts() {
        List<WebElement> prices = driver.findElements(By.cssSelector(".prices>span"));
        List<String> currencies = new ArrayList<>();

        for (WebElement i : prices) {
            String currency = i.getText();
            currencies.add(currency);
        }
        return currencies;
    }

    public boolean checkCurrencyforAllProducts() {
        boolean checkCurrencies = getCurrenciesForAllProducts()
                .stream()
                .allMatch((s) -> s.startsWith("$"));

        return checkCurrencies;
    }


}
