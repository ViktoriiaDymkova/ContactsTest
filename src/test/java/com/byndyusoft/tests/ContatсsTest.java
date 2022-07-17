package com.byndyusoft.tests;

import com.byndyusoft.pages.GoogleSteps;
import com.byndyusoft.pages.MainPageSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


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
        step("В поисковой строке введите Byndyusoft", () -> {
            googleSteps.clickToSearch();
        });
        step("Перейдите по первой ссылке", () -> {
            googleSteps.finfirst();
        });
        step("Нажмите на желтую кнопку 'Заказать презентацию' в разделе 'Узнайте больше о наших продуктах'", () -> {
            mainPageSteps.findButton();
        });
        step("Проверьте корректность номера телефона и почтового ящика", () -> {
            mainPageSteps.checkInfo();
        });
    }
}
