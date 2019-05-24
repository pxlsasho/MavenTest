package VolodymyrHavryliak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage
{
    private static final String FIST_NAME = "firstname";
    private static final String LAST_NAME = "lastname";
    private static final String EMAIL = "email";
    private static final String TELEPHONE = "telephone";
    private static final String PASSWORD = "password";
    private static final String CONFIRM = "confirm";
    private static final String MAIL_SUBSCRIPTION = "newsletter";
    private static final String PRIVACY_POLICY = "agree";
    private WebDriver driver;

    @FindBy(linkText = "Continue")
    private WebElement begin;

    @FindBy(name = FIST_NAME)
    private WebElement firstName;
    @FindBy(name = LAST_NAME)
    private WebElement lastName;
    @FindBy(name = EMAIL)
    private WebElement email;
    @FindBy(name = TELEPHONE)
    private WebElement telephone;
    @FindBy(name = PASSWORD)
    private WebElement password;
    @FindBy(name = CONFIRM)
    private WebElement confirmPassword;
    @FindBy(name = MAIL_SUBSCRIPTION)
    private WebElement NewsLetterButton;
    @FindBy(name = PRIVACY_POLICY)
    private WebElement privacyPolicyCheck;
    @FindBy( xpath="/html/body/div[2]/div/div/form/div/div/input[2]" )
    private WebElement Continue;

    public void clickContinueButton()
    {
        begin.click();
    }
    public void Registration()
    {
        firstName.sendKeys("aloha");
        lastName.sendKeys("Stich");
        email.sendKeys("626stich@outlook.com");
        telephone.sendKeys("0507077812");
        password.sendKeys("624");
        confirmPassword.sendKeys("624");
        NewsLetterButton.click();
        privacyPolicyCheck.click();
        Continue.click();
    }
}