Feature: Create Departments

  Background:
    Given I login as admin
    And I create an organization as org with
      | name    | Org 1                                                                                                                                  |
      | billing | [ companyName: 'Org 2 LTD', vatNumber: 'PT123456789', address: [ line1 : 'Street', city: 'City', country: 'PT', postalCode: '3000' ] ] |

  Scenario: Can change the name of a company
    When I update an organization with id ${org.id} with
      | name    | Updated Org 1  |
      | billing | ${org.billing} |
    Then the request succeeds
    And the response contains
      | name | Updated Org 1 |
