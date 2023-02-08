@smoke

Feature: F02_Login | users could use login functionality to use their accounts
#First scenario
  Scenario:  user login with valid username and password
    And user navigates to login page
    When user login with "test@example.com" and "P@ssw0rd"
    And user click on login button
    Then user could login successfully

  # Second scenario
  Scenario:  user login with invalid username and password
    And user navigates to login page
    When user login with "test@example.com" and "P@ssw0rd"
    And user click on login button
    Then user fails to login


