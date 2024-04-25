package ge.tbc.itacademy.pages.swooppages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SushiPage {
    public ElementsCollection allSushi = $$(".special-offer");
    public SelenideElement registrationElement = $("form[id='LoginForm']"),
            sortOptions = $("#sort"),
            loadingElement = $(By.cssSelector("#body[style*='unset']")),
            firstSushi = $(".special-offer a"),
            firstSushiWithZeroSales = $x("//p[text()='გაყიდულია 0']//parent::div//preceding-sibling::div[@class='voucher-diagram']");
    public String sortDescending = "ფასით კლებადი";
    public By favoritesButton = By.cssSelector(".deal-basket-wishlist div"),
            vouchersSoldPercentage = By.cssSelector(".voucher-limit"),
            sushiPrice = By.cssSelector("div.discounted-prices p:nth-child(1)");
}
