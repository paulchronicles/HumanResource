package PageObject;

import Locators.UserManagement;
import Utilities.Utilities;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import resources.BaseClass;
import resources.LoggerHelper;

import java.util.List;

public class UserManagementPageObject extends BaseClass {
    public static Logger log = LoggerHelper.getLogger(UserManagementPageObject.class);
    public WebDriver driver;
    Utilities utilities = new Utilities();
    UserManagement userManagement;

    public UserManagementPageObject(WebDriver driver) {
        userManagement = PageFactory.initElements(BaseClass.driver, UserManagement.class);
        this.driver = driver;
    }

    public void searchAndDeleteUser(String text) throws InterruptedException {
        enterUserName(text);
        clickSearchBtn();
        searchForInformationInTableRow(text);
        clickCheckBox();
        Utilities.waitFor(2000);
        clickDeleteBtn();
        Utilities.waitFor(2000);
        utilities.acceptAlert();
        log.info("Searched and Deleted " + text);
    }

    public void selectUserRole(String role) {
        utilities.selectOption(UserManagement.roleDDTrigger, role);
        log.info("Selected " + role);
    }

    public void selectStatus(String status) {
        utilities.selectOption(UserManagement.roleDDTrigger, status);
        log.info("Selected " + status);
    }

    public void clickCheckBox() {
        UserManagement.checkbox.click();
        log.info("Clicked checkbox");

    }

    public void enterUserName(String username) {
        UserManagement.userNameTxtBox.sendKeys(username);
        log.info("Entered " + username);
    }

    public void clickSearchBtn() {
        UserManagement.searchBtn.click();
        log.info("Clicked search Btn");
    }

    public void clickAddBtn() {
        UserManagement.addBtn.click();
        log.info("Clicked Add Btn");
    }

    public void clickDeleteBtn() {
        UserManagement.deleteBtn.click();
        log.info("Clicked Delete Btn");
    }


    public void searchForInformationInTableColumn(String text) {

        WebElement table = driver.findElement(By.xpath("//table[@id='resultTable']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("th"));
            for (WebElement column : columns) {
                if (column.getText()
                        .contains(text)) {
                    log.info("Text found");
                    break;
                }
            }
        }
    }


    public void searchForInformationInTableRow(String text) {
        WebElement table = driver.findElement(By.xpath("//table[@id='resultTable']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (int i = 0; i < rows.size(); i++) {
            String details = rows.get(i)
                    .getText();
            if (details.contains(text)) {
                Assert.assertTrue(details.contains(text));
                System.out.println(details);
                System.out.println("Halleluyah, item found");
                log.info("search And Found " + text);
                break;
            }
        }

    }

}