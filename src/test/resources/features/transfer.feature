Feature: Transfer

  Scenario: Transfer balance to other rekening
    Given user is on login page
    And user click on masuk m-banking satu button
    And user input email with "gilangzhanuardy3222@gmail.com"
    And user input password with "Testing123*"
    And user click on login button
    And user click transfer button and transfer to new target
    When user input information and target rekening
    Then user success transfer