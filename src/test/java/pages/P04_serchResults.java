package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_serchResults {
    //1- locators
    private By results = By.cssSelector("[class=\"product-item\"]");
    private By scienceProduct = By.cssSelector("[href=\"/science-faith\"]");
    private By soundForge = By.cssSelector("[href=\"/sound-forge-pro-11-recurring\"]");
    private By sku = By.cssSelector("[class=\"value\"]");
    private By appleCamProduct = By.cssSelector("[href=\"/apple-icam\"]");
    //2- variables
    WebDriver driver;

    //3- constructor
    public P04_serchResults(WebDriver driver) {
        this.driver = driver;
    }

    //4- actions
    public int searchResults() {
        return driver.findElements(results).size();
    }

    public void clickSearchResults() {
        driver.findElement(results).click();
    }

    public String checkSku(String sku) {
        return driver.findElement(this.sku).getText();
    }
}
