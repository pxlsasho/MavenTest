package vheryliv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private static final String BASE_URL = "https://demo.opencart.com/";
    private static final String MY_ACCOUNT = "My Account";
    private WebDriver driver;

    @FindBy (linkText = MY_ACCOUNT)
    private WebElement myaccount;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get(BASE_URL);
    }

    public void click(){
        myaccount.click();
    }

}