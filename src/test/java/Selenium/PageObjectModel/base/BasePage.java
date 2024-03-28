package Selenium.PageObjectModel.base;

import Selenium.PageObjectModel.Page.components.Header;
import org.openqa.selenium.WebDriver;


public class BasePage {
    protected WebDriver driver;
    private Header header;
    public BasePage(WebDriver driver){
        this.driver = driver;
        this.header = new Header(this.driver);
    }
    //page element

    //page actions
    public Header header(){
        return this.header;
    }
    //page validation
}
