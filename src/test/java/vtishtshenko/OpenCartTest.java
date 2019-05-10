package vtishtshenko;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.vtishtshenko.OpenCartMainPage;

public class OpenCartTest {
    @Test
    public void testOpenCart()
    {
        System.setProperty("webdriver.chrome.driver" ,  "C:\\Users\\vik\\Documents\\2 курс\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        OpenCartMainPage mainPage = PageFactory.initElements(chromeDriver, OpenCartMainPage.class);
        mainPage.open();
        mainPage.accountLocalization();
    }
}
