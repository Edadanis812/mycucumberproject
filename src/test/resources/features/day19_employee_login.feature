@employee_login_scenario_outline @smoke
Feature: employee_login
  Scenario Outline: login_with_employee_credentials
    Given user is on the login page
    And user clicks on login dropdown
    And user clicks on sign in button
    And user sends username "<username>"
    And user sends password "<password>"
    And user clicks on the login button
    Then close the application
    Examples: credentials
      |username       |password  |
      |gino.wintheiser|%B6B*q1!TH|
      |dallas.batz|dOWjuXz8*es6|
      |leonel.skiles|x3uvY0f8hw1T|
      |reddy.veum|*f**3dafHW3Jx|
      |syble.jerde|2*0R*!K&GB3T%G|
      #|julius.keebler|F&134#R%0d |
      #|jeanette.haag|yjTXNFhnTLG0|
      #|eloisa.kub|U59hk^@$VG9J|
      #|angus.spencer|QKzuQiTUp5r1s^|

#1. create teh feature file
#2. Run runner and generate missing step definitions: @employee_login_scenario_outline
#3. Put the step definitions in the LoginStepDefs class
#4. Start writing JAVA code in step definitinons
#5. Add url to configuration file "gmi_login_url=https://gmibank.com/"
#6. Create page objects.