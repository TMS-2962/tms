# Home Page
Feature: Users Lands into the Home Page TMS application

  #Scenario: validate the entity prsent on the Home Page of the TMS application
    #Given The user opens the TMS application
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Clicks on the login button
    #Given Adminstrator is lands on the Home Page and Click on the Language Dropdown
    #Then Clicks on the sutiable language
  
Scenario: validate the Status of courese present on the Home Page of the TMS application
    Given The user opens the TMS application
    When The Training administrator enters a valid username "tms@cpt-it.com"
    And The Training administrator enters a valid password "password"
    And Clicks on the login button
    Given Adminstrator is lands on the Home Page and Click on the Language Dropdown
    Then Clicks on the sutiable language 
    Then validate the Status of courese present on the Home Page of the TMS application