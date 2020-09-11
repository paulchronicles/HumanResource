package LeaveTests;

import PageObject.ApplyPageObject;
import PageObject.LandingPageObject;
import PageObject.MyLeavePageObject;
import PageObject.TabsObject;
import org.testng.annotations.Test;
import resources.BaseClass;

public class CancelLeaveFromMyLeavePageTest extends BaseClass {

    LandingPageObject landingPageObject;
    ApplyPageObject applyPageObject;
    TabsObject tabsObject;
    MyLeavePageObject myLeavePageObject;


    @Test
    public void cancelLeaveWithTypeVacationFromMyLeavePage() throws InterruptedException {

        landingPageObject = new LandingPageObject(driver);
        applyPageObject = new ApplyPageObject(driver);
        tabsObject = new TabsObject(driver);
        myLeavePageObject = new MyLeavePageObject(driver);

        landingPageObject.signIn(prop.getProperty("adminusername"), prop.getProperty("adminpassword"));
        tabsObject.clickLeaveTab();
        tabsObject.clickMyLeaveSubTab();
        myLeavePageObject.searchForTextInRowsAndPerformAction("Vacation US", "Cancel");


    }
}
