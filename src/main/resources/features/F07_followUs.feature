@smoke
Feature: F07_followUs | user switches between tabs
  #First scenario
  Scenario: user opens facebook link
    When user clicks on facebook tab
    Then user is taken to facebook page


    #Second scenario
  Scenario: user opens twitter link
    When user clicks on twitter tab
    Then user is taken to twitter page

    #Third scenario
  Scenario: user opens rss link

    When user clicks on rss tab
    Then user is taken to rss page

    #Fourth scenario
  Scenario: user opens youtube link
    When user clicks on youtube tab
    Then user is taken to youtube page