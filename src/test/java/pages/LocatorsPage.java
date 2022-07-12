package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LocatorsPage {
    //locators
    SelenideElement search = $("[name=q]"),
            searchInput = $(".gLFyf"),
           // firstLink = $$(".g .LC20lb"),
            aboutProducts = $(".btn.btn--lg.btn--info"),
            tel = $x("//a[@href='tel:88007751521']"),
            email = $x("//a[contains(text(),'sales@byndyusoft.com')]");

    //actions

}
