Feature: Login
  AS QA Automation
  I want to open login user in Wappi App
  To Log in

  Scenario: Correct login
    Given the user is on the Wappi page
    When the user enter username and password
      | username   | password |
      | automation | 12345678 |
    Then the user should see the name Ofertas

