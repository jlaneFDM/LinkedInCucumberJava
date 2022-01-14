Feature: Menu Management
  Background: Set up a menu item
    Given I have a menu item with name "Chicken Sandwich" a description "description" and price 15
    When I add that menu item
    Then A menu item with the name "Chicken Sandwich" should be added
#each STEP in the BACKGROUND will run before each SCENARIO
  @SmokeTest
  Scenario: Add a menu item
    Given I have a menu item with name "Cucumber Sandwich" a description "description" and price 20
    When I add that menu item
    Then A menu item with the name "Cucumber Sandwich" should be added
    @RegularTest
    Scenario: Add another menu item
      Given I have a menu item with name "Cucumber Salad" a description "description" and price 15
      When I add that menu item
      Then A menu item with the name "Cucumber Salad" should be added
      @NightlyBuildTest @RegularTest
      Scenario: Add third menu item
        Given I have a menu item with name "Chicken Sandwich" a description "description" and price 15
        When I add that menu item
        Then I should see an error message with value "Duplicate item"
