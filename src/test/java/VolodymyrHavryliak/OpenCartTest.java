package VolodymyrHavryliak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OpenCartTest
{
    WebDriver driver;
    @Test
    public void OpencartTest() {

        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        driver = new ChromeDriver();

        //MainPage
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.Open();
        mainPage.FindAccount();

        //RegistrationPage
        RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        registrationPage.clickContinueButton();
        registrationPage.Registration();

        //LoginPage
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage.FindAccount();
        loginPage.loginUser();

        //CartPage
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
        cartPage.SearchAndAdditem();

    }
}
