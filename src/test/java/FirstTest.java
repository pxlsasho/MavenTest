import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;


public class FirstTest {

    @Test
    public void FirstTEst()
    {
        System.setProperty("webdriver.chrome.driver" ,  "/Users/osynyava/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com");
        driver.close();

    }
}
