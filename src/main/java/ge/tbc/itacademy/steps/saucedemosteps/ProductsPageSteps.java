package ge.tbc.itacademy.steps.saucedemosteps;

import com.codeborne.selenide.Condition;
import ge.tbc.itacademy.pages.saucedemopages.ProductsPage;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;

public class ProductsPageSteps {
    ProductsPage productsPage = new ProductsPage();

    @Step
    public ProductsPageSteps validateAllImagesVisible(SoftAssert softAssert){
        for(var image : productsPage.images){
            System.out.println(image.getAttribute("src"));
            softAssert.assertFalse(image.is(Condition.attribute("src", "https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg")));
        }
        return this;
    }

    @Step
     public ProductsPageSteps clickMenu(){
        productsPage.menuBtn.click();
        return this;
     }

     @Step
    public ProductsPageSteps logoutBtnIsVisible(){
        productsPage.logOutBtn.shouldBe(Condition.visible);
        return this;
     }

     @Step
    public ProductsPageSteps clickToLogoutBtn(){
        productsPage.logOutBtn.click();
        return this;
     }


}
