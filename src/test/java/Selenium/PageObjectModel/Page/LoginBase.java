package Selenium.PageObjectModel.Page;

import Selenium.PageObjectModel.LocatorPOM;
import Selenium.PageObjectModel.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginBase extends BasePage {

    public LoginBase(WebDriver driver) {
        super(driver);
    }

    //page element

    public WebElement getUserNameElement(){
        return this.driver.findElement(By.id(LocatorPOM.txtUserNameId));
    }
    public WebElement getPasswordElement(){
        return this.driver.findElement(By.id(LocatorPOM.txtPasswordId));
    }
    public WebElement getBtnLoginElement(){
        return this.driver.findElement(By.id(LocatorPOM.btnLoginId));
    }
    // Page Actions
    public void loginToSystem(String username, String password){
        this.getUserNameElement().sendKeys(username);
        this.getPasswordElement().sendKeys(password);
        this.getBtnLoginElement().click();
    }
    //page validation
}
