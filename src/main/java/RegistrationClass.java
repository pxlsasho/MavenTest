package Efik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Random;

public class RegistrationClass {

    private WebDriver driver;

    @FindBy(linkText = "Continue")
    private WebElement begin;
    @FindBy(id="input-firstname")
    private WebElement firstName;
    @FindBy(id="input-lastname")
    private WebElement lastName;
    @FindBy(id="input-email")
    private WebElement emailAddress;
    @FindBy(id="input-telephone")
    private WebElement telephone;
    @FindBy(id="input-password")
    private WebElement password;
    @FindBy(id="input-confirm")
    private WebElement confirmPassword;
    @FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
    private WebElement privacyPolicy;
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
    private WebElement continueNext;

    public RegistrationClass(WebDriver driver){
        this.driver=driver;
    }
    public void clickContinueButton()
    {
        begin.click();
    }
    public void Registration(){
            Random rand=new Random();
            int n=rand.nextInt(99);
            String randomNumbers=Integer.toString(n);
            String repeated=randomNumbers.repeat(4);

            firstName.click();
            firstName.clear();
            firstName.sendKeys(randomNumbers);
            lastName.click();
            lastName.clear();
            lastName.sendKeys(randomNumbers);
            emailAddress.click();
            emailAddress.clear();
            emailAddress.sendKeys(randomNumbers+"@gmail.com");
            telephone.click();
            telephone.clear();
            telephone.sendKeys(repeated);
            password.click();
            password.clear();
            password.sendKeys(repeated);
            confirmPassword.click();
            confirmPassword.clear();
            confirmPassword.sendKeys(repeated);
            privacyPolicy.click();
            continueNext.click();
    }
}
