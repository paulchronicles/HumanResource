package Utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import resources.BaseClass;
import resources.LoggerHelper;

import java.util.List;

public class Utilities extends BaseClass {

	public static Logger log = LoggerHelper.getLogger(Utilities.class);
	public static WebDriverWait wait = new WebDriverWait(driver, 10);

	public static void waitFor(int i) throws InterruptedException {
		Thread.sleep(i);
		log.info("Wait for Next Action");
	}

	public static void waitForVisibilityOfElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Waiting for " + element + " to be visible");

	}

	public void selectOption(WebElement ele, String text) {
		Select select = new Select(ele);
		select.selectByValue(text);
		log.info("Selected " + text);
	}

	public void selectOptionByText(WebElement ele, String text) {
		Select select = new Select(ele);
		select.selectByVisibleText(text);
		log.info("Selected " + text);
	}

	public void scrollToElement(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		log.info("Scrolled " + ele + "into view");
	}

	public void waitForElement(WebElement ele) {
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			log.info("Waiting for the visibility of :" + ele);

		} catch (Exception e) {
			e.printStackTrace();
			log.info(e.getMessage());
		}
	}


	public void acceptAlert() {

		WebElement alert = driver.findElement(By.xpath("//input[@value='Ok']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", alert);
		log.info("Accept Alert");
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
