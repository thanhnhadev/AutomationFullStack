package Selenium.TestNG;

import Selenium.Bai5_Locator.BT_LocatorCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo6ActionGet {
    public static void main(String[] args) throws Exception {
        WebDriver driver ;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get(BT_LocatorCRM.URL_Page);
        String headerPage=  driver.findElement(By.xpath(BT_LocatorCRM.headerLoginPage)).getText();
        System.out.println("Header Login Page:"+headerPage);
        String buttonLogin= driver.findElement(By.xpath(BT_LocatorCRM.btnLogin)).getCssValue("background-color");
        String btnLogin= driver.findElement(By.xpath(BT_LocatorCRM.btnLogin)).getCssValue("color");
        String AtbLogin= driver.findElement(By.xpath(BT_LocatorCRM.btnLogin)).getAttribute("type");
        String ClsLogin= driver.findElement(By.xpath(BT_LocatorCRM.btnLogin)).getAttribute("class");
        System.out.println("backgroud-color:"+buttonLogin);
        System.out.println("color:"+btnLogin);
        System.out.println("Type Value:"+AtbLogin);
        System.out.println("Class Value:"+ClsLogin);
        Dimension dim= driver.findElement(By.xpath(BT_LocatorCRM.btnLogin)).getSize();
        System.out.println("Width:"+dim.getWidth());
        System.out.println("Height:"+dim.getHeight());
        Thread.sleep(2000);
        Point point= driver.findElement(By.xpath(BT_LocatorCRM.btnLogin)).getLocation();
        System.out.println("x:"+point.getX());
        System.out.println("y:"+point.getY());
        Thread.sleep(2000);
        driver.findElement(By.xpath(BT_LocatorCRM.txtEmail)).sendKeys(BT_LocatorCRM.EmailAdress);
        Thread.sleep(2000);
        driver.findElement(By.xpath(BT_LocatorCRM.txtPassword)).sendKeys(BT_LocatorCRM.Password);
        System.out.println("Email value:"+driver.findElement(By.xpath(BT_LocatorCRM.txtEmail)).getAttribute("value"));
        Thread.sleep(2000);
        System.out.println("Password value:"+driver.findElement(By.xpath(BT_LocatorCRM.txtPassword)).getAttribute("value"));
        Thread.sleep(2000);
        driver.findElement(By.xpath(BT_LocatorCRM.btnLogin)).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
