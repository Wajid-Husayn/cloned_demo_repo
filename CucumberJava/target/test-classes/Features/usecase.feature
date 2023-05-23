Feature: to validate the functionality

  Scenario: Functionlaity is working on valid credentials
    Given user is page1
    And user enter credentials
    When user click on button to login
    Then Hurray we are successful
