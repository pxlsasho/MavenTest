package nsosnovshchenko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
    private static final String BASE_URL = "https://demo.opencart.com/";

    private WebDriver driver;

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


    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void open()
    {
        driver.get(BASE_URL);
    }

    public void searchAndAddToCart(){
        searchButtonLink.click();
        searchCriteriaField.clear();
        searchCriteriaField.sendKeys("Apple Cinema 30");
        chooseCategoryLink.click();
        //select element from drop-down list
/*        WebElement searchMonitors =driver.findElement(By.name("category_id"));
        Select sel = new Select(searchMonitors);
        sel.selectByIndex(28);*/
        // current value doesn't work to choose "Monitors"
        thisSearchLink.click();
        chooseMonitor.click();
        largeRadioOption.click();//choose first option
        checkbox1Link.click();//choose first option

        WebElement selectColor =driver.findElement(By.name("option[217]"));
        Select sell = new Select(selectColor);
        sell.selectByIndex(3); //green color
        //wanted to upload txt file
        //but this function doesn't work correctly on the site
        enterTextLink.sendKeys("blablablablablaba");
        uploadFileLink.sendKeys("G:\\\\test.txt");

        addToCart.click();
        driver.close();

    }

    public void searchAndAddToCartBetterTry(){
        searchButtonLink.click();
        searchCriteriaField.clear();
        searchCriteriaField.sendKeys("mac");
        thisSearchLink.click();
        chooseIMac.click();
        addToCart.click();
    }
}
