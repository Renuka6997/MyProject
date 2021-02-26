Feature: Snapdeal Application

 Scenario: Check for removal of the product from shortlist
    Given user enters the url of application
    When user clicks on sign in button
    Then user signin with valid credentials
      | bammidirenuka06@gmail.com | team03 |
    Then user selects shortlist under user profile
    Then user removes the product