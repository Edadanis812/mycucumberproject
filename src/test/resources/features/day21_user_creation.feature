#HOMEWORK
@user_creation
Feature: Creating new user feature

  Scenario Outline: login_with_admin_credentials
    Given user is on the login page
    And user clicks on login dropdown
    And user clicks on sign in button
    And user sends username "<username>"
    And user sends password "<password>"
    And user clicks on the login button
    And verify the login is successful

    Examples: credential
      |username|password |
      |CWoburn |Cw192837?|
  Scenario Outline: creating new user
    Given user clicks on the administration
    And user clicks on the user management
    And user clicks on create a new user button
    And user provides login as "<login>"
    And user enters firstname as "<name>"
    And user enters lastname as "<lastname>"
    And user provides email address "<email>"
    And user selects language as "<language>"
    And user selects profile on dropdown "<profiles>"
    And user clicks on save button
    Then verify the new user creation is successful

    Examples:
      |login|name|lastname|email             |language|profiles    |
      |eaday|emre|aday    |adayemre@gmail.com|English |ROLE_MANAGER|