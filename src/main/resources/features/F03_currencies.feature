@smoke
Feature: testing currency

  Scenario: user could select euro currency
    When user select euro option
    Then euro symbol is displayed on all products



    Scenario Outline: test
      Given test this value <"productName">
      Examples:
      |productName|
      |book       |
      |shoes      |