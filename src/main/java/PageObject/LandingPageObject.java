package PageObject;

import Locators.LandingPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import resources.BaseClass;
import resources.LoggerHelper;

public class LandingPageObject extends BaseClass {
    public static Logger log = LoggerHelper.getLogger(LandingPageObject.class);
    public WebDriver driver;
    LandingPage landingPage;

    public LandingPageObject(WebDriver driver) {
        landingPage = PageFactory.initElements(BaseClass.driver, LandingPage.class);
        this.driver = driver;
    }

    public void signIn(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickSignInBtn();

    }

    public void enterUsername(String text) {
        LandingPage.usernameTextBox.sendKeys(text);
        log.info("Enter username " + text);
    }

    public void enterPassword(String text) {
        LandingPage.passwordTxtBox.sendKeys(text);
        log.info("Enter password " + text);
    }

    public void clickSignInBtn() {
        LandingPage.signInBtn.click();
        log.info("Clicked SignIn Btn");
    }
}
