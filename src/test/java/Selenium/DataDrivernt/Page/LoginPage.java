package Selenium.DataDrivernt.Page;

import Selenium.DataDrivernt.LocatorDataDrivent;
import Selenium.DataDrivernt.base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }
    //page element

    public WebElement getUserNameElement(){
        return this.driver.findElement(By.id(LocatorDataDrivent.txtUserNameId));
    }
    public WebElement getPasswordElement(){
        return this.driver.findElement(By.id(LocatorDataDrivent.txtPasswordId));
    }
    public WebElement getBtnLoginElement(){
        return this.driver.findElement(By.id(LocatorDataDrivent.btnLoginId));
    }

    // Page Actions
    public  HomePage loginToSystem(String username, String password){
        this.getUserNameElement().sendKeys(username);
        this.getPasswordElement().sendKeys(password);
        this.getBtnLoginElement().click();
        return new HomePage(this.driver);
    }
    // Page Validation
    //page validation
}
