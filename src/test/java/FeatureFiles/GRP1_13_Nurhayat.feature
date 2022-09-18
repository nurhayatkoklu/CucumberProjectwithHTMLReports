Feature: Nationalities Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline: Create Nationality
    And Click on the element in the Left Nav
      | setupOne      |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <NameInput> |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

    Examples:
      | NameInput |
      | Marsian   |


  Scenario Outline: Edit Nationality

    And Click on the element in the Left Nav
      | setupOne      |
      | parameters    |
      | nationalities |

    And User sending the keys in Dialog Content
      | searchInput | <SearchInput> |

    And Click on the element in Dialog Content
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog Content

      | nameInput | <NameInput> |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

    Examples:
      | SearchInput | NameInput     |
      | Marsian     | Black Marsian |


  Scenario Outline: Delete Nationality
    And Click on the element in the Left Nav
      | setupOne      |
      | parameters    |
      | nationalities |

    And User sending the keys in Dialog Content
      | searchInput | <SearchInput> |

    And Click on the element in Dialog Content
      | searchButton       |
      | deleteButton       |
      | deleteDialogButton |

    Then Success message should be displayed

    Examples:
      | SearchInput |
      | Marsian     |
