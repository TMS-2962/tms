Feature: validate the functionality of the Self learnind data

  Background: 
    Given The user opens the TMS application
    And The Training administrator enters a valid username "tms@cpt-it.com"
    And The Training administrator enters a valid password "password"
    And Clicks on the login button
    Given Adminstrator is lands on the Home Page and Click on the Language Dropdown
    Then Clicks on the sutiable language
    Given The Training Administrator Update click on edit and is on the course details page

  Scenario: Training administrator will filled the Self learnind data inforamtion (Survey )
  Given Training administrator Lands on the add Courses and select survey
  Then Training administrator Clicks on the Added Survey
  And Training administrator Add survey
  Then clicks on the Save button
  
  Scenario: Training administrator will filled the Self learnind data inforamtion (Certificate )
    Given Training administrator Lands on the add Courses and select Certificate
    Then Training administrator Clicks on the Added Certificate
    And Training administrator Add Certificate
    And select certifacte
    Then clicks on the Save button

  Scenario: Verify that if click on upload file button, redirect to adding button
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added (Files )
    And Verify that if click on upload file button, redirect to adding button

  Scenario: Check is the uploader show a “success” message after the upload
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added (Files )
    And Check is the uploader show a “success” message after the upload

  Scenario: Check the file name should be the same and display after uploading the file.
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added (Files )
    And Check the file name should be the same and display after uploading the file

  Scenario: Verify is the uploaded file extension is shown with the file name.
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added (Files )
    And Verify is the uploaded file extension is shown with the file name.

  Scenario: Check is the file size is displaying with the file name.
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added (Files )
    And Check is the file size is displaying with the file name.

  Scenario: To verify Adding Survey to the course Verify that if click on add button ,A pop-up window will open containing all the Survey added to the system
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added Survey
    And Training administrator Add survey
    And Adding Survey to the course Verify that if click on add button ,A pop-up window will open containing all the Survey added to the system

  Scenario: Verify that if you click the Save button after selecting a Survey form, the questionnaire will be saved to the course
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added Survey
    And Training administrator Add survey
    And Verify that if you click the Save button after selecting a Survey form, the questionnaire will be saved to the course

  Scenario: Verify that if you click the Save button before selecting a Survey form, the error message will be appear
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added Survey
    And Training administrator Add survey
    And Verify that if you click the Save button before selecting a Survey form, the error message will be appear

  Scenario: Verify that if the duplicate form is selected, an alert message will appear.Search in Add Certificates TO Cours
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added Survey
    And Training administrator Add survey
    And Verify that if the duplicate form is selected, an alert message will appear.Search in Add Certificates TO Cours

  Scenario: Check if the clicking on the filter button opens the filter option.
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added (Files )
   And Check if the filtering leads to Right results

  Scenario: Check if all the filter options are available.(يتم الفلتره عن طريق :افتراضي للمتدرب ,افتراضي للمدرب)
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added (Files )
    And Check if all the filter options are available.(يتم الفلتره عن طريق :افتراضي للمتدرب ,افتراضي للمدرب)

  Scenario: Verify selected filter can be cleared.
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added (Files )
    And Verify selected filter can be cleared.

  Scenario: Check if the can use a filter option before searching.
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added (Files )
    And Check if the can use a filter option before searching.

  Scenario: Check if the filtering leads to Right results
    Given Training administrator Lands on the add Courses and select survey
    Then Training administrator Clicks on the Added (Files )
    And Check if the filtering leads to Right results

  Scenario: Verify search working by adding keyword and pressing the Enter key from the keyboard Add certificate.
    Given Training administrator Lands on the add Courses and select Certificate
    Then Training administrator Clicks on the Added Certificate
    And Training administrator Add Certificate
    And Verify search working by adding keyword and pressing the Enter key from the keyboard Add certificate.

  Scenario: Verify that Proper messages should be displayed when there are no results Add certificate..
    Given Training administrator Lands on the add Courses and select Certificate
    Then Training administrator Clicks on the Added Certificate
    And Training administrator Add Certificate
    And Verify that Proper messages should be displayed when there are no results Add certificate..

  Scenario: Verify that Application should not crash if user added html code OR link in search field Add certificate..
    Given Training administrator Lands on the add Courses and select Certificate
    Then Training administrator Clicks on the Added Certificate
    And Training administrator Add Certificate
    And Verify that Application should not crash if user added html code OR link in search field Add certificate..

  Scenario: Verify that Application should not crash if user added special character in search field Add certificate.
    Given Training administrator Lands on the add Courses and select Certificate
    Then Training administrator Clicks on the Added Certificate
    And Training administrator Add Certificate
    And Verify that Application should not crash if user added special character in search field Add certificate.

  Scenario: Verify pagination added in case if the search result goes on the number of pages.Add certificate.
    Given Training administrator Lands on the add Courses and select Certificate
    Then Training administrator Clicks on the Added Certificate
    And Training administrator Add Certificate
    And Verify pagination added in case if the search result goes on the number of pages.Add certificate.

  Scenario: Verify pagination is accessible or not by clicking on the Previous button Add certificate..
    Given Training administrator Lands on the add Courses and select Certificate
    Then Training administrator Clicks on the Added Certificate
    And Training administrator Add Certificate
    And Verify pagination is accessible or not by clicking on the Previous button Add certificate..

  Scenario: Verify pagination is accessible or not by clicking on the Next button Add certificate..
    Given Training administrator Lands on the add Courses and select Certificate
    Then Training administrator Clicks on the Added Certificate
    And Training administrator Add Certificate
    And Verify pagination is accessible or not by clicking on the Next button Add certificate

  Scenario: Verify that Proper messages should be displayed when there are no results Add certificate..
    Given Training administrator Lands on the add Courses and select Certificate
    Then Training administrator Clicks on the Added Certificate
    And Training administrator Add Certificate
    And Verify that Proper messages should be displayed when there are no results Add certificate..
