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
        //defining new chrome driver instance and init it
        OpenCartProperties props = new OpenCartProperties();
        System.setProperty("webdriver.chrome.driver" ,  props.getChromedriver());
        ChromeDriver = new ChromeDriver();
    }
    @Test
    public void registerNewUser() throws Exception {
        //init chrome driver
        //System.setProperty("webdriver.chrome.driver", "G:\\MyF\\SoftServe\\drivers\\chromedriver.exe");

        //creating instance of the Registration page
        RegisterUser RegisterUser = PageFactory.initElements(ChromeDriver, RegisterUser.class);
        new RegisterUser(ChromeDriver);

        //open source link
        RegisterUser.open();
        Assert.assertEquals(ChromeDriver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/h1/a")).getText(),"Your Store");
        RegisterUser.goToMyAccount();
        Assert.assertEquals(ChromeDriver.findElement(By.linkText("Register")).getText(),"Register");
        RegisterUser.goToRegistrationPage();
        Assert.assertEquals(ChromeDriver.findElement(By.className("agree")).getText(),"Privacy Policy");
        //calling new user registration method
        RegisterUser.registerNewUser();
        //closing web page
        ChromeDriver.close();
    }

    @Test
    public void testOpenCart() {
        //init chrome driver
        //System.setProperty("webdriver.chrome.driver", "G:\\MyF\\SoftServe\\drivers\\chromedriver.exe");
        //WebDriver ChromeDriver = new ChromeDriver();

        //creating instance of the Main page
        OpenCartMainPage OpenCartMainPage = PageFactory.initElements(ChromeDriver, OpenCartMainPage.class);
        new OpenCartMainPage(ChromeDriver);

        //opening source link
        OpenCartMainPage.open();
        Assert.assertEquals(ChromeDriver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/h1/a")).getText(),"Your Store");
        OpenCartMainPage.goToMyAccount();
        Assert.assertEquals(ChromeDriver.findElement(By.linkText("Register")).getText(),"Register");
        //going to login page
        OpenCartMainPage.goToMyLoginPage();
        Assert.assertEquals(ChromeDriver.findElement(By.className("btn-primary")).getText(),"Continue");
        //logging
        OpenCartMainPage.userLogin();
        Assert.assertEquals(ChromeDriver.findElement(By.className("list-unstyled")).getText(),"");
        //close activity
        ChromeDriver.close();
    }

    @Test
    public void searchAndAddToCart(){
        //System.setProperty("webdriver.chrome.driver", "G:\\MyF\\SoftServe\\drivers\\chromedriver.exe");
        //WebDriver ChromeDriver = new ChromeDriver();

        //creating instance of the Cart page
        CartPage CartPage = PageFactory.initElements(ChromeDriver, CartPage.class);
        new CartPage(ChromeDriver);

        //open source link
        CartPage.open();
        Assert.assertEquals(ChromeDriver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/h1/a")).getText(),"Your Store");
        //searching and picking an object to add to cart
        CartPage.searchAndAddToCartBetterTry();
        //closing the page
        ChromeDriver.close();
    }

}
