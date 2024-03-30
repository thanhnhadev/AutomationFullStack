package Selenium.DataDrivernt.base;


import Selenium.DataDrivernt.LocatorDataDrivent;
import Selenium.DataDrivernt.Page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    public WebDriver _driver;
    @BeforeMethod
    public void setUp(){
        _driver = new ChromeDriver();
        _driver.manage().window().maximize();
        _driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        _driver.get(LocatorDataDrivent.URL_Page);
        LoginPage loginBase = new LoginPage(_driver);
        loginBase.loginToSystem("standard_user", "secret_sauce");
    }

    @AfterMethod
    public void tearDown(double seconds) throws Exception {
        Thread.sleep(2000);
        _driver.quit();
    }
}
