package Selenium.DataDrivernt.Data;

import org.testng.annotations.DataProvider;

public class SumData {
    @DataProvider(name = "testSumFromOtherClass")
    public Object[][] data(){
        return new Object[][] {
                {
                        1,1,2
                },
                {
                        1,2,3
                },
                {
                        5,5,10
                },
                {
                        5,5,11
                },
                {
                        2,3,5
                }
        };
    }
}
