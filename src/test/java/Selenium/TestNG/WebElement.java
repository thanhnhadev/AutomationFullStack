package Selenium.TestNG;

import Selenium.Bai5_Locator.BT_LocatorCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElement {
    public static void main(String[] args) throws InterruptedException {
        //khoi tao browser
        WebDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(BT_LocatorCRM.URL_Page);
        //senkey, click, clear
        driver.findElement(By.xpath(BT_LocatorCRM.txtEmail)).sendKeys(BT_LocatorCRM.EmailAdress);
        driver.findElement(By.xpath(BT_LocatorCRM.txtPassword)).sendKeys(BT_LocatorCRM.Password);
        driver.findElement(By.xpath(BT_LocatorCRM.btnLogin)).click();
//        driver.findElement(By.id("logout")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
