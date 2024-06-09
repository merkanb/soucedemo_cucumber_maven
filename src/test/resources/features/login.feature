Feature: Login and E2E Test

  @wip
  Scenario: E2E Test
    Given The user is on the login page
    When  The user enters "standard_user" and "secret_sauce"
    Then  The user should be able to login
    And   The user sorts the products "Price (high to low)"
    And   The user adds cheapest "Sauce Labs Onesie" and second costliest "Sauce Labs Backpack" products
    And   The user opens basket
    And   The user clicks checkout
    And   The user enters details "Mike" "Anderson" "HA27BT" and finish the purchase
    Then  The user verify that price is "Total: $41.02"

    And   The user finishes the purchase
    Then  The user verify that checkout complete header is "Thank you for your order!"
#    Then The user write a new step
#    Then The user write another





