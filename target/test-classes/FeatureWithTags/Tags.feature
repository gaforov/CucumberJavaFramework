Feature: Feature to demo tags

  @smoke
  Scenario: Sample One
    Given user navigates to website
    When user cliks login button
    Then use log in to website

  @regression
  Scenario: Sample Two
    Given user navigates to website
    When user cliks login button
    Then use log in to website

  @Smoke @regression
  Scenario: Sample Three
    Given user navigates to website
    When user cliks login button
    Then use log in to website

  @important
  Scenario: Sample Two
    Given user navigates to website
    When user cliks login button
    Then use log in to website
