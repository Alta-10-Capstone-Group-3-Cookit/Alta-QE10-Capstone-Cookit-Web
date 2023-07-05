Feature: Add new reecipe

  @NewRecipePage @Cookit
  Scenario: Add new recipe with all inputs are filled with valid data
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "NaufalVerif1" as username and "Asdfg123" as password for new recipe page
    And User click login button
    Then User already on Home Page
    When User click on New Post button
    And User click on New Recipe button
    Then User already on New Recipe Page
    When User input "Burger Kepiting" as Recipe Title
    And User input "Burger Kepiting biasa" as Description
    And Upload valid image file
    And Click on ingredient plus button
    And Input "Roti" as first ingredient name, "2" as first ingredient item, "potong" as first ingredient unit
    And Input "Burger" as second ingredient name, "1" as second ingredient item, "potong" as second ingredient unit
    And Click directions plus button
    And Input "Siapkan bahan" as first step
    And Input "Susun bahan sesuai selera" as second step
    And Checklist sell ingredients
    And Input "50000" as price
    And Click Submit button
    Then User already on recipe page from new recipe
    And Validate recipe title is "Burger Kepiting"
    And Validate price is "50000"

  @NewRecipePage @Cookit
  Scenario: Add new recipe with blank recipe title
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "NaufalVerif1" as username and "Asdfg123" as password for new recipe page
    And User click login button
    Then User already on Home Page
    When User click on New Post button
    And User click on New Recipe button
    Then User already on New Recipe Page
    When User input "Burger Kepiting biasa" as Description
    And Upload valid image file
    And Click on ingredient plus button
    And Input "Roti" as first ingredient name, "2" as first ingredient item, "potong" as first ingredient unit
    And Input "Burger" as second ingredient name, "1" as second ingredient item, "potong" as second ingredient unit
    And Click directions plus button
    And Input "Siapkan bahan" as first step
    And Input "Susun bahan sesuai selera" as second step
    And Checklist sell ingredients
    And Input "50000" as price
    And Click Submit button
    Then User still on New Recipe page

  @NewRecipePage @Cookit
  Scenario: Add new recipe with blank description
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "NaufalVerif1" as username and "Asdfg123" as password for new recipe page
    And User click login button
    Then User already on Home Page
    When User click on New Post button
    And User click on New Recipe button
    Then User already on New Recipe Page
    When User input "Burger Kepiting" as Recipe Title
    And Upload valid image file
    And Click on ingredient plus button
    And Input "Roti" as first ingredient name, "2" as first ingredient item, "potong" as first ingredient unit
    And Input "Burger" as second ingredient name, "1" as second ingredient item, "potong" as second ingredient unit
    And Click directions plus button
    And Input "Siapkan bahan" as first step
    And Input "Susun bahan sesuai selera" as second step
    And Checklist sell ingredients
    And Input "50000" as price
    And Click Submit button
    Then User still on New Recipe page

  @NewRecipePage @Cookit
  Scenario: Add new recipe with wrong type image
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "NaufalVerif1" as username and "Asdfg123" as password for new recipe page
    And User click login button
    Then User already on Home Page
    When User click on New Post button
    And User click on New Recipe button
    Then User already on New Recipe Page
    When User input "Burger Kepiting" as Recipe Title
    And User input "Burger Kepiting biasa" as Description
    And Upload invalid image file
    And Click on ingredient plus button
    And Input "Roti" as first ingredient name, "2" as first ingredient item, "potong" as first ingredient unit
    And Input "Burger" as second ingredient name, "1" as second ingredient item, "potong" as second ingredient unit
    And Click directions plus button
    And Input "Siapkan bahan" as first step
    And Input "Susun bahan sesuai selera" as second step
    And Checklist sell ingredients
    And Input "50000" as price
    And Click Submit button
    Then User still on New Recipe page

  @NewRecipePage @Cookit
  Scenario: Add new recipe with blank ingredient
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "NaufalVerif1" as username and "Asdfg123" as password for new recipe page
    And User click login button
    Then User already on Home Page
    When User click on New Post button
    And User click on New Recipe button
    Then User already on New Recipe Page
    When User input "Burger Kepiting" as Recipe Title
    And User input "Burger Kepiting biasa" as Description
    And Upload valid image file
    And Click directions plus button
    And Input "Siapkan bahan" as first step
    And Input "Susun bahan sesuai selera" as second step
    And Checklist sell ingredients
    And Input "50000" as price
    And Click Submit button
    Then User still on New Recipe page

  @NewRecipePage @Cookit
  Scenario: Add new recipe with blank step
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "NaufalVerif1" as username and "Asdfg123" as password for new recipe page
    And User click login button
    Then User already on Home Page
    When User click on New Post button
    And User click on New Recipe button
    Then User already on New Recipe Page
    When User input "Burger Kepiting" as Recipe Title
    And User input "Burger Kepiting biasa" as Description
    And Upload valid image file
    And Click on ingredient plus button
    And Input "Roti" as first ingredient name, "2" as first ingredient item, "potong" as first ingredient unit
    And Input "Burger" as second ingredient name, "1" as second ingredient item, "potong" as second ingredient unit
    And Checklist sell ingredients
    And Input "50000" as price
    And Click Submit button
    Then User still on New Recipe page

  @NewRecipePage @Cookit
  Scenario: Add new recipe with blank price
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "NaufalVerif1" as username and "Asdfg123" as password for new recipe page
    And User click login button
    Then User already on Home Page
    When User click on New Post button
    And User click on New Recipe button
    Then User already on New Recipe Page
    When User input "Burger Kepiting" as Recipe Title
    And User input "Burger Kepiting biasa" as Description
    And Upload valid image file
    And Click on ingredient plus button
    And Input "Roti" as first ingredient name, "2" as first ingredient item, "potong" as first ingredient unit
    And Input "Burger" as second ingredient name, "1" as second ingredient item, "potong" as second ingredient unit
    And Click directions plus button
    And Input "Siapkan bahan" as first step
    And Input "Susun bahan sesuai selera" as second step
    And Checklist sell ingredients
    And Clear price input
    And Click Submit button
    Then User still on New Recipe page