package com.byndyusoft.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSteps {
    //locators
    SelenideElement search = $("[name=q]"),
            searchInput = $(".gLFyf"),
            aboutProducts = $(".btn.btn--lg.btn--info"),
            tel = $x("//a[@href='tel:88007751521']"),
            email = $x("//a[contains(text(),'sales@byndyusoft.com')]");

    ElementsCollection
            collection = $$(".g .LC20lb");

    //actions
    public GoogleSteps clickToSearch() {
        search.click();
        searchInput.setValue("Byndyusoft").pressEnter();
        return this;
    }

    public GoogleSteps finfirst() {
        collection.first().click();
        return this;
    }
}
