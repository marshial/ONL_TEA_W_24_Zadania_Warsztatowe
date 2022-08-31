Feature: Create new address

  Scenario Outline: Add new address to user account

    Given User is on the "https://mystore-testlab.coderslab.pl/" website
    When User clicks on sign in button
    And User logs in
    And User clicks on Addresses button
    And User clicks on Create new address button
    And User fills in fields: "<alias>", "<address>", "<city>", "<postalCode>", "<phone>" and clicks in Save button
    Then New address is added and address is correct
    Examples:
      | alias     | address            | city     | postalCode | phone        |
      | Mariuszek | ul. Poznanska 4    | Wroclaw  | 50-019     | +48321321321 |
      | Seba      | ul. Litweska 3     | Poznan   | 69-666     | +48456456456 |
      | Karol     | ul. Krakowska 14/5 | WadoVice | 02-137     | +48420420420 |

