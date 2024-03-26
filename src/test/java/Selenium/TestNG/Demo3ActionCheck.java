package Selenium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo3ActionCheck {
    public static void main(String[] args) throws Exception {
        //khoi tao browser
        WebDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://anhtester.com/");
        WebElement tagH1 = driver.findElement(By.xpath("//h1[contains(text(),'Anh Tester')]"));
        WebElement tagH2 = driver.findElement(By.xpath("//h2[contains(text(),'Anh Tester')]"));
        boolean checkDisplay1 = tagH1.isDisplayed();
       boolean checkDisplay2 = tagH2.isDisplayed();
//        System.out.println(checkDisplay1);
        if (checkDisplay1==false&&checkDisplay2==false){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
