Feature: Certificate Management

  Background: 
    Given The user opens the TMS application
    And The Training administrator enters a valid username "tms@cpt-it.com"
    And The Training administrator enters a valid password "password"
    And Clicks on the login button
    Given Adminstrator is lands on the Home Page and Click on the Language Dropdown
    Then Clicks on the sutiable language

  Scenario: Training Administrator adds a new certificate
    And Training Administrator navigate to the Certificates section
    When Training Administrator click on the Add Certificate button
    And Training Administrator enter the Arabic Certificate Name
    And Training Administrato renter the English Certificate Name
    And Training Administrator enter the Arabic Certificate Title
    And Training Administrator enter the English Certificate Title
    And Training Administrator select the Certificate Type
    And Training Administrator enter the Arabic Academy Head Name
    #And Training Administrator enter the Trainers Signature
    #And Training Administrator enter the Academy Heads Signature
    When Training Administratorclick on the Save button
    Then the new certificate should be saved successfully

  #Scenario: Validate the Sepcial character in category Target Groups Page of the TMS application
    #And Training Administrator navigate to the Certificates section
    #And Enters  Sepcial character in category name Certificates section
    #Then Proper messages should be displayed when there are no results in certifcate
#
  #Scenario: Verify that if you click the icon (X) after adding keywords in the search field, the search field is cleared.
    #And Training Administrator navigate to the Certificates section
    #Then search filed is blank validate in certifcate
#
  #Scenario: Verify that Proper messages should be displayed when there are no results.
    #And Training Administrator navigate to the Certificates section
    #And enter search result in certifcate
    #Then Proper messages should be displayed when there are no results in certifcate
#
  #Scenario: Verify that Application should not crash if user added html code OR link in search field.
    #And Training Administrator navigate to the Certificates section
    #And enter html code OR link in search field in certifcate.
#
  #Scenario: Verify pagination is accessible by clicking on the Next button
    #And Training Administrator navigate to the Certificates section
    #When I click on the Next button Certificates section
    #And the content should update to reflect the next page Certificates section
#
  #Scenario: Verify pagination is accessible by clicking on the Previous button
    #And Training Administrator navigate to the Certificates section
    #When I click on the Previous button Certificates section
    #And the content should update to reflect the previous page Certificates section
#
  #Scenario: Check if the clicking on the filter button opens the filter option.
    #And Training Administrator navigate to the Certificates section
    #And Check if the clicking on the filter button opens the filter option Certificates section.
#
  #Scenario: Check if all the filter options are available.
    #And Training Administrator navigate to the Certificates section
    #And Check if all the filter options are available Certificates section.

  #Scenario: Verify selected filter can be cleared.
    #And Training Administrator navigate to the Certificates section
    #And Check if all the filter options are available Certificates section.
    #And Verify selected filter can be cleared Certificates section.
#
  #Scenario: Check if the filtering leads to Right results.
    #And Training Administrator navigate to the Certificates section
    #And Check if all the filter options are available Certificates section.
    #And Check if the filtering leads to Right results Certificates section.
