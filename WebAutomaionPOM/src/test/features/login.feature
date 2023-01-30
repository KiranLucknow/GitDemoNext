Feature: Login
  As a user
  I should login and use the portal

  Background:
    Given I'm on open homepage "http://www.next.co.uk"
    When I click my account link on header


  @JE-2 @smoke @regression
  Scenario: Validate login feature with valid credentials

    When I enter username "georgelynn@example.com"
    And I enter password "Lynn123@"
    And I click sign in button
    Then should login successfully and should be re-directed to account page with text as "Account Summary"

  @JE-2 @regression
  Scenario: Validate login feature with invalid credentials

    When I enter username "georgelynn123@example.com"
    And I enter password "Lynn12356@"
    And I click sign in button
    Then shouldn't  login successfully with text as "Sorry, we have been unable to sign you in."
    But I shouldn't get re-directed anywhere and stay on  login page


