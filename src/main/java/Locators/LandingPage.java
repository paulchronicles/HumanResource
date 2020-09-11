package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {


    @FindBy(name = "txtUsername")
    public static WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public static WebElement passwordTxtBox;

    @FindBy(xpath = "//form[@id='frmLogin']//descendant::div//input[@name='Submit']")
    public static WebElement signInBtn;

}
