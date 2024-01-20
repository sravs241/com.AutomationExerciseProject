Feature: Register User Feature

Scenario: User Registration
    Given I want to Launch browser
    And Navigate to url
    And Verify that home page is visible successfully
    And  Click on 'Signup / Login' button
    And Verify 'New User Signup!' is visible
    When Enter name and email address
    Then Click 'Signup' button