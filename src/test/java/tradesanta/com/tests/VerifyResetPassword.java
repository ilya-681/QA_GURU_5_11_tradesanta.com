package tradesanta.com.tests;

import tradesanta.com.pages.Public.ResetPassword;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class VerifyResetPassword extends TestBase{

    ResetPassword resetPassword = new ResetPassword();

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("UI")
    @Feature("Reset password page")
    @Story("Reset password page content")
    @DisplayName("Successful Reset password page loading")
    void openMainPageTest() {
        resetPassword.openResetPasswordPage();
    }

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("UI")
    @Feature("Reset password page")
    @Story("Reset password page content")
    @DisplayName("Reset password page console log should not have errors")
    void loginPageConsoleShouldNotHaveErrorsTest() {
        resetPassword.openResetPasswordPage()
                     .checkConsoleShouldNotHaveErrors();
    }

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("UI")
    @Feature("Reset password page")
    @Story("Reset password page content")
    @DisplayName("Check Reset password page header")
    public void loginPageHeaderTest() {
        resetPassword.openResetPasswordPage()
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
    @Feature("Reset password page")
    @Story("Reset password page content")
    @DisplayName("Check Reset password page footer")
    public void mainPageFooterTest() {
        resetPassword.openResetPasswordPage()
                     .checkPageFooter()
                     .checkFooterSocialNetworkLinks()
                     .checkFooterAppLinks()
                     .checkFooterMenuNames()
                     .checkFooterMenuLinks()
                     .checkFooterPolicyLinks()
                     .checkFooterContent();
    }
}
