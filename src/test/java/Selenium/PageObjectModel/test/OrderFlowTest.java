package Selenium.PageObjectModel.test;

import Selenium.PageObjectModel.Page.HomePage;
import Selenium.PageObjectModel.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class OrderFlowTest extends TestBase {
    @BeforeClass
    public void oneTimeSetUp(){
        System.out.println("Tui là one time set up do nhen");
    }

    @Test
    public void verifyAddProductToCartSuccessfully() throws Exception {
        // select first product
        HomePage homePage = new HomePage(this._driver);
        homePage.selectProductByName("Sauce Labs Onesie");

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
