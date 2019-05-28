package pages.vtishtshenko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class OpenCartRegistrationPage {
    private static final String BASE_URL = "https://demo.opencart.com";
    private static final String MY_ACCOUNT_LINK = "My Account";
    private static final String REGISTRATION_LINK = "Register";
    private static final String FIRST_NAME_LINK = "firstname";
    private static final String LAST_NAME_LINK = "lastname";
    private static final String EMAIL_LINK = "email";
    private static final String TELEPHONE_LINK = "telephone";
    private static final String PASSWORD_LINK = "password";
    private static final String CONFIRM_PASSWORD_LINK = "confirm";
    private static final String SUBSCRIPTION_LINK = "newsletter";
    private static final String PRIVACY_POLICY_LINK = "agree";
    private WebDriver driver;

    @FindBy(linkText = MY_ACCOUNT_LINK)
    private WebElement accountLink;
    @FindBy(linkText = REGISTRATION_LINK)
    private WebElement registrationLink;
    @FindBy(name = FIRST_NAME_LINK)
    private WebElement firstName;
    @FindBy(name = LAST_NAME_LINK)
    private WebElement lastName;
    @FindBy(name = EMAIL_LINK)
    private WebElement email;
    @FindBy(name = TELEPHONE_LINK)
    private WebElement telephone;
    @FindBy(name = PASSWORD_LINK)
    private WebElement password;
    @FindBy(name = CONFIRM_PASSWORD_LINK)
    private WebElement confirmPassword;
    @FindBy(name = SUBSCRIPTION_LINK)
    private WebElement newsletter;
    @FindBy(name = PRIVACY_POLICY_LINK)
    private WebElement privacyPolicy;
    @FindBy(className = "btn btn-primary")
    private WebElement continueButton;

    public OpenCartRegistrationPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void open(){
        driver.get(BASE_URL);
    }
    public  void accountLocalization()
    {
        accountLink.click();
    }
    public void registrationLocalization()
    {
        registrationLink.click();
    }
    public int randomNumber()
    {
        Random rand = new Random();
        int number =rand.nextInt(999);
        return number;
    }
    public void Registration(){
        firstName.sendKeys("firstname"+randomNumber());
        lastName.sendKeys("lastname"+randomNumber());
        email.sendKeys("email"+randomNumber()+"@gmail.com");
        telephone.sendKeys("+380112233445");
        password.sendKeys("password123");
        confirmPassword.sendKeys("password123");
        newsletter.click();
        privacyPolicy.click();
        continueButton.click();
    }
}
