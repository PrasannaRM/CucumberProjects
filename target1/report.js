$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/TariffPlanEx.feature");
formatter.feature({
  "name": "User enter the Tariff plan in automation deom site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To add the Tariff Plan deatils",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User should be in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TariffDetail.user_should_be_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on add tariff plan page",
  "keyword": "And "
});
formatter.match({
  "location": "TariffDetail.user_click_on_add_tariff_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter all the details from tariff plan page",
  "keyword": "When "
});
formatter.match({
  "location": "TariffDetail.user_enter_all_the_details_from_tariff_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "TariffDetail.user_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User getting the message",
  "keyword": "Then "
});
formatter.match({
  "location": "TariffDetail.user_getting_the_message()"
});
formatter.result({
  "status": "passed"
});
});