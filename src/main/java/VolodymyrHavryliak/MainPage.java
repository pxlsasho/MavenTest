package VolodymyrHavryliak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage
{
    private static final String Base_url = "https://demo.opencart.com/";

    private WebDriver driver;
    @FindBy(linkText = "My Account")
    private WebElement myAccountLink;


    public MainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void Open()
    {
        driver.get(Base_url);
    }
    public void FindAccount()
    {
        myAccountLink.click();
    }

}
