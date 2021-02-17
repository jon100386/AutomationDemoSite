#Autor: xxxxx

  @stories
  Feature: automation testing
    a user wishes to register on the Automation Demo Site platform

  @scenario1
  Scenario: Fill out the form for the respective registration
    Given brandon opens the website for registration
    When brandon fills out the form for the respective registration
    |firstName | lastName  | address | emailaddress      |  phone    |  languages | skills |  country   | selectcountry | yearbirth | monthbirth  | daybirth  | password  |
    |John     | Alvarez   | Calle 70| jonalv@gmail.com  | 3104500101| English   | Java   |  Colombia  | Australia  | 1986            | March       | 10        | Jonalv10+ |
    Then brandon finally completes his registration successfully


