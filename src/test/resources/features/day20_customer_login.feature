@customer_login
Feature: customer_login_feature
  Scenario Outline: login_with_customer_credentials

    Given user opens the URL "https://www.bluerentalcars.com/"
    When user navigate the login page
    And user enters username as "<username>" and password as "<password>" and click on login button
    Then verify the login is successful
    Then close the application

    Examples: test_data
    |username                     |password  |
    |customer@bluerentalcars.com  |12345     |
    |customer1@bluerentalcars.com |12346     |
    |customer2@bluerentalcars.com |12347     |
    |customer3@bluerentalcars.com |1234X     |





