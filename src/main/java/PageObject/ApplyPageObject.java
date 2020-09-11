package PageObject;

import Locators.ApplyPage;
import Utilities.Utilities;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import resources.BaseClass;
import resources.LoggerHelper;

import java.util.List;

public class ApplyPageObject extends BaseClass {

    public static Logger log = LoggerHelper.getLogger(ApplyPageObject.class);
    public WebDriver driver;
    ApplyPage applyPage;
    Utilities utilities = new Utilities();

    public ApplyPageObject(WebDriver driver) {
        applyPage = PageFactory.initElements(driver, ApplyPage.class);
        this.driver = driver;
    }


    public void selectDate(String d, String month, String year) {

        utilities.selectOptionByText(ApplyPage.monthPickerDD, month);
        utilities.selectOptionByText(ApplyPage.yearPickerDD, year);
        List<WebElement> days = ApplyPage.day;
        for (WebElement day : days) {
            if (day.getText()
                    .contains(d)) {
                log.info("Selected " + d);
                day.click();
            }
        }

    }

    public void selectLeaveType(String leaveType) {
        utilities.selectOptionByText(ApplyPage.leaveTypeDDTrigger, leaveType);
        log.info("Selected LeaveType " + leaveType);

    }

    public void enterComment(String comment) {
        ApplyPage.commentTxtBox.sendKeys(comment);
        log.info("Entered " + comment + " in the comment Box");
    }

    public void clickApplyBtn() {
        ApplyPage.applyBtn.click();
        log.info("Clicked Apply Btn");

    }

    public void clickFromDateControl() {
        ApplyPage.fromDate.click();
        log.info("Clicked From Date Control");
    }

    public void clickToDateControl() {
        ApplyPage.toDate.click();
        log.info("Clicked To Date Control");
    }
}
