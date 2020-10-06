#while running this, make sure url is et to https://example.testproject.io/web/
@Regression
Feature: feature to test login functionality

  @Smoke
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And user cliks on login button
    Then user is navigated to the home page
