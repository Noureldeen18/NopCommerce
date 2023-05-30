package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage {
    //1- locators
    By registerBtn = By.cssSelector("[class=\"ico-register\"]");
    By loginBtn = By.cssSelector("[class=\"ico-login\"]");
    By myaccount = By.cssSelector("[class=\"ico-account\"]");
    By currenciesDropDown = By.cssSelector("[id=\"customerCurrency\"]");
    By pc = By.cssSelector("[href=\"/build-your-own-computer\"]");

    By mac = By.cssSelector("[href=\"/apple-macbook-pro-13-inch\"]");

    By htc = By.cssSelector("[href=\"/htc-one-m8-android-l-50-lollipop\"]");

    By gifCard = By.cssSelector("[href=\"/25-virtual-gift-card\"]");
    By price = By.cssSelector("[class=\"price actual-price\"]");
    By serchBox = By.cssSelector("[id=\"small-searchterms\"]");
    By serchBtn = By.cssSelector("[class=\"button-1 search-box-button\"]");

    By computers = By.xpath("//a[@href=\"/computers\"]");
    By nootbooks = By.cssSelector("[href=\"/notebooks\"]");
    By pageTitle = By.cssSelector("[class=\"page-title\"]");

    By iphoneSlider = By.cssSelector("[href=\"https://demo.nopcommerce.com/\"]");
    By s22Slider = By.cssSelector("[href=\"https://demo.nopcommerce.com/\"]");

    By facebook = By.cssSelector("[href=\"http://www.facebook.com/nopCommerce\"]");

    By twitter = By.cssSelector("[href=\"https://twitter.com/nopCommerce\"]");
    By rss = By.cssSelector("[href=\"/news/rss/1\"]");
    By yotube = By.cssSelector("[href=\"http://www.youtube.com/user/nopCommerce\"]");
    By htcAddToWishList = By.cssSelector("[class=\"button-2 add-to-wishlist-button\"]");
    By wishListMsg = By.cssSelector("[class=\"bar-notification success\"]");
    By wishListBtn = By.cssSelector("[href=\"/wishlist\"]");


    //2- variables
    WebDriver driver;

    //3- constructor
    public P03_homePage(WebDriver driver) {
        this.driver = driver;
    }


    //4- Actions
    public void clickRegisterBtn() {
        driver.findElement(registerBtn).click();
    }

    public void clickLoginBtn() {
        driver.findElement(loginBtn).click();
    }

    public boolean checkMyaccount() {
        driver.findElement(myaccount).isDisplayed();
        return true;
    }

    public void selectCurrency() {
        Select selectEuro = new Select(driver.findElement(currenciesDropDown));
        selectEuro.selectByIndex(1);

    }

    public List<WebElement> CheckEuroInPc() {
        return driver.findElements(RelativeLocator.with(price).below(pc));
    }

    public List<WebElement> CheckEuroInMac() {
        return driver.findElements(RelativeLocator.with(price).below(mac));
    }

    public List<WebElement> CheckEuroInHtc() {
        return driver.findElements(RelativeLocator.with(price).below(htc));
    }

    public List<WebElement> CheckEuroInGiftCard() {
        return driver.findElements(RelativeLocator.with(price).below(gifCard));
    }

    public void searhBySearchBox(String product) {
        driver.findElement(serchBox).sendKeys(product);
    }

    public void clickSearchBtn() {
        driver.findElement(serchBtn).click();
    }


    public WebElement hooverOnComputers() {
        return driver.findElement(computers);
    }

    public void clickOnNotebooks() {
        driver.findElement(nootbooks).click();
    }

    public boolean pageTitleIsDisplayed() {
        driver.findElement(pageTitle).getText().contains("Notebooks".toLowerCase().trim());
        return true;
    }

    public void clickIphone14() {
        driver.findElements(iphoneSlider).get(0).click();
    }

    public void clickS22() {
        driver.findElements(s22Slider).get(1).click();
    }

    public void clickFacebook() {
        driver.findElement(facebook).click();
    }

    public void clickTwitter() {
        driver.findElement(twitter).click();
    }

    public void clickRss() {
        driver.findElement(rss).click();
    }

    public void clickYoutube() {
        driver.findElement(yotube).click();
    }

    public void addHtcToWishList() {
        driver.findElement(RelativeLocator.with(htcAddToWishList).below(htc)).click();
    }

    public WebElement wishListSuccessMsg() {
        return driver.findElement(wishListMsg);
    }

    public void clickWishListBtn() {
        driver.findElement(wishListBtn).click();
    }


}
