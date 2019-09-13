Feature: Validate the Automation Demo Site

  Scenario: To add the customer details
    Given User is on demo telecom site
    When User enter to add customer
    And Fill all the details in that page
    And Click the submit button
    Then User getting the custumer code

  @smoke
  Scenario: To add the customer details
    Given User is on demo telecom site
    When User enter to add customer
    And Fill all the details into that page
      | Hari | Haran | c@gmail.com | maduari | 98762310 |
    And Click the submit button
    Then User getting the custumer code

  Scenario: To add the customer details
    Given User is on demo telecom site
    When User enter to add customer
    And Fill all the detailss into that page
      | fname | Viswha      |
      | lname | Vijay       |
      | email | v@gmail.com |
      | addr  | Madurai     |
      | phone |  7418529630 |
    And Click the submit button
    Then User getting the custumer code
