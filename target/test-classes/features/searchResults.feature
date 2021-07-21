Feature: Search results


  @regression
  Scenario: Table columns names
    Given I am on the login page

    And I click on "Users" link
    Then table should have following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |