Feature: Snapdeal Application

Scenario: Check for adding the product to shortlist
  Given user able to access the url of te application
  When user clicks on sign in option
  Then user signin with valid username and password
  | bammidirenuka06@gmail.com | team03 |
  And clicks on start shopping
  And user add the product to the shortlist
  Then user should be able to see the product in the wishlist
