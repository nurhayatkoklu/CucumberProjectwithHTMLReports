Feature: Grade Levels Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline: Create Grade Level
    And Click on the element in the Left Nav
      | setupOne    |
      | parameters  |
      | gradeLevels |

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content

      | nameInput | <NameInput> |
      | shortName | <ShortName> |
      | order     | <Order>     |

    And Click on the element in Dialog Content
      | nextGrade   |
      | <NextGrade> |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

    Examples:
      | NameInput | ShortName | Order | NextGrade |
      | Ciaro     | CRO       | 15    | none      |


  Scenario Outline: Edit Grade Level

    And Click on the element in the Left Nav
      | setupOne    |
      | parameters  |
      | gradeLevels |

    And Click on the element in Dialog Content
      | editCiaro |

    And User sending the keys in Dialog Content

      | nameInput | <NameInput> |
      | shortName | <ShortName> |
      | order     | <Order>     |

    And Click on the element in Dialog Content
      | nextGrade   |
      | <NextGrade> |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

    Examples:
      | NameInput | ShortName | Order | NextGrade |
      | Ciaro3    | CRO3      | 12    | none      |


  Scenario: Delete Grade Level
    And Click on the element in the Left Nav
      | setupOne    |
      | parameters  |
      | gradeLevels |

    And Click on the element in Dialog Content
      | deleteCiaro        |
      | deleteDialogButton |

    Then Success message should be displayed


