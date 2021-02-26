Feature: Snapdeal Application

  Scenario: Check for the user is able to add the product to the cart
    Given User is able to access the url of the application
    When user clicks on signin option
    Then user is able to enter valid "bammidirenuka06@gmail.com" and "team03"
    Then user selects a product
    Then user adds the product to the cart
    And user checks for the added product in the cart option
