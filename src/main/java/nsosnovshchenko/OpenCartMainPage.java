package nsosnovshchenko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenCartMainPage {

    //variables
    private static final String BASE_URL = "https://demo.opencart.com/";
    private static final String MY_ACCOUNT_LINK_TEST = "My Account";
    private static final String LOGIN_LINK_TEST = "Login";

    private WebDriver driver;

    //web element instances
    @FindBy(linkText = MY_ACCOUNT_LINK_TEST)
    private WebElement myAccountLink;
    @FindBy(linkText = LOGIN_LINK_TEST)
    private WebElement myLoginLink;
    @FindBy(id = "input-email")
    private WebElement emailLog;
    @FindBy(id = "input-password")
    private WebElement passwordLog;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/input")
    private WebElement loginButton;

    //logging method
    public OpenCartMainPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void open()
    {
        driver.get(BASE_URL);
    }
    public void goToMyAccount()
    {
        myAccountLink.click();
    }
    public void goToMyLoginPage()
    {
        myLoginLink.click();
    }
    public void userLogin(){
        emailLog.clear();
        emailLog.sendKeys("test@ukr.net");
        passwordLog.clear();
        passwordLog.sendKeys("Password12#");
        loginButton.click();

    }
}
