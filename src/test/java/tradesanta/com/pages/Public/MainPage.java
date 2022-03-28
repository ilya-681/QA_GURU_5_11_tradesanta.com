package tradesanta.com.pages.Public;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainPage extends AbstractExternalPage {

    public SelenideElement welcomeMsg = $x("//body").$(byText("Сrypto trading bots for everyone"));

    @Step("Open the main page")
    public MainPage openMainPage() {
        open("");
        isMainPageOpened();
        return this;
    }

    @Step("Check that the main page is opened")
    public MainPage isMainPageOpened() {
        welcomeMsg.shouldBe(Condition.visible);
        return this;
    }
}
