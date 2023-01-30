Feature: Registration
  Desc

  @registration
  Scenario: Validate registration with valid data
    Given I'm on open homepage "http://www.next.co.uk"
    When I click my account link on header
    And I click register now button
    And I provide data for registration
    |Mr|George|Lynn|georgeLynn@sample.com|georgelynn1$|24 06 90|
    When I click register button
    Then I should get registered successfully


    Scenario Outline: Validate Registration

      Given I'm on open homepage "http://www.next.co.uk"
      When I click my account link on header
      And I click register now button
      And I provide data for registration "<Title>", "<Firstname>", "<Lastname>"
      When I click register button
      Then I should get registered successfully

      Examples:
      |Title|Firstname|Lastname|
      |Mr|George|Lynn|
      |Mr|Smith|Edwards|
