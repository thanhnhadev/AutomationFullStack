package Selenium.DataDrivernt.Page;

import Selenium.DataDrivernt.LocatorDataDrivent;
import Selenium.DataDrivernt.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public ProductDetailPage selectProductByName(String productname){
        String productXpath = String.format(LocatorDataDrivent.productHomePage, productname);
        this.driver.findElement(By.xpath(productXpath)).click();
        return new ProductDetailPage(this.driver);
    }
}
