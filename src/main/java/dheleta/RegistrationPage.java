package dheleta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pages.MainPage;

public class RegistrationPage {
    private WebDriver driver;

    RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    void InputFirstname(String firstName)
    {
        driver.findElement(By.id("input-firstname")).sendKeys(firstName);
    }


    void InputLastname(String lastName)
    {
        driver.findElement(By.id("input-lastname")).sendKeys(lastName);
    }

    void InputEmail(String eMail)
    {
        driver.findElement(By.id("input-email")).sendKeys(eMail);
    }

    void InputPhone(String phone)
    {
        driver.findElement(By.id("input-telephone")).sendKeys(phone);
    }

    void InputPassword(String password)
    {
        driver.findElement(By.id("input-password")).sendKeys(password);
    }

    void InputPasswordConfirm(String password)
    {
        driver.findElement(By.id("input-confirm")).sendKeys(password);
    }

    void policeAgree()
    {
        driver.findElement(By.name("agree")).click();
    }

    void ContinueClick()
    {
        driver.findElement(By.xpath("//*[@id=\"content\"]//input[2]")).click();
    }

    void RegisterUser(String firstName,String lastName, String eMail, String phoneNumber, String password, String confirmPaswword)
    {
        mainPage main = new mainPage(driver);
        main.open();
        main.goToRegister();
        InputFirstname(firstName);
        InputLastname(lastName);
        InputEmail(eMail);
        InputPhone(phoneNumber);
        InputPassword(password);
        InputPasswordConfirm(confirmPaswword);
        policeAgree();
        ContinueClick();
    }

    public static void main(String[] args)
    { System.setProperty(mainPage.CHROME_DRIVER, mainPage.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        RegistrationPage reg = new RegistrationPage(driver);
        reg.RegisterUser("Dmytro","Heleta","dmytroheleta@gmail.com", "32121","fff","fff");
    }
}
