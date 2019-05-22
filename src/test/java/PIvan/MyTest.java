package PIvan;
import Pivan.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.OpenCartProperties;

@Test
public class MyTest {


        public void RunTest() throws Exception {
            //System.setProperty("webdriver.chrome.driver", "C:/DRIVER/chromedriver.exe");
            OpenCartProperties props = new OpenCartProperties();
            System.setProperty("webdriver.chrome.driver" ,  props.getChromedriver());

            WebDriver driver = new ChromeDriver();
            MainPage myCart=new MainPage(driver);
            myCart.open();
            myCart.FindSwitch();

        }
    }


