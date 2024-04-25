package ge.tbc.itacademy.steps.swoopsteps;
import ge.tbc.itacademy.pages.swooppages.SearchedHotelsPage;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;


public class SearchedHotelsPageSteps {
    SearchedHotelsPage searchedHotelsPage = new SearchedHotelsPage();
    SoftAssert softAssert = new SoftAssert();

    @Step("Validate prices of movies")
    public SearchedHotelsPageSteps validatePrices(int min, int max, SoftAssert softAssert){
        for (var price : searchedHotelsPage.hotelPrices) {
            price.scrollIntoView(true);
            String priceWithSign = price.getText();
            int parsedPrice = Integer.parseInt(priceWithSign.substring(0, priceWithSign.length() - 1));
            if (parsedPrice > max || parsedPrice < min) softAssert.fail("incorrect price range value is: " + parsedPrice);
        }
        softAssert.assertAll();
        return this;
    }
}