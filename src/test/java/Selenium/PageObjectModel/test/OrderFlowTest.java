package Selenium.PageObjectModel.test;

import Selenium.PageObjectModel.LocatorPOM;
import Selenium.PageObjectModel.Page.CardPage;
import Selenium.PageObjectModel.Page.HomePage;
import Selenium.PageObjectModel.Page.ProductDetailPage;
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
        homePage.selectProductByName(LocatorPOM.productName);
        Thread.sleep(2000);
        // click on Add To cart button

        ProductDetailPage productDetailPage = new ProductDetailPage(this._driver);
        productDetailPage.addProductTocart();
        productDetailPage.header().navigateToCartPage();
        Thread.sleep(2000);
        // navigate to cart
        CardPage cardPage = new CardPage(this._driver);
        Assert.assertTrue(!cardPage.isCartItemEmpty() );
        Thread.sleep(2000);

    }

    @Test
    public void verifyRemoveItemInCart() throws Exception {
        HomePage homePage = new HomePage(this._driver);
        homePage.selectProductByName(LocatorPOM.productName1);
        Thread.sleep(2000);
        ProductDetailPage productDetailPage = new ProductDetailPage(this._driver);
        productDetailPage.addProductTocart();
        productDetailPage.header().navigateToCartPage();
        Thread.sleep(2000);
        CardPage cardPage = new CardPage(this._driver);
        cardPage.RemoveCartItem(LocatorPOM.productName1);
//        Assert.assertTrue(_driver.findElement(By.className("app_logo")).getText().equals("Swag Labs"));
    }



    @AfterClass
    public void oneTimeTearDown() throws Exception {
        Thread.sleep(2000);
        _driver.quit();
    }
}
