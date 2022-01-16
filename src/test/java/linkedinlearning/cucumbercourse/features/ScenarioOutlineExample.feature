Feature: Final Bill Calculation
  @ScenarioOutlineExample
  Scenario Outline: Customer Bill Amount Calculation
    Given I have a Customer
    And user enters initial bill amount as <InitialBillAmount>
    And sales tax rate is <TaxRate> percent
    Then final bill amount calculated is <CalculatedBillAmount>
    Examples:
    |InitialBillAmount   |TaxRate  |CalculatedBillAmount|
    |100.00              |1.10     |110                 |
    |200.00              |1.08     |216                 |
    |100.00              |1.0155   |101.55              |