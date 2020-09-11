package PageObject;

import Locators.Tabs;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import resources.BaseClass;
import resources.LoggerHelper;

public class TabsObject extends BaseClass {

    public static Logger log = LoggerHelper.getLogger(TabsObject.class);
    Tabs tab = new Tabs();

    public TabsObject(WebDriver driver) {
        this.driver = driver;
        tab = PageFactory.initElements(driver, Tabs.class);
    }


    public void clickAdminTab() {
        Tabs.adminTab.click();
        log.info("Clicked Admin Tab");

    }

    public void clickLeaveTab() {
        Tabs.leaveTab.click();
        log.info("Clicked Leave Tab");
    }

    public void clickLeaveSubTab() {
        Tabs.applyLeaveSubTab.click();
        log.info("Clicked SubLeave Tab");
    }

    public void clickMyLeaveSubTab() {
        Tabs.myLeaveSubTab.click();
        log.info("Clicked My Leave Tab");

    }
}
