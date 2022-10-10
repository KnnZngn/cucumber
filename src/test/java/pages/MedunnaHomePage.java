package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaHomePage {
    public MedunnaHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement signInIcon;

    @FindBy(id = "login-item")
    public WebElement signInDropDown;

    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

    @FindBy(xpath = "//span[.='Items&Titles']")
    public WebElement itemsTitlesButton;

    @FindBy(xpath = "//span[.='Room']")
    public WebElement roomButton;

    @FindBy(id = "jh-create-entity")
    public WebElement createANewRoomButton;


}