package Selenium.DataDrivernt.test;

import Selenium.DataDrivernt.Data.SumData;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Objects;

public class DemoDataDrivent {

    @Test(dataProvider="testSumFromOtherClass",dataProviderClass = SumData.class)
    public void testSum(int soHang1,int soHang2,int result) {
        Assert.assertTrue(soHang1+soHang2==result);
    }
//    @Test
//    public void testSum2() {
//        Assert.assertTrue(1+1==3);
//    }
}
