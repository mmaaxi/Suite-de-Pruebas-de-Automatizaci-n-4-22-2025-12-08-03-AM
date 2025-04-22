Feature: Test login functionality

  Scenario: User logs into the system with valid credentials
    Given the user is on the homepage
    When the user enters valid credentials
    Then the user is logged into the system