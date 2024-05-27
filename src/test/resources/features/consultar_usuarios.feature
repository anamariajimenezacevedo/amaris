Feature: list all users information
  I as a app need to list all users because i need show your information

  Scenario: list all users
    When he list all users
    Then response status code is 200
    And all 20 the expected users should be returned
