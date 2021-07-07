package cloud.autotests.tests;

import cloud.autotests.pages.Public.LoginPage;
import cloud.autotests.pages.Public.ResetPassword;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



public class LoginPageTest extends TestBase {

    final private LoginPage loginPage = new LoginPage();
    final private ResetPassword resetPassword = new ResetPassword();

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("TS")
    @Feature("Login page")
    @Story("Login page content")
    @DisplayName("Successful Login page loading")
    void openMainPageTest() {
        loginPage.openLoginPage();
    }

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("TS")
    @Feature("Login page")
    @Story("Login page content")
    @DisplayName("Login page console log should not have errors")
    void loginPageConsoleShouldNotHaveErrorsTest() {
        loginPage.openLoginPage()
                 .checkConsoleShouldNotHaveErrors();
    }

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("TS")
    @Feature("Main page")
    @Story("Main page content")
    @DisplayName("Check Main page header")
    public void mainPageHeaderTest() {
        loginPage.openLoginPage()
                .checkPageHeader()
                .checkHeaderMenuNames()
                .checkHeaderMenuLinks()
                .checkHeaderSignUpLink()
                .checkHeaderSignInLink();
    }

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("TS")
    @Feature("Main page")
    @Story("Main page content")
    @DisplayName("Check Main page footer")
    public void mainPageFooterTest() {
        loginPage.openLoginPage()
                 .checkPageFooter()
                 .checkFooterSocialNetworkLinks()
                 .checkFooterAppLinks()
                 .checkFooterMenuNames()
                 .checkFooterMenuLinks()
                 .checkFooterPolicyLinks()
                 .checkFooterContent();
    }

    @Test
    @Tag("TS")
    @Feature("Enable Reset password link on the login page")
    @Story("Reset password")
    @DisplayName("Verify that Reset password link is enable on the login page ")
    void verifyResetPasswordLink() {
        loginPage.openLoginPage()
                 .clickToForgotYourPassword();

        resetPassword.isResetPasswordOpened();
    }
}
