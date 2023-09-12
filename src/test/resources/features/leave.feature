Feature: Leave page scenarios

  Scenario: Rejected status is present as a selection
    Given I am on the login page
    When I add the correct credentials to the login fields
    And I click the login button
    And I click the leave link from the menu
    And I select the Rejected status from the 'Show Leave with Status' section
    Then I check that the Rejected status is present as a selection by using XPath selector

