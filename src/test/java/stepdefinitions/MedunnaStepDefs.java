package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.MedunnaHomePage;
import pages.MedunnaRoomPage;

public class MedunnaStepDefs {

    MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
    MedunnaRoomPage medunnaRoomPage = new MedunnaRoomPage();

    @Given("Sign in as admin")
    public void sign_in_as_admin() {

        medunnaHomePage.signInIcon.click();
        medunnaHomePage.signInDropDown.click();
        medunnaHomePage.usernameBox.sendKeys("adminrecep");
        medunnaHomePage.passwordBox.sendKeys("123Recep");
        medunnaHomePage.signInSubmitButton.click();


    }

    @When("Click on ItemsTitles")
    public void click_on_items_titles() {
        medunnaHomePage.itemsTitlesButton.click();


    }

    @When("Click on Room button")
    public void click_on_room_button() {
        medunnaHomePage.roomButton.click();
    }

    @When("Click Create a new room button")
    public void click_create_a_new_room_button() {

        medunnaHomePage.createANewRoomButton.click();

    }

    @Then("Verify that Create or edit a Room is displayed")
    public void verify_that_create_or_edit_a_room_is_displayed() {

        Assert.assertTrue(medunnaRoomPage.createEditRoomText.isDisplayed());

    }

    @When("Enter room number as {string}")
    public void enterRoomNumberAs(String arg0) {

    }

    @When("Clear room number")
    public void clear_room_number() {

    }

    @Then("Verify This field is required.")
    public void verify_this_field_is_required() {

    }

    @Then("Verify {int} Room Types are selectable.")
    public void verify_room_types_are_selectable(Integer int1) {

    }

    @When("Click on Status checkbox")
    public void click_on_status_checkbox() {

    }

    @Then("Verify that checkbox is selected")
    public void verify_that_checkbox_is_selected() {

    }

    @When("Send price to price box and clear it")
    public void send_price_to_price_box_and_clear_it() {

    }

    @When("Send price to price box  as {string}")
    public void sendPriceToPriceBoxAs(String price) {

    }

    @When("Send description to the description box and clear.")
    public void send_description_to_the_description_box_and_clear() {

    }

    @Then("Verify This field is required is not displayed.")
    public void verify_this_field_is_required_is_not_displayed() {

    }

    @When("Send description to the description box")
    public void send_description_to_the_description_box() {

    }

    @When("Click on View button on Rooms page")
    public void click_on_view_button_on_rooms_page() {

    }

    @Then("Verify that you can view all {int} items.")
    public void verify_that_you_can_view_all_items(Integer int1) {

    }

    @When("Click on Edit button")
    public void click_on_edit_button() {

    }

    @When("Change the room number")
    public void change_the_room_number() {

    }

    @When("Click on save button")
    public void click_on_save_button() {

    }

    @Then("Verify {string}")
    public void verify(String string) {

    }

    @When("Click on Created Date button and sort them from newest to oldest")
    public void click_on_created_date_button_and_sort_them_from_newest_to_oldest() {

    }

    @When("Click on Delete button at the top.")
    public void click_on_delete_button_at_the_top() {

    }

    @When("Click on Delete as confirm on the alert")
    public void click_on_delete_as_confirm_on_the_alert() {

    }

    @Then("Verify The room is deleted")
    public void verify_the_room_is_deleted() {

    }


    @When("clear the price")
    public void clearThePrice() {
    }
}