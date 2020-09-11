package LoginTests;

import PageObject.LandingPageObject;
import net.bytebuddy.utility.RandomString;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.BaseClass;


public class LoginTest extends BaseClass {
    String username = "Admin";
    String password = "admin123";
    String invalidPassword = RandomString.make(5);


    @Test
    public void userSignInWithValidCredentials() {
        LandingPageObject landingPageObject = new LandingPageObject(driver);
        landingPageObject.signIn(username, password);
        Assert.assertTrue(driver.getCurrentUrl()
                .contains("dashboard"));
    }

    @Test
    public void userSignInWithInvalidCredentials() {
        LandingPageObject landingPageObject = new LandingPageObject(driver);
        landingPageObject.signIn(username, invalidPassword);
        Assert.assertTrue(driver.getCurrentUrl()
                .contains("validateCredentials"));
    }


}
