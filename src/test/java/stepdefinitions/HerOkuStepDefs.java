package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HerOkuHomePage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class HerOkuStepDefs {

HerOkuHomePage herOkuHomePage= new HerOkuHomePage();

    @And("user click on first JS alert button")
    public void userClickOnFirstJSAlertButton() throws InterruptedException {herOkuHomePage.okJSAlert.click();
       Driver.getDriver().switchTo().alert().accept();
        System.out.println("2.adim");
    }
    @And("user verify result text {string}")
    public void userGetResultText(String arg0) throws InterruptedException {
        System.out.println("verify adim");

    }
    @And("user click on alert accept")
    public void userClickOnAlertAccept() throws InterruptedException {
        System.out.println("4.adim");
    }

    @And("user click on alert type a text")
    public void userClickOnAlertTypeAText() throws InterruptedException {
        System.out.println("6.adim");
    }

}
