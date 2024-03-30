package Selenium.DataDrivernt.test;

import Selenium.DataDrivernt.Data.ProductData;
import Selenium.DataDrivernt.Page.CartPage;
import Selenium.DataDrivernt.Page.HomePage;
import Selenium.DataDrivernt.Page.LoginPage;
import Selenium.DataDrivernt.Page.ProductDetailPage;
import Selenium.DataDrivernt.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrtheFlowTest extends TestBase {
    @Test(dataProvider = "ProductData",dataProviderClass = ProductData.class)
    public void verifyAddProductToCartSuccessfullyFluent(String username, String password, String productName) throws InterruptedException {
        LoginPage loginPage = new LoginPage(_driver);
        Assert.assertFalse(
                loginPage.loginToSystem(username, password)
                        .selectProductByName(productName)
                        .addProductToCart()
                        .header().navigateToCartPage()
                        .isCartEmpty()

        );
    }
    @Test(dataProvider = "productDataFromJSON", dataProviderClass = ProductData.class)
    public void verifyAddProductToCartSuccessfullyFluentFromJSonFile(String password, String productName, String username) throws InterruptedException {
        LoginPage loginPage = new LoginPage(_driver);
        Assert.assertFalse(
                loginPage.loginToSystem(username, password)
                        .selectProductByName(productName)
                        .addProductToCart()
                        .header().navigateToCartPage()
                        .isCartEmpty()
        );
    }
    @Test
    public void verifyRemoveItemInCartNormal() throws InterruptedException {
        LoginPage loginPage = new LoginPage(_driver);
        loginPage.loginToSystem("standard_user", "secret_sauce");

        String productName =  "Sauce Labs Onesie";
        HomePage homepage = new HomePage(this._driver);
        homepage.selectProductByName(productName);

        ProductDetailPage productDetailPage = new ProductDetailPage(this._driver);
        productDetailPage.addProductToCart();
        productDetailPage.header().navigateToCartPage();

        CartPage cartPage = new CartPage(this._driver);
        cartPage.removeItemByName(productName);

        Assert.assertTrue(cartPage.isCartEmpty());
    }
    @Test
    public void verifyRemoveItemInCartFluent() throws InterruptedException {
        String productName =  "Sauce Labs Fleece Jacket";
        LoginPage loginPage = new LoginPage(_driver);
        boolean isCartEmpty = loginPage.loginToSystem("standard_user", "secret_sauce")
                .selectProductByName(productName)
                .addProductToCart()
                .header().navigateToCartPage()
                .removeItemByName(productName)
                .isCartEmpty();

        Assert.assertTrue(isCartEmpty);
    }
}
