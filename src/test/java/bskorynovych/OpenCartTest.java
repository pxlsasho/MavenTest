package bskorynovych;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class OpenCartTest {

    @Test
    public void SomeClicks()
    {
        //driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Богдан Скоринович\\Desktop\\курси TA\\chromedriver.exe");
        WebDriver chromedriver = new ChromeDriver();

        //test
        MainPageOpencart mainPageOpencart = PageFactory.initElements( chromedriver, MainPageOpencart.class);
        mainPageOpencart.open();
        mainPageOpencart.findmyAccount();
        mainPageOpencart.findLogin();
        mainPageOpencart.findRegister();


    }
}
