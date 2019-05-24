package VolodymyrHavryliak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{
    private WebDriver driver;

    @FindBy(id = "input-email")
    private WebElement email;
    @FindBy(id = "input-password")
    private WebElement password;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/input")
    private WebElement loginButton;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void loginUser()
    {
        email.sendKeys("626stich@outlook.com");
        password.sendKeys("624");
        loginButton.click();
    }
}
