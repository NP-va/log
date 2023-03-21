Feature: betPARX login feature
  User Story:As a user, I should be able to login with correct credentials and dashboard should be displayed.

  @wip
  Scenario: Login to betParx account with valid credentials
    Given user is on betParx login page
    When user enters username
    When user enters password
    Then user should see dashboard