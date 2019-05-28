package Efik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OpenCartTest {
    WebDriver driver;
    @Test
    public void OpencartTest() {

        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        driver = new ChromeDriver();

        //MainPage
        Efik.MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.OpenWebsite();
        mainPage.FindAccountLink();

        //RegistrationPage
        RegistrationClass registrationClass = PageFactory.initElements(driver, RegistrationClass.class);
        registrationClass.clickContinueButton();
        registrationClass.Registration();

        //LoginPage
        Efik.LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage.FindAccountLink();
        loginPage.Login();

        //CartPage
        CartClass cartClass = PageFactory.initElements(driver, CartClass.class);
        cartClass.SearchAndAdditem();

    }
}


