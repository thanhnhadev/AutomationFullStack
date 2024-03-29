package Selenium.PageObjectModel.Page;

import Selenium.PageObjectModel.LocatorPOM;
import Selenium.PageObjectModel.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CardPage extends BasePage {
    public CardPage(WebDriver driver) {
        super(driver);
    }
    By lstCartItem =By.className(LocatorPOM.lstCartItemclass);
    public int getCartItem(){
        List<WebElement> lstCartItems = this.driver.findElements(lstCartItem);
        return lstCartItems.size();
    }
    public boolean isCartItemEmpty(){
        List<WebElement> lstCartItems = this.driver.findElements(lstCartItem);
        boolean isTrue= true;
        if(lstCartItems.size()>0){
            isTrue= false;
        }
        return isTrue;
    }
}
