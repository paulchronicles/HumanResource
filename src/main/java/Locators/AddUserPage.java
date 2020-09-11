package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage {

    @FindBy(id = "systemUser_userType")
    public static WebElement userRoleDDTrigger;

    @FindBy(id = "systemUser_employeeName_empName")
    public static WebElement empNameTxtBox;

    @FindBy(id = "systemUser_userName")
    public static WebElement userName;

    @FindBy(id = "systemUser_status")
    public static WebElement statusDDTrigger;

    @FindBy(id = "systemUser_password")
    public static WebElement passwordTxtBox;

    @FindBy(id = "systemUser_confirmPassword")
    public static WebElement confirmPasswordTxtBox;

    @FindBy(id = "btnSave")
    public static WebElement saveBtn;


}
