package tradesanta.com.pages.Public;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends AbstractExternalPage {

    public SelenideElement welcomeMsg = $x("//body").$(byText("Forgot your password?")),
                           unsuccessfulLoginMsg = $("#lbl-error");

    SelenideElement userName = $("#inp-username"),
                    password = $("#inp-password"),
                    rememberMe = $("#loginform-rememberme"),
                    forgotPassword = $("a[href='request-password-reset']");


    @Step("Open the login page")
    public LoginPage openLoginPage() {
        open("/login");
        isLoginPageOpened();
        return this;
    }

    @Step("Check that the login page is opened")
    public LoginPage isLoginPageOpened() {
        welcomeMsg.shouldBe(Condition.visible);
        return this;
    }

    @Step("Set the username")
    public LoginPage setUsername(String username) {
        userName.setValue(username);
        return this;
    }

    @Step("Set the password")
    public LoginPage setPassword(String pwd) {
        password.setValue(pwd);
        return this;
    }

    @Step("Set the \"Remember Me\" checkbox")
    public LoginPage setRememberMe() {
        rememberMe.click();
        return this;
    }

    @Step("Click to \"Forgot your password?\"")
    public void clickToForgotYourPassword() {
        forgotPassword.click();
    }

    @Step("Login with username and password")
    public void login(String username, String pwd) {
        setUsername(username);
        password.setValue(pwd).pressEnter();
    }


}




