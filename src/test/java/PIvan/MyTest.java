package PIvan;
import Pivan.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class MyTest {


        public void RunTest() {
            System.setProperty("webdriver.chrome.driver", "C:/DRIVER/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            MainPage myCart=new MainPage(driver);
            myCart.open();
            myCart.FindSwitch();

        }
    }


