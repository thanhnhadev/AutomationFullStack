package Selenium.TestNG.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public WebDriver _driver;
    @BeforeMethod
    public void setUp(){
        _driver = new ChromeDriver();
        _driver.get("https://www.saucedemo.com/");
        // login to system
        String txtUserNameId = "user-name";
        String txtPasswordXpath = "//*[@id = 'password']";
        String btnLoginCss = "#login-button";

        WebElement txtUserName = _driver.findElement(By.id(txtUserNameId));
        WebElement txtPassword = _driver.findElement(By.xpath(txtPasswordXpath));
        WebElement btnLogin = _driver.findElement(By.cssSelector(btnLoginCss));

        txtUserName.sendKeys("standard_user");
        txtPassword.sendKeys("secret_sauce");
        btnLogin.click();
    }

    @AfterMethod
    public void tearDown(){
        _driver.quit();
    }
}
