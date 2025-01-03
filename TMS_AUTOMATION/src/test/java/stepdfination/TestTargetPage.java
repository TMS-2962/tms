package stepdfination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.TargetPage;
import Utiles.CommonUtlies;
import Utiles.ElementUtiles;
import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTargetPage {

	WebDriver driver;
	private TargetPage targetPage; // Instance of TargetPage class to interact with target group functionalities
	private HomePage homePage; // Instance of HomePage class to interact with home page functionalities
	private CommonUtlies commonUtlies; // Utility class instance for common functionality like getting text
	private ElementUtiles elementUtiles;

	// Step definition for landing on Target Groups Page and clicking on the 'Add
	// Category' button
	@Then("Lands on Target Groups Page and clicks on the Add category")
	public void lands_on_target_groups_page_and_clicks_on_the_add_category() throws InterruptedException {
		driver = DriverFactory.getdriver();
		targetPage = new TargetPage(driver);
		homePage = new HomePage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		homePage.clickOnclickdrpChooseTargetGroups();
		Thread.sleep(3000);
		targetPage.ClickOnTheAddCategory();
	}

	// Step definition for entering a category name in the "Add Category" input
	// field
	@Then("Enters category name")
	public void entres_category_name() throws InterruptedException {
		Thread.sleep(3000);
		targetPage.EnterTextInTheAddCategory(commonUtlies.getTextForAddTargetGroupName());
	}

	// Step definition for clicking the "Add" button after entering the category
	// name
	@Then("Clicks on the Add button")
	public void click_on_the_add_button() throws InterruptedException {
		Thread.sleep(3000);
		targetPage.ClickOnBtnAdd();
	}

	// Step definition for landing on the Target Groups Page and clicking on the
	// "Edit Category" button
	@Then("Lands on Target Groups Page and clicks on the edit category")
	public void lands_on_target_groups_page_and_clicks_on_the_edit_category() throws InterruptedException {
		driver = DriverFactory.getdriver();
		targetPage = new TargetPage(driver);
		homePage = new HomePage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		homePage.clickOnclickdrpChooseTargetGroups();
		Thread.sleep(3000);
		targetPage.ClickOnTheEdit();
		targetPage.EnterTextInTheAddCategory(commonUtlies.getTextForAddTargetGroupName());
	}

	// Step definition for clicking the "Update" button after editing the category
	@Then("Clicks on the Update button")
	public void click_on_the_update_button() throws InterruptedException {
		Thread.sleep(3000);
		targetPage.ClickOnTheUpdate();
	}

	// Step definition for landing on the Target Groups Page and clicking on the
	// search category
	@Then("Lands on Target Groups Page and clicks on the search category")
	public void lands_on_target_groups_page_and_clicks_on_the_search_category() throws InterruptedException {
		driver = DriverFactory.getdriver();
		targetPage = new TargetPage(driver);
		homePage = new HomePage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		homePage.clickOnclickdrpChooseTargetGroups();
	}

	// Step definition for entering a search name in the search input field
	@Then("Enters search name")
	public void enters_search_name() throws InterruptedException {
		Thread.sleep(5000);
		targetPage.enterSearchText("TestTMS28");
	}

	// Step definition for clicking the "Enter" button to submit the search
	@Then("Clicks on the Enter button")
	public void clicks_on_the_enter_button() throws InterruptedException {
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		assertEquals(targetPage.getTestTMS28Element(), "TestTMS28");
	}

	// Step definition for verifying the error message for a blank category name
	@Then("verify the error Message for dded Blank category")
	public void verify_the_error_message_for_dded_blank_category() throws InterruptedException {
		Thread.sleep(5000);
		assertEquals(targetPage.getFieldRequiredMessageText(), "This Field is Required");
	}

	// Step definition for entering a duplicate category name
	@Then("Enters Duplicate category name")
	public void enters_duplicate_category_name() throws InterruptedException {
		Thread.sleep(3000);
		targetPage.EnterTextInTheAddCategory("TestTMS28");
	}

	// Step definition for verifying the error message for a duplicate category
	@Then("verify the error Message for Duplicate category")
	public void verify_the_error_message_for_duplicate_category() throws InterruptedException {
		Thread.sleep(5000);
		assertEquals("The category you wish to add already exists. We hope to add a new category",
				targetPage.getAlertMessageText());
	}

	// Step definition for entering special characters in the category name
	@Then("Enters  Sepcial character in category name")
	public void enters_sepcial_character_in_category_name() throws InterruptedException {
		Thread.sleep(3000);
		targetPage.EnterTextInTheAddCategory("TestTMS28#");
	}

	// Step definition for verifying the error message for special characters in the
	// category name
	@Then("verify the error Message for Sepcial character in category")
	public void verify_the_error_message_for_sepcial_character_in_category() throws InterruptedException {
		Thread.sleep(5000);
		assertEquals(targetPage.getSpecialCharacterMessageText(), "Not allowed Use special characters");
	}

	@Then("enter search result")
	public void enter_search_result() throws InterruptedException {
		Thread.sleep(5000);
		targetPage.enterSearchText("265thbxjt7x");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	@Then("enter html code OR link in search field.")
	public void enter_html_code_or_link_in_search_field() throws InterruptedException {
		Thread.sleep(5000);
		targetPage.enterSearchText(
				"<script src=\"https://cdn-na.readspeaker.com/script/37/webReader/webReader.js?pids=wr\" type=\"text/javascript\" id=\"rs_req_Init\"></script>");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	@Then("search filed is blank validate")
	public void search_filed_is_blank_validate() throws InterruptedException {
		Thread.sleep(3000);
		targetPage.enterSearchText("TestTMS28");
		Thread.sleep(6000);
		driver.navigate().refresh();
	}

	@Then("Proper messages should be displayed when there are no results")
	public void proper_messages_should_be_displayed_when_there_are_no_results() throws InterruptedException {
		Thread.sleep(5000);
		assertEquals(targetPage.getNoMatchingResultsMessageText(), "There are No Matching Results");
	}

	@When("I click on the Previous button")
	public void i_click_on_the_previous_button() throws InterruptedException {
		driver = DriverFactory.getdriver();
		targetPage = new TargetPage(driver);
		homePage = new HomePage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		homePage.clickOnclickdrpChooseTargetGroups();
		Thread.sleep(8000);
		targetPage.clickNextButton();
		Thread.sleep(3000);
		targetPage.clickPreviousButton();
	}

	@When("the content should update to reflect the previous page")
	public void the_content_should_update_to_reflect_the_previous_page() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("The Previous button is working :" + targetPage.isPreviousButtonDisplayed());

	}

	@When("I click on the Next button")
	public void i_click_on_the_next_button() throws InterruptedException {
		driver = DriverFactory.getdriver();
		targetPage = new TargetPage(driver);
		homePage = new HomePage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(3000);
		homePage.clickOnclickdrpChooseTargetGroups();
		Thread.sleep(8000);
		targetPage.clickNextButton();
	}

	@When("the content should update to reflect the next page")
	public void the_content_should_update_to_reflect_the_next_page() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Next button is displayed :" + targetPage.isNextButtonDisplayed());
	}

	@Then("Enters category name with forty character")
	public void enters_category_name_with_forty_character() throws InterruptedException {
		Thread.sleep(3000);
		targetPage.EnterTextInTheAddCategory("TestTMS28ncksjcnksckshicjhskncsnknklnkljxcj");
	}

	@Then("click on the cancel button Add category")
	public void click_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(5000);
		elementUtiles.pressEscape(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		System.out.println("No data is added");
	}

	@Then("Lands on Target Groups Page")
	public void lands_on_target_groups_page() throws InterruptedException {
		driver = DriverFactory.getdriver();
		targetPage = new TargetPage(driver);
		homePage = new HomePage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		homePage.clickOnclickdrpChooseTargetGroups();
	}

	@Then("Find element of activation and perform click.")
	public void find_element_of_activation_and_perform_click() throws InterruptedException {
		Thread.sleep(5000);
		targetPage.toggleActiveState();
		targetPage.isActive();
		targetPage.enableOrDisable();
	}

	@Then("Check if the clicking on the filter button opens the filter option in Target Groups Page..")
	public void check_if_the_clicking_on_the_filter_button_opens_the_filter_option_in_target_groups_page()
			throws InterruptedException {
		Thread.sleep(5000);
		targetPage.clickFilter();
	}

	@Then("Check if all the filter options are available in Target Groups Page.")
	public void check_if_all_the_filter_options_are_available_in_target_groups_page() throws InterruptedException {
		Thread.sleep(5000);
		targetPage.clickFilter();
		assertEquals(targetPage.getViewText(), "View");
		assertEquals(targetPage.getStatusText(), "Status");
	}

}
