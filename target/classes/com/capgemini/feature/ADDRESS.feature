Feature: Snapdeal Application

  Scenario: User should be able to add the address
    Given user is able to access the url
    When user select sign in and clicks on the login button
    Then user enters valid credentials
    And user selects an option from profile
    And user clicks on saved addresses
    And user clicks on add address
    And user fills the details
      |            530012 | Renuka     |
      | 203, Murali Nagar | 8532596852 |
    Then user clicks on save button and able to see the saved address
