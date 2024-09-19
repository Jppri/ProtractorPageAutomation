Feature: User Registration
  As a user
  I want to register into the system
  So that I can create an account

  Background:
    Given I am on the registration page

  Scenario: Successful Registration with valid credentials
    Given I enter a valid name
    And I enter a valid email
    And I enter a valid password
    And I click the checkout box
    And I selected my gender
    And I choose my employment status
    And I enter my date of birth
    When I click on the submit button
    Then I should see my name in the two way data binding example
    And I should see a welcome message
    And The browser should quit
