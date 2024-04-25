package ge.tbc.itacademy.utility;

import ge.tbc.itacademy.data.Constants;;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import ge.tbc.itacademy.steps.swoopsteps.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;
;import static ge.tbc.itacademy.data.Constants.SWOOP_URL;


public class SwoopSetup {
    public HomePageSteps homePageSteps;
    public RecreationPageSteps recreationPageSteps;
    public SearchedHotelsPageSteps searchedHotelsPageSteps;
    public SushiPageSteps sushiPageSteps;
    public SushiDetailsPageSteps sushiDetailsPageSteps;
    public SoftAssert softAssert;
    public Constants swoopData;

    @BeforeSuite(alwaysRun = true)
    public void setUp(){
        Configuration.pageLoadTimeout = 100000000L;
        Configuration.timeout = 30000;
        Configuration.holdBrowserOpen = true;
        Configuration.savePageSource = false;
        Configuration.browserSize = "1920x1080";
        Configuration.clickViaJs = true;
        homePageSteps = new HomePageSteps();
        recreationPageSteps = new RecreationPageSteps();
        searchedHotelsPageSteps = new SearchedHotelsPageSteps();
        sushiPageSteps = new SushiPageSteps();
        sushiDetailsPageSteps = new SushiDetailsPageSteps();
        softAssert = new SoftAssert();
    }

    @BeforeMethod(alwaysRun = true)
    public void navigateToSwoop(){
        Selenide.open(SWOOP_URL);
    }

    @AfterTest(alwaysRun = true)
    public void close(){
        Selenide.closeWebDriver();
    }
    String conflict="One";
}
