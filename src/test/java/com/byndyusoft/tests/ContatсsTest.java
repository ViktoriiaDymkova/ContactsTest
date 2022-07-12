package com.byndyusoft.tests;

import com.byndyusoft.pages.GoogleSteps;
import com.byndyusoft.pages.MainPageSteps;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class ContatсsTest extends TestBase {

    GoogleSteps googleSteps = new GoogleSteps();
    MainPageSteps mainPageSteps = new MainPageSteps();

    @Tag("smokeTest")
    @Test
    @DisplayName("Автоматизация скрипта проверки контактной информации на сайте компании Byndyusoft")
    void byndyusoftContactsTest() {
        step("Откройте сайт https://www.google.ru/", () -> {
            open(baseUrl);
        });
        googleSteps.clickToSearch();
        googleSteps.finfirst();
        mainPageSteps.findButton();
        mainPageSteps.checkInfo();
    }
}
