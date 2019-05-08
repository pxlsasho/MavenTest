import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstTest {

    @Test
    public void FirstTEst()
    {
        System.setProperty("webdriver.chrome.driver" ,  "/Users/osynyava/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rozetka.com.ua/ua/");
        driver.findElement(By.xpath("(//a[@href='/a/'])")).click();
        driver.findElement(By.xpath("//a[class='header-topline__user-link']")).click();
        driver.findElement(By.linkText("Зареєструватися")).click();
        driver.findElement(By.name("title")).clear();
        driver.findElement(By.name("title")).sendKeys("test");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("w1@w.com");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("Password42");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        driver.findElement(By.linkText("test")).click();
        driver.findElement(By.linkText("Вихід")).click();
        driver.findElement(By.linkText("увійдіть в особистий кабінет")).click();
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys("w1@w.com");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("Password42");
        driver.findElement(By.name("auth_submit")).click();
        driver.findElement(By.cssSelector("img[alt='Prestigio MultiPad Visconte 64GB Wi-Fi'")).click();
        driver.findElement(By.name("topurchases")).click();
        driver.findElement(By.linkText("Кошик 1")).click();
        driver.findElement(By.xpath("//div[@id='cart-popup-block']/div/a/span")).click();
        assertEquals(driver.findElement(By.linkText("Prestigio MultiPad Visconte 64GB Wi-Fi")).getText(),
                "Prestigio MultiPad Visconte 64GB Wi-Fi (PMP810FWH) + Чохол-клавіатура у подарунок!");


    }
}
