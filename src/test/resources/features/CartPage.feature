Feature: Cart Page

  @Cookit
  Scenario: User checkout item
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User click cart icon button
    Then User already on cart page
    And List of added item will appear
    When user click on checkbox on selected item
    Then User verify total price
    And User click checkout button
    And User already on payment page

  @Cookit
  Scenario: User checkout item to detail purchase page
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User click cart icon button
    Then User already on cart page
    And List of added item will appear
    When user click on checkbox on selected item
    Then User verify total price
    And User click checkout button
    And User already on payment page
    When User click on choosen delivery option
    Then User click on choosen payment method
    And User click place order button
    And Password confirmation pop-up will appear
    And User input "Asdfg123" as confirm password
    And User click confirm button
    And User already on Detail Purchase page

  @CartPage @Cookit
  Scenario: User pay for placed order
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "userverif1" as username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    And User click cart icon button
    Then User already on cart page
    And List of added item will appear
    When user click on checkbox on selected item
    Then User verify total price
    And User click checkout button
    And User already on payment page
    When User click on choosen delivery option
    Then User click on choosen payment method
    And User click place order button
    And Password confirmation pop-up will appear
    And User input "Asdfg123" as confirm password
    And User click confirm button
    And User already on Detail Purchase page
    And User copy the virtual account number that displayed on detail purchased page
    When User go to midtrans page for payment
    And User input the Virtual Account Number to virtual account number field on midtrans page
    And User click on inquire button on midtrans page
    And User already on inquiry page on midtrans
    When User click pay on inquiry page on midtrans
    Then Payment Success message will appear
    And User go back to detail purchase page on cookit
    And User click back button
    And User already on my purchase page
    When User click on shipped tab
    And list of paid item will appear