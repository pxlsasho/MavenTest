package vmelnyk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utils.OpenCartProperties;

public class OpenCartTest {

    @Test
    public void TestOpenCart() throws Exception
    {
        //System.setProperty("webdriver.chrome.driver" , "C:/chromedriver/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver" ,  "/Users/osynyava/chromedriver/chromedriver");
        OpenCartProperties props = new OpenCartProperties();
        System.setProperty("webdriver.chrome.driver" ,  props.getChromedriver());
        WebDriver chromeDriver = new ChromeDriver();

        MainPage mainPage = PageFactory.initElements(chromeDriver, MainPage.class);
        mainPage.open();
        mainPage.AccountClick();

    }
}
