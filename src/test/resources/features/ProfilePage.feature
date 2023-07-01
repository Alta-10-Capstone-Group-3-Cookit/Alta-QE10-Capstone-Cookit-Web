Feature: Profile page

  @ProfilePage
  Scenario: Validate user informations on profile page
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalfix" as username and "Asdfg123" as password for profile page
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click on Profile list menu
    Then User already on profile page
    And Validate user name is correct
    And Validate user profile layout is displayed
    And Validate user recipe post is displayed

  @ProfilePage
  Scenario: User give like on their recipe post
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalfix" as username and "Asdfg123" as password for profile page
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click on Profile list menu
    Then User already on profile page
    When User click like icon on their post
    Then Like count number should be "1"

  @ProfilePage
  Scenario: User unlike their recipe post
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalfix" as username and "Asdfg123" as password for profile page
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click on Profile list menu
    Then User already on profile page
    When User click like icon on their post
    And User click like icon on their post
    Then Like count number should be "0"

  @ProfilePage
  Scenario: User click reply on their recipe post
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalfix" as username and "Asdfg123" as password for profile page
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click on Profile list menu
    Then User already on profile page
    When User click three dots icon on their post
    And User click on Reply
    Then User navigated to reply page

  @ProfilePage
  Scenario: User click recook on their recipe post
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalfix" as username and "Asdfg123" as password for profile page
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click on Profile list menu
    Then User already on profile page
    When User click three dots icon on their post
    And User click on Recook
    Then User navigated to recook page