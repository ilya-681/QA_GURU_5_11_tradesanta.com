package tradesanta.com.tests;

import tradesanta.com.pages.Public.LoginPage;
import tradesanta.com.pages.Public.ResetPassword;
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
    @Tag("UI")
    @Feature("Login page")
    @Story("Login page content")
    @DisplayName("Successful Login page loading")
    void openMainPageTest() {
        loginPage.openLoginPage();
    }

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("UI")
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
    @Tag("UI")
    @Feature("Login page")
    @Story("Login page content")
    @DisplayName("Check Login page header")
    public void loginPageHeaderTest() {
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
    @Tag("UI")
    @Feature("Login page")
    @Story("Login page content")
    @DisplayName("Check Login page footer")
    public void loginPageFooterTest() {
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
    @Tag("UI")
    @Feature("Login page")
    @Story("Login page content")
    @DisplayName("Check Reset password link on the login page ")
    void resetPasswordLinkTest() {
        loginPage.openLoginPage()
                 .clickToForgotYourPassword();

        resetPassword.isResetPasswordOpened();
    }
}
