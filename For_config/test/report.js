$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/Login5.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to application with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens url",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email and password",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on logout button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});