package nsosnovshchenko;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class OpenCartTest {

    @Test
    public void registerNewUser() {
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
        OpenCartMainPage.userLogin();
    }

    @Test
    public void searchAndAddToCart(){
        System.setProperty("webdriver.chrome.driver", "G:\\MyF\\SoftServe\\drivers\\chromedriver.exe");
        WebDriver ChromeDriver = new ChromeDriver();

        CartPage CartPage = PageFactory.initElements(ChromeDriver, CartPage.class);
        new CartPage(ChromeDriver);

        CartPage.open();
        //CartPage.searchAndAddToCart();

        CartPage.searchAndAddToCartBetterTry();
    }

}
