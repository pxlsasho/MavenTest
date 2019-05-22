package yuriikulyk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.OpenCartProperties;

public class TestNG {

    WebDriver driver;

    @BeforeTest
    public void setup() throws Exception
    {
        OpenCartProperties props = new OpenCartProperties();
        System.setProperty("webdriver.chrome.driver" ,  props.getChromedriver());
        driver = new ChromeDriver();
    }
    @Test
    public void RegistrationNewUser()
    {
        //System.setProperty("webdriver.chrome.driver" ,  "D://IntelliJ IDEA Community Edition 2019.1/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        registrationPage.goToRegistrationPage();
        registrationPage.registration();
    }

    @Test
    public void LoginOldUser()
    {
        //System.setProperty("webdriver.chrome.driver" ,  "D://IntelliJ IDEA Community Edition 2019.1/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.goToLoginPage();
        loginPage.login();
    }

    @Test
    public void SearchAndAddToCart()
    {
        //System.setProperty("webdriver.chrome.driver" ,  "D://IntelliJ IDEA Community Edition 2019.1/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
        cartPage.searchAndAddToCart();
    }
}
