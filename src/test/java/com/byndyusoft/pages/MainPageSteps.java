package com.byndyusoft.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageSteps {
    //locators
    SelenideElement search = $("[name=q]"),
            searchInput = $(".gLFyf"),
            aboutProducts = $(".btn.btn--lg.btn--info"),
            tel = $x("//a[@href='tel:88007751521']"),
            email = $x("//a[contains(text(),'sales@byndyusoft.com')]");

    ElementsCollection
            collection = $$(".g .LC20lb");

    //actions

    @Step("Нажмите на желтую кнопку 'Заказать презентацию' в разделе 'Узнайте больше о наших продуктах'")
    public MainPageSteps findButton() {
        Selenide.switchTo().window(1);
        aboutProducts.scrollIntoView(true).click();
        return this;
    }

    @Step("Проверьте корректность номера телефона и почтового ящика")
    public MainPageSteps checkInfo() {
        tel.shouldHave(text("8 800 775-15-21"));
        email.shouldBe(visible);
        return this;
    }
}
