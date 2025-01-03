# Category Groups Page
Feature: Users Land into the Category Groups Page of the TMS application

  Background: 
    Given The user opens the TMS application
    And The Training administrator enters a valid username "tms@cpt-it.com"
    And The Training administrator enters a valid password "password"
    And Clicks on the login button
    Given Adminstrator is lands on the Home Page and Click on the Language Dropdown
    Then Clicks on the sutiable language

  #Scenario: Validate the Add category group in the Category Groups Page of the TMS application
    #Then Lands on the Category Groups Page and clicks on the Add category group
    #And Enters category group name
    #Then Clicks on the Add button of category
#
  #Scenario: Validate the edit category group in the Category Groups Page of the TMS application
    #Then Lands on the Category Groups Page and clicks on the edit category group
    #And Enters category group name
    #And Clicks on the Update  button of category
#
  #Scenario: Validate the Search category group in the Category Groups Page of the TMS application
    #Then Lands on the Category Groups Page and clicks on the search category group
    #And Enters search name of category
    #Then Clicks on the Enter button of category
#
  #Negative scenario
  #Scenario: Validate the Added Blank category group in the Category Groups Page of the TMS application
    #Then Lands on the Category Groups Page and clicks on the Add category group
    #Then Clicks on the Add of category button
    #Then Verifies the error message for added Blank category group
#
  #Scenario: Validate the Duplicate category group in the Category Groups Page of the TMS application
    #Then Lands on the Category Groups Page and clicks on the Add category group
    #And Enters Duplicate category group name
    #Then Clicks on the Add of category button
    #Then Verifies the error message for Duplicate category group
#
  #Scenario: Validate the Special character in category group in the Category Groups Page of the TMS application
    #Then Lands on the Category Groups Page and clicks on the Add category group
    #And Enters Special character in category group name
    #Then Clicks on the Add of category button
    #Then Verifies the error message for Special character in category group
#
  #Scenario: Validate the Add category group in the Category Groups Page of the TMS application
    #Then Lands on the Category Groups Page and clicks on the Add category group
    #And Enters category group name with Forty characters
    #Then Clicks on the Add button of category
#
  #Scenario: Verify the category is not added if the category name is entered and the 'X' icon is pressed.
    #Then Lands on the Category Groups Page and clicks on the Add category group
    #And Enters category group name
    #And click on the cancel button
#
  #Scenario: Verify that if click on cancel button with data,No record added
    #Then Lands on the Category Groups Page and clicks on the Add category group
    #And click on the cancel button
#
  #Scenario: Verify the Activate  Categories Group
    #Then Lands on Category Groups Page
    #And Find element in Category Groups Page of activation and perform click.
#
  #Scenario: Check if the clicking on the filter button opens the filter option.
    #Then Lands on Category Groups Page
    #And Check if the clicking on the filter button opens the filter option.
#
  #Scenario: Check if all the filter options are available.
    #Then Lands on Category Groups Page
    #And Check if all the filter options are available.
#
  #Scenario: Verify that not allow Edit an item with a name that was previously added
    #Then Lands on the Category Groups Page and clicks on the edit category group
    #And Enters Duplicate category group name
    #And Clicks on the Update  button of category
    #Then Verifies the error message for Duplicate category group
#
  #Scenario: Verify the category name can’t accept special characters.
 #Then Lands on the Category Groups Page and clicks on the edit category group
    #And Enters Special character in category group name
    #Then Verifies the error message for Special character in category group
#
  #Scenario: Verify the category name should accept 40 char only
    #Then Lands on the Category Groups Page and clicks on the Add category group
    #And Enters category group name with Forty characters
    #Then Clicks on the Add button of category
#
  #Scenario: Verify the category is not updated if the category name is entered and the 'X' icon is pressed
    #Then Lands on the Category Groups Page and clicks on the Add category group
    #And Enters category group name
    #And click on the cancel button
#
  #Scenario: Verify that Application should not crash if user added special character in search field
    #Then Lands on the Category Groups Page and clicks on the search category group
    #And Verify that Application should not crash if user added special character in search field of category
#
  #Scenario: Verify that if you click the icon (X) after adding keywords in the search field, the search field is
    #Then Lands on the Category Groups Page and clicks on the search category group
    #And Verify that if you click the icon (X) after adding keywords in the search field, the search field is
#
  #Scenario: Verify that Proper messages should be displayed when there are no results.
    #Then Lands on the Category Groups Page and clicks on the search category group
    #And Verify that Proper messages should be displayed when there are no results in category group.
#
  #Scenario: Verify that Application should not crash if user added html code OR link in search field.
    #Then Lands on the Category Groups Page and clicks on the search category group
    #And Verify that Application should not crash if user added html code OR link in search field in category.
#
  #Scenario: Verify pagination added in case if the search result goes on the number of pages.
    #Then Lands on Category Groups Page
    #Then Verify pagination added in case if the search result goes on the number of pages.
#
  #Scenario: Verify pagination is accessible or not by clicking on the Previous button.
    #Then Lands on Category Groups Page
    #Then Verify pagination is accessible or not by clicking on the Previous button in category.
#
  #Scenario: Verify pagination is accessible or not by clicking on the Next button .
    #Then Lands on Category Groups Page
    #And Verify pagination is accessible or not by clicking on the Next button in categorty .

  Scenario: Verify selected filter can be cleared.
    Then Lands on Category Groups Page
    And Check if all the filter options are available.
    And Verify selected filter can be cleared in catgory.

  Scenario: Check if the filtering leads to Right results
    Then Lands on Category Groups Page
    And Check if all the filter options are available.
    And Check if the filtering leads to Right results in catgory.
