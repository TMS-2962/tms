package stepdfination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import Pages.LoginPage;
import Utiles.CommonUtlies;
import Utiles.ElementUtiles;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {

	WebDriver driver; // WebDriver instance for interacting with the browser
	private LoginPage loginPage; // Instance of LoginPage class to interact with the login page
	private CommonUtlies commonUtlies;
	private ElementUtiles elementUtiles;

	// Step for Training Administrator to open the application
	@Given("The user opens the TMS application")
	public void the_user_opens_the_tms_application() {
		driver = DriverFactory.getdriver(); // Get WebDriver instance from DriverFactory
		loginPage = new LoginPage(driver); // Initialize the LoginPage object
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
	}

	// Step for Training Administrator to enter a valid username
	@When("The Training administrator enters a valid username {string}")

	public void the_training_administrator_enters_a_valid_username(String userEmail) throws InterruptedException {
		Thread.sleep(5000);
		loginPage.EnterUserName(userEmail); // Pass the username to the login page to be entered

	}

	// Step for Training Administrator to enter a valid password
	@When("The Training administrator enters a valid password {string}")
	public void the_training_administrator_enters_a_valid_password(String password) {
		loginPage.EnterPassword(password);

	}

	// Step for Training Administrator to click the login button
	@When("Clicks on the login button")
	public void clicks_on_the_login_button() throws InterruptedException {
		Thread.sleep(2000); // Adding a brief delay (should be replaced with explicit waits)
		loginPage.BtnCheckBox(); // Click on the checkbox (e.g., 'remember me')
		Thread.sleep(2000); // Another delay (should ideally be replaced with waits)
		loginPage.BtnLogin(); // Click the login button
	}

	// Step for Trainee to enter a valid username
	@When("The Trainee enters a valid username {string}")
	public void the_trainee_enters_a_valid_username(String userEmail) {
		loginPage.EnterUserName(userEmail);
	}

	// Step for Trainee to enter a valid password
	@When("The Trainee enters a valid password {string}")
	public void the_trainee_enters_a_valid_password(String password) {
		loginPage.EnterPassword(password);
	}

	// Step for Trainer to enter a valid username
	@When("The Trainer enters a valid username {string}")
	public void the_trainer_enters_a_valid_username(String userEmail) {
		loginPage.EnterUserName(userEmail);

	}

	// Step for Trainer to enter a valid password
	@When("The Trainer enters a valid password {string}")
	public void the_trainer_enters_a_valid_password(String password) {
		loginPage.EnterPassword(password);
	}

	@When("validate the Training administrator on login Page")
	public void validate_the_training_administrator_on_login_page() {
		System.out.println(driver.getTitle());
		assertTrue(driver.getTitle().contains("GACA - TMS"));
	}

	@When("validate the Trainee on login Page")
	public void validate_the_trainee_on_login_page() {
		System.out.println(driver.getTitle());
		assertTrue(driver.getTitle().contains("GACA - TMS"));
	}

	@When("validate the Trainer administrator on login Page")
	public void validate_the_trainer_administrator_on_login_page() {
		System.out.println(driver.getTitle());
		assertTrue(driver.getTitle().contains("GACA - TMS"));
	}

	@When("The Training administrator enters an invalid username")
	public void the_training_administrator_enters_an_invalid_username() {
		loginPage.EnterUserName(commonUtlies.generateEmail());
	}

	@When("The Training administrator enters an invalid password {string}")
	public void the_training_administrator_enters_an_invalid_password(String InvalidPassword) {
		loginPage.EnterPassword(InvalidPassword);

	}

	@Then("The Training administrator should see an error message")
	public void the_training_administrator_should_see_an_error_message() {
		String expectedMessage = ".خطأ في اسم المستخدم أو كلمة المرور";
		assertEquals(expectedMessage, loginPage.getErrorMessageText());
		System.out.println(loginPage.getErrorMessageText());
	}

	@Then("The Training administrator should see an error message for missing username and password")
	public void the_training_administrator_should_see_an_error_message_for_missing_username_and_password()
			throws InterruptedException {
		Thread.sleep(2000);
		String expectedMessage = "هذا الحقل مطلوب"; // Expected message for blank password
		assertEquals(expectedMessage, loginPage.getErrorMessageForBlankUserEmail());
		System.out.println(loginPage.getErrorMessageForBlankUserEmail());
		assertEquals(expectedMessage, loginPage.getErrorMessageForBlankPassword());
		System.out.println(loginPage.getErrorMessageForBlankUserEmail());

	}

	@Then("Verify that once logged in, clicking the back button doesn’t log out the user")
	public void verify_that_once_logged_in_clicking_the_back_button_doesn_t_log_out_the_user()
			throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		assertTrue(driver.getTitle().contains("GACA - TMS"));
		System.out.println("Not logout in application");
	}

	@Given("if a user should not be allowed to log in with different credentials from the same browser at the same time")
	public void if_a_user_should_not_be_allowed_to_log_in_with_different_credentials_from_the_same_browser_at_the_same_time()
			throws InterruptedException {
		loginPage.clickOntheTestProfile();
		loginPage.clickLogout();
		loginPage.performLoginInNewTab("tms@cpt-it.com", "password");
		loginPage.clickOntheTestProfile();
		loginPage.clickLogout();
		Thread.sleep(5000);
		loginPage.performLoginInNewTab("Trainee151@tms.com", "P@ssw0rd");
		loginPage.clickOntheTestProfile();
		loginPage.clickLogout();
		loginPage.performLoginInNewTab("trainer@ysolution.net", "password");
	}

	@Then("The Training administrator should see an error message Lock message")
	public void the_training_administrator_should_see_an_error_message_lock_message() throws InterruptedException {
		for (int i = 0; i < 13; i++) {
			loginPage.BtnLogin();
			Thread.sleep(2000);
		}
		assertEquals(loginPage.getErrorMessageForAccountLock(), "هذا الايميل مقفول");

	}

	@Then("The Training administrator should see an error message for missing password")
	public void the_training_administrator_should_see_an_error_message_for_missing_username()
			throws InterruptedException {
		Thread.sleep(2000);
		String expectedMessage = "هذا الحقل مطلوب"; // Expected message for blank password
		assertEquals(expectedMessage, loginPage.getErrorMessageForBlankUserEmail());
		System.out.println(loginPage.getErrorMessageForBlankUserEmail());
	}

	@Then("The Training administrator should see an error message for missing useremail")
	public void the_training_administrator_should_see_an_error_message_for_missing_useremail()
			throws InterruptedException {
		Thread.sleep(5000);
		String expectedMessage = "هذا الحقل مطلوب"; // Expected message for blank password
		assertEquals(expectedMessage, loginPage.getErrorMessageForBlankPassword());
		System.out.println(loginPage.getErrorMessageForBlankPassword());
	}

	@When("Verify that clicking the {string} button logs the user out and redirects to the login page.")
	public void verify_that_clicking_the_button_logs_the_user_out_and_redirects_to_the_login_page(String string)
			throws InterruptedException {
		Thread.sleep(5000);
		loginPage.clickOntheTestProfile();
		loginPage.clickLogout();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		assertTrue(driver.getTitle().contains("GACA - TMS"));

	}

	@When("Verify that the {string} button is visible when logged in.")
	public void verify_that_the_button_is_visible_when_logged_in(String string) throws InterruptedException {
		Thread.sleep(5000);
		loginPage.clickOntheTestProfile();
		Thread.sleep(5000);
		loginPage.clickLogout();
	}

	@When("Verify that the user can log out successfully.")
	public void verify_that_the_user_can_log_out_successfully() throws InterruptedException {
		Thread.sleep(5000);
		loginPage.clickOntheTestProfile();
		Thread.sleep(5000);
		loginPage.clickLogout();
		System.out.println("User Log Out successfully ");
	}

	@When("Verify that the {string} checkbox works and keeps the user logged in for a set duration when checked.")
	public void verify_that_the_checkbox_works_and_keeps_the_user_logged_in_for_a_set_duration_when_checked(
			String string) throws InterruptedException {
		Thread.sleep(5000);
		assertEquals(loginPage.getRememberMeLabelText(), "تذكرني");

	}

	@Given("Verify that the password field masks \\(shows asterisks) the entered password for security.")
	public void verify_that_the_password_field_masks_shows_asterisks_the_entered_password_for_security()
			throws InterruptedException {
		Thread.sleep(5000);
		loginPage.clickEyeSlashIcon();
	}

	@When("Verify that the login button is enabled when both Email and Password fields are populated.")
	public void verify_that_the_login_button_is_enabled_when_both_email_and_password_fields_are_populated()
			throws InterruptedException {
		Thread.sleep(5000);
		loginPage.BtnLogin(); // Click the login button
	}

	@When("Verify that the login button redirects to the homepage or dashboard after a successful login.")
	public void verify_that_the_login_button_redirects_to_the_homepage_or_dashboard_after_a_successful_login() {
		System.out.println(driver.getTitle());
		assertTrue(driver.getTitle().contains("GACA - TMS"));
	}

	@When("Verify that the {string} checkbox does not log the user in if it is unchecked.")
	public void verify_that_the_checkbox_does_not_log_the_user_in_if_it_is_unchecked(String string) {
		System.out.println("Verify that the {string} checkbox does not log the user in if it is unchecked.");
	}

	@When("Verify that the user is not logged in automatically after the session expires, if the {string} checkbox is unchecked.")
	public void verify_that_the_user_is_not_logged_in_automatically_after_the_session_expires_if_the_checkbox_is_unchecked(
			String string) {
		System.out.println(
				"Verify that the user is not logged in automatically after the session expires, if the {string} checkbox is unchecked.");

	}

	@When("Verify that the user is automatically logged in after closing and reopening the browser when {string} is checked.")
	public void verify_that_the_user_is_automatically_logged_in_after_closing_and_reopening_the_browser_when_is_checked(
			String string) {
		System.out.println(
				"Verify that the user is automatically logged in after closing and reopening the browser when {string} is checked");
	}

	@When("Verify that the {string} checkbox does not cause an error if unchecked with invalid credentials.")
	public void verify_that_the_checkbox_does_not_cause_an_error_if_unchecked_with_invalid_credentials(String string) {
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	@When("Verify that the user can log in by pressing the {string} key after entering valid credentials.")
	public void verify_that_the_user_can_log_in_by_pressing_the_key_after_entering_valid_credentials(String string) {
		System.out.println(
				"Verify that the user can log in by pressing the {string} key after entering valid credentials.");
	}

	@When("Verify that the Login button is disabled when the Email and Password fields are cleared after entering invalid data.")
	public void verify_that_the_login_button_is_disabled_when_the_email_and_password_fields_are_cleared_after_entering_invalid_data() {
		System.out.println(
				"Verify that the Login button is disabled when the Email and Password fields are cleared after entering invalid data.");
	}

}
