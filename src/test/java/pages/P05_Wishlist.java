package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_Wishlist {
    //1- locators

    By products = By.cssSelector("[class=\"product-name\"]");

    //2- variables
    WebDriver driver;
    //3- constructor

    public P05_Wishlist(WebDriver driver) {
        this.driver = driver;
    }

    //4- actions


    public int countProducts() {
        return driver.findElements(products).size();
    }
}
