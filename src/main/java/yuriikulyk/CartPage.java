package yuriikulyk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    private static final String BASE_URL = "https://demo.opencart.com/";
    private static final String SEARCH_CRITERIA_ID = "input-search";
    private static final String ALL_CATEGORIES_BUTTON_NAME = "category_id";
    private static final String SEARCH_BUTTON_ID = "button-search";
    private static final String SEARCH_IN_SUBCATEGORIES_BUTTON_NAME = "sub_category";
    private static final String SEARCH_IN_PRODUCT_DESCRIPTIONS_NAME = "description";
    private static final String SORT_BY_ID = "input-sort";
    private static final String SHOW_ID = "input-limit";

    private WebDriver driver;

    @FindBy(xpath = "/html/body/header/div/div/div[2]/div/span/button/i")
    private WebElement searchButton;
    @FindBy(id = SEARCH_CRITERIA_ID)
    private WebElement searchCriteriaField;
    @FindBy(name = ALL_CATEGORIES_BUTTON_NAME)
    private WebElement chooseCategoryLink;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/select/option[18]")
    private WebElement searchCategory;
    @FindBy(name = SEARCH_IN_SUBCATEGORIES_BUTTON_NAME)
    private WebElement searchInSubcategories;
    @FindBy(name = SEARCH_IN_PRODUCT_DESCRIPTIONS_NAME)
    private WebElement searchInDescriptions;
    @FindBy(id = SEARCH_BUTTON_ID)
    private WebElement searchLink;
    @FindBy(id = SORT_BY_ID)
    private WebElement sortByButton;
    @FindBy(xpath = "//*[@id=\"input-sort\"]/option[4]")
    private WebElement chooseSortByOption;
    @FindBy(id = SHOW_ID)
    private WebElement showButton;
    @FindBy(xpath = "//*[@id=\"input-limit\"]/option[4]")
    private WebElement chooseShowOption;
    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]")
    private WebElement addToCart;

    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void searchAndAddToCart()
    {
        driver.get(BASE_URL);
        searchButton.click();
        searchCriteriaField.sendKeys("iphone");
        chooseCategoryLink.click();
        searchCategory.click();
        searchInSubcategories.click();
        searchInDescriptions.click();
        searchLink.click();
        sortByButton.click();
        chooseSortByOption.click();
        showButton.click();
        chooseShowOption.click();
        addToCart.click();
    }
}
