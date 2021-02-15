package tests;

import org.junit.jupiter.api.Test;
import settings.BaseTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class YandexSearchTest extends BaseTest {

    @Test
    public void SearchSelenideYandex() {

        open("https://yandex.ru/");
        $("#text").setValue("Selenide").pressEnter();
        $$("#search-result").findBy(text("ru.selenide.org")).shouldBe(visible);

    }
}
