package vmelnyk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtoCart {
    private static final String BASE_URL = "https://demo.opencart.com/";

   private WebDriver driver;

   @FindBy (linkText = "Phones & PDAs")
    private WebElement PhonesPage;
   @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/button[1]")
    private WebElement AddPhoneToCart;
   @FindBy (linkText = "Your Store")
    private WebElement HomePage;
   @FindBy (xpath = "/html/body/header/div/div/div[2]/div/input")
    private WebElement SearchField;
   @FindBy (xpath = "/html/body/header/div/div/div[2]/div/span/button")
    private WebElement SearchButton;
   @FindBy (xpath = "/html/body/div[2]/div/div/div[3]/div[3]/div/div[2]/div[2]/button[1]")
    private WebElement AddMacBookToCart;
   @FindBy (xpath = "/html/body/div[2]/div/div/div[3]/div[3]/div/div[2]/div[2]/button[2]")
    private WebElement AddMacBookToWishList;
   @FindBy (xpath = "/html/body/nav/div/div[2]/ul/li[3]/a/i")
    private WebElement WishPage;
   @FindBy (xpath = "/html/body/nav/div/div[2]/ul/li[4]/a/i")
   private  WebElement CartPage;

   public AddtoCart(WebDriver driver) { this.driver = driver; }
    public void open() {driver.get(BASE_URL); }
   public void CartTest() {
       PhonesPage.click();
       AddPhoneToCart.click();
       HomePage.click();
       SearchField.click();
       SearchField.sendKeys("Mac");
       SearchButton.click();
       AddMacBookToCart.click();
       AddMacBookToWishList.click();
       WishPage.click();
       CartPage.click();
       HomePage.click();


   }


}

