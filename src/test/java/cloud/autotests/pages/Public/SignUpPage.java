package cloud.autotests.pages.Public;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SignUpPage extends AbstractExternalPage{

    public SelenideElement welcomeMsg = $x("//body").shouldHave(Condition.text("Simplify Your Trading Now"));


}
