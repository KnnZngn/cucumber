package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerOkuHomePage {
    public HerOkuHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    public WebElement okJSAlert;

    @FindBy(xpath = "//*[@id='result']")
    public WebElement resultText;
    //*[text()='You successfully clicked an alert']

    @FindBy(xpath = "//*[@onclick='jsConfirm()']")
    public WebElement confirmJSAlert;
@FindBy(xpath = "//*[@onclick='jsPrompt()']")
    public WebElement typeBoxJSAlert;










}
