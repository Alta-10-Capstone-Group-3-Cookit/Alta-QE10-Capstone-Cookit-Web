Feature: Home Page


  @Cookit
  Scenario: User go to timeline tab
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User click timeline tab button
    Then User already on Timeline Tab

  @Cookit
  Scenario: User go to recipe tab
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User already on Recipe Tab

  @HomePage @Cookit
  Scenario: User go to recipe page
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User already on Recipe Tab
    Then User click on recipe name
    And User already on recipe page

  @Cookit
  Scenario: User go to search page
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User click search icon button
    Then User already on search page

  @Cookit
  Scenario: User add item to cart
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User already on Recipe Tab
    Then User click on add to cart icon button on recipe tab on home page

  @Cookit
  Scenario: User go to cart page
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User click cart icon button
    Then User already on cart page