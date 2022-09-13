Feature: Delivery
  AS QA Automation
  I want to buy a delivery in Wappi App
  To bring at home

  Background: Update user data
    Given the user is on the Wappi page
    When the user enter username and password
      | username   | password |
      | automation | 12345678 |

  Scenario: Make delivery
    When the user click on a product and on the request button
    Then the user confirm the orderTu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades

  Scenario: Make delivery with coupon
    When the user click on get coupon button
    And the user copy number coupon
    And the user go to the purchase
    Then the user confirm the orderTu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades

