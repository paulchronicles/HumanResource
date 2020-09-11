package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ApplyPage {


    @FindBy(id = "applyleave_txtLeaveType")
    public static WebElement leaveTypeDDTrigger;

    @FindBy(id = "applyleave_txtFromDate")
    public static WebElement fromDate;

    @FindBy(id = "applyleave_txtToDate")
    public static WebElement toDate;

    @FindBy(id = "applyleave_txtComment")
    public static WebElement commentTxtBox;

    @FindBy(id = "applyBtn")
    public static WebElement applyBtn;

    @FindBy(xpath = "//select[@data-handler='selectMonth']")
    public static WebElement monthPickerDD;

    @FindBy(xpath = "//select[@data-handler='selectYear']")
    public static WebElement yearPickerDD;

    @FindBy(xpath = "//td[@data-handler='selectDay']")
    public static List<WebElement> day;


}
