Feature: Checking game creation and working
  Scenario: Checking game field creation
    Given I have my game class
    When I create new game
    Then I have created field with size 4x4 and empty cells

  Scenario: Checking game field left move
    Given I have created field
    When I do move left
    Then Cells righter the zero cell move left and cells with equal nubers is merge together



