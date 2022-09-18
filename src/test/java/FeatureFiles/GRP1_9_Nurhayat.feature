Feature: Discounts Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline: Create Discount
    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | discounts  |

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content

      | description     | <Description>     |
      | integrationCode | <IntegrationCode> |
      | priority        | <Priority>        |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

    Examples:
      | Description    | IntegrationCode | Priority |
      | Happy Birthday | HP              | 10       |

  Scenario Outline: Edit Discount

    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | discounts  |

    And User sending the keys in Dialog Content
      | descriptionSearch | <DescriptionSearch> |

    And Click on the element in Dialog Content
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog Content

      | description     | <Description>     |
      | integrationCode | <IntegrationCode> |
      | priority        | <Priority>        |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

    Examples:
      | Description            | IntegrationCode | Priority | DescriptionSearch |
      | Happy Birtday Discount | HPD             | 11       | Happy             |

  Scenario Outline: Delete Discount
    And Click on the element in the Left Nav
      | setupOne   |
      | parameters |
      | discounts  |

    And User sending the keys in Dialog Content
      | descriptionSearch | <DescriptionSearch> |

    And Click on the element in Dialog Content
      | searchButton       |
      | deleteButton       |
      | deleteDialogButton |

    Then Success message should be displayed

    Examples:
      | DescriptionSearch |
      | Happy             |
