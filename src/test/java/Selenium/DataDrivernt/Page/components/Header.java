package Selenium.DataDrivernt.Page.components;

import Selenium.DataDrivernt.LocatorDataDrivent;
import Selenium.DataDrivernt.Page.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Header {
    public WebDriver _driver;
    public Header(WebDriver driver){
        this._driver = driver;
    }


    public CartPage navigateToCartPage(){
        this._driver.findElement(By.className(LocatorDataDrivent.lnkShoppingCartcls)).click();
        return new CartPage(this._driver);
    }

    public void openMenuPanel(){
        this._driver.findElement(By.id(LocatorDataDrivent.btnHamburgerMenuid)).click();
    }

    // page valation
    public boolean isLogoDisplay(){
        try{
            return this._driver.findElement(By.className(LocatorDataDrivent.logocls)).isDisplayed();
        }
        catch (NoSuchElementException e){
            return false;
        }

    }
}
