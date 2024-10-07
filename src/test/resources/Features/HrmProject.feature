Feature: Login Functionality
  Background:
    Given user open url


  @login
  Scenario: Verify Login Functionality
    When user given user name
    And user given password
    Then user click login button

  @systemUser
  Scenario: Add User Functionality
    When user click on admin menu
    And user click on add menu
    And user select role
    And user select status
    And user set employee name
    And user set username
    And user set password
    Then user click on save button