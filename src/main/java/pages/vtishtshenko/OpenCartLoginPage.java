package pages.vtishtshenko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenCartLoginPage {
    private static final String BASE_URL = "https://demo.opencart.com";
    private static final String ACCOUNT_LINK= "My Account";
    private static final String LOGIN_LINK= "Login";

    private WebDriver driver;

    @FindBy(linkText = "My Account")
    private WebElement accountLink;
    @FindBy(linkText = "Login")
    private WebElement loginLink;
    @FindBy(id="input-email")
    private WebElement email;
    @FindBy(id = "input-password")
    private WebElement password;
    public OpenCartLoginPage(WebDriver driver){

        this.driver=driver;
    }
    public void open()
    {
        driver.get(BASE_URL);
    }
    public void accountLocalization()
    {
        accountLink.click();
    }
    public void loginLocalization()
    {
        loginLink.click();
    }
    public void Login(){
        email.sendKeys("test1@test1.com");
        password.sendKeys("password123");
    }
}
