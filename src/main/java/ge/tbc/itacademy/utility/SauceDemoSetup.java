package ge.tbc.itacademy.utility;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import ge.tbc.itacademy.data.Constants;
import ge.tbc.itacademy.pages.saucedemopages.HomePage;
import ge.tbc.itacademy.steps.saucedemosteps.HomePageSteps;
import ge.tbc.itacademy.steps.saucedemosteps.ProductsPageSteps;
import ge.tbc.itacademy.steps.swoopsteps.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import static ge.tbc.itacademy.data.Constants.SAUCE_DEMO_URL;
import static ge.tbc.itacademy.data.Constants.SWOOP_URL;

public class SauceDemoSetup{
    public HomePageSteps homePageSteps = new HomePageSteps();
    public ProductsPageSteps productsPageSteps = new ProductsPageSteps();
    public SoftAssert softAssert = new SoftAssert();
    public Constants sauceDemoData;
    public DBMethods dbMethods;

    @BeforeSuite(alwaysRun = true)
    public void setUp(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("-incognito");
        Configuration.browserCapabilities = chromeOptions;
        Configuration.pageLoadTimeout = 100000000L;
        Configuration.timeout = 30000;
        Configuration.holdBrowserOpen = true;
        Configuration.savePageSource = false;
        Configuration.browserSize = "1920x1080";
        Configuration.clickViaJs = true;
        dbMethods = new DBMethods();
    }

    @BeforeMethod(alwaysRun = true)
    public void navigateToSauceDemo(){
        Selenide.open(SAUCE_DEMO_URL);
    }

    @AfterTest(alwaysRun = true)
    public void close(){
        Selenide.closeWebDriver();
    }
}
