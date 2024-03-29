package Selenium.PageObjectModel;

import org.openqa.selenium.By;

public class LocatorPOM {
    public static String URL_Page = "https://www.saucedemo.com/";
    public static String  txtUserNameId = "user-name";
    public static String  txtPasswordId= "password";
    public static String  btnLoginId = "login-button";
    public static String btnaddToShopcls ="shopping_cart_link";
    public static String addProductTocartid="add-to-cart";
    public static String AppLogo="//*[@class='app_logo']";
    public static String HumbergerMenu="//*[@class='bm-burger-button']";
    public  static String lstCartItemclass ="//*[@class='cart_item']";
    public  static String productName = "Sauce Labs Onesie";
    public static String productName1="Sauce Labs Fleece Jacket";
    public  static String btnRemoveCartItemclass ="//*[@class='remove_from_cart']";
    public  static String btnRemoveCartItemclass1 ="//*[text()='%s']//../..//button";
}
