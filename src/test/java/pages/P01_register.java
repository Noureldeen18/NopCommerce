package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_register {
    //1- Locators
    By maleRadioBtn = By.cssSelector("[id=\"gender-male\"]");
    By femaleRadioBtn = By.cssSelector("[id=\"gender-female\"]");
    By firstNameField = By.cssSelector("[id=\"FirstName\"]");
    By lastNameField = By.cssSelector("[id=\"LastName\"]");
    By selectDayDropdown = By.cssSelector("[name=\"DateOfBirthDay\"]");
    By selectMonthDropdown = By.cssSelector("[name=\"DateOfBirthMonth\"]");
    By selectYearDropdown = By.cssSelector("[name=\"DateOfBirthYear\"]");
    By emailField = By.cssSelector("[id=\"Email\"]");
    By passwordField = By.cssSelector("[id=\"Password\"]");
    By confirmPasswordField = By.cssSelector("[id=\"ConfirmPassword\"]");
    By registerBtn = By.id("register-button");
    By successMsg = By.cssSelector("[class=\"result\"]");
    //2- variables
    WebDriver driver;
//3-constructor

    public P01_register(WebDriver driver) {
        this.driver = driver;
    }

    //4- actions
    public void chooseGender(String gender) {
        if (gender.toLowerCase() == "male") {
            driver.findElement(maleRadioBtn).click();
        } else if (gender.toLowerCase() == "female") {
            driver.findElement(femaleRadioBtn).click();
        } else {
            System.out.println("Gender is invalid");
        }
    }

    public void insertFirstname(String firstName) {
        driver.findElement(firstNameField).sendKeys("automation");
    }

    public void insertLastname(String lastName) {
        driver.findElement(lastNameField).sendKeys("tester");
    }

    public void selectDate(String day, String month, String year) {
        Select selectDay = new Select(driver.findElement(selectDayDropdown));
        selectDay.selectByValue(day);

        Select selectMonth = new Select(driver.findElement(selectMonthDropdown));
        selectMonth.selectByValue(month);

        Select selectYear = new Select(driver.findElement(selectYearDropdown));
        selectYear.selectByValue(year);
    }

    public void insertEmail(String email) {
        driver.findElement(emailField).sendKeys("test@example.com");
    }

    public void insertPassword(String paswword) {
        driver.findElement(passwordField).sendKeys("P@ssw0rd");
    }

    public void confirmPassword(String repeatPassword) {
        driver.findElement(confirmPasswordField).sendKeys("P@ssw0rd");
    }

    public void clickRegisterBtn() {
        driver.findElement(registerBtn).click();
    }

    public String checkSuccesMsg() {
        return driver.findElement(successMsg).getText();

    }

    public String checksuccessMsgColor() {
        return driver.findElement(successMsg).getCssValue("color");

    }
}
