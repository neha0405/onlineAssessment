Feature: Fiserv Coding Assessment

  Scenario Outline: Validate Searched text on Search Engine
    Given User is on Search Engine "<searchEngine>"
    When User Search for text "<searchText>" on Search Engine "<searchEngine>"
    Then User should be able to validate the result with search text "<searchText>" on Search Engine "<searchEngine>"
    Examples:
      | searchEngine | searchText |
      | Google       | Java       |
      | Google       | Java1      |
#      | Bing         | Java       |
#      | Bing         | Java1      |
#      | yahoo        | Java       |
#      | yahoo        | Java1      |