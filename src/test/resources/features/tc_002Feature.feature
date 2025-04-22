Feature: Logout functionality

  Scenario: User logs out successfully
    Given the user is logged in
    When the user clicks on the logout button
    Then the user should be logged out
    And the user should be redirected to the homepage