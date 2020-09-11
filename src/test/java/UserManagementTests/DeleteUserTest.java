package UserManagementTests;

import PageObject.LandingPageObject;
import PageObject.TabsObject;
import PageObject.UserManagementPageObject;
import org.testng.annotations.Test;
import resources.BaseClass;

public class DeleteUserTest extends BaseClass {


    @Test(groups = {"sanity"})
    public void deleteUser() throws InterruptedException {
        UserManagementPageObject userManagementPageObject = new UserManagementPageObject(driver);
        LandingPageObject landingPageObject = new LandingPageObject(driver);
        TabsObject tabsObject = new TabsObject(driver);

        landingPageObject.signIn(prop.getProperty("adminusername"), prop.getProperty("adminpassword"));
        tabsObject.clickAdminTab();
        userManagementPageObject.searchAndDeleteUser(prop.getProperty("johnsmith"));

    }


}
