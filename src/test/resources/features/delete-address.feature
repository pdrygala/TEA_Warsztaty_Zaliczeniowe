Feature: User delete address

  Scenario: User can delete address from its account
    Given User is logged to https://prod-kurs.coderslab.pl on UserPage
    When User goes to Addresses Page
    And User delete address with alias "Main Address"
    Then User sees alert "Address successfully deleted!"
    And Close page