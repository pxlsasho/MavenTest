package vmelnyk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OpenCartTest {
    @Test
    public void TestOpenCart()
    {
        System.setProperty("webdriver.chrome.driver" , "C:/chromedriver/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        MainPage mainPage = PageFactory.initElements(chromeDriver, MainPage.class);
        mainPage.open();
        mainPage.MyAccount_Click();
        mainPage.Register_CLick();
        mainPage.FirstName_Click();
        mainPage.FirstName_Set();
        mainPage.LastName_Set();
        mainPage.Email_Set();
        mainPage.Telephone_Set();
        mainPage.Password_Set();
        mainPage.Confirm_Password();
        mainPage.Agree_Click();
        mainPage.Continue_Click();

    }
    @Test
    public void AddtoCartTest() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        AddtoCart addtoCart = PageFactory.initElements(chromeDriver, AddtoCart.class);
        addtoCart.open();
        addtoCart.CartTest();

    }

    }

