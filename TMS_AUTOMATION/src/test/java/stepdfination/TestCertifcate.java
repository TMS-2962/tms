package stepdfination;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import Pages.CertificatePage;
import Utiles.CommonUtlies;
import Utiles.ElementUtiles;
import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCertifcate {
	WebDriver driver;
	private CertificatePage certificate;
	private CommonUtlies commonUtlies;
	private ElementUtiles elementUtiles;

	@Then("Training Administrator navigate to the Certificates section")
	public void training_administrator_navigate_to_the_certificates_section() throws InterruptedException {
		driver = DriverFactory.getdriver();
		certificate = new CertificatePage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		certificate.clickCertificateImage();

	}

	@When("Training Administrator click on the Add Certificate button")
	public void training_administrator_click_on_the_add_certificate_button() throws InterruptedException {

		Thread.sleep(5000);
		certificate.clickAddCertificateButton();

	}

	@When("Training Administrator enter the Arabic Certificate Name")
	public void training_administrator_enter_the_arabic_certificate_name() throws InterruptedException {
		Thread.sleep(5000);
		certificate.enterName(CommonUtlies.generateRandomStringWithNumber());
	}

	@When("Training Administrato renter the English Certificate Name")
	public void training_administrato_renter_the_english_certificate_name() {
		certificate.enterEnglishName(CommonUtlies.generateRandomStringWithNumber());
	}

	@When("Training Administrator enter the Arabic Certificate Title")
	public void training_administrator_enter_the_arabic_certificate_title() {
		certificate.enterAddress(CommonUtlies.generateRandomStringWithNumber());
	}

	@When("Training Administrator enter the English Certificate Title")
	public void training_administrator_enter_the_english_certificate_title() {
		certificate.enterEnglishAddress(CommonUtlies.generateRandomStringWithNumber());
	}

	@When("Training Administrator select the Certificate Type")
	public void training_administrator_select_the_certificate_type() {
		certificate.selectCertificateType();
		certificate.clickPassingCertificateOption();
	}

	@When("Training Administrator enter the Arabic Academy Head Name")
	public void training_administrator_enter_the_arabic_academy_head_name() {
		certificate.enterPresidentName(CommonUtlies.generateRandomStringWithNumber());
	}

	@When("Training Administrator enter the Trainers Signature")
	public void training_administrator_enter_the_trainers_signature() {
		certificate.FileInputFieldCoach("src/test/resources/TMSFiles/TMS.jpg");
	}

	@When("Training Administrator enter the Academy Heads Signature")
	public void training_administrator_enter_the_academy_heads_signature() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		certificate.FileInputFieldPrisdent("src/test/resources/TMSFiles/TMD.png");
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	@When("Training Administratorclick on the Save button")
	public void training_administratorclick_on_the_save_button() {
		certificate.clickSaveButton();
	}

	@Then("the new certificate should be saved successfully")
	public void the_new_certificate_should_be_saved_successfully() {
		assertEquals(certificate.getSaveSuccessfullyText(), "Save Successfully");
		System.out.println("The certifcate :" + certificate.getSaveSuccessfullyText());
	}

	@Then("Check if the clicking on the filter button opens the filter option Certificates section.")
	public void check_if_the_clicking_on_the_filter_button_opens_the_filter_option_certificates_section()
			throws InterruptedException {
		Thread.sleep(5000);
		certificate.clickFilter();
	}

	@Then("Check if all the filter options are available Certificates section.")
	public void check_if_all_the_filter_options_are_available_certificates_section() throws InterruptedException {
		Thread.sleep(5000);
		certificate.clickFilter();
		assertEquals(certificate.getViewText(), "View");

	}

	@When("I click on the Next button Certificates section")
	public void i_click_on_the_next_button_certificates_section() throws InterruptedException {
		Thread.sleep(8000);
		certificate.clickNextButton();
	}

	@When("the content should update to reflect the next page Certificates section")
	public void the_content_should_update_to_reflect_the_next_page_certificates_section() {
		System.out.println("Next button is displayed :" + certificate.isNextButtonDisplayed());
	}

	@When("I click on the Previous button Certificates section")
	public void i_click_on_the_previous_button_certificates_section() throws InterruptedException {
		Thread.sleep(5000);
		certificate.clickNextButton();
		Thread.sleep(3000);
		certificate.clickPreviousButton();
	}

	@When("the content should update to reflect the previous page Certificates section")
	public void the_content_should_update_to_reflect_the_previous_page_certificates_section() {
		System.out.println("The Previous button is working :" + certificate.isPreviousButtonDisplayed());
	}

	@Then("search filed is blank validate in certifcate")
	public void search_filed_is_blank_validate_in_certifcate() throws InterruptedException {
		Thread.sleep(3000);
		certificate.enterSearchText("TestTMS28");
		driver.navigate().refresh();
	}

	@Then("enter search result in certifcate")
	public void enter_search_result_in_certifcate() throws InterruptedException {
		Thread.sleep(5000);
		certificate.enterSearchText("aaaaaaaaaaa");
		Thread.sleep(5000);
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

	}

	@Then("Enters  Sepcial character in category name Certificates section")
	public void enters_sepcial_character_in_category_name_certificates_section() throws InterruptedException {
		Thread.sleep(5000);
		certificate.enterSearchText("@");
		Thread.sleep(5000);
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	@Then("Proper messages should be displayed when there are no results in certifcate")
	public void proper_messages_should_be_displayed_when_there_are_no_results_in_certifcate()
			throws InterruptedException {
		Thread.sleep(5000);
		assertEquals(certificate.getNoMatchingResultsMessageText(), "There are No Matching Results");

	}

	@Then("enter html code OR link in search field in certifcate.")
	public void enter_html_code_or_link_in_search_field_in_certifcate() throws InterruptedException {
		Thread.sleep(5000);
		certificate.enterSearchText(
				"<script src=\"https://cdn-na.readspeaker.com/script/37/webReader/webReader.js?pids=wr\" type=\"text/javascript\" id=\"rs_req_Init\"></script>");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

	}

	@Then("Verify selected filter can be cleared Certificates section.")
	public void verify_selected_filter_can_be_cleared_certificates_section() throws InterruptedException {
		System.out.println("Verify selected filter can be cleared Certificates section");
		// Adding a delay to stabilize the UI after loading (consider replacing
		// Thread.sleep with explicit waits).
		Thread.sleep(5000);

		// Step 1: Click on the filter dropdown to open it.
		certificate.clickFilterDropdown();

		// Step 2: Select the filter option '50'.
		certificate.selectFilterOption("10");

		// Adding another delay to stabilize after filter selection.
		Thread.sleep(5000);

		// Step 3: Scroll to the end of the page to ensure visibility of all elements.
		elementUtiles.scrollToEndOfPage();

		// Adding another delay for page scrolling to complete (replaceable with waits
		// if needed).
		Thread.sleep(5000);

		// Step 4: Assert that the table row value matches the selected filter option.
		assertEquals(certificate.getTableRowValueText("10"), "10");
		System.out.println("After 1 selection result is clerard");
		// Step 1: Click on the filter dropdown to open it.
		certificate.clickFilterDropdown();

		// Step 2: Select the filter option '50'.
		certificate.selectFilterOption("10");

		// Adding another delay to stabilize after filter selection.
		Thread.sleep(5000);

		// Step 3: Scroll to the end of the page to ensure visibility of all elements.
		elementUtiles.scrollToEndOfPage();

		// Adding another delay for page scrolling to complete (replaceable with waits
		// if needed).
		Thread.sleep(5000);

		// Step 4: Assert that the table row value matches the selected filter option.
		assertEquals(certificate.getTableRowValueText("10"), "10");

	}

	/**
	 * Verifies that the filtering in the Certificates section leads to the correct
	 * results. Steps: 1. Waits for the dropdown and selects the filter option '50'.
	 * 2. Scrolls to the end of the page to ensure all elements are loaded. 3.
	 * Validates that the table row value matches the selected filter option.
	 * 
	 * @throws InterruptedException if the thread sleep is interrupted.
	 */
	@Then("Check if the filtering leads to Right results Certificates section.")
	public void check_if_the_filtering_leads_to_right_results_certificates_section() throws InterruptedException {
		System.out.println("Check if the filtering leads to Right results Certificates section.");

		// Adding a delay to stabilize the UI after loading (consider replacing
		// Thread.sleep with explicit waits).
		Thread.sleep(5000);

		// Step 1: Click on the filter dropdown to open it.
		certificate.clickFilterDropdown();

		// Step 2: Select the filter option '50'.
		certificate.selectFilterOption("50");

		// Adding another delay to stabilize after filter selection.
		Thread.sleep(5000);

		// Step 3: Scroll to the end of the page to ensure visibility of all elements.
		elementUtiles.scrollToEndOfPage();

		// Adding another delay for page scrolling to complete (replaceable with waits
		// if needed).
		Thread.sleep(5000);

		// Step 4: Assert that the table row value matches the selected filter option.
		assertEquals(certificate.getTableRowValueText("50"), "50");
	}

}
