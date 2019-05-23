package nsosnovshchenko;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import utils.OpenCartProperties;

import java.io.IOException;

import static org.testng.Assert.assertEquals;


public class OpenCartTest {

    WebDriver ChromeDriver;

    @BeforeTest
    public void setup() throws Exception
    {
        OpenCartProperties props = new OpenCartProperties();
        System.setProperty("webdriver.chrome.driver" ,  props.getChromedriver());
        ChromeDriver = new ChromeDriver();
    }
    @Test
    public void registerNewUser() throws Exception {
        //init chrome driver
        //System.setProperty("webdriver.chrome.driver", "G:\\MyF\\SoftServe\\drivers\\chromedriver.exe");
        RegisterUser RegisterUser = PageFactory.initElements(ChromeDriver, RegisterUser.class);
        new RegisterUser(ChromeDriver);

        RegisterUser.open();
        Assert.assertEquals(ChromeDriver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/h1/a")).getText(),"Your Store");
        RegisterUser.goToMyAccount();
        Assert.assertEquals(ChromeDriver.findElement(By.linkText("Register")).getText(),"Register");
        RegisterUser.goToRegistrationPage();
        Assert.assertEquals(ChromeDriver.findElement(By.className("agree")).getText(),"Privacy Policy");
        RegisterUser.registerNewUser();
        ChromeDriver.close();
    }

    @Test
    public void testOpenCart() {
        //init chrome driver
        //System.setProperty("webdriver.chrome.driver", "G:\\MyF\\SoftServe\\drivers\\chromedriver.exe");
        //WebDriver ChromeDriver = new ChromeDriver();

        OpenCartMainPage OpenCartMainPage = PageFactory.initElements(ChromeDriver, OpenCartMainPage.class);
        new OpenCartMainPage(ChromeDriver);

        OpenCartMainPage.open();
        Assert.assertEquals(ChromeDriver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/h1/a")).getText(),"Your Store");
        OpenCartMainPage.goToMyAccount();
        Assert.assertEquals(ChromeDriver.findElement(By.linkText("Register")).getText(),"Register");
        OpenCartMainPage.goToMyLoginPage();
        Assert.assertEquals(ChromeDriver.findElement(By.className("btn-primary")).getText(),"Continue");
        OpenCartMainPage.userLogin();
        Assert.assertEquals(ChromeDriver.findElement(By.className("list-unstyled")).getText(),"");
        ChromeDriver.close();
    }

    @Test
    public void searchAndAddToCart(){
        //System.setProperty("webdriver.chrome.driver", "G:\\MyF\\SoftServe\\drivers\\chromedriver.exe");
        //WebDriver ChromeDriver = new ChromeDriver();

        CartPage CartPage = PageFactory.initElements(ChromeDriver, CartPage.class);
        new CartPage(ChromeDriver);

        CartPage.open();
        Assert.assertEquals(ChromeDriver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/h1/a")).getText(),"Your Store");
        CartPage.searchAndAddToCartBetterTry();
        ChromeDriver.close();
    }

}
