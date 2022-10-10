Feature: FE3425_Reservation_Feature

  Background: User logins the Application
    Given user opens the URL "https://www.bluerentalcars.com/"
    When user navigate the login page
    And user enters manager_username and manager_password
      |username                     |password  |
      |customer@bluerentalcars.com  |12345     |
    Then verify the login is successful
    And capture the screenshot

  @reservation_creation
  Scenario Outline: TC01_Reservation_Creation

    Given user is on the home page
    And select a car model "Maserati"
    And enter pick up field
    And enter drop off field
    And Enter pick up date "<Date1>" as MMddyyyy
    And Enter drop off date "<Date2>" as MMddyyyy
    And click continue reservation
    And verify complete reservation screen pops up
    And enter card number
    And enter name on the card
    And enter expire date and CVC
    And checks the agreement
    And click complete reservation
    Then verify "Reservation created successfully" pop up
    Examples:
      | Date1 | Date2 |
      |10112042|12122043|