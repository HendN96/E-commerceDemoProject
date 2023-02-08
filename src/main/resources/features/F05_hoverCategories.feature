@smoke
  Feature: F05_hoverCategories | user will be able to hover on categories
    Scenario: user hovers
      When user hovers on main category
      And users clicks on sub-category
      Then verify page title