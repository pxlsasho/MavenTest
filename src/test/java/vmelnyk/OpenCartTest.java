package vmelnyk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OpenCartTest {

    @Test
    public void TestOpenCart()
    {
        System.setProperty("webdriver.chrome.driver" , "C:/chromedriver/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        MainPage mainPage = PageFactory.initElements(chromeDriver, MainPage.class);
        mainPage.open();
        mainPage.AccountClick();

    }
}
