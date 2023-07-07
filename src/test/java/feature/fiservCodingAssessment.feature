Feature: Fiserv Coding Assessment

  @Google
  Scenario Outline: Validate Searched text on Search Engine-Google
    Given User is on Search Engine "<searchEngine>"
    When User Search for text "<searchText>" on Search Engine Google
    Then User should be able to validate the result with search text "<searchText>" on Search Engine Google
    Examples:
      | searchEngine | searchText |
      | Google       | Java       |


  @Bing
  Scenario Outline: Validate Searched text on Search Engine-Bing
    Given User is on Search Engine "<searchEngine>"
    When User Search for text "<searchText>" on Search Engine Bing
    Then User should be able to validate the result with search text "<searchText>" on Bing
    Examples:
      | searchEngine | searchText |
      | Bing         | Java       |


  @Yahoo
  Scenario Outline: Validate Searched text on Search Engine-Yahoo
    Given User is on Search Engine "<searchEngine>"
    When User Search for text "<searchText>" on Search Engine Yahoo
    Then User should be able to validate the result with search text "<searchText>" on Yahoo
    Examples:
      | searchEngine | searchText |
      | Yahoo        | Java       |
