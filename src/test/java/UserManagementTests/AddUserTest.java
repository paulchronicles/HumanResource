package UserManagementTests;

import PageObject.AddUserPageObject;
import PageObject.LandingPageObject;
import PageObject.TabsObject;
import PageObject.UserManagementPageObject;
import Utilities.Utilities;
import org.testng.annotations.Test;
import resources.BaseClass;

public class AddUserTest extends BaseClass {

    UserManagementPageObject userManagementPageObject;
    LandingPageObject landingPageObject;
    AddUserPageObject addUserPageObject;
    TabsObject tabsObject;


    @Test(groups = {"regression", "smoke"})
    public void addNewUser() {
        userManagementPageObject = new UserManagementPageObject(driver);
        landingPageObject = new LandingPageObject(driver);
        addUserPageObject = new AddUserPageObject(driver);
        tabsObject = new TabsObject(driver);

        landingPageObject.signIn(prop.getProperty("adminusername"), prop.getProperty("adminpassword"));
        tabsObject.clickAdminTab();
        userManagementPageObject.clickAddBtn();
        addUserPageObject.selectStatus("1");
        addUserPageObject.enterEmployeeName("Robert Craig");
        addUserPageObject.enterUserName("SoooG");
        addUserPageObject.selectStatus("0");
        addUserPageObject.enterPassword(prop.getProperty("userpassword"));
        addUserPageObject.confirmPassword(prop.getProperty("userpassword"));
        addUserPageObject.clickSaveBtn();
    }

    @Test(groups = {"smoke"})
    public void verifyNewUserAdded() throws InterruptedException {

        userManagementPageObject = new UserManagementPageObject(driver);
        tabsObject = new TabsObject(driver);
        tabsObject.clickAdminTab();
        Utilities.waitFor(3000);
        userManagementPageObject.searchForInformationInTableRow("SoooG ESS Robert Craig Disabled");

    }
}