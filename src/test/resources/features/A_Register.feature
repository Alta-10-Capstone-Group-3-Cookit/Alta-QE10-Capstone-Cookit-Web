Feature: Register user

  @Register
  Scenario: User register with valid and unregistered username, email, and password
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    And User click Sign Up text
    And User already on signup page
    When User input valid and unregistered username, email, and password
    And User click sign up button
    Then User already on login page after success pop up