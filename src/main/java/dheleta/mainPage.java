package dheleta;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class mainPage
{
    private static final String BASE_URL = "https://demo.opencart.com/";
    protected static final String DRIVER_PATH = "C:\\\\chromedriver\\\\chromedriver.exe";
    protected static  final String CHROME_DRIVER = "webdriver.chrome.driver";
    public WebDriver driver;
    public mainPage(WebDriver driver)
    {
        this.driver = driver;
    }
    protected void open()
    {
        driver.get(BASE_URL);
    }

    protected void MyAccount()
    {
        driver.findElement(By.className("dropdown")).click();
    }

    protected void goToLogin()

    {
        driver.findElement(By.linkText("Login")).click();
    }

    protected void goToRegister()

    {
        driver.findElement(By.linkText("Register")).click();
    }



    public static void main(String[] args)
    { System.setProperty(CHROME_DRIVER, DRIVER_PATH);
       // WebDriver driver = new ChromeDriver();
        //mainPage main = new mainPage(driver);
        //main.open();
        //main.MyAccount();
        //main.goToLogin();

    }



}
