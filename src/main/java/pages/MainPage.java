package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private static final String BASE_URL = "https://rozetka.com.ua/ua/";
    private static final String UA_LINK_TEXT = "UA";
    private WebDriver driver;

    @FindBy(linkText = "UA")
    private WebElement uaLink;

    public MainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void open()
    {
        driver.get(BASE_URL);
    }
    public void steUALocalization()
    {
        uaLink.click();
    }

}
