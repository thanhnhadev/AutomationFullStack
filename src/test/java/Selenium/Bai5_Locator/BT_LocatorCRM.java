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

    //page projects
    public static String buttonAddNewProject="//a[contains(.,'New Project')]";
    public static String inputSearchProject ="//div[@id='projects_filter']//input[@type='search']";

    //page add new project
    public static String headerAddNewProject ="//h4[contains(text(),'Add new project')]";
    public static String inputProjectName ="//label[contains(.,'* Project Name')]/following-sibling::input[@type='text']";
    public static String dropDownProjectCustomer ="//label[@for='clientid']/following-sibling::div//button";
    public static String inputSearchProjectCustomer ="//label[@for='clientid']/following-sibling::div//input[@type='search']";
    public static String CheckboxCalculateProjects="//input[@id='progress_from_tasks']";
    public static String inputSliderProgress="//label[contains(text(),'Progress')]/following-sibling::input[@name='progress']";
    public static String dropDownBillingType="//label[@for='billing_type']/following-sibling::div[contains(@class,'dropdown')]";
    public static String OptionBillingType="//span[contains(text(),'Project Hours')]";
    public static String dropDownStatus="//label[@for='status']/following-sibling::div[contains(@class,'dropdown')]";
    public static String OptionStatus="//span[contains(text(),'On Hold')]";
    public static String InputEstimatedHours="//label[contains(text(),'Estimated Hours')]/following-sibling::input[@name='estimated_hours']";
    public static String dropDownMembers="//label[contains(text(),'Members')]/following-sibling::div/button[@data-toggle='dropdown']";
    public static String OptionMemberrs="//label[contains(text(),'Members')]//following-sibling::div//input[@aria-label='Search']";
    public static String inputStartDate="//label[@for='start_date']/following-sibling::div//input";
    public static String inputDeadLine="//label[@for='Deadline']/following-sibling::div//input";
    public static String inputTag="//label[contains(text(),'Tags')]/following-sibling::input";
    public static String iframe="//body[@data-id='description']";//can phai switch to frame
    public static String checkboxSendProject="//label[contains(text(),'Send project created email')]";
    public static String buttonSaveProject="//div[@class='panel-footer text-right']/child::button";


}
