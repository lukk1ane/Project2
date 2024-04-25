package ge.tbc.itacademy.steps.saucedemosteps;

import com.codeborne.selenide.Condition;
import ge.tbc.itacademy.pages.saucedemopages.HomePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Step
    public HomePageSteps inputUsername(String username){
        homePage.inputUserName.sendKeys(username);
        return this;
    }
    @Step
    public HomePageSteps inputPassword(String password){
        homePage.inputPassword.sendKeys(password);
        return this;
    }
    @Step
    public HomePageSteps clickLoginBtn(){
        homePage.loginBtn.click();
        return this;
    }
    @Step
    public HomePageSteps checkErrorMessageAppeared(){
        homePage.errorMessage.shouldBe(visible);
        return this;
    }
    @Step
    public HomePageSteps checkXIconIsVisible(){
        homePage.xIcon.shouldBe(visible);
        return this;
    }
    @Step
    public HomePageSteps validateInputUsernameIsEmpty(){
        homePage.inputUserName.shouldBe(Condition.empty);
        return this;
    }
    @Step
    public HomePageSteps validateInputPasswordIsEmpty(){
        homePage.inputPassword.shouldBe(Condition.empty);
        return this;
    }
}
