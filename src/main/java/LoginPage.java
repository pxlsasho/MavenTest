package Efik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "input-email")
    private WebElement emailField;
    @FindBy(id="input-password")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"account-login\"]/ul/li[3]/a")
    private WebElement loginButton;

    private LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    public void Login(){
        emailField.click();
        emailField.clear();
        emailField.sendKeys("adorememore@gmail.com");
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("adoreme");
        loginButton.click();
    }
}
