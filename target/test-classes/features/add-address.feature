Feature: User add new address

  Scenario Outline: User can add new address
    Given User is logged in https://prod-kurs.coderslab.pl on User Page
    When User goes to address page
    And User goes to create new address link
    And User input information <alias>, <address>, <city>, <postcode>, <country> and <phone>
    And User saves information
    Then User sees "Address successfully added!"
    And User check address information <alias>, <address>, <city>, <postcode>, <country> and <phone>
    And Close shop page

    Examples:
      | alias        | address         | city | postcode | country        | phone     |
      | Main Address | ul.Orzeszkowa 9 | Pcim | 32-432   | United Kingdom | 566456654 |
