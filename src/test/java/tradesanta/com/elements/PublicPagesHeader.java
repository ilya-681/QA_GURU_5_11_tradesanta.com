package tradesanta.com.elements;

import tradesanta.com.config.App;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PublicPagesHeader {

    SelenideElement logo = $x("//body//header").$("img[alt='Trade santa – cryptocurrency trading bots']"),
            tradingPairs = $x("//body//header").$(byText("Trading pairs")),
            about = $x("//body//header").$(byText("About")),
            blog = $x("//body//header").$(byText("Blog")),
            faq = $x("//body//header").$(byText("FAQ")),
            pricing = $x("//body//header").$(byText("Pricing")),
            telegramLink = $x("//body//header").$("img[src='https://static.tradesanta.com/img/lp/icon-tg-circle.svg']"),
            signIn_UpBlock = $x("//body//header").$(".nav-item-access"),
            languageSelect = $x("//body//header").$(".dropdown.dropdown-lang");

    public void isDisplayed() {
        logo.shouldBe(Condition.visible);
        tradingPairs.shouldBe(Condition.visible);
        about.shouldBe(Condition.visible);
        blog.shouldBe(Condition.visible);
        faq.shouldBe(Condition.visible);
        pricing.shouldBe(Condition.visible);
        telegramLink.shouldBe(Condition.visible);
        signIn_UpBlock.should(exist);
        languageSelect.shouldBe(Condition.visible);
    }

    public void checkHeaderMenuNames() {
        tradingPairs.shouldHave(text("Trading pairs"));
        about.shouldHave(text("About"));
        blog.shouldHave(text("Blog"));
        faq.shouldHave(text("FAQ"));
        pricing.shouldHave(text("Pricing"));
    }

    public void checkHeaderMenuLinks() {
        tradingPairs.shouldHave(Condition.href("/crypto-markets"));
        about.shouldHave(Condition.href("/how-it-works"));
        blog.shouldHave(Condition.href("/blog"));
        faq.shouldHave(Condition.href("/documentation-new"));
        pricing.shouldHave(Condition.href("/pricing"));
        telegramLink.parent().shouldHave(Condition.href(App.config.getTelegrammLink()));
    }

    @Step("Check header \"Sign in\" link on public pages")
    public void checkHeaderSignInButton() {
        actions().moveToElement(signIn_UpBlock).moveByOffset(-40, 0).click().perform();
        $("body").shouldHave(Condition.text("if you don't have an account."));
        Selenide.back();
    }

    @Step("Check header \"Sign up\" link on public pages")
    public void checkHeaderSignUpButton() {
        actions().moveToElement(signIn_UpBlock).moveByOffset(40, 0).click().perform();
        $("body").shouldHave(Condition.text("Simplify Your Trading Now"));
        Selenide.back();
    }
}
