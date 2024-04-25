package ge.tbc.itacademy.pages.swooppages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RecreationPage {
    public SelenideElement minPrice = $("div.category-filter-desk input#minprice"),
            maxPrice = $("div.category-filter-desk input#maxprice"),
            searchButton = $("div.category-filter-desk div.submit-button"),
            loadingElementSelector = $(By.cssSelector("#body[style*='unset']")),
            deleteFilterButton = $x("(//div[@class='delete-search-button'])[last()]"),
            locationFilterDropdownButton = $x("(//button[@class='ms-choice'])[last()]"),
            gldaniCheckbox = $x("(//span[text()='გლდანი']//preceding-sibling::input)[last()]"),
            voucherPaymentMethodRadioBtn = $x("(//label[text()='ვაუჩერი']//input)[last()]"),
            defaultPaymentMethodRadioBtn = $x("(//label[text()='ყველა']//input)[last()]");
}
