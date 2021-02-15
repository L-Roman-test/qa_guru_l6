package tests;

import org.junit.jupiter.api.Test;
import settings.BaseTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void SearchSelenide() {
        open("https://google.com");
        $("[name=q]").setValue("Selenide").pressEnter();
        $$("#search cite").findBy(text("ru.selenide.org")).shouldBe(visible);
    }
}
