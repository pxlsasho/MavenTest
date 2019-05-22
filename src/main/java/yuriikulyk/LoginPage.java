package yuriikulyk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private static final String Base_URL = "https://demo.opencart.com/";
    private static final String MY_ACCOUNT_LINK_TEXT = "My Account";
    private static final String LOGIN_LINK_TEST = "Login";

    private WebDriver driver;

    @FindBy(linkText = MY_ACCOUNT_LINK_TEXT)
    private WebElement myAccountLink;
    @FindBy(linkText = LOGIN_LINK_TEST)
    private WebElement myLoginLink;
    @FindBy(id = "input-email")
    private WebElement emailField;
    @FindBy(id = "input-password")
    private WebElement passwordField;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/input")
    private WebElement loginButton;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void goToLoginPage()
    {
        driver.get(Base_URL);
        myAccountLink.click();
        myLoginLink.click();
    }
    public void login()
    {
        emailField.sendKeys("abdullah@gmail.com");
        passwordField.sendKeys("kurlyk");
        loginButton.click();
    }
}
