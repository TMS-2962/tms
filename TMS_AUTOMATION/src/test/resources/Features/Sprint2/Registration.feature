Feature: Vaildae The registration functiionality of The TMS application

  Background: 
    Given The user opens The TMS application and Lands on The registration Page
    #Scenario: Verify The user can sucessfully registered with government-sector
    #Scenario: Verify The user can sucessfully registered with private-sector
    #Given The private-sector user is on The registration page
    #When The Private Sector User enters the email
    #And The Private Sector User enters the OTP
    #And The Private Sector User enters the first text
    #And The Private Sector User enters the second text
    #And The Private Sector User enters the activity
    #And The Private Sector User enters the commercial registration number
    #And The Private Sector User enters the contact numbers
    #And The Private Sector User uploads the first file
    #And The Private Sector User uploads the second file
    #And The Private Sector User uploads the third file
    #Then The Private Sector User form should be successfully submitted
  Scenario: Verify The user can sucessfully registered with user
    Given The user is on The registration page
    When The user fills in The first name field
    And The user fills in The last name field
    And The user fills in The email field
    And The user fills in The primary phone field
    And The user fills in The secondary phone field
    And The user fills in The password field
    And The user fills in The confirm password field
    And The user agrees to The terms by clicking The checkbox
    Then The user should see The form submitted successfully 
    
 Scenario: Verify that the user cannot register an account with an invalid email address.
     Given The user is on The registration page
    When The user fills in The first name field
    And The user fills in The last name field
    And The user fills in The invalid email field 
    Then Verify that the user cannot register an account with an invalid email address.
 Scenario: Verify that the user cannot enter a non-Arabic name in the ArabicFirstName field. 
      Given The user is on The registration page
    When The user fills in The first name field
    And The user fills in The user enter a non-Arabic name in the ArabicFirstName field.  
    Then Verify that the user cannot enter a non-Arabic name in the ArabicFirstName field. 

 Scenario: Verify that the user cannot enter a National ID with an incorrect format or length.
       Given The user is on The registration page
       Then  Verify that the user cannot enter a National ID with an incorrect format or length.

 Scenario: Verify that the user can successfully create an account with a valid National ID.
     Given The user is on The registration page
    When The user fills in The first name field
    And The user fills in The last name field
    And The user fills in The email field
    And The user fills in The primary phone field
    And The user fills in The secondary phone field
    And The user fills in The password field
    And The user fills in The confirm password field
    And The user agrees to The terms by clicking The checkbox
    Then The user should see The form submitted successfully  
    Then Verify that the user can successfully create an account with a valid National ID.
 Scenario: Verify that the user cannot create an account with an empty Password field.
     Given The user is on The registration page 
     Then Verify that the user cannot create an account with an empty Password field.

 Scenario: Verify that the user can successfully create an account with a strong password (mix of letters, numbers, and symbols).
     Given The user is on The registration page
     Then Verify that the user can successfully create an account with a strong password (mix of letters, numbers, and symbols).
 Scenario: Verify that the Password and Password Confirm fields must match.
     Given The user is on The registration page
          Then Verify that the Password and Password Confirm fields must match.

 Scenario: Verify that the user cannot leave the Gender field empty.
    Given The user is on The registration page
    Then Verify that the user cannot leave the Gender field empty.
 Scenario: Verify that the user can successfully select either Male or Female in the Gender field.
     Given The user is on The registration page
     Then Verify that the user can successfully select either Male or Female in the Gender field.
 Scenario: Verify that the user cannot submit the form without entering all required fields.
     Given The user is on The registration page
     Then Verify that the user cannot submit the form without entering all required fields.
 Scenario: Verify that the user can successfully create an account with a valid email (e.g., ""user@example.com"").
     Given The user is on The registration page
     Then Verify that the user can successfully create an account with a valid email (e.g., ""user@example.com"").
 Scenario: Verify that the user cannot create an account with an already registered email address.
     Given The user is on The registration page
     Then Verify that the user cannot create an account with an already registered email address.
 Scenario: Verify that the ""Create Account"" button is disabled if any required field is empty or invalid.
     Given The user is on The registration page
     Then Verify that the ""Create Account"" button is disabled if any required field is empty or invalid.
 Scenario: Verify that the user cannot create an account with a password that does not meet security requirements (e.g., missing special characters).
     Given The user is on The registration page
     Then Verify that the user cannot create an account with a password that does not meet security requirements (e.g., missing special characters).
 Scenario: Verify the ID number accepts 20 char.
     Given The user is on The registration page
     Then Verify the ID number accepts 20 char.
 Scenario: Verify the phone number accepts 15 numbers
     Given The user is on The registration page
     Then Verify the phone number accepts 15 numbers
 Scenario: Verify that the password must be complex
     Given The user is on The registration page
     Then Verify that the password must be complex
 Scenario: Verify that the user cannot enter an existing email
     Given The user is on The registration page
     Then Verify that the user cannot enter an existing email