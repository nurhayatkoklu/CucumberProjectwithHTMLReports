Feature: BankAccount Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Add bankAccount
    And Click on the element in the Left Nav
      | setupOne |
      | parameters |
      | bankAccount |
    And Click on the element in Dialog Content
      | addButton|
    And User sending the keys in Dialog Content
      | nameInput | Kadirovi|
      | IBAN      | TR5889 4388 3483 4184|
      | bankCode |  05|
    And Click on the element in Dialog Content
      | currency|
      | TRY     |
      | saveButton|

    Then Success message should be displayed


  Scenario: Edit bankAccount
    And Click on the element in the Left Nav
      | setupOne |
      | parameters |
      | bankAccount |
    And User sending the keys in Dialog Content
      | bankSearch| Kadirovi|
    And Click on the element in Dialog Content
      | searchButton|
      | editButton|
    And User sending the keys in Dialog Content
      | nameInputBank | Kadirovic|
      | IBAN      | TR5889 4388 3483 4983|
      | bankCode |  09|
    And Click on the element in Dialog Content
      | saveButton|

    Then Success message should be displayed


  Scenario: Delete bankAccount
    And Click on the element in the Left Nav
      | setupOne |
      | parameters |
      | bankAccount |
    And User sending the keys in Dialog Content
      | bankSearch| Kadirovic|
    And Click on the element in Dialog Content
      | searchButton|
      | deleteButton|
      | deleteDialogButton|

    Then Success message should be displayed