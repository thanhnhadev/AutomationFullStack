package Selenium.DataDrivernt.test;

import Selenium.DataDrivernt.Data.ProductData;
import Selenium.DataDrivernt.Page.LoginPage;
import Selenium.DataDrivernt.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrtheFlowTest extends TestBase {
    @Test(dataProvider = "ProductData",dataProviderClass = ProductData.class)
    public void verifyAddProductToCartSuccessFluent(String username,String password,String productName ) throws Exception {
        Assert.assertFalse(
                LoginPage.loginToSystem(username,password)
        );
    }
}
