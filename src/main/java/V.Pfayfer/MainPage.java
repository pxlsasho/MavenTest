package V.Pfayfer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
//V.Pfayfer
    private static final String BASE_URL = "https://demo.opencart.com/";
    private static final String UA_LINK_TEXT = "UA";
    private WebDriver driver;
 // find link element myaccount
    @FindBy(linkText = "My Account")
    private WebElement link_1;
    // find register
    @FindBy(linkText = "Register")
    private WebElement link_2;
//search field first name
    @FindBy(id = "input-firstname")
    private WebElement link_3;
    //search field second name
    @FindBy(id = "input-lastname")
    private WebElement link_4;
    //filling field email
    @FindBy(id = "input-email")
    private WebElement link_5;
    //filling field telephone
    @FindBy(id = "input-telephone")
    private WebElement link_6;
    //filling pass
    @FindBy(id = "input-password")
    private WebElement link_7;
    //filling field confirm
    @FindBy(id = "input-confirm")
    private WebElement link_8;
    @FindBy(name = "agree")
    private WebElement link_9;
    @FindBy( id= "agree")
    private WebElement link_10;
    public MainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void open()
    {
        driver.get(BASE_URL);
    }
    public void set_auth()
    {
        link_1.click();
        link_2.click();
        //form firstName filling
        link_3.click();
        link_3.clear();
        link_3.sendKeys("VOva");
        //form LastName filling
        link_4.click();
        link_4.clear();
        link_4.sendKeys("Pfayfer");
        //filling e-mail
        link_5.click();
        link_5.clear();
        link_5.sendKeys("Hatsker.2014@Net");
        //filling phone
        link_6.click();
        link_6.clear();
        link_6.sendKeys("777");
        //filling pass
        link_7.click();
        link_7.clear();
        link_7.sendKeys("Joycasino.777");
        //filling confirm
        link_8.click();
        link_8.clear();
        link_8.sendKeys("Joycasino.777");
        //confirm rules
        link_9.click();
        //confirm registration
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

    }

}
