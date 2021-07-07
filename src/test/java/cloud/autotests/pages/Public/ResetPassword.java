package cloud.autotests.pages.Public;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class ResetPassword extends AbstractExternalPage{

    public SelenideElement welcomeMsg = $x("//body").$(byText("Reset password"));

    @Step("Open the ResetPassword page")
    public ResetPassword openResetPasswordPage() {
        open("/request-password-reset");
        isResetPasswordOpened();
        return this;
    }

    @Step("Verify that the ResetPassword page is opened")
    public ResetPassword isResetPasswordOpened() {
        welcomeMsg.shouldBe(Condition.visible);
        return this;
    }
}
