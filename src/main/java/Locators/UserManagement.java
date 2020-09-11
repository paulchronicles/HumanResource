package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserManagement {

    @FindBy(id = "searchSystemUser_userName")
    public static WebElement userNameTxtBox;

    @FindBy(id = "searchSystemUser_userType")
    public static WebElement roleDDTrigger;

    @FindBy(id = "searchSystemUser_employeeName_empName")
    public static WebElement employeeNameTxtBox;

    @FindBy(id = "searchSystemUser_status")
    public static WebElement statusDDTrigger;

    @FindBy(id = "searchBtn")
    public static WebElement searchBtn;

    @FindBy(id = "btnAdd")
    public static WebElement addBtn;

    @FindBy(id = "btnDelete")
    public static WebElement deleteBtn;

    @FindBy(name = "chkSelectRow[]")
    public static WebElement checkbox;

}
