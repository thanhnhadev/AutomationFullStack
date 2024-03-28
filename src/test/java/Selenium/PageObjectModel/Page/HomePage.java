package Selenium.PageObjectModel.Page;

import Selenium.PageObjectModel.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver _driver) {
        super(_driver);
    }
    public void  selectProductByName(String productName) {
        String productXpath = String.format("//*[text()='%s']",productName);
        this.driver.findElement(By.xpath(productXpath));
    }
}
