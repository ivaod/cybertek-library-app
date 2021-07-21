Feature: Login
  As a user, I should be able to login

  #Background: User is on login page
    #Given I am on the login page

@login

  Scenario: Login as librarian 1
    Given I am on the login page
    When I enter username "librarian11@library"
    And I enter password "I61FFPPf"
    And click the sign button
    Then dashboard should be displayed
    And there should be "5570" users

 # Scenario: Login as librarian 12
   # Given I am on the login page
  #  When I enter username "librarian12@library"
   # And I enter password "AOYKYTMJ"
   # And click the sign button
   # Then dashboard should be displayed


    #numbercan be whatever you have there

 # Scenario: Login as a Librarian same line
  #  Given I am on the login page
   # When I login using "librarian12@library" and "AOYKYTMJ"
   # Then dashboard should be displayed
   # And there should "5570" "Users"


  Scenario Outline: Login functionality
    Given I am on the login page
    When User types "<emailBox>" in the box

    Then User enters "<passwordBox>" in the box
    Then account holder name should be"<name>"
    And click the sign button

   # Examples:
    #  | emailBox            | passwordBox |
      #| librarian11@library | I61FFPPf    |
      #| librarian12@library | AOYKYTMJ    |
      #| librarian13@library | 9rf6axdD    |

    Examples:
      | emailBox          | passwordBox | name            |
      | student27@library | kkMksO2i    | Test Student 27 |
      | student28@library | 19Ceq2sT    | Test Student 28 |
      | student29@library | WyIUNpDI    | Test Student 29 |
      | student30@library | IaT9YI0I    | Test Student 30 |

    Examples:
      | emailBox            | passwordBox | name              |
      | librarian13@library | 9rf6axdD    | Test Librarian 13 |
      | librarian14@library | 87x8afWY    | Test Librarian 14 |
      | librarian15@library | S5Ejblg1    | Test Librarian 15 |
      | librarian16@library | 8BzUhhaU    | Test Librarian 16 |
      | librarian17@library | tXqOoIOS    | Test Librarian 17 |
      | librarian18@library | rKG2sP88    | Test Librarian 18 |
      | librarian19@library | 6M0J2Wr7    | Test Librarian 19 |
      | librarian20@library | XXJTMgzA    | Test Librarian 20 |
      | librarian21@library | aZ849tSZ    | Test Librarian 21 |
      | librarian22@library | bJRnAAyp    | Test Librarian 22 |
      | student31@library   | yOPdSR0u    | Test Student 31   |
      | student32@library   | GYLemAba    | Test Student 32   |
      | student33@library   | a1aI3VDj    | Test Student 33   |
      | student34@library   | eEQDhR9C    | Test Student 34   |
      | student35@library   | TNb5zpGn    | Test Student 35   |
      | student36@library   | qR3brbb1    | Test Student 36   |
      | student37@library   | GpaUyXJQ    | Test Student 37   |
      | student38@library   | r3sqckHs    | Test Student 38   |
      | student39@library   | GCTOZ0Yk    | Test Student 39   |
      | student40@library   | sK7ctVOS    | Test Student 40   |
      | student41@library   | MhQEHwP8    | Test Student 41   |
      | student42@library   | zCm83mcJ    | Test Student 42   |
      | student43@library   | 7F1rV4W8    | Test Student 43   |
      | student44@library   | BIXPElK5    | Test Student 44   |