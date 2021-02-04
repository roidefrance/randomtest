package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class randomTest {
    @BeforeAll
    static void setup(){
    Configuration.timeout = 10000;

    }
    @Test
    void siteExists() {

        open("https://www.mail.ru/");
        $("html").shouldHave(text("Почта"));
        $("html").shouldHave(text("Спорт"));
        $(byLinkText("Спорт")).doubleClick();
        switchTo().window(1);
        $(byText("Футбол")).hover();
        $(byLinkText("Премьер-лига")).click();

    }
}
