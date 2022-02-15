#All feature files must start with Feature keyword.There can be ONLY 1 Feature keyword per file.
#Feature describe the overall test case.
#It can be a user story name.
#Google_Search_Functionality
#Google Search Functionality

  @google_search
Feature: Google_Search_Functionality
#Scenario: Test Case(In Cucumber, there is not "test case" keyword.)
#TC: Test Case
  #Under Scenario, we will have TEST STEPS
  #Given,And,Then,When,But,* annotations
  #These are Gherkin Language
  #EACH STEP MUST START WITH A GHERKIN KEYWORD
  #Given should be used as preconditions
  #Then should be used for verifications
  #And and When should be used in the middle steps
  Background: user_is_on_the_google_page
  #It is like "static block"  OR Before method
  #Background keyword is used before each Scenario keyword
  #Background is used for repeated pre conditions.
  #It cannot be used after Scenario keyword,so use it first.
    Given user is on the google page

  @iphone_search
  Scenario:TC01_iphone_search #TC
    #Given user is on the google page
    When user search for iPhone on google
    Then verify the result has iPhone related results
    Then capture the screenshot
    Then close the application
    #We can create multiple Scenarios
  @teapot_search @wip
  Scenario: T2_teapot_search
    #Given user is on the google page
    When user search for Tea Pot on google
    Then verify the result has Tea Pot related results
    #wip:work in progress
  @flower_search @wip
  Scenario: TC03_flower_search
    #Given user is on the google page
    When user search for flower on google
    Then verify the result has flower related results

    #What is a feature file?
    #We write out test scenario in feature files.Feature:
    # We use Gherkin language in the feature files such aas Feature,Scenario,Given,And,Then,When. But, Background...
    #It is written in plain English
    #Knows as Non-technical part.
    # Everybody can read and understand
    #What is a step definition?
    #We write our JAVA code in the step definitions
    #This has the technical part.
    #Only technical people can understand.
