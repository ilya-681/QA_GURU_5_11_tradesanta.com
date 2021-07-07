package tradesanta.com.tests;

import tradesanta.com.config.App;
import tradesanta.com.pages.Internal.DashboardPage;
import tradesanta.com.pages.Public.LoginPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class LoginTest extends TestBase {

    final private LoginPage loginPage = new LoginPage();
    final private DashboardPage dashboardPage = new DashboardPage();


    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("TS")
    @Feature("Login with username/password")
    @Story("Successful Login")
    @DisplayName("Successful login with username/password")
    void successfulAuthByWebWithCredentialsTest() {
        loginPage.openLoginPage()
                 .login(App.config.existingUsername(), App.config.existingUsernamePassword());

        dashboardPage.isLoginDashboardOpened();
    }

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("TS")
    @Feature("Login with username/password")
    @Story("Unsuccessful Login")
    @DisplayName("Unsuccessful login with wrong password")
    void unsuccessfulAuthByWebWithWrongPasswordTest() {
        loginPage.openLoginPage()
                 .login(App.config.existingUsername(), "123456789");

        loginPage.unsuccessfulLoginMsg.shouldBe(Condition.visible);
    }

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("TS")
    @Feature("Login with username/password")
    @Story("Unsuccessful Login")
    @DisplayName("Unsuccessful login with wrong username")
    void unsuccessfulAuthByWebWithWrongUsernameTest() {
        loginPage.openLoginPage()
                 .login("someUserName", App.config.existingUsernamePassword());

        loginPage.unsuccessfulLoginMsg.shouldBe(Condition.visible);
    }
}

