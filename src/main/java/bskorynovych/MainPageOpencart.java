package bskorynovych;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageOpencart {
    private static final String BASE_URL = "https://demo.opencart.com/";
    private static final String ACCOUNT_LINK = "My Account";
    private static final String LOGIN_LINK = "Login";
    private static final String REGISTER_LINK = "Register";
    private static final String LOGOUT_LINK = "Logout";

    private WebDriver driver;

    @FindBy (linkText = ACCOUNT_LINK)
    private WebElement myAccountLink;
    @FindBy (linkText = LOGIN_LINK)
    private WebElement loginField;
    @FindBy (linkText = REGISTER_LINK)
    private WebElement registerField;
    @FindBy (linkText = LOGOUT_LINK)
    private WebElement logoutField;

    public MainPageOpencart(WebDriver driver) { this.driver = driver;}

    public void open() {
        driver.get(BASE_URL);
    }
    public void findmyAccount() { myAccountLink.click();}
    public void findLogin() { loginField.click();}
    public void findRegister() { registerField.click();}


}
