Feature: Login
  AS QA Automation
  I want to open login user in Wappi App
  To Log in

  Background: Update user data
    Given the user is on the Wappi page
    When the user enter username and password
      | username   | password |
      | automation | 12345678 |

  Scenario: Up Date User
    When Open profile
    When the user click on personal information
    And the user type data
      | name   | lastname | date       |
      | felipe | alvarez  | 12/11/1987 |
    Then Confrim the information

