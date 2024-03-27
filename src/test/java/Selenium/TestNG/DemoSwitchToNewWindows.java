package Selenium.TestNG;

import Selenium.TestNG.Comon.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoSwitchToNewWindows extends BaseTest {
    public static void main(String[] args) {
        createMultiBrowser("chrome");
        driver.get("https://google.com");
        String handler = driver.getWindowHandle();
        System.out.println(handler);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://crm.anhtester.com/admin/authentication");
        sleep(1);
        driver.switchTo().window(handler);// chuyen ve cua so mac dinh ban dau

        closeBrowser();
    }
}
