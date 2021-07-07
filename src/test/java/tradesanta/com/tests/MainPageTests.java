package tradesanta.com.tests;

import tradesanta.com.pages.Public.MainPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class MainPageTests extends TestBase {

    final private MainPage mainPage =new MainPage();

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("TS")
    @Feature("Main page")
    @Story("Main page content")
    @DisplayName("Successful Main page loading")
    void openMainPageTest() {
        mainPage.openMainPage();
    }

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("TS")
    @Feature("Main page")
    @Story("Main page content")
    @DisplayName("Main page console log should not have errors")
    void loginPageConsoleShouldNotHaveErrorsTest() {
        mainPage.openMainPage()
                .checkConsoleShouldNotHaveErrors();
    }

    /*@Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("TS")
    @Feature("Main page")
    @Story("Main page content")
    @DisplayName("Check Main page header")
    public void mainPageHeaderTest() {
        mainPage.openMainPage()
                .checkMainPageHeader()
                .checkMenuNames()
                .checkMenuLinks();
    }*/

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("TS")
    @Feature("Main page")
    @Story("Main page content")
    @DisplayName("Check Main page footer")
    public void mainPageFooterTest() {
        mainPage.openMainPage()
                .checkPageFooter()
                .checkFooterSocialNetworkLinks()
                .checkFooterAppLinks()
                .checkFooterMenuNames()
                .checkFooterMenuLinks()
                .checkFooterPolicyLinks()
                .checkFooterContent();
    }
}
