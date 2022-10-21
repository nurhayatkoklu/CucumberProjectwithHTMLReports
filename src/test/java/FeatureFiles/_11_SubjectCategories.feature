Feature: Subject Categories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline: Create Subject Categories
    And Click on the element in the Left Nav
      | education         |
      | setupFour         |
      | subjectCategories |

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content

      | nameInput | <NameInput> |
      | code      | <Code>      |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

    Examples:
      | NameInput | Code      |
      | oguz1256  | grup14316 |


  Scenario Outline: Edit Subject Categories
    And Click on the element in the Left Nav
      | education         |
      | setupFour         |
      | subjectCategories |

    And User sending the keys in Dialog Content
      | fieldSearch | <fieldSearch> |

    And Click on the element in Dialog Content
      | searchButton |
      | editButton   |
    And User sending the keys in Dialog Content

      | nameInput | <NameInput> |
      | code      | <Code>      |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed


    Examples:
      | fieldSearch | NameInput | Code        |
      | oguz1256    | oguzh4337 | grups12ffaj |


  Scenario Outline: Delete Subject Categories
    And Click on the element in the Left Nav
      | education         |
      | setupFour         |
      | subjectCategories |

    And User sending the keys in Dialog Content
      | nameSearch | <nameSearch> |

    And Click on the element in Dialog Content
      | searchButton       |
      | deleteFieldButton  |
      | deleteDialogButton |
    Then Success message should be displayed

    Examples:
      | nameSearch |
      | oguzh4337  |