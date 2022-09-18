Feature: Positions Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully



  Scenario: Add new Position
    And Click on the element in the Left Nav
      | humanResources |
      | setupThree     |
      | positions      |
    And Click on the element in Dialog Content
      | addButton |
    And User sending the keys in Dialog Content
      | nameInput | Emrah   |
      | shortName | test123 |
    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed


  Scenario: Edit Exist Position
    And Click on the element in the Left Nav
      | humanResources |
      | setupThree     |
      | positions      |
    And User sending the keys in Dialog Content
      | nameSearch | Emrah |
    And Click on the element in Dialog Content
      | searchButton |
      | editButton   |
    And User sending the keys in Dialog Content
      | nameInput | Emrah1   |
      | shortName | test1234 |
    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed


  Scenario: Delete Exist Position
    And Click on the element in the Left Nav
      | humanResources |
      | setupThree     |
      | positions      |
    And User sending the keys in Dialog Content
      | nameSearch | Emrah1 |
    And Click on the element in Dialog Content
      | searchButton       |
      | deleteButton       |
      | deleteDialogButton |

    Then Success message should be displayed




