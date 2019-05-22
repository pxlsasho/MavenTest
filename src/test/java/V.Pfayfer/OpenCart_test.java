package V.Pfayfer;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import V.Pfayfer.MainPage;

public class OpenCart_test {

    @Test
    public void testRozetka()
    {
        //Init chrome driver
        System.setProperty("webdriver.chrome.driver" ,  "C:/chromedriver/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        //Test Body
        MainPage mainPage = PageFactory.initElements(chromeDriver, MainPage.class);
        mainPage.open();
        mainPage.set_auth();


    }


}
