package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.*;

import java.time.Duration;

public class Hooks {
    static WebDriver driver;
    static P01_register p01_register;
    static SoftAssert softAssert;
    static P02_login p02_login;
    static P03_homePage p03homePage;
    static Actions actions;
    static WebDriverWait webDriverWait;
    static P04_serchResults p04_serchResults;
    static P05_Wishlist p05_wishlist;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        p01_register = new P01_register(driver);
        p02_login = new P02_login(driver);
        p03homePage = new P03_homePage(driver);
        softAssert = new SoftAssert();
        actions = new Actions(driver);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        softAssert.assertAll();
        p04_serchResults = new P04_serchResults(driver);
        p05_wishlist = new P05_Wishlist(driver);

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
