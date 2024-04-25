package ge.tbc.itacademy.pages.saucedemopages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    public SelenideElement inputUserName = $(By.id("user-name")),
            inputPassword = $(By.id("password")),
            loginBtn = $(By.id("login-button")),
            errorMessage = $x("//h3[text()='Epic sadface: Sorry, this user has been locked out.']"),
            xIcon = $("div.form_group path");
}
