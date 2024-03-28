package Selenium.TestNG.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

import java.util.List;

public class MainTest extends TestBase{
    @BeforeClass
    public void oneTimeSetUp(){
        System.out.println("Tui là one time set up do nhen");
    }

    @Test
    public void verifyAddProductToCartSuccessfully() throws InterruptedException {
        // select first product
        String lblFirstProductXpath = "(//*[contains(@class, 'inventory_item_name')])[1]";
        this._driver.findElement(By.xpath(lblFirstProductXpath)).click();

        // click on Add To cart button
        _driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        // navigate to cart
        _driver.findElement(By.id("shopping_cart_container")).click();

        List<WebElement> cartItem = _driver.findElements(By.className("cart_item"));
        Assert.assertTrue(cartItem.size() > 0);
    }

    @Test
    public void verifyRemoveItemInCart(){
        Assert.assertTrue(_driver.findElement(By.className("app_logo")).getText().equals("Swag Labs"));
    }



    @AfterClass
    public void oneTimeTearDown(){
        System.out.println("Tui la one time tear down do nhen");
    }

}
