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
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable: https://www.limeroad.com/men-clothing?src_id\u003dnavdeskMen__1 has no size and location\n  (Session info: chrome\u003d119.0.6045.123)\nBuild info: version: \u00274.12.1\u0027, revision: \u00278e34639b11\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.7\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [e39ad7556d188b23b35ed5e1d5f0d5bf, actions {actions\u003d[org.openqa.selenium.interactions.Sequence@3ed34ef5]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 119.0.6045.123, chrome: {chromedriverVersion: 119.0.6045.105 (38c72552c5e..., userDataDir: C:\\Users\\Gayu\\AppData\\Local...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:51416}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:51416/devtoo..., se:cdpVersion: 119.0.6045.123, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: e39ad7556d188b23b35ed5e1d5f0d5bf\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:196)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:171)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:602)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:688)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:605)\r\n\tat com.Base_class.Methods.actions(Methods.java:64)\r\n\tat com.stepdef.Step_definition.user_clicks_on_men_module(Step_definition.java:27)\r\n\tat ✽.User clicks on men module(file:/C:/Users/Gayu/eclipse-workspace/Lime_Road/src/test/java/com/feature/lime.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User select on T-shirts submodule",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition.user_select_on_T_shirts_submodule()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select on size",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition.user_select_on_size()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Add to cart button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_clicks_on_Add_to_cart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});