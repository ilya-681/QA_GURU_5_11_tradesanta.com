package tradesanta.com.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tradesanta.com.pages.Links;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PublicPagesHeader {

    SelenideElement logo = $x("//body//header").$("img[alt='Trade santa – cryptocurrency trading bots']"),
            tradingPairs = $x("//body//header").$(byText("Trading pairs")),
            contactUs = $x("//body//header").$(byText("Contact us")),
            blog = $x("//body//header").$(byText("Blog")),
            faq = $x("//body//header").$(byText("FAQ")),
            pricing = $x("//body//header").$(byText("Pricing")),
            telegramLink = $x("//body//header").$("img[src='https://static.tradesanta.com/img/lp/icon-tg-circle.svg']"),
            signIn_UpBlock = $x("//body//header").$(".nav-item-access"),
            languageSelect = $x("//body//header").$(".dropdown.dropdown-lang");

    public void isDisplayed() {
        logo.shouldBe(Condition.visible);
        tradingPairs.shouldBe(Condition.visible);
        contactUs.shouldBe(Condition.visible);
        blog.shouldBe(Condition.visible);
        faq.shouldBe(Condition.visible);
        pricing.shouldBe(Condition.visible);
        telegramLink.shouldBe(Condition.visible);
        signIn_UpBlock.should(exist);
        languageSelect.shouldBe(Condition.visible);
    }

    public void checkHeaderMenuNames() {
        tradingPairs.shouldHave(text("Trading pairs"));
        contactUs.shouldHave(text("Contact us"));
        blog.shouldHave(text("Blog"));
        faq.shouldHave(text("FAQ"));
        pricing.shouldHave(text("Pricing"));
    }

    public void checkHeaderMenuLinks() {
        tradingPairs.shouldHave(Condition.href("/crypto-markets"));
        contactUs.shouldHave(Condition.href("/contact-us"));
        blog.shouldHave(Condition.href("/blog"));
        faq.shouldHave(Condition.href("/faq"));
        pricing.shouldHave(Condition.href("/pricing"));
        telegramLink.parent().shouldHave(Condition.href(Links.TELEGRAM_LINK.getURL()));
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
