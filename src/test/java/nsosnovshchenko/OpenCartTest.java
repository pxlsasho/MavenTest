package nsosnovshchenko;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class OpenCartTest {

    @Test
    public void testOpenCart() {
        //init chrome driver
        System.setProperty("webdriver.chrome.driver", "G:\\MyF\\SoftServe\\drivers\\chromedriver.exe");
        WebDriver ChromeDriver = new ChromeDriver();

        OpenCartMainPage OpenCartMainPage = PageFactory.initElements(ChromeDriver, OpenCartMainPage.class);
        new OpenCartMainPage(ChromeDriver);

        OpenCartMainPage.open();
        OpenCartMainPage.goToMyAccount();
        OpenCartMainPage.goToMyLoginPage();


    }

}
