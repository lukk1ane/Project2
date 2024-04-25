package ge.tbc.itacademy.pages.swooppages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class SearchedHotelsPage {
    public ElementsCollection hotelPrices = $$("#partialid div.discounted-prices p:nth-child(1)");
}