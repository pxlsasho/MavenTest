package vmelnyk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    private static final String BASE_URL = "https://demo.opencart.com/";
    private static final String MyAccount_LINK = "My Account";
    private static final String Register_Button = "Register";
    private static final String FIRST_NAME_FIELD = "firstname";
    private static final String LAST_NAME_FIELD = "lastname";
    private static final String EMAIL_FIELD = "email";
    private static final String TELEPHONE_FIELD = "telephone";
    private static final String PASSWORD_FIELD = "password";
    private static final String CONFIRM_FIELD = "confirm";
    private static final String PRIVACY_POLICY_FIELD = "agree";
    private WebDriver driver;

    @FindBy (linkText = "My Account")
    private WebElement  myAccountLink;
    @FindBy (linkText = "Register")
    private  WebElement registrationLink;
    @FindBy (id = "input-firstname")
    private WebElement firstNameField;
    @FindBy (id = "input-lastname")
    private WebElement lastNameField;
    @FindBy (id = "input-email")
    private WebElement emailField;
    @FindBy (id = "input-telephone")
    private WebElement telephoneField;
    @FindBy (id = "input-password")
    private WebElement passwordField;
    @FindBy (id = "input-confirm")
    private WebElement confirmPasswordField;
    @FindBy (xpath = "//form/div/div/input[1]")
    private WebElement privacyPolicyCheck;
    @FindBy(xpath = "/html/body/div[2]/div/div/form/div/div/input[2]")
    private WebElement continueButton;
    public MainPage(WebDriver driver) { this.driver = driver; }

    public void open() {driver.get(BASE_URL); }
    public void MyAccount_Click()   { myAccountLink.click(); }
    public void Register_CLick()    { registrationLink.click(); }
    public void FirstName_Click()   { firstNameField.click(); }
    public void FirstName_Set()     { firstNameField.sendKeys("TestName"); }
    public void LastName_Set()      { lastNameField.sendKeys("TestLastName"); }
    public void Email_Set()         { emailField.sendKeys("testmytest@test.com"); }
    public void Telephone_Set()     { telephoneField.sendKeys("38011111111");}
    public void Password_Set()      { passwordField.sendKeys("12341234");}
    public void Confirm_Password()  { confirmPasswordField.sendKeys("12341234"); }
    public void Agree_Click()       { privacyPolicyCheck.click(); }
    public void Continue_Click()    { continueButton.click(); }


}
