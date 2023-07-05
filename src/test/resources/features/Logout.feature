Feature: Logout

  @Logout @Cookit
  Scenario: User do logout
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalfix" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click logout menu
    And User click Yes on pop up
    Then User already on login page

  @Logout @Cookit
  Scenario: Admin do logout
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin" as username and "admin" as password
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click logout menu
    And User click Yes on pop up
    Then User already on login page

  @Logout @Cookit
  Scenario: Verified user do logout
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click logout menu
    And User click Yes on pop up
    Then User already on login page

  @Logout @Cookit
  Scenario: User cancel logout
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalfix" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click logout menu
    And User click No on pop up
    Then User still on home page

  @Logout @Cookit
  Scenario: Admin cancel logout
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin" as username and "admin" as password
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click logout menu
    And User click No on pop up
    Then User still on home page

  @Logout @Cookit
  Scenario: Verified user cancel logout
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click logout menu
    And User click No on pop up
    Then User still on home page