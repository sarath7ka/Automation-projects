Feature: To Validate the functionality of amazon Application
 @Test001
  Scenario: To Log in the Amazon Application
    Given User launch Log In Page
    When User enter the valid email id or phone number
    And User enter the valid Password
    Then Navigate the Amazon Home Page