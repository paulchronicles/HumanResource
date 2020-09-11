package PageObject;

import Locators.AddUserPage;
import Utilities.Utilities;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import resources.BaseClass;
import resources.LoggerHelper;

public class AddUserPageObject extends BaseClass {
    public static Logger log = LoggerHelper.getLogger(AddUserPageObject.class);
    public WebDriver driver;
    AddUserPage addUserPage;
    Utilities utilities = new Utilities();

    public AddUserPageObject(WebDriver driver) {
        addUserPage = PageFactory.initElements(BaseClass.driver, AddUserPage.class);
        this.driver = driver;
    }


    public void selectUserRole(String text) {
        utilities.selectOption(AddUserPage.userRoleDDTrigger, text);
    }

    public void enterEmployeeName(String text) {
        AddUserPage.empNameTxtBox.sendKeys(text);
        log.info("Enter Employee Name " + text);
    }

    public void enterUserName(String text) {
        AddUserPage.userName.sendKeys(text);
        log.info("Enter Username " + text);
    }

    public void selectStatus(String status) {
        utilities.selectOption(AddUserPage.statusDDTrigger, status);
        log.info("Selected Status " + status);
    }

    public void enterPassword(String password) {
        AddUserPage.passwordTxtBox.sendKeys(password);
        log.info("Enter Password" + password);
    }

    public void confirmPassword(String password) {
        AddUserPage.confirmPasswordTxtBox.sendKeys(password);
        log.info("Confirm " + password);
    }

    public void clickSaveBtn() {
        AddUserPage.saveBtn.click();
        log.info("Clicked Save Btn");
    }

}
