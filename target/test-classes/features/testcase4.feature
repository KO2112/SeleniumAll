Feature: log in and log out funcitonality
  Scenario: verify user can login and logout
    Given user is on the login page
    When user clicks signup loggin button
    Then user should see login to your account message
    When Enter correct email address and password
    And user clicks login button
    Then user should see logged in as username message
    When user clicks on logout button
    Then user should see the login page
