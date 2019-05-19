package nsosnovshchenko;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserTest {
    @Test
    public void testOpenCart() {
        //init chrome driver
        System.setProperty("webdriver.chrome.driver", "G:\\MyF\\SoftServe\\drivers\\chromedriver.exe");
        WebDriver ChromeDriver = new ChromeDriver();

        RegisterUser RegisterUser = PageFactory.initElements(ChromeDriver, RegisterUser.class);
        new RegisterUser(ChromeDriver);

        RegisterUser.open();
        RegisterUser.goToMyAccount();
        RegisterUser.goToRegistrationPage();
        RegisterUser.registerNewUser();

    }
}
