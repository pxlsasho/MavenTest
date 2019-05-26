package nsosnovshchenko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class RegisterUser {

    //variables
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
    //driver var
    private WebDriver driver;
    //web elements
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

    //setter
    public RegisterUser(WebDriver driver)
    {
        this.driver = driver;
    }

    //launch base url
    public void open()
    {
        driver.get(BASE_URL);
    }

    //go to account
    public void goToMyAccount()
    {
        myAccountLink.click();
    }

    //go to registration page
    public void goToRegistrationPage()
    {
        registrationLink.click();
    }

    //random integer creation
    public int generateInt3(){
        Random rand = new Random();
        int number = rand.nextInt(999);
        return number;
    }

    //method that registers new user
    public void registerNewUser(){

        String firstName = "FirstName"+ generateInt3();
        String secondName = "SecondName"+ generateInt3();

        firstNameField.clear();
        firstNameField.sendKeys(firstName);
        lastNameField.clear();
        lastNameField.sendKeys(secondName);
        emailField.clear();
        emailField.sendKeys("test" + generateInt3() + "@gmail.com");
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
