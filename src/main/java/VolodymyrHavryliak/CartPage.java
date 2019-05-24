package VolodymyrHavryliak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage
{
private WebDriver driver;

private static final String SEARCH_BUTTON = "//html/body/header/div/div/div[2]/div/span/button/i";
private static final String ITEM = "input-search";
private static final String All_CATEGORIES = "category_id";
private static final String SEARCH_BUTTON_NEXT = "button-search";
private static final String GO_TO_ITEM = "/html/body/div[2]/div/div/div[3]/div/div/div[2]/div/h4/a";
private static  final String QUANTITY = "quantity";
private static final String ADD_TO_CART = "button-cart";
private static final String RETURN = "/html/body/div/nav/div[2]/ul/li[7]/a";
private static final String CHOSE_ANOTHER = "/html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/div/h4/a";
    @FindBy(xpath = SEARCH_BUTTON)
    private WebElement searchbutton;
    @FindBy(id = ITEM)
    private WebElement searchline;
    @FindBy (name = All_CATEGORIES)
    private WebElement allcategories;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/select/option[19]")
    private WebElement searchsubcategory;
    @FindBy(id = SEARCH_BUTTON_NEXT)
    private WebElement searchbuttonnext;
    @FindBy(xpath = GO_TO_ITEM)
    private WebElement gotoitem;
    @FindBy(name = QUANTITY)
    private WebElement quantity;
    @FindBy(id = ADD_TO_CART)
    private WebElement addtocart;
    @FindBy(xpath = RETURN)
    private WebElement Returntocameras;
    @FindBy (xpath = CHOSE_ANOTHER)
    private WebElement another;
    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void SearchAndAdditem()
    {
        searchbutton.click();
        searchline.sendKeys("Canon");
        allcategories.click();
        searchsubcategory.click();
        searchbuttonnext.click();
        gotoitem.click();
        quantity.clear();
        quantity.sendKeys("12");
        addtocart.click();
        Returntocameras.click();
        another.click();
        quantity.clear();
        quantity.sendKeys("12");
        addtocart.click();

    }
}
