@alert_handle
Feature: click_alert
  Scenario: Alert_cope_with

    Given user goes to url "http://the-internet.herokuapp.com/javascript_alerts"
    And user click on first JS alert button
    And user verify result text "You successfully clicked an alert"
    And user click on alert accept
    And user verify result text "You clicked: Cancel"
    And user click on alert type a text
    And user verify result text "You entered: a"


