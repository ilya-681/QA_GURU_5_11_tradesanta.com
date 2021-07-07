package cloud.autotests.pages.Internal;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DashboardPage extends AbstractInternalPage{

    public SelenideElement welcomeMsg = $("#dynamics_accesses");

    @Step("Open the dashboard page")
    public DashboardPage openDashboardPage() {
        open("/account");
        isLoginDashboardOpened();
        return this;
    }

    @Step("Verify that the dashboard page is opened")
    public DashboardPage isLoginDashboardOpened() {
        welcomeMsg.shouldBe(Condition.visible);
        return this;
    }
}
