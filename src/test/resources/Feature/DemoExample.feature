Feature: Validate the Automation Demo Site

  Scenario: To add the customer details
    Given User is on demo telecom site
    When User enter to add customer
    And Fill all the details in that page
    And Click the submit button
    Then User getting the custumer code

