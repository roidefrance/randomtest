package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class randomTest {

    @Test
    void siteExists() {

        open("https://www.mail.ru/");
        $("html").shouldHave(text("Почта"));
        $("html").shouldHave(text("Спорт"));
$("#q").setValue("спорт").pressEnter();

    }
}