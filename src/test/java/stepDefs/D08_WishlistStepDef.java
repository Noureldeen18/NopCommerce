package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static stepDefs.Hooks.*;

public class D08_WishlistStepDef {
    @When("I click on the wishlist button for HTC One M8 Android L5 Lollipop")
    public void i_click_on_the_wishlist_button_for_htc_one_m8_android_l5_lollipop() {
        p03homePage.addHtcToWishList();
    }

    @Then("I should see the success message {string} with green background color")
    public void i_should_see_the_success_message_with_green_background_color(String msg) {
        softAssert.assertTrue(p03homePage.wishListSuccessMsg().getText().contains(msg));
        String actualColor = Color.fromString(p03homePage.wishListSuccessMsg().getCssValue("background-color")).asHex();
        softAssert.assertEquals(actualColor, "#4bb07a");
    }

    @When("I click on the wishlist button for HTC One M8 Android L5 Lollipop and wait for success message to disappear")
    public void i_click_on_the_wishlist_button_for_htc_one_m8_android_l5_lollipop_and_wait_for_success_message_to_disappear() {
        p03homePage.addHtcToWishList();
    }

    @And("I click on the Wishlist tab")
    public void i_click_on_the_wishlist_tab() {
        ExpectedConditions.invisibilityOf(p03homePage.wishListSuccessMsg());
        p03homePage.clickWishListBtn();
    }

    @Then("I should see the quantity value greater than {int}")
    public void i_should_see_the_quantity_value_greater_than(Integer products) {
        softAssert.assertTrue(p05_wishlist.countProducts() > 0);
    }

}
