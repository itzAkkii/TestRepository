Feature: Login

  Scenario: Login to application with valid credentials
    Given User launch chrome browser
    When User opens url
    And User enters email and password
    And Click on login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on logout button
    Then Page title should be "Your store. Login"
    And close browser
