package dchalyi;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.dchalyi.OpenCartCartPage;
import pages.dchalyi.OpenCartLoginPage;
import pages.dchalyi.OpenCartMainPage;
import pages.dchalyi.OpenCartRegistrationPage;
import utils.OpenCartProperties;

public class OpenCartTest {

    @Test
    public void testOpenCart() throws Exception {
        //Init chrome driver
        OpenCartProperties props = new OpenCartProperties();
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver" ,  props.getChromedriver());
        WebDriver driver = new ChromeDriver();

        OpenCartRegistrationPage registrationPage = PageFactory.initElements(driver, OpenCartRegistrationPage.class);
        new OpenCartRegistrationPage(driver);
        OpenCartMainPage mainPage = PageFactory.initElements(driver, OpenCartMainPage.class);
        new OpenCartRegistrationPage(driver);
        //OpenCartMainPage mainPage = new OpenCartMainPage(driver);
        OpenCartLoginPage loginPage = PageFactory.initElements(driver, OpenCartLoginPage.class);
        new OpenCartLoginPage(driver);
        OpenCartCartPage cartPage = PageFactory.initElements(driver, OpenCartCartPage.class);
        new OpenCartCartPage(driver);


        mainPage.open();
        try {
            driver.manage().window().maximize();
        } catch (Exception e) {
            e.printStackTrace();
        }
        mainPage.findMyAccount();
        mainPage.findRegister();
        registrationPage.registerNewUser("Danylo", "Chalyi",
                "iotiot8@gmail.com", "0987654321", "drakondrakon",
                "drakondrakon");
        registrationPage.clickContinueButton();
        mainPage.logout();
        mainPage.clickContinueButton();
        mainPage.findMyAccount();
        mainPage.findLogin();
        loginPage.loginAs("iotiot8@gmail.com", "drakondrakon");
        cartPage.findSearch();
        cartPage.search("mac");
        cartPage.findGood();
        cartPage.addToCart();
    }
}