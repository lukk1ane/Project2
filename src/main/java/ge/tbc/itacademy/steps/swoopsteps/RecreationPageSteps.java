package ge.tbc.itacademy.steps.swoopsteps;

import ge.tbc.itacademy.pages.swooppages.RecreationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RecreationPageSteps {
    RecreationPage recreationPage = new RecreationPage();

    @Step("Set minimal price")
    public RecreationPageSteps setMinPrice(String minPrice){
        recreationPage.minPrice.setValue(minPrice);
        return this;
    }
    @Step("Set minimal price")
    public RecreationPageSteps validateMinPriceEmpty(){
        recreationPage.minPrice.shouldBe(Condition.empty);
        return this;
    }

    @Step("Set maximal price")
    public RecreationPageSteps setMaxPrice(String maxPrice){
        recreationPage.maxPrice.setValue(maxPrice);
        return this;
    }

    @Step("Click find button")
    public RecreationPageSteps clickFind(){
        executeJavaScript("arguments[0].click()", recreationPage.searchButton);
        return this;
    }

    @Step("Wait to load Hotels")
    public RecreationPageSteps waitToLoad(){
        recreationPage.loadingElementSelector.shouldBe(Condition.visible);
        return this;
    }
    @Step
    public RecreationPageSteps clickDeleteFilterButton(){
        recreationPage.deleteFilterButton.scrollIntoView(false).click();
        return this;
    }
    @Step
    public RecreationPageSteps clickLocationFilter(){
        recreationPage.locationFilterDropdownButton.scrollIntoView(false).click();
        return this;
    }
    @Step
    public RecreationPageSteps validateLocationFilter(String val){
        recreationPage.locationFilterDropdownButton.shouldHave(Condition.text(val));
        return this;
    }
    @Step
    public RecreationPageSteps clickGldaniCheckbox(){
        recreationPage.gldaniCheckbox.scrollIntoView(false).click();
        return this;
    }
    @Step
    public RecreationPageSteps clickVoucherRadioBtn(){
        recreationPage.voucherPaymentMethodRadioBtn.scrollIntoView(false).click();
        return this;
    }
    @Step
    public RecreationPageSteps validateDefaultPaymentChecked(){
        recreationPage.defaultPaymentMethodRadioBtn.shouldHave(Condition.attribute("checked"));
        return this;
    }
}
