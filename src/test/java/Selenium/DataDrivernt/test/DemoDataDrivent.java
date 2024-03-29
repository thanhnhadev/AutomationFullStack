package Selenium.DataDrivernt.test;

import Selenium.DataDrivernt.Data.SumData;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Objects;

public class DemoDataDrivent {

    @Test(dataProvider="testSumFromOtherClass",dataProviderClass = SumData.class)
    public void testSum(String soHang1,String soHang2,String result) {
        Assert.assertTrue( Integer.parseInt(soHang1)+Integer.parseInt(soHang2)==Integer.parseInt(result));
    }
//    @Test
//    public void testSum2() {
//        Assert.assertTrue(1+1==3);
//    }
}
