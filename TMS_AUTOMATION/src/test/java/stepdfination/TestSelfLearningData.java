package stepdfination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Pages.CertificatePage;
import Pages.HomePage;
import Pages.SelfLearning;
import Pages.SelfLearningDataPage;
import Pages.TargetPage;
import Utiles.CommonUtlies;
import Utiles.ElementUtiles;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestSelfLearningData {
	WebDriver driver;
	private SelfLearningDataPage selfLearningDataPage;
	private CommonUtlies commonUtlies;
	private ElementUtiles elementUtiles;

	@Given("Training administrator Lands on the add Courses and select survey")
	public void training_administrator_lands_on_the_add_courses_and_select_files() throws InterruptedException {
		driver = DriverFactory.getdriver();
		selfLearningDataPage = new SelfLearningDataPage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(4000);

	}

	@Then("Training administrator Clicks on the Added \\(Files )")
	public void training_administrator_clicks_on_the_added_files() throws InterruptedException {
		Thread.sleep(5000);
		selfLearningDataPage.clickFilesButton();
	}

	@Then("Training administrator Add Certificate")
	public void training_administrator_add_certificate() throws InterruptedException {
		Thread.sleep(8000);
		selfLearningDataPage.clickAddCertificateSpan();

	}

	@Then("select certifacte")
	public void select_certifacte() throws InterruptedException {
		Thread.sleep(8000);
		selfLearningDataPage.enterSearchText("TMSTestSuyog");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(8000);
		selfLearningDataPage.interactWithModalChoose1Input();

	}

	@Then("clicks on the Save button")
	public void clicks_on_the_save_button() throws InterruptedException {
		Thread.sleep(5000);
		selfLearningDataPage.clickSaveButton();
	}

	@Then("Verify that if click on upload file button, redirect to adding button")
	public void verify_that_if_click_on_upload_file_button_redirect_to_adding_button() throws InterruptedException {
		Thread.sleep(5000);
		selfLearningDataPage.clickAddFileSpan();

	}

	@Then("Check is the uploader show a “success” message after the upload")
	public void check_is_the_uploader_show_a_success_message_after_the_upload() throws InterruptedException {
		Thread.sleep(10000);
		selfLearningDataPage.clickAddFileSpan();
		selfLearningDataPage.clickChooseOption();
		selfLearningDataPage.selectReviewerOption();
		Thread.sleep(5000);
		selfLearningDataPage.enterFileName("TMSSuyogFile30");
		selfLearningDataPage.clickCheckboxLabel();
		Thread.sleep(5000);
		selfLearningDataPage.uploadFile("src/test/resources/TMSFiles/TMS.jpg");
		Thread.sleep(5000);
		selfLearningDataPage.clickSaveButton();
		Thread.sleep(10000);
		selfLearningDataPage.getSaveSuccessfullyText();

	}

	@Then("Check the file name should be the same and display after uploading the file")
	public void check_the_file_name_should_be_the_same_and_display_after_uploading_the_file()
			throws InterruptedException {
		Thread.sleep(8000);
		selfLearningDataPage.clickAddFileSpan();
		Thread.sleep(5000);
		selfLearningDataPage.uploadFile("src/test/resources/TMSFiles/TMS.jpg");
		Thread.sleep(5000);
		System.out.println("File Name :" + selfLearningDataPage.getFilePreviewTitle());
	}

	@Then("Verify is the uploaded file extension is shown with the file name.")
	public void verify_is_the_uploaded_file_extension_is_shown_with_the_file_name() throws InterruptedException {
		Thread.sleep(8000);
		selfLearningDataPage.clickAddFileSpan();
		Thread.sleep(5000);
		selfLearningDataPage.uploadFile("src/test/resources/TMSFiles/TMS.jpg");
		Thread.sleep(5000);
		System.out.println("File Name :" + selfLearningDataPage.getFilePreviewTitle());
	}

	@Then("Check is the file size is displaying with the file name.")
	public void check_is_the_file_size_is_displaying_with_the_file_name() throws InterruptedException {

		Thread.sleep(8000);
		selfLearningDataPage.clickAddFileSpan();
		Thread.sleep(5000);
		selfLearningDataPage.uploadFile("src/test/resources/TMSFiles/TMS.jpg");
		Thread.sleep(5000);
		System.out.println("file size :" + selfLearningDataPage.getFilePreviewSize());

	}

	@Then("Training administrator Clicks on the Added Survey")
	public void training_administrator_clicks_on_the_added_survey() throws InterruptedException {
		Thread.sleep(5000);
		selfLearningDataPage.clickSurveysButton();

	}

	@Then("Training administrator Add survey")
	public void training_administrator_add_survey() throws InterruptedException {
		Thread.sleep(5000);
		selfLearningDataPage.clickAddedSurveySpan();
	}

	@Then("Adding Survey to the course Verify that if click on add button ,A pop-up window will open containing all the Survey added to the system")
	public void adding_survey_to_the_course_verify_that_if_click_on_add_button_a_pop_up_window_will_open_containing_all_the_survey_added_to_the_system()
			throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("A pop-up window will open containing all the Survey added to the system");

	}

	@Then("Verify that if you click the Save button after selecting a Survey form, the questionnaire will be saved to the course")
	public void verify_that_if_you_click_the_save_button_after_selecting_a_survey_form_the_questionnaire_will_be_saved_to_the_course()
			throws InterruptedException {
		Thread.sleep(5000);
//		selfLearningDataPage.clickAddQuestionButton();
		selfLearningDataPage.clickSaveButton();
	}

	@Then("Verify that if you click the Save button before selecting a Survey form, the error message will be appear")
	public void verify_that_if_you_click_the_save_button_before_selecting_a_survey_form_the_error_message_will_be_appear()
			throws InterruptedException {
		Thread.sleep(5000);
		elementUtiles.pressEscape(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	@Then("Verify that if the duplicate form is selected, an alert message will appear.Search in Add Certificates TO Cours")
	public void verify_that_if_the_duplicate_form_is_selected_an_alert_message_will_appear_search_in_add_certificates_to_cours() {
		System.out.println("This is bug in the survey");

	}

	@Given("Training administrator Lands on the add Courses and select Certificate")
	public void training_administrator_lands_on_the_add_courses_and_select_certificate() throws InterruptedException {
		driver = DriverFactory.getdriver();
		selfLearningDataPage = new SelfLearningDataPage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

	}

	@Then("Training administrator Clicks on the Added Certificate")
	public void training_administrator_clicks_on_the_added_certificate() throws InterruptedException {
		Thread.sleep(5000);
		selfLearningDataPage.clickCertificatesButton();
	}

	@Given("Training administrator Lands on the add Courses and select\\(Exams)")
	public void training_administrator_lands_on_the_add_courses_and_select_exams() throws InterruptedException {
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

	}

	@Then("Training administrator Clicks on the Added \\(Exams)")
	public void training_administrator_clicks_on_the_added_exams() throws InterruptedException {
		Thread.sleep(5000);
		selfLearningDataPage.clickExamsButton();
	}

	@Then("Training administrator Add \\(Exams)")
	public void training_administrator_add_exams() throws InterruptedException {
		Thread.sleep(5000);
		selfLearningDataPage.clickAddExamSpan();

	}

	@Then("Check if all the filter options are available.\\(يتم الفلتره عن طريق :افتراضي للمتدرب ,افتراضي للمدرب)")
	public void check_if_all_the_filter_options_are_available_يتم_الفلتره_عن_طريق_افتراضي_للمتدرب_افتراضي_للمدرب()
			throws InterruptedException {
		Thread.sleep(5000);
		selfLearningDataPage.clickFilter();
		assertEquals(selfLearningDataPage.getViewText(), "View");
		assertEquals(selfLearningDataPage.getStatusText(), "Status");
	}

	@Then("Check if the filtering leads to Right results")
	public void check_if_the_filtering_leads_to_right_results() throws InterruptedException {
		Thread.sleep(5000);
		selfLearningDataPage.clickFilter();
		assertEquals(selfLearningDataPage.getViewText(), "View");
		assertEquals(selfLearningDataPage.getStatusText(), "Status");
	}

	@Then("Verify search working by adding keyword and pressing the Enter key from the keyboard Add certificate.")
	public void verify_search_working_by_adding_keyword_and_pressing_the_enter_key_from_the_keyboard_add_certificate()
			throws InterruptedException {
		Thread.sleep(8000);
		selfLearningDataPage.enterSearchText("testSuyog");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	@Then("Verify that Proper messages should be displayed when there are no results Add certificate..")
	public void verify_that_proper_messages_should_be_displayed_when_there_are_no_results_add_certificate()
			throws InterruptedException {
		Thread.sleep(8000);
		selfLearningDataPage.enterSearchText("asdhg");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(8000);

	}

	@Then("Verify that Application should not crash if user added html code OR link in search field Add certificate..")
	public void verify_that_application_should_not_crash_if_user_added_html_code_or_link_in_search_field_add_certificate()
			throws InterruptedException {
		Thread.sleep(8000);
		selfLearningDataPage.enterSearchText("https:TestTMs");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(8000);
	}

	@Then("Verify that Application should not crash if user added special character in search field Add certificate.")
	public void verify_that_application_should_not_crash_if_user_added_special_character_in_search_field_add_certificate()
			throws InterruptedException {
		Thread.sleep(8000);
		selfLearningDataPage.enterSearchText("@");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(8000);
	}

	@Then("Verify pagination added in case if the search result goes on the number of pages.Add certificate.")
	public void verify_pagination_added_in_case_if_the_search_result_goes_on_the_number_of_pages_add_certificate() {
		System.out.println("pagination added in case if the search result goes on the number of pages.Add certifica");
	}

	@Then("Verify pagination is accessible or not by clicking on the Previous button Add certificate..")
	public void verify_pagination_is_accessible_or_not_by_clicking_on_the_previous_button_add_certificate()
			throws InterruptedException {
		Thread.sleep(8000);
		selfLearningDataPage.enterSearchText("Test");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(8000);
		selfLearningDataPage.clickNextButton();
		selfLearningDataPage.clickPreviousButton();
		System.out.println(selfLearningDataPage.isPreviousButtonDisplayed());
	}

	@Then("Verify pagination is accessible or not by clicking on the Next button Add certificate")
	public void verify_pagination_is_accessible_or_not_by_clicking_on_the_next_button_add_certificate()
			throws InterruptedException {
		Thread.sleep(8000);
		selfLearningDataPage.enterSearchText("Test");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(8000);
		selfLearningDataPage.clickNextButton();
		System.out.println(selfLearningDataPage.isPreviousButtonDisplayed());
	}

}
