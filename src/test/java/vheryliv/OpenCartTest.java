package vheryliv;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import utils.OpenCartProperties;

public class OpenCartTest {

    /*WebDriver chromedriver;

    @BeforeTest
    public void setup() throws Exception {
        OpenCartProperties props = new OpenCartProperties();
        System.setProperty("webdriver.chrome.driver", props.getChromedriver());
        chromedriver = new ChromeDriver();
    }*/

    @Test
    public void opencarttest() {
        //chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vladg_000\\chromedriver\\chromedriver.exe");
        //OpenCartProperties props = new OpenCartProperties();
        //System.setProperty("webdriver.chrome.driver" ,  props.getChromedriver());
        WebDriver chromedriver = new ChromeDriver();

        //test
        MainPage mainPage = PageFactory.initElements(chromedriver,MainPage.class);
        mainPage.open();
        mainPage.click();

    }

    @Test
    public void DoLogIn(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vladg_000\\chromedriver\\chromedriver.exe");
        WebDriver chromedriver = new ChromeDriver();
        LogIn dologin = PageFactory.initElements(chromedriver,LogIn.class);
        dologin.gotoLogInPage();
        dologin.dologin();
    }
}
