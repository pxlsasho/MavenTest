package pages.vtishtshenko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenCartMainPage {
    private static final String BASE_URL = "https://demo.opencart.com";
    private static final String My_Account_LINK_TEXT = "My Account";
    private WebDriver driver;
    @FindBy(linkText = "My Account")
    private WebElement accountLink;

    public OpenCartMainPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void open()
    {
        driver.get(BASE_URL);
    }
    public  void accountLocalization()
    {
        accountLink.click();
    }
}
