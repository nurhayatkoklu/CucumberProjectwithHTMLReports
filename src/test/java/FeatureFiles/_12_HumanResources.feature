Feature: Grade Levels Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline: Create Human Resources Setup
    And Click on the element in the Left Nav
      | humanResources |
      | setupThree     |
      | positions      |

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content

      | nameInput | <NameInput> |
      | shortName | <shortName> |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

    Examples:
      | NameInput | shortName |
      | menemen61 | domates61 |


  Scenario Outline: Edit Human Resources Setup
    And Click on the element in the Left Nav
      | humanResources |
      | setupThree     |
      | positions      |

    And User sending the keys in Dialog Content
      | fieldSearch | <fieldSearch> |

    And Click on the element in Dialog Content
      | searchButton |
      | editButton   |
    And User sending the keys in Dialog Content

      | nameInput | <NameInput> |
      | shortName      | <shortName> |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

    Examples:
      | fieldSearch | NameInput | shortName |
      | menemen61   | menemen32 | domates32 |


  Scenario Outline: Delete Human Resources Setup
    And Click on the element in the Left Nav
      | humanResources |
      | setupThree     |
      | positions      |

    And User sending the keys in Dialog Content
      | fieldSearch | <fieldSearch> |

    And Click on the element in Dialog Content
      | searchButton       |
      | deleteButton  |
      | deleteDialogButton |
    Then Success message should be displayed

    Examples:
      | fieldSearch |
      | menemen32   |