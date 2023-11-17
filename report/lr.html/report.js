$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Gayu/eclipse-workspace/Lime_Road/src/test/java/com/feature/lime.feature");
formatter.feature({
  "name": "Limeroad Order",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoketest"
    }
  ]
});
formatter.scenario({
  "name": "To Click shop men",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "name": "User launch the url \"https://www.limeroad.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Step_definition.user_launch_the_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Shop men",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition.user_clicks_on_Shop_men()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on men module",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition.user_clicks_on_men_module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select on T-shirts submodule",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition.user_select_on_T_shirts_submodule()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on selected T-shirt",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition.user_select_on_clicks_on_selected_T_shirt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select on size",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition.user_select_on_size()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Add to cart button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_clicks_on_Add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition.user_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});