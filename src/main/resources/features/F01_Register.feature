Feature: F01_Register | users could register with new accounts

  @smoke
  Scenario Outline: guest user could register with valid data successfully
    Given user clicks on register button
    And user select <genderType>
    And user enter <firstName> and <lastName>
    And user enter date of birth
    And user enter <email>
    And user fills <password> fields
    When user clicks on register button
    Then success message is displayed
    Examples:
      | firstName    | lastName | email              | password   | genderType |
      | "automation" | "tester" | "test@example.com" | "P@ssw0rd" | male       |