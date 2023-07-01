Feature: Follow back user and Unfollow User

#  Follow Back
  @FollowerFollowing
  Scenario: User follow back another user
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalverif1" as username and "Asdfg123" as password for follower page
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click on Profile list menu
    Then User already on profile page
    When User click on Followers text
    Then User already on Followers page
    When User click on Follow Back button
    And Refresh page
    Then Follow Back button text should change to Friend


#    Unfollow
  @FollowerFollowing
  Scenario: Unfollow user
    Given User already on Cookit landing page
    When User click on Sign In button
    Then User already on login page
    When User input "naufalverif1" as username and "Asdfg123" as password for follower page
    And User click login button
    Then User already on Home Page
    When User click on Profile menu
    And User click on Profile list menu
    Then User already on profile page
    When User click on Following text
    Then User already on Following page
    When User click on Unfollow button
    And Refresh page
    Then List of user following is empty