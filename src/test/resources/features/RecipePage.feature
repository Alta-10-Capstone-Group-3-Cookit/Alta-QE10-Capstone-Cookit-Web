Feature: Recipe Page


  Scenario: User like recipe
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User already on Recipe Tab
    Then User click on recipe name
    And User already on recipe page
    When User click like button icon


  Scenario: User unlike recipe
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User already on Recipe Tab
    Then User click on recipe name
    And User already on recipe page
    When User click like button icon
    Then User click unlike button icon


  Scenario: User increase total servings
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User already on Recipe Tab
    Then User click on recipe name
    And User already on recipe page
    When User click plus button on ingredients


  Scenario: User decrease total servings
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User already on Recipe Tab
    Then User click on recipe name
    And User already on recipe page
    When User click plus button on ingredients
    Then User click minus button on ingredients


  Scenario: User decrease total servings
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User already on Recipe Tab
    Then User click on recipe name
    And User already on recipe page
    And User click add to cart button on Buy Ingredients section


  Scenario: User add comment on recipe
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User already on Recipe Tab
    Then User click on recipe name
    And User already on recipe page
    And User scroll down to comments section
    Then User input "Coba comment" on comments field
    And User click on submit button on comments section
    And Comments "Coba comment" should appear


  Scenario: User go to recook recipe page
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User already on Recipe Tab
    Then User click on recipe name
    And User already on recipe page
    When User click three dots icon button on title secction
    Then User click recook on three dots icon button on title secction
    And User already on Recook page


  Scenario: User go to reply recipe page
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User already on Recipe Tab
    Then User click on recipe name
    And User already on recipe page
    When User click three dots icon button on title secction
    Then User click reply on three dots icon button on title secction
    And User already on Reply page


  Scenario: User reply recipe
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User already on Recipe Tab
    Then User click on recipe name
    And User already on recipe page
    When User click three dots icon button on title secction
    Then User click reply on three dots icon button on title secction
    And User already on Reply page
    When User input "Coba Reply" on Describe field on Reply Recipe page
    Then Click on add image button and upload valid image file
    And User click Submit button on Reply Recipe page

  @RecipePage
  Scenario: User recook recipe
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User already on Recipe Tab
    Then User click on recipe name
    And User already on recipe page
    When User click three dots icon button on title secction
    Then User click recook on three dots icon button on title secction
    And User already on Recook page
    When User input "Recook Burger Kepiting" as Recook Recipe Title
    And User input "Burger Kepiting ala spongebob" as Recook Description
    And Click on ingredient plus button
    And Input "Selada" as ingredient 3 name, "1" as ingredient 3 item quantity, "lembar" as ingredient 3 unit
    And Input "60000" as price
    And Click Submit button
    And User already on recipe page
    And Validate price is "60000"