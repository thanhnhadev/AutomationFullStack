package Selenium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebDriverDemo {
    public static void main(String[] args) throws Exception {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //navigate to page
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium Java");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//h3[contains(text(),'[Selenium Java] Bài 4: Cài đặt môi trường Selenium')]")).click();
//        Thread.sleep(2000);
//
//        //điều hướng về lịch sử trang trước
//        driver.navigate().back();
//        //làm mới trang hiện tại
//        driver.navigate().refresh();
//        //điều hướng đến trang tiếp theo
//        driver.navigate().forward();
//        //get the title of page
//        String title = driver.getTitle();
//        //get the current url
//        String url =driver.getCurrentUrl();
//        //get the current page html source
//        String html = driver.getPageSource();
//        System.out.println("title=" + title);
//        System.out.println("current url"+url);
//        System.out.println("page source"+html);
        List<WebElement> listTile= driver.findElements(By.xpath("//h3"));
        for (int i=0;i<listTile.size();i++){
            System.out.println(listTile.get(i).getText());
        }

        Thread.sleep(100);
        driver.quit();
    }
}
