package yuriikulyk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestNG {
    @Test
    public void RegistrationNewUser()
    {
        System.setProperty("webdriver.chrome.driver" ,  "/Users/osynyava/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        registrationPage.goToRegistrationPage();
        registrationPage.registration();
    }

    @Test
    public void LoginOldUser()
    {
        System.setProperty("webdriver.chrome.driver" ,  "/Users/osynyava/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.goToLoginPage();
        loginPage.login();
    }

    @Test
    public void SearchAndAddToCart()
    {
        System.setProperty("webdriver.chrome.driver" ,  "/Users/osynyava/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
        cartPage.searchAndAddToCart();
    }
}
