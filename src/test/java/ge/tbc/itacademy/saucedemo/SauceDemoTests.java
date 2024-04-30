package ge.tbc.itacademy.saucedemo;

import ge.tbc.itacademy.utility.SauceDemoSetup;
import ge.tbc.itacademy.utility.User;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SauceDemoTests extends SauceDemoSetup {
    @Test(priority = 1,groups = "SauceDemoLogin")
    @Feature("Login Feature")
    @Story("Successful Login")
    @Description("Verify successful login with standard user")
    public void successfulLoginTest(){
        User user = dbMethods.getUser("standard_user");
        homePageSteps.inputUsername(user.getUsername())
                .inputPassword(user.getPass())
                .clickLoginBtn();
        productsPageSteps.validateAllImagesVisible(softAssert);
        softAssert.assertAll();
    }


    @Feature("Login Feature")
    @Story("Banned User Login")
    @Test(priority = 2, groups = "SauceDemoLogin")
    @Description("Verify login attempt with a banned user")    public void bannedUserLoginTest(){
        User user = dbMethods.getUser("locked_out_user");
        homePageSteps.inputUsername(user.getUsername())
                .inputPassword(user.getPass())
                .clickLoginBtn()
                .checkErrorMessageAppeared()
                .checkXIconIsVisible();
    }

    @Feature("Login Feature")
    @Story("Problematic Logic")
    @Test(priority = 3, groups = "SauceDemoLogin")
    @Description("Verify login with problematic logic")    public void problematicLogicTest(){
        User user = dbMethods.getUser("problem_user");
        homePageSteps.inputUsername(user.getUsername())
                .inputPassword(user.getPass())
                .clickLoginBtn();
        productsPageSteps.validateAllImagesVisible(softAssert);
        softAssert.assertAll();
    }

    @Feature("Logout Feature")
    @Story("Logout Functionality")
    @Test(priority = 4, groups = "SauceDemoLogin")
    @Description("Verify user logout functionality")    public void logOutTest(){
        User user = dbMethods.getUser("standard_user");
        homePageSteps.inputUsername(user.getUsername())
                .inputPassword(user.getPass())
                .clickLoginBtn();
        productsPageSteps.clickMenu()
                .logoutBtnIsVisible()
                .clickToLogoutBtn();
        homePageSteps.validateInputUsernameIsEmpty()
                .validateInputPasswordIsEmpty();
    }
    String conflict="One";
}
