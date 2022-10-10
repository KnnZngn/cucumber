package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Locale;

public class AppReservationStepDefs {

    HomePage homePage = new HomePage();
    @Given("user is on the home page")
    public void user_is_on_the_home_page() {

        // Assert.assertTrue(homePage.userID.isDisplayed());
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

    }

    @And("select a car model {string}")
    public void selectACarModel(String carModel) {
        Select selectCar = new Select(homePage.selectACar);
        //ReusableMethods.selectRandomTextFromDropdown(selectCar);
        selectCar.selectByVisibleText(carModel);


    }

    @Given("enter pick up field")
    public void enter_pick_up_field() {

        homePage.pickUpPlace.sendKeys(Faker.instance(Locale.US).address().cityName());


    }
    @Given("enter drop off field")
    public void enter_drop_off_field() {

        homePage.dropOffPlace.sendKeys(Faker.instance(Locale.US).address().cityName());

    }

    @And("Enter pick up date {string} as MMddyyyy")
    public void enterPickUpDateAsMMddyyyy(String arg0) {
        homePage.pickUpDate.sendKeys(arg0);
        // "<kenan>"  "<username>"  "<date>" vs
        //feature deki argumanim neyse neyi
        //aratmak istiyorsam neyi yazmak istiyorsam ordakini alip buraya
        //adimlara gelecek ve onu clickleyecek veya send edecek
        //elma yazmissam elma date basliginin(arguman) altina=yani arg0
        //hangi parametreyi(elemani degeri value yi) yazarsam o gelecek
        //3 tane yazarsam test bastan 3 kere calisacak
        //arg0 yerine date de yazabilirim veya basligim her neyse
        //sadece "knn" tirnakla yazarsam onu arar ve artik o tirnak
        //icini istedigmz gibi degstrblrz parameter olur "maserati" gibi
        homePage.pickUpTime.sendKeys("11:11p");

    }


    @And("Enter drop off date {string} as MMddyyyy")
    public void enterDropOffDateAsMMddyyyy(String arg0) {
        homePage.dropOffDate.sendKeys(arg0); //feature deki argumanim neyse neyi
        //aratmak istiyorsam neyi yazmak istiyorsam ordakini alip buraya
        //adimlara gelecek ve onu clickleyecek veya send edecek
        //elma yazmissam elma date basliginin(arguman) altina=yani arg0
        //hangi parametreyi(elemani degeri value yi) yazarsam o gelecek
        //3 tane yazarsam test bastan 3 kere calisacak
        //arg0 yerine date de yazabilirim veya basligim her neyse
        homePage.dropOffTime.sendKeys("11:11a");
    }




    @Given("click continue reservation")
    public void click_continue_reservation() {

        homePage.continueReservationButton.click();

    }
    @Given("verify complete reservation screen pops up")
    public void verify_complete_reservation_screen_pops_up() {

        //  Assert.assertTrue(homePage.completeReservationScreenText.isDisplayed());

    }
    @Given("enter card number")
    public void enter_card_number() {
        Actions action = new Actions(Driver.getDriver());
        action.doubleClick(homePage.cardNumberBox).perform();
        homePage.cardNumberBox.sendKeys(Faker.instance().business().creditCardNumber());
    }
    @Given("enter name on the card")
    public void enter_name_on_the_card() {
        Actions action = new Actions(Driver.getDriver());
        action.doubleClick(homePage.nameOnCardBox).perform();
        homePage.nameOnCardBox.sendKeys(Faker.instance().business().creditCardType());
    }
    @Given("enter expire date and CVC")
    public void enter_expire_date_and_cvc() {

        Actions action = new Actions(Driver.getDriver());
        action.doubleClick(homePage.cvcBox).perform();
        homePage.cvcBox.sendKeys(Faker.instance().number().digits(3));

    }
    @Given("checks the agreement")
    public void checks_the_agreement() {
        homePage.agreementCheckBox.click();

    }
    @Given("click complete reservation")
    public void click_complete_reservation() {
        ReusableMethods.waitForClickablility(homePage.completeReservationButton,2);
        homePage.completeReservationButton.click();

    }
    @Then("verify {string} pop up")
    public void verifyPopUp(String arg0) {
        ReusableMethods.waitForClickablility(homePage.completeReservationScreenText,2);
//       String str= homePage.completeReservationScreenText.getText();
//       Assert.assertEquals("Reservation created successfully",str);

        Assert.assertTrue(homePage.completeReservationScreenText.isDisplayed());

    }





}