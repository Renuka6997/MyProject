#Author:
Feature: Snapdeal Application 

  Background:    
    Given User should be able to access the url of the application 
    When user moves to the signin button  
    Then user is able to login with valid credentials 

  @Test1  
  Scenario: Check for the user is able to add the address in profile 
    When user clicks on orders option and click on saved addresses
    Then user clicks on add address 
    And user fill the details and check for address on current page
    Then user signs out from the application

  @Test2
  Scenario: Check for the user is able to purchase the product using existing address
    When user selects a product from home page
    Then user clicks on buy now option
    And user clicks on proceed to pay button
    Then user fills card details and clicks on pay option
