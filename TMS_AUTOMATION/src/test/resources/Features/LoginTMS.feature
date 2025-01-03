# Login page
Feature: Users login into TMS application

  Background: 
    Given The user opens the TMS application

  Scenario: Training administrator login with valid username and password
    When The Training administrator enters a valid username "tms@cpt-it.com"
    And The Training administrator enters a valid password "password"
    And Clicks on the login button
    And validate the Training administrator on login Page

  #Scenario: Trainee login with valid username and password
    #When The Trainee enters a valid username "Trainee151@tms.com"
    #And The Trainee enters a valid password "P@ssw0rd"
    #And Clicks on the login button
    #And validate the Trainee on login Page
#
  #Scenario: Trainer login with valid username and password
    #When The Trainer enters a valid username "trainer@ysolution.net"
    #And The Trainer enters a valid password "password"
    #And Clicks on the login button
    #And validate the Trainer administrator on login Page
#
  #Scenario: Training administrator login with invalid username and password
    #When The Training administrator enters an invalid username
    #And The Training administrator enters an invalid password "wrongpassword2"
    #And Clicks on the login button
    #Then The Training administrator should see an error message
#
  #Scenario: Training administrator attempts to login with blank username and password
    #And Clicks on the login button
    #Then The Training administrator should see an error message for missing username and password
#
  #Scenario: Training administrator attempts to login with blank username
    #And The Trainer enters a valid password "password"
    #And Clicks on the login button
    #Then The Training administrator should see an error message for missing password
#
  #Scenario: Training administrator attempts to login with blank Password
    #When The Trainer enters a valid username "trainer@ysolution.net"
    #And Clicks on the login button
    #Then The Training administrator should see an error message for missing useremail
#
  #Scenario: Verify that once logged in, clicking the back button doesn’t log out the user.
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Clicks on the login button
    #Then Verify that once logged in, clicking the back button doesn’t log out the user
#
  #Scenario: Verify if a user should not be allowed to log in with different credentials from the same browser at the same time
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Clicks on the login button
    #Given if a user should not be allowed to log in with different credentials from the same browser at the same time
#
  #Scenario: Verify that After 3 or 5 unsuccessful attempts of login, user account got locked
    #When The Training administrator enters an invalid username
    #And The Training administrator enters an invalid password "wrongpassword2"
    #Then The Training administrator should see an error message Lock message
#
  #Scenario: Verify that clicking the "Logout" button logs the user out and redirects to the login page.
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Clicks on the login button
    #And Verify that clicking the "Logout" button logs the user out and redirects to the login page.
#
  #Scenario: Verify that the "Logout" button is visible when logged in.
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Clicks on the login button
    #And Verify that the "Logout" button is visible when logged in.
#
  #Scenario: Verify that the user can log out successfully.
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Clicks on the login button
    #And validate the Training administrator on login Page
    #And Verify that the user can log out successfully.
#
  #Scenario: Verify that the "Remember Me" checkbox works and keeps the user logged in for a set duration when checked.
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Verify that the "Remember Me" checkbox works and keeps the user logged in for a set duration when checked.
    #And Clicks on the login button
#
  #Scenario: Verify that the password field masks (shows asterisks) the entered password for security.
    #And The Training administrator enters a valid password "password"
    #And Verify that the password field masks (shows asterisks) the entered password for security.
#
  #Scenario: Verify that the login button is enabled when both Email and Password fields are populated.
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Verify that the login button is enabled when both Email and Password fields are populated.
#
  #Scenario: Verify that the login button redirects to the homepage or dashboard after a successful login.
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Clicks on the login button
    #And Verify that the login button redirects to the homepage or dashboard after a successful login.
#
  #Scenario: Verify that the "Remember Me" checkbox does not log the user in if it is unchecked.
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Clicks on the login button
    #And Verify that the "Remember Me" checkbox does not log the user in if it is unchecked.
#
  #Scenario: Verify that the user is not logged in automatically after the session expires, if the "Remember Me" checkbox is unchecked.
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Clicks on the login button
    #And Verify that the user is not logged in automatically after the session expires, if the "Remember Me" checkbox is unchecked.
#
  #Scenario: Verify that the user is automatically logged in after closing and reopening the browser when "Remember Me" is checked.
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Clicks on the login button
    #And Verify that the user is automatically logged in after closing and reopening the browser when "Remember Me" is checked.
#
  #Scenario: Verify that the "Remember Me" checkbox does not cause an error if unchecked with invalid credentials.
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Clicks on the login button
    #And Verify that the "Remember Me" checkbox does not cause an error if unchecked with invalid credentials.
#
  #Scenario: Verify that the user can log in by pressing the 'Enter' key after entering valid credentials.
    #When The Training administrator enters a valid username "tms@cpt-it.com"
    #And The Training administrator enters a valid password "password"
    #And Verify that the user can log in by pressing the 'Enter' key after entering valid credentials.

  Scenario: Verify that the Login button is disabled when the Email and Password fields are cleared after entering invalid data.
    When The Training administrator enters a valid username "tms1@cpt-it.com"
    And The Training administrator enters a valid password "password1"
    And Clicks on the login button
    And Verify that the Login button is disabled when the Email and Password fields are cleared after entering invalid data.
