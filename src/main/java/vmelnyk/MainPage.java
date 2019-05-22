package vmelnyk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.awt.image.ImageWatched;

public class MainPage {

    private static final String BASE_URL = "https://demo.opencart.com/";
    private static final String MY_ACCOUNT_LINK = "My Account";
    private WebDriver driver;

    @FindBy (linkText = "My Account")

    private WebElement account;
    public MainPage(WebDriver driver) { this.driver = driver; }

    public void open() {driver.get(BASE_URL); }
    public void AccountClick()  {account.click(); }


}
