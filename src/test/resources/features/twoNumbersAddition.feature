Feature: two numbers addition
  As a user of calculator
  I want to add and see the results of the twoo nubers addition
  So that I want to make sure that the calculations are correct

  Scenario: check add two numbers
    Given user has number on as 10
    And user has number two as 20
    When user adds number one and number two
    Then the result is 10
