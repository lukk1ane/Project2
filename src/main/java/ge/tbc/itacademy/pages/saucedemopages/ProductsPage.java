package ge.tbc.itacademy.pages.saucedemopages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage {
    public ElementsCollection images = $$("div.inventory_item img");
    public SelenideElement menuBtn = $(By.id("react-burger-menu-btn")),
            logOutBtn = $(By.id("logout_sidebar_link"));
}
