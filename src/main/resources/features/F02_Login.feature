Feature: F02_Login | users could use login functionality to use their accounts

  @smoke
  Scenario: user could login with valid email and password
    Given user go to login page
    And user login with valid Email and Password
    When user press on login button
    Then user login to the system successfully

  @smoke
  Scenario: user could login with invalid email and password
    Given user go to login page
    And user login with invalid Email and Password
    When user press on login button
    Then user could not login to the system

