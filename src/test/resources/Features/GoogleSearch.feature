#while running this, make sure url is et to www.google.com
#@Regression
Feature: feature to test google search functionality

  #@Smoke
  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
