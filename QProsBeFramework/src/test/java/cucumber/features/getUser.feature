Feature: Get users information from the pet store website

  Scenario Outline: Get users information
    Given the user add to look for it and get it
    When  the user submits the searched information "<username>"
    Then  verify that the returned information matches the user you searched for <id> , "<username>" , "<email>"



    Examples:
      | username | id  | email               |
      | Ahmad12x | 123 | aKhaled@gmail.com   |
      | Sameh43z | 245 | sMohammad@gmail.com |
      | Zahergg  | 978 | zFathi@gmail.com    |
      | Sarah123 | 346 | sSammer@gmail.com   |