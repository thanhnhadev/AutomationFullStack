package Selenium.TestNG.Comon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public void createBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }
    public static void createMultiBrowser(String browserName){
        if (browserName.equals("chrome")){
            driver = new ChromeDriver();
        } else if (browserName.equals("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equals("IE")){
            driver = new InternetExplorerDriver();
        } else if (browserName.equals("saf")) {
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }
    public static void closeBrowser(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(2000*seconds));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
