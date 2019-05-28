package vtishtshenko;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import pages.vtishtshenko.OpenCartLoginPage;
import pages.vtishtshenko.OpenCartMainPage;
import utils.OpenCartProperties;
import pages.vtishtshenko.OpenCartRegistrationPage;
import java.io.IOException;

public class OpenCartTest {
    public WebDriver driver;
    @BeforeTest
    public void setup() throws Exception
    {
        OpenCartProperties props = new OpenCartProperties();
        System.setProperty("webdriver.chrome.driver" ,  props.getChromedriver());
        driver = new ChromeDriver();
    }
    @Test
    public void testMainOpenCart()
    {
        OpenCartMainPage mainPage = PageFactory.initElements(driver, OpenCartMainPage.class);
        new OpenCartMainPage(driver);
        mainPage.open();
        mainPage.accountLocalization();
        driver.close();
    }
    @Test
    public void testRegistrationOpenCart()
    {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vik\\Documents\\2 курс\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        OpenCartRegistrationPage registrationPage = PageFactory.initElements(driver,OpenCartRegistrationPage.class);
        new OpenCartRegistrationPage(driver);
        registrationPage.open();
        registrationPage.accountLocalization();
        registrationPage.registrationLocalization();
        registrationPage.Registration();
        driver.close();
    }
    @Test
    public void testLoginOpenCart()
    {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vik\\Documents\\2 курс\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        OpenCartLoginPage loginPage = PageFactory.initElements(driver,OpenCartLoginPage.class);
        new OpenCartLoginPage(driver);
        loginPage.open();
        loginPage.accountLocalization();
        loginPage.loginLocalization();
        loginPage.Login();
        driver.close();
    }
}
