@FirstTest
Feature:Basic syntax
  #for single execution we can use scenario
  @testScenario1
  Scenario: Scenario 1
    Given user is on the TS site
    When the user clicks on About Us button
    Then the About Us page opens
    And close the browser

    #for multiple execution we can use scenario outline with Examples
  @testScenario2
  Scenario Outline: Scenario 2
    Given user is on the Login form page
    When the user enters <Username>" and "<Password>"
    And click on the submit button
    Then a confirmation message is shown
    And close the browser

    Examples:
      |Username | Password |
      |admin | password |
      |sahil | wrongPassword|