package bskorynovych;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SearchPageOpencart {
    private static final String BASE_URL = "https://demo.opencart.com/";
    private static final String SEARCH_FIELD_ID = "input-search";
    private static final String SEARCH_BUTTON_ID = "button-search";
    private static final String CATEGORY_NAME = "category_id";
    private static final String SUBCATEGORY_BUTTON_NAME = "sub_category";
    private static final String PRODUCT_DESCRIPTION_BUTTON_NAME = "sub_category";

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"search\"]/span/button")
    private WebElement goToSearchStoreButton;
    @FindBy(id = SEARCH_FIELD_ID)
    private WebElement searchField;
    @FindBy(id = SEARCH_BUTTON_ID)
    private WebElement searchButton;
    @FindBy(name = CATEGORY_NAME)
    private WebElement categoryList;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/select/option[19]")
    private WebElement categoryCameras;
    @FindBy(name = SUBCATEGORY_BUTTON_NAME)
    private WebElement subcategoryButton;
    @FindBy(name = PRODUCT_DESCRIPTION_BUTTON_NAME)
    private WebElement searchInProductDescriptionButton;

    public SearchPageOpencart(WebDriver driver)
    {
        this.driver = driver;
    }

    public void searchCameraCanon()
    {
        driver.get(BASE_URL);
        goToSearchStoreButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchField.sendKeys("canon");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        categoryList.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        categoryCameras.click();
        subcategoryButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchInProductDescriptionButton.click();
        searchButton.click();
    }

}
