
Feature: Login page feature

  Scenario: Login user to the page successfully
    When I add the correct credentials to the login fields
    And I click the login button
    Then I am able to login successfully

  Scenario: Login user to the page unsuccessfully
    Given I am on the login page
    When I add the incorrect credentials to the login fields
    And I click the login button
    Then I see the error message
