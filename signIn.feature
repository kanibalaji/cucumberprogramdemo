Feature: Bookcart application demo

  Scenario: Login should be success
    Given User should navigate the application
    And User clicks on the login link
    And User enters the username as Kanimozhi
    And User enters the password as MahiRitu2818
    When User click on the login button
    Then login should be success
