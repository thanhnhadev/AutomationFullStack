package Selenium.Bai5_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) throws InterruptedException {
        //khoi tao browser
        //chrome,firefox,edge
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // open webs
        driver.get("https://cms.anhtester.com/login");
        //admin@example.com

        //định vi cac elements trang login cms
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(3000);
//        driver.findElement(By.id("logout")).click();
        driver.quit();
    }
}
