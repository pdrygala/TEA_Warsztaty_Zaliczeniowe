Feature: User can order  item from shop

  Scenario Outline: User make order in online shop.
    Given User is logged in to https://prod-kurs.coderslab.pl
    When User click on item <item>
    And User check discount equals 20%
    And User choose size as <size>
    And User choose quantity as <quantity>
    And Add item do cart
    And User goes to checkout
    And User confirm address
    And User choose shipping method as Pick up in-store
    And User choose payment method as Pay by Check
    And User click on button Order with an obligation to pay
    Then User makes screenshot with order and price
    And Close browser

    Examples:
      | item                        | size | quantity |
      | Hummingbird printed sweater | M    | 5        |