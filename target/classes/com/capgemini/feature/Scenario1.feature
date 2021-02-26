#Author: Renuka B
Feature: Snapdeal Application 

#Keywords
#Feature: Title of the Scenario
#Scenario:list of steps.
#Given: To define precondition step
#When: key actions to be performed
#Then: To observe outcomes
#And:To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: data to be sent
#@ (Tags/Labels):To group Scenarios

  @Tag1 
  Scenario Outline: Check for the user is able to signin with valid email and number 
    Given user is able to access the url of the application 
    When user clicks on signin option 
    Then user login with valid "<usernames>" and "<passwords>" 
    And user enters to the home page of the application 
    Then user log out from the application 

    Examples:    
      | usernames                 | passwords |
      |                9849317893 | team03    |
      | bammidirenuka06@gmail.com | team03    |
      
  @Tag2
  Scenario: Check the user able to add the product to cart from shortlist 
    Given user access the url
    When user clicks on signin button
    Then user login with valid username and password
      | bammidirenuka06@gmail.com | team03 |  
    And user clicks on shortlist from profile
    And user clicks on start shopping and selects a product
    And user clicks on add to cart and check for the product
    Then user logs out from application

  @Tag3
  Scenario: Check for the user able to purchase the product from shortlist
    Given user enters with the url
    When user clicks on signin
    And user login with valid credentials
    And user clicks on shortlist
    And user clicks on start and select a product
    And user clicks on buy now
    And user fill the details and save
    Then user clicks on proceed to pay
