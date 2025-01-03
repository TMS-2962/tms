#Add course data
Feature: validate the functionality of the Self learning courese

  Background: 
    Given The user opens the TMS application
    And The Training administrator enters a valid username "tms@cpt-it.com"
    And The Training administrator enters a valid password "password"
    And Clicks on the login button
    Given Adminstrator is lands on the Home Page and Click on the Language Dropdown
    Then Clicks on the sutiable language

  Scenario: Training administrator will validate the self learning inforamtion
    Then Navigate through the navigation bar, select the Courses and Self Learning options.
    And Search for a course and validate the course name and course code.
    And Click on the Trainee  option.
    And Validate all the information in the trainee section.
