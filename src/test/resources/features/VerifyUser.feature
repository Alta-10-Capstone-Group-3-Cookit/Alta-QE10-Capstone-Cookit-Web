Feature: Verify user

  @VerifyUser
  Scenario: Admin verify user on Verify User page
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin" as username and "admin" as password for verify user page
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click on verify users menu
    Then User already on Verify Users page
    When User click checklist button on first user
    Then First user that already verified should not be displayed