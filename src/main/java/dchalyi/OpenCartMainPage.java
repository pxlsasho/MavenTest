package pages.dchalyi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenCartMainPage {
    private static final String BASE_URL = "https://demo.opencart.com/";
    private WebDriver driver;

    @FindBy(xpath = "//*[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@value='Login']")
    private WebElement clickLogin;

    public OpenCartMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(BASE_URL);
    }

    public void findMyAccount() {
        driver.findElement(By.linkText("My Account")).click();
    }

    public void findLogin() {
        driver.findElement(By.linkText("Login")).click();
    }

    public void enterEmail(String email) {
        driver.findElement(By.xpath("//*[@name='email']")).click();
        driver.findElement(By.xpath("//*[@name='email']")).clear();
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(By.xpath("//*[@name='password']")).click();
        driver.findElement(By.xpath("//*[@name='password']")).clear();
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(By.xpath("//*[@value='Login']")).click();
    }

    public void loginAS(String userEmail, String userPassword) {
        enterEmail(userEmail);
        enterPassword(userPassword);
        clickLogin();
    }
}
