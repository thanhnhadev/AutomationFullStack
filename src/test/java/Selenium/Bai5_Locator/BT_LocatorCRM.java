package Selenium.Bai5_Locator;

public class BT_LocatorCRM {
    public static String headerLoginPage ="//h1[contains(.,'Login')]";
    public static String txtEmail="//input[@id='email']";
    public static String txtPassword = "//input[@id='password']";
    public static String btnLogin = "//button[contains(.,'Login')]";
    public  static String linkForGotPassword = "//a[contains(.,'Forgot Password?')]";
    //Dashboard
    public static String menuCustomers="//span[contains(.,'Customers')]";
    public static String menuProject="//span[contains(.,'Projects')][1]";
    public static String menuTask="//span[contains(.,'Task')][1]";
    public static String menuDashboard ="//span[contains(.,'Dashboard')]";
    //Customers
    public static String btnAddNewCustomer = "//a[contains(@href,'New Customer')]";
    public static String  btnImportCustomer="//a[contains(@href,'Import Customers')]";
    public static String  btnContack="//a[contains(@href,'all_contacts')]";
    public static String  headerCustomerPage="//span[contains(.,'Customers Summary')]";
    public static String  inputSearchCustomer="//div[@id='clients_filter']/descendant::input[@type='search']";
    public static String  inputCompanyName="//input[@id='company']";
    public static String  inputVatNumber="//input[@id='vat']";
    public static String  inputPhone="//input[@id='phonenumber']";
    public static String  inputWebsite="//input[@id='website']";
    public static String  inputDropDownGroups="//div[@app-field-wrapper='groups_in[]']//input[@type='search']";
    public static String  dropDownCurrency="//button[@data-id='default_currency']";
    public static String  inputSearchCurrency="//div[@app-field-wrapper='default_currency']//input[@type='search']";
    public static String dropdownLanguage="//button[@data-id='default_language']";
    public static String optionDefaultLanguageVietnam="//span[contains(.,'Vietnamese')]";
    public static String inputAdress="//textarea[@id='address']";
    public static String inputCity="//input[@id='city']";
    public static String inputState ="//input[@id='state']";
    public static String inputZipCode="//input[@id='zip']";
    public static String buttonCountry ="//button[@data-id='country']";
    public static String inputSearcjCountry="//div[app-field-wrapper='country']//input[@type='search']";
    public static String buttonSaveancreayecontact="//button[contains(.,'Save and create contact')]";
    public static String buttonSave="//div[@id='profile-save-section']//button[normalize-space()='Save']";

}
