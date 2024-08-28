Feature: Mutation

  Scenario: Check and see the mutation
    Given user is on login page
    And user click on masuk m-banking satu button
    And user input email with "gilangzhanuardy3222@gmail.com"
    And user input password with "Testing123*"
    And user click on login button
    And user click mutation button
    And user click input information for mutation
    When user input PIN
    Then user can check the mutation