Feature: User Login

  @Login
  Scenario Outline: User can Login successfully
    Given the user is on the login page
    When the user enters valid "<username>" and "<password>" credentials.
    And clicks the login button
    Then the user should see a login success.

  Examples:
    | username | password |
    | sat      | a@1234   |
    | saj      | b@gfs    |