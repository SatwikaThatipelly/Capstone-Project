Feature: User Signup

  Scenario: User can sign up successfully
    Given the user is on the signup page
    When the user enters valid username and password
    And clicks the signup button
    Then the user should see a success message.