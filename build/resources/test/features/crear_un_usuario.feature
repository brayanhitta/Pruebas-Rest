#Autor: Brayan Hitta

Feature: Create an user on Regres.in
  I wan to create an user

  Scenario: Creation an user
    When you create an user
      | name    | job  |
      | brandon | java |
    Then I shoul see the user created