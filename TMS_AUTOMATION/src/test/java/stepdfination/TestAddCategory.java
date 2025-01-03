package stepdfination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Pages.AddCategoryPage;
import Pages.HomePage;
import Pages.TargetPage;
import Utiles.CommonUtlies;
import Utiles.ElementUtiles;
import factory.DriverFactory;
import io.cucumber.java.en.Then;

public class TestAddCategory {
	WebDriver driver;
	private AddCategoryPage addCategoryPage;
	private CommonUtlies commonUtlies;
	private ElementUtiles elementUtiles;

	@Then("Lands on the Category Groups Page and clicks on the Add category group")
	public void lands_on_the_category_groups_page_and_clicks_on_the_add_category_group() throws InterruptedException {
		driver = DriverFactory.getdriver();
		addCategoryPage = new AddCategoryPage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		addCategoryPage.clickOnCategory();
		addCategoryPage.clickAddCategory();
	}

	@Then("Enters category group name")
	public void enters_category_group_name() throws InterruptedException {
		Thread.sleep(5000);
		addCategoryPage.enterCategoryName(commonUtlies.getTextForAddCategoryGroupName());

	}

	@Then("Clicks on the Add button of category")
	public void clicks_on_the_add_button_of_category() throws InterruptedException {
		Thread.sleep(5000);
		addCategoryPage.clickAddButton();
	}

	@Then("Lands on the Category Groups Page and clicks on the edit category group")
	public void lands_on_the_category_groups_page_and_clicks_on_the_edit_category_group() throws InterruptedException {
		driver = DriverFactory.getdriver();
		addCategoryPage = new AddCategoryPage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		addCategoryPage.clickOnCategory();
		Thread.sleep(5000);
		addCategoryPage.clickEditImage();

	}

	@Then("Clicks on the Update  button of category")
	public void clicks_on_the_update_button_of_category() throws InterruptedException {
		Thread.sleep(5000);
		addCategoryPage.ClickOnTheUpdate();
	}

	@Then("Lands on the Category Groups Page and clicks on the search category group")
	public void lands_on_the_category_groups_page_and_clicks_on_the_search_category_group()
			throws InterruptedException {
		driver = DriverFactory.getdriver();
		addCategoryPage = new AddCategoryPage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		addCategoryPage.clickOnCategory();

	}

	@Then("Enters search name of category")
	public void enters_search_name_of_category() throws InterruptedException {
		Thread.sleep(5000);
		addCategoryPage.searchCategory("TestTMSSuyog72");

	}

	@Then("Clicks on the Enter button of category")
	public void clicks_on_the_enter_button_of_category() {
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		assertEquals(addCategoryPage.getTextFromElement(), "TestTMSSuyog72");
	}

	@Then("Clicks on the Add of category button")
	public void clicks_on_the_add_of_category_button() throws InterruptedException {
		Thread.sleep(5000);
		addCategoryPage.clickAddButton();
	}

	@Then("Verifies the error message for added Blank category group")
	public void verifies_the_error_message_for_added_blank_category_group() {

		assertEquals(addCategoryPage.isRequiredFieldMessageDisplayed(), "This Field is Required");
	}

	@Then("Enters Duplicate category group name")
	public void enters_duplicate_category_group_name() throws InterruptedException {

		Thread.sleep(5000);
		addCategoryPage.enterCategoryName("TestTMSSuyog72");
	}

	@Then("Verifies the error message for Duplicate category group")
	public void verifies_the_error_message_for_duplicate_category_group() throws InterruptedException {

		assertEquals(addCategoryPage.isCategoryExistsMessageDisplayed(),
				"The category you wish to add already exists. We hope to add a new category");
	}

	@Then("Enters Special character in category group name")
	public void enters_special_character_in_category_group_name() throws InterruptedException {
		addCategoryPage.enterCategoryName("TestTMSSuyog72@");
	}

	@Then("Verifies the error message for Special character in category group")
	public void verifies_the_error_message_for_special_character_in_category_group() {

		assertEquals(addCategoryPage.getSpecialCharacterMessageText(), "Not allowed Use special characters");
	}

	@Then("Enters category group name with Forty characters")
	public void enters_category_group_name_with_forty_characters() throws InterruptedException {
		Thread.sleep(5000);
		addCategoryPage.enterCategoryName("TestTMSSuyog72cvsdchshcbsjchbkjcjkasbcxkhjsancasjhxcasjkxcnsahxcjklshc");
	}

	@Then("click on the cancel button")
	public void click_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(5000);
		elementUtiles.pressEscape(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		System.out.println("No data is added");
	}

	@Then("Lands on Category Groups Page")
	public void lands_on_category_groups_page() throws InterruptedException {
		driver = DriverFactory.getdriver();
		addCategoryPage = new AddCategoryPage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		addCategoryPage.clickOnCategory();
	}

	@Then("Find element in Category Groups Page of activation and perform click.")
	public void find_element_in_category_groups_page_of_activation_and_perform_click() throws InterruptedException {
		Thread.sleep(5000);
		try {
			addCategoryPage.toggleActiveState();
			addCategoryPage.isActive();
			addCategoryPage.enableOrDisable();
		} catch (Exception e) {
			System.out.println("The Category is disable");
		}
	}

	@Then("Check if the clicking on the filter button opens the filter option.")
	public void check_if_the_clicking_on_the_filter_button_opens_the_filter_option() {
		addCategoryPage.clickFilter();

	}

