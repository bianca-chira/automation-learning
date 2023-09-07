Feature: Admin Page Scenario

  Scenario: As a user I am able to access the Language Packages
    Given I am on the login page
    When I add the correct credentials to the login fields
    And I click the login button
    And I click the Admin link from the menu
    And I click on the Configuration dropdown menu button
    And I click on the Language Packages option
    And I click on the Translate button for Spanish - Español language package
    Then I should be redirected to the languageCustomization page
