package Pivan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {


    private WebDriver driver;
    @FindBy(linkText = "My Account")

    private WebElement uaLink;

        public MainPage(WebDriver driver) {
            this.driver = driver;
        }
        public void open(){
            driver.get("https://demo.opencart.com");
        }
        public void FindSwitch(){

            driver.findElement(By.linkText("My Account")).click();
            driver.findElement(By.linkText("Login")).click();
            driver.findElement(By.linkText("Continue")).click();
        }
    }


