package ge.tbc.itacademy.swoop;
import ge.tbc.itacademy.data.SwoopDataProvider;
import ge.tbc.itacademy.utility.SwoopSetup;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class OfferTests extends SwoopSetup {

    @Test(priority = 1, dataProviderClass = SwoopDataProvider.class, dataProvider = "minAndMaxPrice", groups = "SwoopRegression")
    public void rangeTest(Integer minPrice, Integer maxPrice){
        homePageSteps.clickRecreationButton();
        recreationPageSteps.setMinPrice(minPrice.toString())
                .setMaxPrice(maxPrice.toString())
                .clickFind()
                .waitToLoad();
        searchedHotelsPageSteps.validatePrices(minPrice, maxPrice, softAssert);
    }
    @Test(priority = 2,description = "add first valid sushi to favorites",groups = "SwoopRegression")
    @Story("enter to sushi page and check first validate sushi and add to favorites")
    @Severity(SeverityLevel.NORMAL)
    @Feature("Validate Sold Quantity")
    @Description("enter to categories and go to sushi page and check first valid sushi and make it favorite")
    public void myTest2(){
        homePageSteps.clickToCategoriesButton()
                .hoverFoodsButton()
                .clickToSushiButton();
        sushiPageSteps.checkPercentage()
                .addToFavorites()
                .checkLoginPageAppear();
    }
    @Test(priority = 3,description = "enter to first sushi and click share button",groups = "SwoopRegression")
    @Feature("Share Sushi")
    @Severity(SeverityLevel.NORMAL)
    @Story("go to categories hover food enter sushi page select first sushi, click to share button, validate share page opened")
    @Description("click first sushi, click share button and validate facebook page")
    public void myTest3(){
        homePageSteps.clickToCategoriesButton()
                .hoverFoodsButton()
                .clickToSushiButton();
        sushiPageSteps.clickToFirstSushi();
        sushiDetailsPageSteps.clickShareButton()
                .validateLoginPageAppeared();
    }
    @Test(priority = 4,groups = "SwoopRegression")
    public void myTest4(){
        homePageSteps.clickToCategoriesButton()
                .hoverFoodsButton()
                .clickToSushiButton();
        sushiPageSteps.validateSushiWithZeroSales();
    }
    @Test(priority = 5,groups = "SwoopRegression")
    public void clearFilterTest (){
        homePageSteps.clickRecreationButton();
        recreationPageSteps.setMinPrice("100")
                .clickLocationFilter()
                .clickGldaniCheckbox()
                .validateLocationFilter("გლდანი")
                .clickVoucherRadioBtn()
                .clickDeleteFilterButton()
                .validateDefaultPaymentChecked()
                .validateLocationFilter("ყველა მდებარეობა")
                .validateMinPriceEmpty();
    }


    String conflict="One";
}
