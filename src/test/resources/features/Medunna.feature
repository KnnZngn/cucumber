Feature: Medunna_Test

  Background: Go to homepage
    Given user opens the URL "https://medunna.com"
    Then verify the page title contains "MEDUNNA"
    Then capture the screenshot

  @US16_Room_Manipulation
  Scenario Outline: US16_Room_Manipulation
    Given Sign in as admin
    When Click on ItemsTitles
    And Click on Room button
    And Click Create a new room button
    Then Verify that Create or edit a Room is displayed
    When Enter room number as "<room number>"
    And Clear room number
    Then Verify This field is required.
    When Enter room number as "<room number>"
    Then Verify 5 Room Types are selectable.
    When Click on Status checkbox
    Then Verify that checkbox is selected
    When Send price to price box  as "<price>"
    When clear the price
    Then Verify This field is required.
    When Send price to price box  as "<price>"
    And Send description to the description box and clear.
    Then Verify This field is required is not displayed.
    When Send description to the description box
    And Click on View button on Rooms page
    Then Verify that you can view all 6 items.
    When Click on Edit button
    And Change the room number
    And Click on save button
    Then Verify "The room is updated"
    When Click on Created Date button and sort them from newest to oldest
    And Click on Delete button at the top.
    And Click on Delete as confirm on the alert
    Then Verify The room is deleted

    Examples:
      | room number | price |
      | 99754       | 123   |