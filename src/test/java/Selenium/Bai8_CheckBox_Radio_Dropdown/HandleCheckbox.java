package Selenium.Bai8_CheckBox_Radio_Dropdown;

import Selenium.TestNG.Comon.BaseTest;
import org.openqa.selenium.By;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createMultiBrowser("chrome");
        driver.get("https://demoqa.com/checkbox");
        sleep(1);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        sleep(1);

        closeBrowser();
    }
}
