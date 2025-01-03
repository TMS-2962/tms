Feature: validate the functionality of the survey

  Background: 
    Given The user opens the TMS application
    And The Training administrator enters a valid username "tms@cpt-it.com"
    And The Training administrator enters a valid password "password"
    And Clicks on the login button
    Given Adminstrator is lands on the Home Page and Click on the Language Dropdown
    Then Clicks on the sutiable language

  Scenario: Training administrator adds a new survey
    When The Training administrator clicks on Surveys from the sidebar menu
    And The Training administrator clicks on Add
    And The Training administrator adds the required information
    Then The Training administrator clicks on Save

  Scenario: Training administrator views added surveys
    When The Training administrator clicks on Surveys from the sidebar menu
    Then The added surveys are displayed

  Scenario: Training administrator edits an existing survey
    When The Training administrator clicks on Surveys from the sidebar menu
    And The Training administrator clicks on Edit next to each survey
    And The Training administrator modifies the required information
    Then The Training administrator clicks on Update

  Scenario: Training administrator views the details of an existing survey
    When The Training administrator clicks on Surveys from the sidebar menu
    And The Training administrator clicks on View next to each survey

  Scenario: Department administrator searches for a survey
    When The Training administrator clicks on Surveys from the sidebar menu
    And The department administrator clicks on Search
    Then The survey matching the search criteria is displayed

  Scenario: Training administrator delete added surveys
    When The Training administrator clicks on Surveys from the sidebar menu
    Then The Training administrator clicks delete survey

  Scenario: Verify that alert message will be appear if try to delete survey in training course  completed
    When The Training administrator clicks on Surveys from the sidebar menu
    Then Verify that alert message will be appear if try to delete survey in training course  completed

  Scenario: verify that if delete a Survey is disappeared from
    When The Training administrator clicks on Surveys from the sidebar menu
    And verify that if delete a Survey is disappeared from

  Scenario: verify that if delete a  Survey is disappeared from  Survey popup in add course page Turn on screen reader
    When The Training administrator clicks on Surveys from the sidebar menu
    And verify that if delete a  Survey is disappeared from  Survey popup in add course page Turn on screen reader


  Scenario: Verify that if you click the icon (X) after adding keywords in the search field, the search field is cleared.
    When The Training administrator clicks on Surveys from the sidebar menu
    Then search filed is blank validate Survey Page 

  Scenario: Verify that Proper messages should be displayed when there are no results.
    When The Training administrator clicks on Surveys from the sidebar menu
    And enter search result Survey Page 
    Then Proper messages should be displayed when there are no results Survey Page 

  Scenario: Verify that Application should not crash if user added html code OR link in search field.
    When The Training administrator clicks on Surveys from the sidebar menu
    And enter html code OR link in search field Survey Page .

  Scenario: Verify pagination is accessible by clicking on the Next button
    When The Training administrator clicks on Surveys from the sidebar menu
    And the content should update to reflect the next page Survey Page 

  Scenario: Verify pagination is accessible by clicking on the Previous button
    When The Training administrator clicks on Surveys from the sidebar menu
    And the content should update to reflect the previous page Survey Page 
