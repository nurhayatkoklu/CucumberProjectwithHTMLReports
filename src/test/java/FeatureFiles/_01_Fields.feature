Feature: Fields Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully



  Scenario Outline: Create Fields

    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | fields     |

    And Click on the element in Dialog Content
      | fieldsAddButton |

    And User sending the keys in Dialog Content
      | nameInput       | <nameInput>       |
      | integrationCode | <integrationCode> |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

    Examples:
      | nameInput     | integrationCode |
      | Stevee Jobsss | CEO11           |


    Scenario Outline: Edit Fields
    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |

    And Scroll down the Left Nav

    And Click on the element in Dialog Content

      | fields     |

    And User sending the keys in Dialog Content
      | fieldSearch | <fieldSearch> |

    And Click on the element in Dialog Content
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog Content
      | nameInput       | <nameInput>       |
      | integrationCode | <integrationCode> |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed
    Examples:
      | fieldSearch | nameInput        | integrationCode |
      | Stevee      | Stevee Jobsss111 | CEO1231         |


  Scenario Outline: Delete Fields

    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | fields     |

    And User sending the keys in Dialog Content
      | fieldSearch | <fieldSearch> |

    And Click on the element in Dialog Content
      | searchButton       |
      | deleteButton       |
      | deleteDialogButton |

    Then Success message should be displayed

    Examples:
      | fieldSearch |
      | Jobsss111   |

