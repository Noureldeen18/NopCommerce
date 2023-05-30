package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.actions;
import static stepDefs.Hooks.p03homePage;

public class D05_hoverCategoriesStepDef {

    @When("the user selects a random main category and hover on it")
    public void theUserSelectsARandomMainCategoryAndHoverOnIt() {
        actions.moveToElement(p03homePage.hooverOnComputers()).perform();


    }

    @When("selects a random sub-category")
    public void selects_a_random_sub_category() {
        p03homePage.clickOnNotebooks();
    }

    @Then("the sub-category page title should contain the selected sub-category")
    public void the_sub_category_page_title_should_contain_the_selected_sub_category() {
        Assert.assertTrue(p03homePage.pageTitleIsDisplayed());
    }


}
