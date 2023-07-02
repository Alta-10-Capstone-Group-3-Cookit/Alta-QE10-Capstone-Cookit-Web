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

  @Register
  Scenario: User register with valid and already registered username, email, and password
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    And User click Sign Up text
    And User already on signup page
    When User input "naufaltest1" as username, "naufaltest1@example.com" as email, and "Asdfg123" as password
    And User click sign up button
    Then Alert with message "user already registered" is shown

  @Register
  Scenario: User register with empty username, valid email and valid password
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    And User click Sign Up text
    And User already on signup page
    When User input "naufaltest1@example.com" as email, and "Asdfg123" as password
    And User click sign up button
    Then Alert with message "Please input your email, username and password.." is shown

  @Register
  Scenario: User register with 6 characters password, valid username and valid email
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    And User click Sign Up text
    And User already on signup page
    When User input "naufaltest1" as username, "naufaltest1@example.com" as email, and "Asdfg1" as password
    And User click sign up button
    Then Alert with message "At least 8 characters with no space" is shown

  @Register
  Scenario: User register without uppercase letter password, valid username and valid email
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    And User click Sign Up text
    And User already on signup page
    When User input "naufaltest1" as username, "naufaltest1@example.com" as email, and "asdfg123" as password
    And User click sign up button
    Then Alert with message "At least 1 upper case letter" is shown

  @Register
  Scenario: User register without number on password, valid username and valid email
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    And User click Sign Up text
    And User already on signup page
    When User input "naufaltest1" as username, "naufaltest1@example.com" as email, and "AsdfgAsdfg" as password
    And User click sign up button
    Then Alert with message "At least 1 number" is shown