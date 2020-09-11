package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tabs {

    @FindBy(id = "menu_admin_viewAdminModule")
    public static WebElement adminTab;

    @FindBy(id = "menu_pim_viewPimModule")
    public static WebElement pimTab;

    @FindBy(id = "menu_leave_viewLeaveModule")
    public static WebElement leaveTab;

    @FindBy(id = "menu_leave_applyLeave")
    public static WebElement applyLeaveSubTab;


    @FindBy(id = "menu_leave_viewMyLeaveList")
    public static WebElement myLeaveSubTab;

    @FindBy(id = "menu_time_viewTimeModule")
    public static WebElement timeTab;

    @FindBy(id = "menu_recruitment_viewRecruitmentModule")
    public static WebElement recruitmentTab;

    @FindBy(id = "menu__Performance")
    public static WebElement performanceTab;

    @FindBy(id = "menu_pim_viewMyDetails")
    public static WebElement mmyInfoTab;

    @FindBy(id = "menu_dashboard_index")
    public static WebElement dashboardTab;

    @FindBy(id = "menu_directory_viewDirectory")
    public static WebElement directoryTab;

    @FindBy(id = "menu_maintenance_purgeEmployee")
    public static WebElement maintenanceTab;

    @FindBy(id = "menu_buzz_viewBuzz")
    public static WebElement buzzTab;


}
