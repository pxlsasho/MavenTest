package dchalyi;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.dchalyi.OpenCartMainPage;

public class OpenCartTest {

    @Test
    public void testOpenCart() throws Exception {
        //Init chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        OpenCartMainPage mainPage = new OpenCartMainPage(driver);
        mainPage.open();
        mainPage.findMyAccount();
        mainPage.findLogin();
        mainPage.loginAS("d.chalyi16@gmail.com", "drakondrakon");
    }
}