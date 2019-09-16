Feature: User enter the Tariff plan in automation deom site

  @smoke
  Scenario: To add the Tariff Plan deatils
    Given User should be in home page
    And User click on add tariff plan page
    When User enter all the details from tariff plan page
    And user click the submit button
    Then User getting the message

  Scenario: To add the Tariff Plan deatils
    Given User should be in home page
    And User click on add tariff plan page
    When User enter all the detail from tariff plan page
      | 500 | 350 | 140 | 112 | 350 | 415 | 198 |
      | 300 | 400 | 310 | 100 | 156 | 156 | 138 |
    And user click the submit button
    Then User getting the message

  Scenario: To add the Tariff Plan deatils
    Given User should be in home page
    And User click on add tariff plan page
    When User enter all the detailss from tariff plan page
      | rent | mins | Inter | sms | local | inters | charge |
      |  500 |  350 |   140 | 112 |   350 |    415 |    198 |
      |  300 |  400 |   310 | 100 |   156 |    156 |    138 |
    And user click the submit button
    Then User getting the message

  Scenario Outline: To add the Tariff Plan deatils
    Given User should be in home page
    And User click on add tariff plan page
    When User enter all the detailss from tariff plan page "<rent>","<mins>","<Inter>","<sms>","<local>","<inters>","<charge>" 
    And user click the submit button
    Then User getting the message

    Examples: 
      | rent | mins | Inter | sms | local | inters | charge |
      |  500 |  350 |   140 | 112 |   350 |    415 |    198 |
      |  300 |  400 |   310 | 100 |   156 |    156 |    138 |
