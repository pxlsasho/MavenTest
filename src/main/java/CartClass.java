package Efik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartClass {
    private WebDriver driver;
    private static final String SEARCH_FIELD = "//*[@id=\"search\"]/input";
    private static final String SEARCH_BUTTON = "//html/body/header/div/div/div[2]/div/span/button/i";
    private static final String All_CATEGORIES = "category_id";
    private static final String SEARCH_BUTTON_NEXT = "button-search";
    private static final String GO_TO_ITEM = "//*[@id=\"content\"]/div[3]/div[3]/div/div[2]/div[1]/h4/a";
    private static final String QUANTITY = "quantity";
    private static final String ADD_TO_CART = "button-cart";
    private static final String RETURN = "//*[@id=\"product-product\"]/ul/li[2]/a";
    private static final String CHOSE_ANOTHER = "//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[1]/h4/a";
    @FindBy(xpath = SEARCH_FIELD)
    private WebElement searchfield;
    @FindBy(xpath = SEARCH_BUTTON)
    private WebElement searchbutton;
    @FindBy(name = All_CATEGORIES)
    private WebElement allcategories;
    @FindBy(id = SEARCH_BUTTON_NEXT)
    private WebElement searchbuttonnext;
    @FindBy(xpath = GO_TO_ITEM)
    private WebElement gotoitem;
    @FindBy(name = QUANTITY)
    private WebElement quantity;
    @FindBy(id = ADD_TO_CART)
    private WebElement addtocart;
    @FindBy(xpath = RETURN)
    private WebElement returnBack;
    @FindBy(xpath = CHOSE_ANOTHER)
    private WebElement another;

    public CartClass(WebDriver driver) {

        this.driver = driver;
    }

    public void SearchAndAdditem() {
        searchfield.click();
        searchfield.clear();
        searchfield.sendKeys("mac");
        searchbutton.click();
        allcategories.click();
        searchbuttonnext.click();
        gotoitem.click();
        quantity.clear();
        quantity.sendKeys("3");
        addtocart.click();
        returnBack.click();
        another.click();
        quantity.clear();
        quantity.sendKeys("6");
        addtocart.click();
    }
}
