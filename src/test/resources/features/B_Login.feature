Feature: Login user

  @Login
  Scenario: User login with registered username and password
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalfix" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page

  @Login
  Scenario: User login with wrong password
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalfix" as username and "Qwerty123" as password
    And User click login button
    Then Alert with message "Please enter a valid username or password.." is shown

  @Login
  Scenario: User login with unregistered username
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "unknownuser" as username and "Asdfg123" as password
    And User click login button
    Then Alert with message "Please enter a valid username or password.." is shown

  @Login
  Scenario: User login with empty username field
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "Asdfg123" as password
    And User click login button
    Then Alert with message "Please enter a valid username or password.." is shown

  @Login
  Scenario: User login with empty password field
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalfix" as username
    And User click login button
    Then Alert with message "Please enter a valid username or password.." is shown