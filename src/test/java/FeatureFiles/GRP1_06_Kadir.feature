Feature: Location Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Add new Location
      And Click on the element in the Left Nav
      | setupOne |
      | schoolSetup|
      | locations |
      And Click on the element in Dialog Content
      | addButton|
      And User sending the keys in Dialog Content
      | nameInput | Georgeanaa|
      | shortName | GRGANAA   |
      | capacity  | 43  |
      And Click on the element in Dialog Content
      | saveButton |
      Then Success message should be displayed


  Scenario: Edit new Location

      And Click on the element in the Left Nav
      | setupOne |
      | schoolSetup |
      | locations |

      And Click on the element in Dialog Content
      |editButton|
      And User sending the keys in Dialog Content
      | nameInput | Micheallyy|
      | shortName | Michyuii  |
      | capacity  | 44     |
      And Click on the element in Dialog Content
      | saveButton |
    Then Success message should be displayed


  Scenario: Delete location
        And Click on the element in the Left Nav
          | setupOne |
          | schoolSetup |
          | locations |
        And Click on the element in Dialog Content
          | searchButton|
          | deleteButton|
          | deleteDialogButton|
    Then Success message should be displayed

