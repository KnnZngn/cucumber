package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShoppingHomePage {

    public ShoppingHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLoginLink;
    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accountCreatedText;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;
    @FindBy(xpath = "//b")
    public WebElement loggedInText;
    @FindBy(xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement product1;
    @FindBy(xpath = "(//a[@data-product-id='2'])[1]")
    public WebElement product2;
    @FindBy(xpath = "(//a[@data-product-id='3'])[1]")
    public WebElement product3;
    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShopping;
    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    public WebElement cartButton;
    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logOutButton;



}

