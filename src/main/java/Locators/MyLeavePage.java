package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyLeavePage {


    @FindBy(id = "calFromDate")
    public static WebElement fromDate;

    @FindBy(id = "calToDate")
    public static WebElement toDate;

    @FindBy(xpath = "//*[@type='checkbox']")
    public static List<WebElement> checkboxes;

    @FindBy(id = "select_leave_action_10")
    public static WebElement actionDDTrigger;


}
