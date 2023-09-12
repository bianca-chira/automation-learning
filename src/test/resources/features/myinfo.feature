Feature: My info page feature

  Background:
    Given I am on the login page
    When I add the correct credentials to the login fields
    And I click the login button
    And I click the My Info option from the menu
    And I click on the Contact Details link which will redirect me to the contactDetails page

  Scenario: As a user I am able to update my street and country details
    And I update the Street 1 field from contact details
    And I select Algeria as country
    And I press the Save button
    Then I should see the successfully updated confirmation message

  Scenario: As a user I am able to add an attachment into my Contact Details
    And I click the Add Attachments button
    And I select to upload a file
    And I add a comment for this document uploaded in the comment field
    And I press the Save button for this attachment added
    Then I am able to see my document added in the record found section by using css selector

  Scenario: As a user I am able to delete a record from my Contact Details
    And I tick the checkbox to select one record saved in the Records Found section
    And I press the Delete button to delete that record
    And I press Yes to confirm this deletion
    Then I should receive a confirmation message that the record has been deleted successfull