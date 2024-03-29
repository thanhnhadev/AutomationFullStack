package Selenium.DataDrivernt.Page;

import Selenium.DataDrivernt.LocatorDataDrivent;
import Selenium.PageObjectModel.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }
    public ProductDetailPage addProductToCart() {
        this.driver.findElement(By.xpath(LocatorDataDrivent.btnAddToCart)).click();
        return this;
    }
}
