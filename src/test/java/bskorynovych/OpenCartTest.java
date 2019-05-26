package bskorynovych;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import utils.OpenCartProperties;

import java.util.concurrent.TimeUnit;

public class OpenCartTest {
    WebDriver driver;
    @BeforeTest
    public void setup() throws Exception
    {
        OpenCartProperties props = new OpenCartProperties();
        System.setProperty("webdriver.chrome.driver" ,  props.getChromedriver());
        driver = new ChromeDriver();
    }

    @Test
    public void SomeClicks()
    {
        //driver
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Богдан Скоринович\\Desktop\\курси TA\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        //test
        MainPageOpencart mainPageOpencart = PageFactory.initElements( driver, MainPageOpencart.class);
        mainPageOpencart.open();
        mainPageOpencart.findmyAccount();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPageOpencart.findLogin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPageOpencart.findRegister();


    }
    @Test
    public void SearchAndAddToCart()
    {
        //driver
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Богдан Скоринович\\Desktop\\курси TA\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        SearchPageOpencart searchPageOpencart = PageFactory.initElements( driver, SearchPageOpencart.class);
        searchPageOpencart.searchCameraCanon();
    }

}
