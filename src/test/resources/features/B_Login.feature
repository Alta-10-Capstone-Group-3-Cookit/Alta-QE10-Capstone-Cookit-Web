Feature: Login user

  @Login
  Scenario: User login with registered username and password
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalfix" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page