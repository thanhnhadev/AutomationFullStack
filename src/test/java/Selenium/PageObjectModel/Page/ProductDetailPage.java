package Selenium.PageObjectModel.Page;

import Selenium.PageObjectModel.LocatorPOM;
import Selenium.PageObjectModel.base.BasePage;
import Selenium.PageObjectModel.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }
    public void addProductTocart(){
        this.navigateToCart();
    }
    public void navigateToCart(){
        this.driver.findElement(By.id(LocatorPOM.addProductTocartid)).click();
    }

}
