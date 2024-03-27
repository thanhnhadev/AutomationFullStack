package Selenium.TestNG;

import Selenium.Bai5_Locator.BT_LocatorCRM;
import Selenium.TestNG.Comon.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class DemoCookies extends BaseTest {
    public static void main(String[] args) {
        createMultiBrowser("chrome");
        driver.get(BT_LocatorCRM.URL_Page);
        sleep(1);
        driver.findElement(By.xpath(BT_LocatorCRM.txtEmail)).sendKeys(BT_LocatorCRM.EmailAdress);
        driver.findElement(By.xpath(BT_LocatorCRM.txtPassword)).sendKeys(BT_LocatorCRM.Password);
        sleep(1);
        driver.findElement(By.xpath(BT_LocatorCRM.btnLogin)).click();
        sleep(1);
        Set<Cookie> cookies= driver.manage().getCookies();
        System.out.println(cookies.iterator().next().toString());
        sleep(1);
        String cookieCurrent=driver.manage().getCookieNamed("sp_session").getValue();
        System.out.println("Current cookie: " + cookieCurrent);
        sleep(1);
        closeBrowser();
    }

}
