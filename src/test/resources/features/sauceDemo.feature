Feature: sauceDemo Purchase Flow

  Scenario Outline: Login and place an order Test1

    Given User successfully enters the login credentials username "<username>" and password "<password>"
    When User adds items to cart and checkout
    And User proceeds to fills information firstname "<firstname>" and lastname "<lastname>" and postalcode "<postalcode>" and continue
    Then User should see order confirmation message "THANK YOU FOR YOUR ORDER"
    Examples:
      | username      | password     |firstname|lastname|postalcode|
      | standard_user | secret_sauce |kalyan    |kumar  |76262     |


  Scenario Outline: Login and place an order Test2

    Given User successfully enters the login credentials username "<username>" and password "<password>"
    When User adds items to cart and checkout
    And User proceeds to fills information firstname "<firstname>" and lastname "<lastname>" and postalcode "<postalcode>" and continue
    Then User should see order confirmation message "THANK YOU FOR YOUR ORDER"
    Examples:
      | username      | password     |firstname|lastname|postalcode|
      | standard_user | secret_sauce |john     |paul    |75063     |

  Scenario Outline: Login and place an order Test3

    Given User successfully enters the login credentials username "<username>" and password "<password>"
    When User adds items to cart and checkout
    And User proceeds to fills information firstname "<firstname>" and lastname "<lastname>" and postalcode "<postalcode>" and continue
    Then User should see order confirmation message "THANK YOU FOR YOUR ORDER"
    Examples:
      | username      | password     |firstname|lastname|postalcode|
      | standard_user | secret_sauce |chapel   |denni   |75458     |

  Scenario Outline: Login and place an order Test4

    Given User successfully enters the login credentials username "<username>" and password "<password>"
    When User adds items to cart and checkout
    And User proceeds to fills information firstname "<firstname>" and lastname "<lastname>" and postalcode "<postalcode>" and continue
    Then User should see order confirmation message "THANK YOU FOR YOUR ORDER"
    Examples:
      | username      | password     |firstname|lastname|postalcode|
      | standard_user | secret_sauce |tonye    |kishu   |78954     |

  Scenario Outline: Login and place an order Test5

    Given User successfully enters the login credentials username "<username>" and password "<password>"
    When User adds items to cart and checkout
    And User proceeds to fills information firstname "<firstname>" and lastname "<lastname>" and postalcode "<postalcode>" and continue
    Then User should see order confirmation message "THANK YOU FOR YOUR ORDER"
    Examples:
      | username      | password     |firstname|lastname|postalcode|
      | standard_user | secret_sauce |ragav    |naveen  |65487     |