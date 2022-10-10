package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KnnPage {

    public KnnPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "a.login")
    public WebElement zngnUye;







}
