package Selenium.PageObjectModel.Page.components;

import Selenium.PageObjectModel.LocatorPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Header {
    public WebDriver _driver;
    public Header(WebDriver driver) {
        this._driver = driver;
    }

    public void navigateToCartPage(){
        this._driver.findElement(By.className(LocatorPOM.btnaddToShopcls)).click();
    }

    public void openMenuPanel(){
        this._driver.findElement(By.className(LocatorPOM.HumbergerMenu)).click();
    }
    public boolean isLogoDisplayed(){
        try {
            return this._driver.findElement(By.className(LocatorPOM.AppLogo)).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }
}
