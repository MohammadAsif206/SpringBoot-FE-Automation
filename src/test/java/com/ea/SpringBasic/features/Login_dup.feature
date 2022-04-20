Feature: Login
  This feature deals with the login functionalities of the application

  Scenario: Login with correct credentials
    Given I click login in the home page
    And I enter the following for Login
    |username|password|
    |admin   |password|
    And I click login button
    Then I should see the userform page
    And I click logout link

  Scenario: Login with correct credentials 2
    Given I click login in the home page
    And I enter the following for Login
      |username|password|
      |admin   |password2|
    And I click login button
    Then I should see the userform page
    And I click logout link

