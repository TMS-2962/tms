# Target Groups Page
Feature: Users Land into the Target Groups Page of the TMS application

  Background: 
    Given The user opens the TMS application
    And The Training administrator enters a valid username "tms@cpt-it.com"
    And The Training administrator enters a valid password "password"
    And Clicks on the login button
    Given Adminstrator is lands on the Home Page and Click on the Language Dropdown
    Then Clicks on the sutiable language

  Scenario: Validate the Add category in the Target Groups Page of the TMS application
    Then Lands on Target Groups Page and clicks on the Add category
    And Enters category name
    Then Clicks on the Add button

  Scenario: Validate the edit category in the Target Groups Page of the TMS application
    Then Lands on Target Groups Page and clicks on the edit category
    And Enters category name
    Then Clicks on the Update button

  Scenario: Validate the Search category in the Target Groups Page of the TMS application
    Then Lands on Target Groups Page and clicks on the search category
    And Enters search name
    Then Clicks on the Enter button

  #Negative scenario
  Scenario: Validate the Added Blank category in the Target Groups Page of the TMS application
    Then Lands on Target Groups Page and clicks on the Add category
    Then Clicks on the Add button
    Then verify the error Message for dded Blank category

  Scenario: Validate the Duplicate category in the Target Groups Page of the TMS application
    Then Lands on Target Groups Page and clicks on the Add category
    And Enters Duplicate category name
    Then Clicks on the Add button
    Then verify the error Message for Duplicate category

  Scenario: Validate the Sepcial character in category Target Groups Page of the TMS application
    Then Lands on Target Groups Page and clicks on the Add category
    And Enters  Sepcial character in category name
    Then Clicks on the Add button
    Then verify the error Message for Sepcial character in category

  Scenario: Verify that if you click the icon (X) after adding keywords in the search field, the search field is cleared.
    Then Lands on Target Groups Page and clicks on the search category
    Then search filed is blank validate

  Scenario: Verify that Proper messages should be displayed when there are no results.
    Then Lands on Target Groups Page and clicks on the search category
    And enter search result
    Then Proper messages should be displayed when there are no results

  Scenario: Verify that Application should not crash if user added html code OR link in search field.
    Then Lands on Target Groups Page and clicks on the search category
    And enter html code OR link in search field.

  Scenario: Verify pagination is accessible by clicking on the Next button
    When I click on the Next button
    And the content should update to reflect the next page

  Scenario: Verify pagination is accessible by clicking on the Previous button
    When I click on the Previous button
    And the content should update to reflect the previous page

  Scenario: Validate the Add Target group in the Category Groups Page of the TMS application
    Then Lands on Target Groups Page and clicks on the Add category
    And Enters category name with forty character
    Then Clicks on the Add button

  Scenario: Verify the Target category is not added if the Target category name is entered and the 'X' icon is pressed.
    Then Lands on Target Groups Page and clicks on the Add category
    And Enters category name
    And click on the cancel button Add category

  Scenario: Verify that if click on cancel button with data,Target category No record added
    Then Lands on Target Groups Page and clicks on the Add category
    And click on the cancel button Add category

  Scenario: Verify the Activate Target Categories
    Then Lands on Target Groups Page
    And Find element of activation and perform click.

  Scenario: Check if the clicking on the filter button opens the filter option.
    Then Lands on Target Groups Page
    And Check if the clicking on the filter button opens the filter option in Target Groups Page..

  Scenario: Check if all the filter options are available.
    Then Lands on Target Groups Page
    And Check if all the filter options are available in Target Groups Page.

  Scenario: Verify that not allow Edit an item with a name that was previously added
    Then Lands on Target Groups Page and clicks on the edit category
    And Enters Duplicate category name
    Then Clicks on the Update button
    Then verify the error Message for Duplicate category

  Scenario: Verify the category name can’t accept special characters.
    Then Lands on Target Groups Page and clicks on the edit category
    And Enters  Sepcial character in category name
    Then verify the error Message for Sepcial character in category

  Scenario: Verify the category name should accept 40 char only.accepting forty chrac)
    Then Lands on Target Groups Page and clicks on the edit category
    And Enters category name with forty character
    Then Clicks on the Update button

  Scenario: Verify the category is not updated if the category name is entered and the 'X' icon is pressed.
    Then Lands on Target Groups Page and clicks on the edit category
    And Enters category name
    And click on the cancel button Add category

     Scenario: Validate the edit Added Blank category in the Target Groups Page of the TMS application
 Then Lands on Target Groups Page and clicks on the edit category
  Then Clicks on the Update button
    Then verify the error Message for dded Blank category
    
      Scenario: Verify that the category can be deactivated by toggling the activation switch. 
    Then Lands on Target Groups Page
    And Find element of activation and perform click.