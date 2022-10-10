package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShoppingCartPage {
    public ShoppingCartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@class='active']")
    public WebElement shoppingCartText;
    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    public WebElement proceedToCheckOutButton;
    @FindBy(xpath = "(//li[@class='address_city address_state_name address_postcode'])[1]")
    public WebElement deliveryAddress;
    @FindBy(xpath = "(//li[@class='address_city address_state_name address_postcode'])[1]")
    public WebElement billingAddress;

}
/*
What is collections in JAVA? -> list, set, queue
How did you use collections in your framework? -> I use collections when especially I need to store multiple test data . I use Collections when I try to get data form Excel, or DataTables. For example, I store the multiple login credentials in my excel sheet, and I use ExcelUtil class to get the data as a List. I actually have ExcelUtil class that has Java Codes to get the data from an excel sheet. And in that ExcelUtil we use collection, I can get the list of each column name, or I can get the list of data in different form.
I also use collections when I expect multiple elements. For example findElements() method returns a List of WebElement- List<WebElement>
getWindowHandles returns set of string- Set<String>
When I use Data Table in my cucumber framework, I use collections
I can store the data that comes from DataTables as List<Map<String,String>>
I can also store the data that comes from DataTables as List<List<String>> or Just List<String>
I have Utils classes. In the util classes I used collection a lot. For example, I have Excel Util class
When I get the column names of an excel sheet, I store column names in List<String>
When I the data list from excel, I put data list in List<Map<String, String>>
 */






