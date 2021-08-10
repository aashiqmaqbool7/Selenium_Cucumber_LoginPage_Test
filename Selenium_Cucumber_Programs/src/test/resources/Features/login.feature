Feature: feature to test login functionality

  Scenario Outline: Check if login is successful with valid credentials or not
    Given browser is open
    Given user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Ashiq    |    12345 |
      | Maqbool  |    12345 |
