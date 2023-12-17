Feature:Delete users information from the pet store website

  Scenario Outline: Get users information
    Given the user add the username of the account that want be deleted
    When  the user submits the searched information about the account he wants to delete "<username>"
    And   verify the api status code and the user is deleted successfully


    Examples:
      | username    |
      | Ahmaaad97xx |
      | Samehh98z1  |
      | zaherrr9292 |
      | Saraaah88   |