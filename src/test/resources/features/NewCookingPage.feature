Feature: Add new cooking

  @NewCookingPage
  Scenario: Add new cooking with description and valid image file
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "NaufalVerif1" as username and "Asdfg123" as password for new cooking page
    And User click login button
    Then User already on Home Page
    When User click on New Post button
    And User click on New Cooking button
    Then User already on New Cooking Page
    When User input "Coba-coba" as description
    And Click on add image button to upload valid image file
    And Click submit button on new cooking page
    Then User redirected to Profile page

  @NewCookingPage
  Scenario: Add new cooking with blank description and valid image file
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "NaufalVerif1" as username and "Asdfg123" as password for new cooking page
    And User click login button
    Then User already on Home Page
    When User click on New Post button
    And User click on New Cooking button
    Then User already on New Cooking Page
    When Click on add image button to upload valid image file
    And Click submit button on new cooking page
    Then User still on New Cooking page

  @NewCookingPage
  Scenario: Add new cooking with description and without image file
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "NaufalVerif1" as username and "Asdfg123" as password for new cooking page
    And User click login button
    Then User already on Home Page
    When User click on New Post button
    And User click on New Cooking button
    Then User already on New Cooking Page
    When User input "Coba-coba" as description
    And Click submit button on new cooking page
    Then User still on New Cooking page

  @NewCookingPage
  Scenario: Add new cooking without description and image file
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "NaufalVerif1" as username and "Asdfg123" as password for new cooking page
    And User click login button
    Then User already on Home Page
    When User click on New Post button
    And User click on New Cooking button
    Then User already on New Cooking Page
    When Click submit button on new cooking page
    Then User still on New Cooking page