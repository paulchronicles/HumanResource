package PageObject;

import Locators.MyLeavePage;
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

public class MyLeavePageObject extends BaseClass {

    public static Logger log = LoggerHelper.getLogger(MyLeavePageObject.class);
    MyLeavePage myLeavePage;
    Utilities utilities = new Utilities();

    public MyLeavePageObject(WebDriver driver) {

        myLeavePage = PageFactory.initElements(driver, MyLeavePage.class);
        this.driver = driver;
    }

    public void clickAllCheckbox() {
        MyLeavePage.checkboxes.get(0)
                .click();
        log.info("Clicked All checkbox");


    }

    public void assertAllCheckboxesSelected() {
        Assert.assertTrue(MyLeavePage.checkboxes.get(0)
                .isSelected());
        Assert.assertTrue(MyLeavePage.checkboxes.get(1)
                .isSelected());
        Assert.assertTrue(MyLeavePage.checkboxes.get(2)
                .isSelected());
        Assert.assertTrue(MyLeavePage.checkboxes.get(3)
                .isSelected());
        Assert.assertTrue(MyLeavePage.checkboxes.get(4)
                .isSelected());
        Assert.assertTrue(MyLeavePage.checkboxes.get(5)
                .isSelected());
        log.info("All Checkboxes Selected");
    }


    public void searchForUserInColumnAndPerformAction(String name, String action) {

        WebElement table = driver.findElement(By.xpath("//table[@id='resultTable']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (int i = 0; i < rows.size(); i++) {

            List<WebElement> columns = rows.get(i)
                    .findElements(By.tagName("th"));
            for (int x = 0; x < columns.size(); x++) {
                log.info(x < columns.size());
                log.info(columns.get(x)
                        .getText());
                log.info(x);
                //if(columns.get(4).getText().contains(name))
                // log.info("Text found");
                //utilityClass.selectOptionByText(MyLeavePage.actionDDTrigger, action);
                //break;
            }
        }
    }


    public void searchForTextInRowsAndPerformAction(String text, String action) {
        WebElement table = driver.findElement(By.xpath("//table[@id='resultTable']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (int i = 0; i < rows.size(); i++) {
            String details = rows.get(i)
                    .getText();
            if (details.contains(text)) {
                Assert.assertTrue(details.contains(text));
                System.out.println(details);
                System.out.println("Halleluyah, item found");
                log.info("Searched And Found: " + text);
                utilities.selectOptionByText(MyLeavePage.actionDDTrigger, action);
                break;
            }
        }

    }

}
