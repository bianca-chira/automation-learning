Feature: Admin Page Scenario

  Background:
    Given I am on the login page
    When I add the correct credentials to the login fields
    * I click the login button
    * I click the Admin link from the menu

  Scenario: As a user I am able to access the Language Packages
    * I click on the Configuration dropdown menu button
    * I click on the Language Packages option
    * I click on the Translate button for Spanish - Español language package
    Then I should be redirected to the languageCustomization page

  Scenario: As a user I am able to add a new language Package
    * I click on the Configuration dropdown menu button
    * I click on the Language Packages option
    * I click the Add button to add a new language to the packages
    * I select the language Colognian(Germany) from that list
    * I press the Save to add this new language to my packages
    Then I should be able to see the confirmation message that the language was successfully saved

  Scenario: As a user I want to add a new job
    * I select the Job Titles option from the Job menu dropdown
    * I click the Add button to add a new job
    * I add a name for the job in the Job Title field
    * I add a job description
    * I add a Job Specification file
    * I click the Save button to add the new job
    Then I should see the confirmation message that the job was successfully added



