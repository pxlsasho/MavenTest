package yuriikulyk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
    private static final String Base_URL = "https://demo.opencart.com/";
    private static final String MY_ACCOUNT_LINK_TEXT = "My Account";
    private static final String REGISTRATION_LINK_TEXT = "Register";
    private static final String FIRST_NAME_NAME = "firstname";
    private static final String LAST_NAME_NAME = "lastname";
    private static final String EMAIL_NAME = "email";
    private static final String TELEPHONE_NAME = "telephone";
    private static final String PASSWORD_NAME = "password";
    private static final String CONFIRM_NAME = "confirm";
    private static final String MAIL_SUBSCRIPTION_NAME = "newsletter";
    private static final String PRIVACY_POLICY_NAME = "agree";

    private WebDriver driver;

    @FindBy(linkText = MY_ACCOUNT_LINK_TEXT)
    private WebElement myAccountLink;
    @FindBy(linkText = REGISTRATION_LINK_TEXT)
    private WebElement registrationLink;
    @FindBy(name = FIRST_NAME_NAME)
    private WebElement firstNameField;
    @FindBy(name = LAST_NAME_NAME)
    private WebElement lastNameField;
    @FindBy(name = EMAIL_NAME)
    private WebElement emailField;
    @FindBy(name = TELEPHONE_NAME)
    private WebElement telephoneField;
    @FindBy(name = PASSWORD_NAME)
    private WebElement passwordField;
    @FindBy(name = CONFIRM_NAME)
    private WebElement confirmPasswordField;
    @FindBy(name = MAIL_SUBSCRIPTION_NAME)
    private WebElement NewsLetterButton;
    @FindBy(name = PRIVACY_POLICY_NAME)
    private WebElement privacyPolicyCheck;
    @FindBy(xpath = "/html/body/div[2]/div/div/form/div/div/input[2]")
    private WebElement continueButton;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToRegistrationPage() {
        driver.get(Base_URL);
        myAccountLink.click();
        Thread.sleep(1000);
        registrationLink.click();
    }
    public void registration()
    {
        firstNameField.sendKeys("allah");
        lastNameField.sendKeys("akbar");
        emailField.sendKeys("abdullah@gmail.com");
        telephoneField.sendKeys("+380586289664");
        passwordField.sendKeys("kurlyk");
        confirmPasswordField.sendKeys("kurlyk");
        NewsLetterButton.click();
        privacyPolicyCheck.click();
        continueButton.click();
    }
}
