package Selenium.DataDrivernt.Page;

import Selenium.DataDrivernt.LocatorDataDrivent;
import Selenium.DataDrivernt.base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public int getCartItem(){
        List<WebElement> cartItem = this.driver.findElements(By.className(LocatorDataDrivent.lstCartItem));
        return cartItem.size();
    }

    public CartPage removeItemByName(String productName) {
        String removeButtonByName = String.format(LocatorDataDrivent.removeButtonByName, productName);
        this.driver.findElement(By.xpath(removeButtonByName)).click();
        return this;
    }

    // page validation
    public boolean isCartEmpty(){
        List<WebElement> cartItem = this.driver.findElements(By.className(LocatorDataDrivent.lstCartItem));
        boolean isTrue = true;
        if(cartItem.size() > 0){
            isTrue = false;
        }
        return isTrue;
    }
}
