# Autor: Sergio
@stories
Feature: User creates a UTest account
  As a user, I would like to register on the Utest.com website.
  @scenario
  Scenario: Registering as a user on the Utest.com website
    Given that Sergio is on the UTest Home page
    When he enters all required registration fields
    | firstName | lastName | email                    | birthMonth | birthDay | birthYear | postalCode | password   | confirmPassword |
    | Sergio    | Suarez   | ssuarez99@hotmail.com  | March      | 5        | 1993      | 170001     | Aguasmzl03 | Aguasmzl03      |
    Then a UTest account is created
    | textRegisterSuccess                   |
    | First, please check your email inbox  |
