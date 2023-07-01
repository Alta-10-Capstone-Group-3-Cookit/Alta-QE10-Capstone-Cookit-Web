Feature: Edit profile and request verified

  @EditProfile
  Scenario: Edit user profile with all input fields and image are filled with valid value
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input registered username and "Asdfg123" as password
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click on Profile list menu
    Then User already on profile page
    When User click on edit profile icon
    Then User already on Edit Profile page
    When User input "Hello World" as Bio, and "Asdfg123" as current password, and "Asdfg123" as new and confirm new password, and upload valid profile image
    And Click save button
    Then Error message alert should not be displayed


  @EditProfile
  Scenario: User send request to be verified by admin
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input registered username and "Asdfg123" as password for edit profile page
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click on Profile list menu
    Then User already on profile page
    When User click on edit profile icon
    Then User already on Edit Profile page
    When User click on Request button
    Then Error message alert should not be displayed