@scenario_outline1
Feature: Scenario_outline

  Background: User_goes_to_google
    Given user opens the URL "https://www.google.com"

    Scenario Outline: Google_Search

      Given user search for "<item>" on the google
      Then verify the page title contains "<item>"
      Then close the application


      Examples: test_data
      |item|
      |mercedes benz|
      |tesla   |
      |sdet  |
      |QA Automation Engineer  |
      |bmw     |
      |selenium webdriver jobs|
#item column gibi
#  "<name>" yazarsak bu bizim baslik examplemiz olur
#  altina istedigimizi doldururuz
#  yani gidip steplere tek tek elma armut yazmamiza gerek yok
#  senaryomuza yazariz yeterli ghrkin language
#  steplere gider itemi oraya goturur
#  sirayla sanki for loop gibi example ane yazdiysak senaryoya uygun ilerler
#  teslayi given la arar then le verify eder
#  bmw yi given la arar then stepinde verify eder