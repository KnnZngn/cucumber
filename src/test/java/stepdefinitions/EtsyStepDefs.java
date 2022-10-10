package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import pages.EtsyHomePage;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Set;

public class EtsyStepDefs {
    EtsyHomePage etsyHomePage=new EtsyHomePage();
    JavascriptExecutor js= (JavascriptExecutor)Driver.getDriver();


    @Given("user goes to url {string}")
    public void userGoesToUrl(String arg0) {
        Driver.getDriver().get(arg0);
    }

    @And("user does hover over clothing and shoes section")
    public void userDoesHoverOverClothingAndShoesSection() throws InterruptedException {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(etsyHomePage.clothing_shoes).perform();
        Thread.sleep(2000);
    }

    @And("user click on clothing and shoes section")
    public void userClickOnClothingAndShoesSection() {
        etsyHomePage.clothing_shoes.click();

    }

    @And("user click on kids_baby section")
    public void userClickOnKids_babySection() {
        etsyHomePage.kids_baby.click();
    }

    @And("user click on baby_shoes section")
    public void userClickOnBaby_shoesSection() {
        etsyHomePage.baby_shoes.click();
    }

    @And("user click on boots section")
    public void userClickOnBootsSection() {
        etsyHomePage.boots.click();
    }

    @When("user scroll-down buttom of page up to title There's so much more for you to discover")
    public void userScrollDownButtomOfPageUpToTitleThereSSoMuchMoreForYouToDiscover() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();",etsyHomePage.textForScrollDown);
        Thread.sleep(3000);
        // JSUtils.scrollIntoViewJS(etsyHomePage.textForScrollDown);
    }

    @Then("user verify that display this text There's so much more for you to discover")
    public void userVerifyThatDisplayThisTextThereSSoMuchMoreForYouToDiscover() throws IOException {
        Assert.assertTrue(etsyHomePage.textForScrollDown.getText().contains("you to discover"));
        System.out.println(etsyHomePage.textForScrollDown.getText());
        ReusableMethods.getScreenshot("hadiulan");
    }

    @And("the end")
    public void theEnd() {
        System.out.println("Game Over");
    }

    @And("user search for {string}")
    public void userSearchFor(String arg0) {
        etsyHomePage.searchBox.sendKeys(arg0);
    }


//    @And("user takes and print {string} inside the page")
//    public void userTakesAndPrintInsideThePage(String arg0) {
//       String priceOfSelectedShoes= etsyHomePage.priceOfSelectedShoes.getText();
//        System.out.println(priceOfSelectedShoes);
//    }
//
//
//    @And("user take a screenshot inside the page")
//    public void userTakeAScreenshotInsideThePage() throws IOException {
//        ReusableMethods.getScreenshot("LastProduct");
//    }
}
 /*
     Given user goes to "url"
    And user does hover over "clothing and shoes" section
    And user click on "kids_baby" section
    And user click on "baby_shoes" section
    And user click on "boots" section
    And user click on "There's so much more for you to discover" section
    When user scroll-down buttom of page up to title"price of last products"
    Then user verify that display this text"There's so much more for you to discover"

  */
