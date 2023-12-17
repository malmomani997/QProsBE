Feature: update users information on the pet store website

  Scenario Outline: update users information
    Given the user add his information with "<updatedUsername>" , "<firstname>" , "<phone>"
    When  the user submits the searched information "<username>" thats needed to be updated
    Then  verify that the returned information matches the user you searched for "<updatedUsername>" , "<firstname>" , "<phone>"


    Examples:
      | updatedUsername | firstname | phone      | username |
      | Ahmaaad97xx     | Ahmed     | 0798346345 | Ahmad12x |
      | Samehh98z1      | Sammehh   | 0999834555 | Sameh43z |
      | zaherrr9292     | Zaheeerr  | 0345666344 | Zahergg  |
      | Saraaah88       | Saraaa    | 0734636535 | Sarah123 |


