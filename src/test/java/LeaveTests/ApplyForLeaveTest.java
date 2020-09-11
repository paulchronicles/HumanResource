package LeaveTests;

import PageObject.ApplyPageObject;
import PageObject.LandingPageObject;
import PageObject.TabsObject;
import org.testng.annotations.Test;
import resources.BaseClass;

public class ApplyForLeaveTest extends BaseClass {

    LandingPageObject landingPageObject;
    ApplyPageObject applyPageObject;
    TabsObject tabsObject;

    @Test(groups = {"regression"})
    public void applyForLeave() throws InterruptedException {
        landingPageObject = new LandingPageObject(driver);
        applyPageObject = new ApplyPageObject(driver);
        tabsObject = new TabsObject(driver);

        landingPageObject.signIn(prop.getProperty("adminusername"), prop.getProperty("adminpassword"));
        tabsObject.clickLeaveTab();
        tabsObject.clickLeaveSubTab();
        applyPageObject.selectLeaveType("Vacation US");
        applyPageObject.clickFromDateControl();
        applyPageObject.selectDate("20", "Nov", "2020");
        applyPageObject.clickToDateControl();
        applyPageObject.selectDate("9", "Jan", "2021");
        applyPageObject.enterComment("My God is Able");
        applyPageObject.clickApplyBtn();

    }

}


