package nsosnovshchenko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenCartMainPage {
    //написать метод который будет переходить на страничку логин в опен карт

    private static final String BASE_URL = "https://demo.opencart.com/";
    private static final String MY_ACCOUNT_LINK_TEST = "My Account";
    private static final String LOGIN_LINK_TEST = "Login";

    private WebDriver driver;

    @FindBy(linkText = MY_ACCOUNT_LINK_TEST)
    private WebElement myAccountLink;
    @FindBy(linkText = LOGIN_LINK_TEST)
    private WebElement myLoginLink;

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
}
