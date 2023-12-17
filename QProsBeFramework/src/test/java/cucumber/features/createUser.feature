Feature: Create new users on the pet store website

  Scenario Outline: Create users
    Given the user add his information with <id> , "<username>" , "<firstname>" , "<lastname>" , "<email>" , "<phone>"
    When the user submits the information
    Then verify that the user is created with the correct information <id> , "<username>" , "<email>"


    Examples:
      | id  | username | firstname | lastname | email               | phone      |
      | 123 | Ahmad12x | Ahmad     | Khaled   | aKhaled@gmail.com   | 0745684535 |
      | 245 | Sameh43z | Sameh     | Mohammad | sMohammad@gmail.com | 0786548632 |
      | 978 | Zahergg  | Zaher     | Fathi    | zFathi@gmail.com    | 0795456453 |
      | 346 | Sarah123 | Sarah     | Sameer   | sSammer@gmail.com   | 0864534895 |





