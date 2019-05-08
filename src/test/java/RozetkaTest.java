import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

public class RozetkaTest {

    @Test
    public void testRozetka()
    {
        //Init chrome driver
        System.setProperty("webdriver.chrome.driver" ,  "/Users/osynyava/chromedriver/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        //Test Body
        MainPage mainPage = PageFactory.initElements(chromeDriver, MainPage.class);
        mainPage.open();
        mainPage.steUALocalization();

    }


}
