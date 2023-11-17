@Smoketest
Feature: Limeroad Order
Scenario: To Click shop men

 When User launch the url "https://www.limeroad.com/"
 And User clicks on Shop men
 And User clicks on men module
 And User select on T-shirts submodule
 And User clicks on selected T-shirt
 And User select on size 
 Then User clicks on Add to cart button
 And User close the browser

 