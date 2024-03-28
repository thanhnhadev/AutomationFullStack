package Selenium.Bai8_CheckBox_Radio_Dropdown;

import Selenium.TestNG.Comon.BaseTest;
import org.openqa.selenium.By;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createMultiBrowser("chrome");
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        sleep(1);
       boolean checkbox= driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        sleep(1);
        System.out.println(checkbox);
        closeBrowser();
    }
}
