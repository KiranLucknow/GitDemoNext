
Feature: Header Links

  As a user
  I should get directed appropriately through header links

  @header
  Scenario Outline: Validate Header Links direction

    Given I'm on open homepage "http://www.next.co.uk"
    When I click on Header link "<headerLinks>"
    Then I should get re-directed appropriately to correspoding pages with title as "<landingPageTitle>"

    Examples:
      | headerLinks   | landingPageTitle                   |
      | My Account    | Sign In                            |
      | Help          | Next Help Information              |
      | Store Locator | Next: Official Site - Store Search |

