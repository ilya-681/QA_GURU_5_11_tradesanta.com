package tradesanta.com.elements;

import tradesanta.com.config.App;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class PublicPagesFooter {

    SelenideElement socialNetworkLinksBlock = $(".col-xl-auto.py-3"),
            telegramLink = $("#footer").$("img[alt='tradesanta telegram']"),
            facebookLink = $("#footer").$("img[alt='tradesanta facebook']"),
            twitterLink = $("#footer").$("img[alt='tradesanta twitter']"),
            youtubeLink = $("#footer").$("img[alt='tradesanta youtube']"),

            iosAppLink = $("#footer").$("img[alt='crypto bot app on App Store']").parent(),
            androidAppLink = $("#footer").$("img[alt='trading bot app on Google Play']").parent(),

            termsOfUse = $("#footer").$(byText("Terms of use")),
            disclaimerText = $("#footer").$(".col-12.py-3.small"),
            privacyPolicy = $("#footer").$(byText("Privacy policy")),
            cookiesPolicy = $("#footer").$(byText("Cookies policy")),
            disclaimer = $("#footer").$(byText("Disclaimer")),

            logo = $("#footer").$("img[alt='Trade santa – cryptocurrency trading bots']"),
            cryptoGeek = $("#footer").$("iframe[src='https://cryptogeek.info/tools-widget/tradesanta?view=square&theme=dark&transparent=true']"),
            copyright = $("#footer").$(".col-md-auto.col-lg.py-2.small.text-md-right"),

    featuresBlock = $("#footer").$(byText("Features")),
            howItWorksMenu = $("#footer").$(byText("How it works")),
            technicalIndicatorsMenu = $("#footer").$(byText("Technical indicators")),
            tradingToolsMenu = $("#footer").$(byText("Trading tools")),
            exchangesMenu = $("#footer").$(byText("Exchanges")),
            faqMenu = $("#footer").$(byText("FAQ")),
            changelogMenu = $("#footer").$(byText("Changelog")),
            referralProgramMenu = $("#footer").$(byText("Referral program"));


    public void isDisplayed() {
        telegramLink.shouldBe(visible);
        facebookLink.shouldBe(visible);
        twitterLink.shouldBe(visible);
        youtubeLink.shouldBe(visible);
        iosAppLink.shouldBe(visible);
        androidAppLink.shouldBe(visible);
        termsOfUse.shouldBe(visible);
        disclaimerText.shouldBe(visible);
        privacyPolicy.shouldBe(visible);
        cookiesPolicy.shouldBe(visible);
        disclaimer.shouldBe(visible);
        logo.shouldBe(visible);
        cryptoGeek.shouldBe(visible);
        copyright.shouldBe(visible);
        socialNetworkLinksBlock.shouldBe(visible);
        featuresBlock.shouldBe(visible);
        howItWorksMenu.shouldBe(visible);
        technicalIndicatorsMenu.shouldBe(visible);
        tradingToolsMenu.shouldBe(visible);
        exchangesMenu.shouldBe(visible);
        faqMenu.shouldBe(visible);
        changelogMenu.shouldBe(visible);
        referralProgramMenu.shouldBe(visible);
    }

    public void checkFooterSocialNetworkLinks() {
        telegramLink.parent().shouldHave(Condition.href(App.config.getTelegrammLink()));
        facebookLink.parent().shouldHave(Condition.href(App.config.getFacebookLink()));
        twitterLink.parent().shouldHave(Condition.href(App.config.getTwitterLink()));
        youtubeLink.parent().shouldHave(Condition.href(App.config.getYoutubeLink()));
    }

    public void checkFooterAppLinks() {
        iosAppLink.shouldHave(Condition.href(App.config.getIosAppLink()));
        androidAppLink.shouldHave(Condition.href(App.config.getAndroidAppLink()));
    }

    public void checkFooterMenuNames() {
        featuresBlock.shouldHave(text("Features"));
        howItWorksMenu.shouldHave(text("How it works"));
        technicalIndicatorsMenu.shouldHave(text("Technical indicators"));
        tradingToolsMenu.shouldHave(text("Trading tools"));
        exchangesMenu.shouldHave(text("Exchanges"));
        faqMenu.shouldHave(text("FAQ"));
        changelogMenu.shouldHave(text("Changelog"));
        referralProgramMenu.shouldHave(text("Referral program"));
    }

    public void checkFooterMenuLinks() {
        //featuresBlock:
        howItWorksMenu.shouldHave(Condition.href("/how-it-works"));
        technicalIndicatorsMenu.shouldHave(Condition.href("/technical-indicators"));
        tradingToolsMenu.shouldHave(Condition.href("/trading-tools"));
        exchangesMenu.shouldHave(Condition.href("/exchanges"));
        faqMenu.shouldHave(Condition.href("/documentation-new"));
        changelogMenu.shouldHave(Condition.href("/changelog"));
        referralProgramMenu.shouldHave(Condition.href("/referral-program"));
    }

    public void checkFooterPolicyLinks() {
        termsOfUse.shouldHave(Condition.href("/terms-of-use"));
        privacyPolicy.shouldHave(Condition.href("/privacy"));
        cookiesPolicy.shouldHave(Condition.href("/cookies-policy"));
        disclaimer.shouldHave(Condition.href("/disclaimer"));
    }

    public void checkFooterContent() {
        disclaimerText.shouldHave(text("At this website, you may access software that enables you to trade and invest in cryptocurrencies " +
                "by means of an automatic crypto trader bot – of which you solely control. Please consult with our " +
                "Policies and Disclaimer before starting any trading."));
        copyright.shouldHave(text("© 2018 - 2021 TradeSanta"));
        socialNetworkLinksBlock.shouldHave(text("Come join us:"));
    }
}

