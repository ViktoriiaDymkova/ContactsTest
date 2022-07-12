package com.byndyusoft;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LocatorsPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class ContatsTest extends TestBase {

    @Tag("smokeTest")
    @Test
    @DisplayName("Автоматизация скрипта проверки контактной информации на сайте компании Byndyusoft")
    void byndyusoftContactsTest() {
        step("Откройте сайт https://www.google.ru/", () -> {
            open(baseUrl);
        });

        step("В поисковой строке введите Byndyusoft", () -> {

            $("[name=q]").click();
            $(".gLFyf").setValue("Byndyusoft").pressEnter();
        });

        step("Перейдите по первой ссылке", () -> {
            $$(".g .LC20lb").first().click();
        });

        step("Нажмите на желтую кнопку \"Заказать презентацию\" в разделе \"" +
                "Узнайте больше о наших продуктах\"", () -> {
            Selenide.switchTo().window(1);
            $(".btn.btn--lg.btn--info").scrollIntoView(true).click();
        });

        step("Проверьте корректность номера телефона и почтового ящика", () -> {
            $x("//a[@href='tel:88007751521']").shouldHave(text("8 800 775-15-21"));
            $x("//a[contains(text(),'sales@byndyusoft.com')]").shouldBe(visible);
        });
    }
}


