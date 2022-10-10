package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.LocalDateTime;

public class GoogleStepDefs {

    GooglePage googlePage = new GooglePage();
    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        try{
            googlePage.popUpOkButton.click();
        }catch (Exception e){
//            e.printStackTrace();
        }
    }
    @When("user search for iPhone on google")
    public void user_search_for_i_phone_on_google() {
//use page object model
        googlePage.searchBox.sendKeys("iPhone"+ Keys.ENTER);


    }
    @Then("verify the page title contains iPhone")
    public void verify_the_page_title_contains_i_phone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @When("user search for TeaPot on google")
    public void user_search_for_tea_pot_on_google() {
        googlePage.searchBox.sendKeys("TeaPot"+ Keys.ENTER);
    }
    @Then("verify the page title contains TeaPot")
    public void verify_the_page_title_contains_tea_pot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("TeaPot"));
    }
    /*
    "quote" icine ne yazarsak string olarak steplerimizze gelir
    "mercedes" yazarsak buraya string olarak gelir ve metodumuz onu kullanir
     */
    @Given("user opens the URL {string}")
    public void user_opens_the_url(String string) {

        Driver.getDriver().get(string); //url yerine string yazdik
        //url yi tirnak icinde scenario ya yazdik
        //istedigmz adresi oraya yazabiliriz ve sararmaz
        try{
            googlePage.popUpOkButton.click();
        }catch (Exception e){
//            e.printStackTrace();
        }
    }
    @Given("user search for {string} on the google")
    public void user_search_for_on_the_google(String string) {

        googlePage.searchBox.sendKeys(string+Keys.ENTER);
        //elma armut nutella yerine buraya string yazdik
        //elma armut nutella yi scenario ya yazdik
    }

    @Then("verify the page title contains {string}")
    public void verify_the_page_title_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
        //mercedes yerine burya dinamik olarak string yazdik
        //"mercedes" i senaryomuza yazip buraya cagirdik
        //senaryomuza tirnak icinde ne yazarsak artik buraya o gelecek
    }

    @Then("verify test case fails")
    public void verifyTestCaseFails() {
        Assert.assertTrue(false);
    }
}
