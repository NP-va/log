Feature: Etsy login feature
  User Story:As a user, I should be able to login with correct credentials and dashboard should be displayed.

  @etsy
  Scenario: Login to Etsy account with valid credentials
    Given user is on Etsy login page
    When user enters username
    When user enters password
    Then user should see dashboard