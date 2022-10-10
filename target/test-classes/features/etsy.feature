@knn
Feature: etsyinetsy test
  Scenario: etsy_boots
    Given user goes to url "https://www.etsy.com/"
    And user does hover over clothing and shoes section
    And user click on clothing and shoes section
    And user click on kids_baby section
    And user click on baby_shoes section
    And user click on boots section
    When user scroll-down buttom of page up to title There's so much more for you to discover
    Then user verify that display this text There's so much more for you to discover
    And the end
    And close the application


