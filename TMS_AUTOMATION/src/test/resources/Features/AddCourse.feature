#Add course data
Feature: validate the functionality of the courese

  Background: 
    Given The user opens the TMS application
    And The Training administrator enters a valid username "tms@cpt-it.com"
    And The Training administrator enters a valid password "password"
    And Clicks on the login button
    Given Adminstrator is lands on the Home Page and Click on the Language Dropdown
    Then Clicks on the sutiable language

  Scenario: Training administrator will filled the basic data inforamtion
  Then Go through the navigation bar. select the Course and courses option.
  When The Training administrator enters Code , Arabic Course Name and English Course Name
  And The Training administrator select Category Name , Target Category
  And The Training administrator entres Price Per Person ,Price Per Person Remotely , Duration Of The Course (Today) ,Course Brief ,Course requirements
  And The Training administrator adds Introduction video and  ADD Image
  And The Training administrator adds Course-registration-requires-approval
  And Add The Training administrator adds FAQs
  And The Training administrator select Course Trainers , Course Language
  And The Training administrator Self learning data
  And print all the Basic data in cansole
  
  #Scenario: Training administrator will Update the basic data inforamtion
  #Given The Training Administrator Update click on edit and is on the course details page
  #When The Training administrator Update enters Code , Arabic Course Name and English Course Name
  #And The Training administrator Update  entres Price Per Person ,Price Per Person Remotely , Duration Of The Course (Today) ,Course Brief ,Course requirements
  #And The Training administrator Update adds Course-registration-requires-approval
  #And The Training Update administrator Self learning data
  #And print all the Basic data in cansole
  #
  #Negative scenario Add course
  #Scenario: Training administrator will Search the basic data inforamtion
  #And The Training Administrator entres the CourseCode and click enter button
  #And The Training Administrator gets expected Output and validate it
  #
  #Scenario: Training administrator Not enteres any the basic data inforamtion
  #And The Training Administrator clicks on the save button
  #And The Vaairify and validate the error message
  #
  #Scenario: Verify that An error message should be shown as the user tries to upload an image of an invalid extension
  #Then Go through the navigation bar. select the Course and courses option.
  #And validate  the eror message invalid extension for image
  #
  #Scenario: Verify Upload video button is clickable or not
  #Then Go through the navigation bar. select the Course and courses option.
  #And validate  the  working message
  #
  #Scenario: Verify the video size limit
  #Then Go through the navigation bar. select the Course and courses option.
  #And validate  the eror message video size limit
  #
  #Scenario: Verify that An error message should be shown as the user tries to upload an video of an invalid extension
  #Then Go through the navigation bar. select the Course and courses option.
  #And validate  the eror message invalid extension for video
  #
  #Scenario: Verify edit that An error message should be shown as the user tries to upload an image of an invalid extension
  #Given The Training Administrator Update click on edit and is on the course details page
  #And validate  the eror message invalid extension for image
  #
  #Scenario: Verify edit Upload video button is clickable or not
  #Given The Training Administrator Update click on edit and is on the course details page
  #And validate  the  working message
  #
  #Scenario: Verify edit  the video size limit
  #Given The Training Administrator Update click on edit and is on the course details page
  #And validate edit the eror message video size limit
  #
  #Scenario: Verify that edit  An error message should be shown as the user tries to upload an video of an invalid extension
  #Given The Training Administrator Update click on edit and is on the course details page
  #And validate edit the eror message invalid extension for video
  #
  #Scenario: Check on click on the delete button the confirmation dialog box with a message is displaying.
  #Then Go through the navigation bar. select the Course and courses.
  #And click on the delete button the confirmation dialog box with a message is displaying.
  #
  #Scenario: Check the delete functionality should work as the user clicks on the YES button on the confirmation popup.
  #Then Go through the navigation bar. select the Course and courses.
  #And delete functionality should work as the user clicks on the YES button on the confirmation popup..
  #
  #Scenario: Check the record  should not delete if the user clicks No in the confirmation dialog box popup.
  #Then Go through the navigation bar. select the Course and courses.
  #And Check the record  should not delete if the user clicks No in the confirmation dialog box popup.
  #
  #Scenario: Check the record  should be deleted  as the user clicks on the Yes button on the confirmation popup
  #Then Go through the navigation bar. select the Course and courses.
  #And Check the record  should be deleted  as the user clicks on the Yes button on the confirmation popup
  #
  #Scenario: Check the record  should not delete if the user clicks No in the confirmation dialog box popup.
  #Then Go through the navigation bar. select the Course and courses.
  #And Check the record  should not delete if the user clicks No in the confirmation dialog box popup.
  #
  #Scenario: Check the edit file button is displayed on the webpage.
  #Then Go through the navigation bar. select the Course and courses.
  #And Check the edit file button is displayed on the webpage.
  #
  #Scenario: Check on click over the edit button the user should be redirected to the edit page.
  #Then Go through the navigation bar. select the Course and courses.
  #And Check on click over the edit button the user should be redirected to the edit page.
  #
  #Scenario: verify that all the files are displayed on the respective fields of the edit page.
  #Then Go through the navigation bar. select the Course and courses.
  #And verify that all the files are displayed on the respective fields of the edit page.
  #
  #Scenario: Check is the user can only be able to update the allowed files only.
  #Then Go through the navigation bar. select the Course and courses.
  #And Check is the user can only be able to update the allowed files only.
  #
  #Scenario: Edit File ,Check is the error message is displaying if the file size is large than the allowed one.
  #Then Go through the navigation bar. select the Course and courses option.
  #And Edit File ,Check is the error message is displaying if the file size is large than the allowed one.
  #Scenario: To verify file filter in course
    #Then Go through the navigation bar. select the Course and courses.
    #And To verify file filter in course