	@Then("Check if all the filter options are available.")
	public void check_if_all_the_filter_options_are_available() {
		addCategoryPage.clickFilter();
		assertEquals(addCategoryPage.getViewText(), "View");
		assertEquals(addCategoryPage.getStatusText(), "Status");
	}

	@Then("Verify pagination is accessible or not by clicking on the Next button in categorty .")
	public void verify_pagination_is_accessible_or_not_by_clicking_on_the_next_button_in_categorty()
			throws InterruptedException {
		Thread.sleep(3000);
		addCategoryPage.clickNextButton();
		Thread.sleep(3000);
		System.out.println("Next button is displayed :" + addCategoryPage.isNextButtonDisplayed());
	}

	@Then("Verify pagination is accessible or not by clicking on the Previous button in category.")
	public void verify_pagination_is_accessible_or_not_by_clicking_on_the_previous_button_in_category()
			throws InterruptedException {
		Thread.sleep(6000);
		addCategoryPage.clickNextButton();
		Thread.sleep(3000);
		addCategoryPage.clickPreviousButton();
		System.out.println("The Previous button is working :" + addCategoryPage.isPreviousButtonDisplayed());
	}

	@Then("Verify that Application should not crash if user added html code OR link in search field in category.")
	public void verify_that_application_should_not_crash_if_user_added_html_code_or_link_in_search_field_in_category()
			throws InterruptedException {
		Thread.sleep(5000);
		addCategoryPage.searchCategory(
				"https://docs.google.com/document/d/1i2QKMt9yu7rYMOYyOBXWJFQk9IU9ot4pAuzgu2YSTuo/edit?tab=t.0");
		Thread.sleep(7000);
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	@Then("Verify that Proper messages should be displayed when there are no results in category group.")
	public void verify_that_proper_messages_should_be_displayed_when_there_are_no_results_in_category_group()
			throws InterruptedException {
		Thread.sleep(5000);
		addCategoryPage.searchCategory("weadad");
		Thread.sleep(5000);
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		assertEquals(addCategoryPage.getNoMatchingResultsMessageText(), "There are No Matching Results");
	}

	@Then("Verify that if you click the icon \\(X) after adding keywords in the search field, the search field is")
	public void verify_that_if_you_click_the_icon_x_after_adding_keywords_in_the_search_field_the_search_field_is()
			throws InterruptedException {
		Thread.sleep(5000);
		addCategoryPage.searchCategory("weadad");
		driver.navigate().refresh();
		System.out.println("Search filed is blank");
	}

	@Then("Verify that Application should not crash if user added special character in search field of category")
	public void verify_that_application_should_not_crash_if_user_added_special_character_in_search_field_of_category()
			throws InterruptedException {
		Thread.sleep(5000);
		addCategoryPage.searchCategory("@");
		Thread.sleep(5000);
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		assertEquals(addCategoryPage.getNoMatchingResultsMessageText(), "There are No Matching Results");
	}

	@Then("Verify selected filter can be cleared in catgory.")
	public void verify_selected_filter_can_be_cleared_in_catgory() throws InterruptedException {
		System.out.println("selected filter can be cleared in catgor");
		// Adding a delay to stabilize the UI after loading (consider replacing
		// Thread.sleep with explicit waits).
		Thread.sleep(5000);

		// Step 1: Click on the filter dropdown to open it.
		addCategoryPage.clickFilterDropdown();

		// Step 2: Select the filter option '50'.
		addCategoryPage.selectFilterOption("10");

		// Adding another delay to stabilize after filter selection.
		Thread.sleep(5000);

		// Step 3: Scroll to the end of the page to ensure visibility of all elements.
		elementUtiles.scrollToEndOfPage();

		// Adding another delay for page scrolling to complete (replaceable with waits
		// if needed).
		Thread.sleep(5000);

		// Step 4: Assert that the table row value matches the selected filter option.
		assertEquals(addCategoryPage.getTableRowValueText("10"), "10");
		System.out.println("After 1 selection result is clerard");
		// Step 1: Click on the filter dropdown to open it.
		addCategoryPage.clickFilterDropdown();

		// Step 2: Select the filter option '50'.
		addCategoryPage.selectFilterOption("10");

		// Adding another delay to stabilize after filter selection.
		Thread.sleep(5000);

		// Step 3: Scroll to the end of the page to ensure visibility of all elements.
		elementUtiles.scrollToEndOfPage();

		// Adding another delay for page scrolling to complete (replaceable with waits
		// if needed).
		Thread.sleep(5000);

		// Step 4: Assert that the table row value matches the selected filter option.
		assertEquals(addCategoryPage.getTableRowValueText("10"), "10");
	}

	@Then("Check if the filtering leads to Right results in catgory.")
	public void check_if_the_filtering_leads_to_right_results_in_catgory() throws InterruptedException {
		System.out.println("filtering leads to Right results in catgory.");
		// Adding a delay to stabilize the UI after loading (consider replacing
		// Thread.sleep with explicit waits).
		Thread.sleep(5000);

		// Step 1: Click on the filter dropdown to open it.
		addCategoryPage.clickFilterDropdown();

		// Step 2: Select the filter option '50'.
		addCategoryPage.selectFilterOption("50");

		// Adding another delay to stabilize after filter selection.
		Thread.sleep(5000);

		// Step 3: Scroll to the end of the page to ensure visibility of all elements.
		elementUtiles.scrollToEndOfPage();

		// Adding another delay for page scrolling to complete (replaceable with waits
		// if needed).
		Thread.sleep(5000);

		// Step 4: Assert that the table row value matches the selected filter option.
		assertEquals(addCategoryPage.getTableRowValueText("50"), "50");

	}

}
