Feature: Search Page

  @SearchPage @Cookit
  Scenario: User search for recipes
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User click search icon button
    Then User already on search page
    When User click recipes tab on search page
    Then User click search field on search page
    And User input "Burger" search field on search page
    And List of recipe name contains "Burger" will appear

  @SearchPage @Cookit
  Scenario: User search for people
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User click search icon button
    Then User already on search page
    When User click people tab on search page
    Then User click search field on search page
    And User input "naufal" search field on search page
    And List of username contains "naufal" will appear