#
  #Scenario: Check if the clicking on the filter button opens the filter option.
    #Then Go through the navigation bar. select the Course and courses.
    #And Check if the clicking on the filter button opens the filter option in course.
#
  #Scenario: Check if all the filter options are available.
    #Then Go through the navigation bar. select the Course and courses.
    #And Check if all the filter options are available in course..
#
  #Scenario: Verify selected filter can be cleared.
    #Then Go through the navigation bar. select the Course and courses.
    #And Verify selected filter can be cleared.
#
  #Scenario: Check if the can use a filter option before searching.
    #Then Go through the navigation bar. select the Course and courses.
    #And Check if the can use a filter option before searching.
#
  #Scenario: Check if the filtering leads to Right results.
    #Then Go through the navigation bar. select the Course and courses.
    #And Check if the filtering leads to Right results.
#
  #Scenario: Search in Add Certificates TO Course
  #Then Go through the navigation bar. select the Course and courses.
  #And Search in Add Certificates TO Course
  #
  #Scenario: Verify search working by adding keyword and pressing the Enter key from the keyboard.
  #Then Go through the navigation bar. select the Course and courses.
  #And Verify search working by adding keyword and pressing the Enter key from the keyboard.
  #
  #Scenario: Verify that Proper messages should be displayed when there are no results.
  #Then Go through the navigation bar. select the Course and courses.
  #And Verify that Proper messages should be displayed when there are no results.
  #
  #Scenario: Verify that Application should not crash if user added html code OR link in search field.
  #Then Go through the navigation bar. select the Course and courses.
  #And Verify that Application should not crash if user added html code OR link in search field.
  #
  #Scenario: Verify that Application should not crash if user added special character in search field
  #Then Go through the navigation bar. select the Course and courses.
  #And Verify that Application should not crash if user added special character in search field
  #
  #Scenario: Verify pagination is accessible or not by clicking on the Previous button .
  #Then Go through the navigation bar. select the Course and courses.
  #And Verify pagination is accessible or not by clicking on the Previous button .
  #
  #Scenario: Verify pagination is accessible or not by clicking on the Next button .
  #Then Go through the navigation bar. select the Course and courses.
  #And Verify pagination is accessible or not by clicking on the Next button .
  #
  #Scenario: Verify that Proper messages should be displayed when there are no results.
  #Then Go through the navigation bar. select the Course and courses.
  #And Verify that Proper messages should be displayed when there are no results.
  #
  #Scenario: Verify that all certificates are reflected on the page.
  #Then Go through the navigation bar. select the Course and courses.
  #And Verify that all certificates are reflected on the page.
  #Scenario: Check that the "requirement" field accept characters and special characters
    #Given The Training Administrator Update click on edit and is on the course details page
    #And Check that the "requirement" field accept characters and special characters
#
  #Scenario: Check that the "requirement" field has a maximum number of characters of 100
    #Given The Training Administrator Update click on edit and is on the course details page
    #And Check that the "requirement" field has a maximum number of characters of 100
#
  #Scenario: Verify that the pop-up is closed and that the data has not been modified when the cancel button or ❌ is pressed
    #Given The Training Administrator Update click on edit and is on the course details page
    #And Verify that the pop-up is closed and that the data has not been modified when the cancel button or ❌ is pressed
