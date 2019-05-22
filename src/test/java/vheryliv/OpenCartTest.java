package vheryliv;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import utils.OpenCartProperties;

public class OpenCartTest {
    @Test
    public void opencarttest() throws Exception{
        //chromedriver
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vladg_000\\chromedriver\\chromedriver.exe");
        OpenCartProperties props = new OpenCartProperties();
        System.setProperty("webdriver.chrome.driver" ,  props.getChromedriver());
        WebDriver chromedriver = new ChromeDriver();

        //test
        MainPage mainPage = PageFactory.initElements(chromedriver,MainPage.class);
        mainPage.open();
        mainPage.click();

    }
}
