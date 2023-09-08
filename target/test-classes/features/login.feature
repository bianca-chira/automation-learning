Feature: Login page feature

  Scenario Outline: Login user to the page
    Given I am on the login page
    When I add the <login> credentials to the login fields
    And I click the login button
    Then I am able to login <status>

    Examples:
      | login     | status         |
      | correct   | successfully   |
      | incorrect | unsuccessfully |