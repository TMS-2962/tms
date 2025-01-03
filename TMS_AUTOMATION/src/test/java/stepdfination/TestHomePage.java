package stepdfination;

import org.openqa.selenium.WebDriver;
import Pages.HomePage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestHomePage {

	WebDriver driver; // WebDriver instance for interacting with the browser
	private HomePage homePage; // HomePage instance to interact with the HomePage elements

	@Given("Adminstrator is lands on the Home Page and Click on the Language Dropdown")
	public void adminstrator_is_lands_on_the_home_page_and_click_on_the_language_dropdown()
			throws InterruptedException {
		driver = DriverFactory.getdriver(); // Get WebDriver instance
		homePage = new HomePage(driver); // Initialize the HomePage object
		Thread.sleep(3000);
		homePage.clickOndrpChooseLanguage();
		Thread.sleep(3000);
	}

	// Step for clicking on the suitable language (for example, English)

	@Then("Clicks on the sutiable language")
	public void clicks_on_the_sutiable_language() {

		homePage.clickOnchooseEnglishLanguage();
	}

	// Step for clicking on the Role Dropdown
	@Then("Clicks on the Role Dropdown")
	public void clicks_on_the_role_dropdown() {

		homePage.clickOndrpChooseRoleAdministrator();
	}

	// Step for clicking on the "Empowerment" role option
	@Then("clicks on the empowerment option")
	public void clicks_on_the_empowerment_option() {

		homePage.clickOndrpChooseRoleEmpowerment();
	}

	// Step for navigating through the navigation bar and selecting the Target
	// Groups option
	@Then("Go through the navigation bar and select the Target Groups option.")
	public void go_through_the_navigation_bar_and_select_the_target_groups_option() {

	}

	@Then("validate the Status of courese present on the Home Page of the TMS application")
	public void validate_the_status_of_courese_present_on_the_home_page_of_the_tms_application() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("All the Coures information :" + homePage.getAllStatsTitlesText());

	}
}
