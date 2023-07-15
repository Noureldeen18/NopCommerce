package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_register {
    //2- variables
    WebDriver driver;
    //1- Locators
    private By maleRadioBtn = By.id("gender-male");
    private By femaleRadioBtn = By.id("gender-female");
    private By firstNameField = By.id("FirstName");
    private By lastNameField = By.id("LastName");
    private By selectDayDropdown = By.name("DateOfBirthDay");
    private By selectMonthDropdown = By.name("DateOfBirthMonth");
    private By selectYearDropdown = By.name("DateOfBirthYear");
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By confirmPasswordField = By.id("ConfirmPassword");
    private By registerBtn = By.id("register-button");
    private By successMsg = By.cssSelector("[class=\"result\"]");
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
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void insertLastname(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
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
        driver.findElement(emailField).sendKeys(email);
    }

    public void insertPassword(String paswword) {
        driver.findElement(passwordField).sendKeys(paswword);
    }

    public void confirmPassword(String password) {
        driver.findElement(confirmPasswordField).sendKeys(password);
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
