package nsosnovshchenko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterUser {

    private static final String BASE_URL = "https://demo.opencart.com/";
    private static final String MY_ACCOUNT_LINK_TEST = "My Account";
    private static final String REGISTRATION_LINK = "Register";
    private static final String FIRST_NAME_LINK = "firstname";
    private static final String LAST_NAME_LINK = "lastname";
    private static final String EMAIL_LINK = "email";
    private static final String TELEPHONE_LINK = "telephone";
    private static final String PASSWORD_LINK = "password";
    private static final String CONFIRM_PASS_LINK = "confirm";
    private static final String MAIL_SUBSCRIPTION_LINK = "newsletter";
    private static final String PRIVACY_POLICY_LINK = "agree";

    private WebDriver driver;

    @FindBy(linkText = MY_ACCOUNT_LINK_TEST)
    private WebElement myAccountLink;
    @FindBy(linkText = REGISTRATION_LINK)
    private WebElement registrationLink;
    @FindBy(name = FIRST_NAME_LINK)
    private WebElement firstNameField;
    @FindBy(name = LAST_NAME_LINK)
    private WebElement lastNameField;
    @FindBy(name = EMAIL_LINK)
    private WebElement emailField;
    @FindBy(name = TELEPHONE_LINK)
    private WebElement telephoneField;
    @FindBy(name = PASSWORD_LINK)
    private WebElement passwordField;
    @FindBy(name = CONFIRM_PASS_LINK)
    private WebElement confirmPasswordField;
    @FindBy(name = MAIL_SUBSCRIPTION_LINK)
    private WebElement NewsLetterRadioButton;
    @FindBy(name = PRIVACY_POLICY_LINK)
    private WebElement privacyPolicyCheck;
    @FindBy(xpath = "/html/body/div[2]/div/div/form/div/div/input[2]")
    private WebElement continueButton;

    public RegisterUser(WebDriver driver)
    {
        this.driver = driver;
    }

    public void open()
    {
        driver.get(BASE_URL);
    }
    public void goToMyAccount()
    {
        myAccountLink.click();
    }
    public void goToRegistrationPage()
    {
        registrationLink.click();
    }
    public void registerNewUser(){
        firstNameField.clear();
        firstNameField.sendKeys("Test12345");
        lastNameField.clear();
        lastNameField.sendKeys("Second12345");
        emailField.clear();
        emailField.sendKeys("test@ukr.net");
        telephoneField.clear();
        telephoneField.sendKeys("+380633456789");
        passwordField.clear();
        passwordField.sendKeys("Password12#");
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys("Password12#");
        NewsLetterRadioButton.click();
        privacyPolicyCheck.click();
        continueButton.click();

    }
}
