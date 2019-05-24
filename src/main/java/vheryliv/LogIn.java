package vheryliv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn {
    private static final String BASE_URL ="https://demo.opencart.com/";
    private static final String MY_ACCOUNT = "My Account";
    private static final String LOGIN = "Login";

    private WebDriver driver;

    @FindBy(linkText = MY_ACCOUNT)
    private WebElement myAccountLINK;

    @FindBy(linkText = LOGIN)
    private WebElement loginLINK;

    @FindBy(id = "input-email")
    private WebElement inputEmail;

    @FindBy(id = "input-password")
    private WebElement inputPass;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    private WebElement LoginButton;

    public LogIn(WebDriver driver){
        this.driver = driver;
    }

    public void gotoLogInPage(){
        driver.get(BASE_URL);
        myAccountLINK.click();
        loginLINK.click();
    }

    public void dologin(){
        inputEmail.sendKeys("vladzio@gmail.com");
        inputPass.sendKeys("0202vvv02");
        LoginButton.click();
    }
}
