package cloud.autotests.pages.Internal;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractInternalPage {

    @Step("Console logs should not contain text 'SEVERE'")
    public AbstractInternalPage checkConsoleShouldNotHaveErrors() {
        String consoleLogs = DriverUtils.getConsoleLogs();
        String errorText = "SEVERE";

        assertThat(consoleLogs).doesNotContain(errorText);
        return this;
    }
}
