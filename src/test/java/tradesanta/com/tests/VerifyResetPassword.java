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
    @Tag("TS")
    @Feature("Reset password page")
    @Story("Reset password page content")
    @DisplayName("Successful Reset password page loading")
    void openMainPageTest() {
        resetPassword.openResetPasswordPage();
    }

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("TS")
    @Feature("Reset password page")
    @Story("Reset password page content")
    @DisplayName("Reset password page console log should not have errors")
    void loginPageConsoleShouldNotHaveErrorsTest() {
        resetPassword.openResetPasswordPage()
                     .checkConsoleShouldNotHaveErrors();
    }
}
