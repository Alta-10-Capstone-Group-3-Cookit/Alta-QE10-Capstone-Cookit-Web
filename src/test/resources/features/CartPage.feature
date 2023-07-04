Feature: Cart Page


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
    When User click on choosen delivery option
    Then User click on choosen payment method
    And User click place order button
    And Password confirmation pop-up will appear
    And User input "Asdfg123" as confirm password
    And User click confirm button
    And User already on Detail Purchase page

  @CartPage
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
    When User click on choosen delivery option
    Then User click on choosen payment method
    And User click place order button
    And Password confirmation pop-up will appear
    And User input "Asdfg123" as confirm password
    And User click confirm button
    And User already on Detail Purchase page
    And User copy the virtual account number that displayed on detail purchased page
    When User go to midtrans page for payment
#    Then User click on virtual account number field on midtrans page
#    And User paste the Virtual Account Number to virtual account number field on midtrans page
#    And User click on inquiry button on midtrans page
#    And User Redirected to inquiry page on midtrans
#    And User already on inquiry page on midtrans
#    And User verify amount to pay value same as order total value
#    When User click pay on inquiry page on midtrans
#    Then Payment Success message will appear
#    And User go back to detail purchase page on cookit
#    And User go back to home page
#    When User click on profile icon button
#    Then User click on my purchase button
#    And User redirected to my purchase page
#    And User already on my purchase page
#    When User click on shipped tab
#    Then User already on shipped tab on my purchase page
#    And list of paid item will appear