Feature: validate the functionality of the Trainers

  Background: 
    Given The user opens the TMS application
    And The Training administrator enters a valid username "tms@cpt-it.com"
    And The Training administrator enters a valid password "password"
    And Clicks on the login button
    Given Adminstrator is lands on the Home Page and Click on the Language Dropdown
    Then Clicks on the sutiable language

  Scenario: Training administrator Add a new trainer
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And Training administrator add the required information

  Scenario: Training administrator edit a new trainer
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on edit
    And Training administrator Update the required information

  Scenario: Verify that not allow Add an item with a phone that was previously added
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And Training administrator add the required information with duplicate phone number

  Scenario: Verify that not allow Add an item with a ID that was previously added
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And Training administrator add the required information with ID that was previously added

  Scenario: Verify that not allow Add an item with an Email that was previously added
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And Training administrator add the required information with Email that was previously added

  Scenario: Verify that not filling the mandatory fields and clicking the send button will lead to a validation error.
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And verify the all the error message

  Scenario: Verify that first name accept character only.
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And enter the numeric name and verify the the error message

  Scenario: Verify that the placeholder text in the email field is added or not.
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And Verify that the placeholder text in the email field is added or not.

  Scenario: Verify if the length of the phone number is incorrect i.e. less than 10.
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And erify if the length of the phone number is incorrect i.e. less than 10.

  Scenario: Verify if the length of the phone number is incorrect i.e. more than 10
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And Verify if the length of the phone number is incorrect i.e. more than 10

  Scenario: Check the phone number when passing alphanumeric data
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And Check the phone number when passing alphanumeric data

  Scenario: Check is the user can only be able to upload the allowed files (PDF).
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And Check is the user can only be able to upload the allowed files (PDF).

  Scenario: Check is a proper error message should be shown in case the user tries to upload the file which is not allowed. File type not allowed.
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And Check is a proper error message should be shown in case the user tries to upload the file which is not allowed. File type not allowed.

  Scenario: Check is the error message is displaying if the file size is large than the allowed one(5mb).
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And Check is the error message is displaying if the file size is large than the allowed one(5mb).

  Scenario: Check during uploading a file on click of cancel button window should be closed.
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on Add
    And Check during uploading a file on click of cancel button window should be closed.

  Scenario: Verify that not allow Edit an item with a phone that was previously added
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on edit
    And Verify that not allow Edit an item with a phone that was previously added

  Scenario: Verify that not allow Edit an item with a ID that was previously added
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on edit
    And Verify that not allow Edit an item with a ID that was previously added

  Scenario: Verify that not allow Edit an item with en Email that was previously added
    When Training administrator click on Trainers from the sidebar menu
    And Training administrator click on edit
    And Verify that not allow Edit an item with en Email that was previously added
