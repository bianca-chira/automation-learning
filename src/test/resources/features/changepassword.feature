

Feature: Change password page scenarios

  Scenario: As a user I am able to change my password
    Given I am on the login page
    When I add the correct credentials to the login fields
    * I click the login button
    * I select the Change Password option from drop-down user profile menu
    * I enter the current password in the Current Password field
    * I enter in the Password field a new password
    * I confirm the new password
    * I press the Save button to update the password
    * I should be able to see the confirmation message