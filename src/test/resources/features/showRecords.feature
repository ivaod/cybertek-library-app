Feature: Default value


    Background: User is on login page
    Given I am on the login page
    When I enter username "librarian11@library"
    And I enter password "I61FFPPf"
    And click the sign button
    Then dashboard should be displayed


  @default
  Scenario: Verify default value in Users page
    When I click on "Users" link
    Then show records default value should be 10
    And show records should have following options:
    |5|
    |10|
    |15|
    |50|
    |100|
    |200|
    |500|