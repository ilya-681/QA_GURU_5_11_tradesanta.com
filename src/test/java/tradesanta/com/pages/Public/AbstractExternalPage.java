package tradesanta.com.pages.Public;

import tradesanta.com.elements.PublicPagesFooter;
import tradesanta.com.elements.PublicPagesHeader;

import tradesanta.com.helpers.DriverUtils;
import io.qameta.allure.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractExternalPage {

    final private PublicPagesHeader header = new PublicPagesHeader();
    final private PublicPagesFooter footer = new PublicPagesFooter();

   @Step("Header is displayed")
    public AbstractExternalPage checkPageHeader() {
        header.isDisplayed();
        return this;
    }

    @Step("Check header menu names in Header")
    public AbstractExternalPage checkHeaderMenuNames() {
        header.checkHeaderMenuNames();
        return this;
    }

    @Step("Check header menu links in Header")
    public AbstractExternalPage checkHeaderMenuLinks() {
        header.checkHeaderMenuLinks();
        return this;
    }

    @Step("Check SignIn link in Header")
    public AbstractExternalPage checkHeaderSignInLink() {
        header.checkHeaderSignInButton();
        return this;
    }

    @Step("Check SignUp link in Header")
    public AbstractExternalPage checkHeaderSignUpLink() {
        header.checkHeaderSignUpButton();
        return this;
    }

    @Step("Footer is displayed")
    public AbstractExternalPage checkPageFooter() {
        footer.isDisplayed();
        return this;
    }

    @Step("Check social network links in Footer")
    public AbstractExternalPage checkFooterSocialNetworkLinks() {
        footer.checkFooterSocialNetworkLinks();
        return this;
    }

    @Step("Check footer App links in Footer")
    public AbstractExternalPage checkFooterAppLinks() {
        footer.checkFooterAppLinks();
        return this;
    }

    @Step("Check footer menu names in Footer")
    public AbstractExternalPage checkFooterMenuNames() {
        footer.checkFooterMenuNames();
        return this;
    }

    @Step("Check footer menu links in Footer")
    public AbstractExternalPage checkFooterMenuLinks() {
        footer.checkFooterMenuLinks();
        return this;
    }

    @Step("Check footer terms/policy links in Footer")
    public AbstractExternalPage checkFooterPolicyLinks() {
        footer.checkFooterPolicyLinks();
        return this;
    }

    @Step("Check footer content in Footer")
    public AbstractExternalPage checkFooterContent() {
        footer.checkFooterContent();
        return this;
    }

    @Step("Console logs should not contain text 'SEVERE'")
    public AbstractExternalPage checkConsoleShouldNotHaveErrors() {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
            return this;
        }
    }

