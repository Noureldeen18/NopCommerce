package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_login {
    //2- variables
    WebDriver driver;
    //1- locators
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By loginBtn = By.cssSelector("[class=\"button-1 login-button\"]");
    private By errorMsg = By.cssSelector("[class=\"message-error validation-summary-errors\"]");
    //3- constructor

    public P02_login(WebDriver driver) {
        this.driver = driver;
    }

    //4- Actions
    public void insertValidEmail(String Email) {
        driver.findElement(emailField).sendKeys(Email);

    }

    public void insertValidPassword(String Password) {
        driver.findElement(passwordField).sendKeys(Password);
    }

    public void clickLoginBtn() {
        driver.findElement(loginBtn).click();
    }

    public void insrtInvalidEmail(String invalidEmail) {
        driver.findElement(emailField).sendKeys(invalidEmail);
    }

    public String checkErrMsg() {
        return driver.findElement(errorMsg).getText();

    }

    public String checkErrMsgColor() {
        return driver.findElement(errorMsg).getCssValue("color");

    }

}

