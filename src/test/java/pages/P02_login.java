package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_login {
    //1- locators
    By emailField = By.cssSelector("[id=\"Email\"]");
    By passwordField = By.cssSelector("[id=\"Password\"]");
    By loginBtn = By.cssSelector("[class=\"button-1 login-button\"]");
    By errorMsg = By.cssSelector("[class=\"message-error validation-summary-errors\"]");


    //2- variables
    WebDriver driver;
    //3- constructor

    public P02_login(WebDriver driver) {
        this.driver = driver;
    }

    //4- Actions
    public void insertValidEmail() {
        driver.findElement(emailField).sendKeys("test@example.com");

    }

    public void insertValidPassword() {
        driver.findElement(passwordField).sendKeys("P@ssw0rd");
    }

    public void clickLoginBtn() {
        driver.findElement(loginBtn).click();
    }

    public void insrtInvalidEmail() {
        driver.findElement(emailField).sendKeys("wrong@example.com");
    }

    public String checkErrMsg() {
        return driver.findElement(errorMsg).getText();

    }

    public String checkErrMsgColor() {
        return driver.findElement(errorMsg).getCssValue("color");

    }

}

