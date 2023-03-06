Feature: as an user I should be able to see product name category, price, availablity, condition, brand
  Scenario:as an user I should be able to see product name category, price, availablity, condition, brand
    Given user is on the automation page
    When user clicks on products page and verify that homepage is visible
    And user clicks the first product
    Then user should see product name, category, price, availbility, condition and brand
