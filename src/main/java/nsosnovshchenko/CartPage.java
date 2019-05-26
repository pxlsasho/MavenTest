package nsosnovshchenko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
    private static final String BASE_URL = "https://demo.opencart.com/";

    private WebDriver driver;

    //instances of page web elements
    @FindBy(xpath = "/html/body/header/div/div/div[2]/div/span/button/i")
    private WebElement searchButtonLink;
    @FindBy(id = "input-search")
    private WebElement searchCriteriaField;
    @FindBy(name = "category_id")
    private WebElement chooseCategoryLink;
    @FindBy(name = "Monitors")
    private WebElement searchMonitors;
    @FindBy(id = "button-search")
    private WebElement thisSearchLink;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[1]/h4/a")
    private WebElement chooseMonitor;
    @FindBy(name = "option[218]")
    private WebElement largeRadioOption;
    @FindBy(name = "option[223][]")
    private WebElement checkbox1Link;
    @FindBy(name = "option[209]")
    private WebElement enterTextLink;
    @FindBy(id = "button-upload222")
    private WebElement uploadFileLink;
    @FindBy(id = "button-cart")
    private WebElement addToCart;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div[1]/div/div[2]/div[1]/h4/a")
    private WebElement chooseIMac;

    //setter
    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }
    //method for opening the base url
    public void open()
    {
        driver.get(BASE_URL);
    }
    //method for searching and adding to cart
    public void searchAndAddToCartBetterTry(){
        searchButtonLink.click();
        searchCriteriaField.clear();
        searchCriteriaField.sendKeys("mac");
        thisSearchLink.click();
        chooseIMac.click();
        addToCart.click();
    }
}
