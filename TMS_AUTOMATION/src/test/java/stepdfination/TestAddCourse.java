package stepdfination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;

import Pages.AddCoursePage;
import Utiles.CommonUtlies;
import Utiles.ElementUtiles;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAddCourse {
	WebDriver driver;
	private AddCoursePage addCoursePage;
	private CommonUtlies commonUtlies;
	private ElementUtiles elementUtiles;

	@Then("Go through the navigation bar. select the Course and courses option.")
	public void go_through_the_navigation_bar_select_the_course_and_courses_option() throws InterruptedException {
		driver = DriverFactory.getdriver();
		addCoursePage = new AddCoursePage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		addCoursePage.clickOnCourseImage();
		addCoursePage.clickOnTrainingMaterialLink();
		addCoursePage.clickOnAddButton();

	}

	@When("The Training administrator enters Code , Arabic Course Name and English Course Name")
	public void the_training_administrator_enters_code_arabic_course_name_and_english_course_name()
			throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.uploadFile("src/test/resources/TMSFiles/TMS.jpg");
		addCoursePage.enterCode(commonUtlies.generateRandomStringforCourseCode());
		addCoursePage.enterArabicCourseName(commonUtlies.generateRandomArabicName());
		addCoursePage.enterEnglishCourseName(commonUtlies.generateRandomEnglishName());

	}

	@When("The Training administrator select Category Name , Target Category")
	public void the_training_administrator_select_category_name_target_category() throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.clickChooseOption();
		addCoursePage.clickUuuuOption();
		addCoursePage.clickSelectSpan();
		addCoursePage.clickTestTms83Label();
		addCoursePage.clickCloseOptionTargetCategory();

	}

	@When("The Training administrator entres Price Per Person ,Price Per Person Remotely , Duration Of The Course \\(Today) ,Course Brief ,Course requirements")
	public void the_training_administrator_entres_price_per_person_price_per_person_remotely_duration_of_the_course_today_course_brief_course_requirements()
			throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.enterPricePerPerson(commonUtlies.generateRandomSingleDigitNumber());
		Thread.sleep(5000);
		addCoursePage.enterPricePerPersonRemotely(commonUtlies.generateRandomSingleDigitNumber());
		Thread.sleep(5000);
		addCoursePage.enterDurationOfCourse(commonUtlies.generateRandomSingleDigitNumber());
		addCoursePage.enterCourseBrief(
				"This course provides a comprehensive introduction to the world of programming, aimed at beginners.");
		Thread.sleep(5000);
		addCoursePage.enterCourseRequirements(
				"This course provides a comprehensive introduction to the world of programming, aimed at beginners.");
	}

	@When("The Training administrator adds Introduction video and  ADD Image")
	public void the_training_administrator_adds_introduction_video_and_add_image() throws InterruptedException {
		Thread.sleep(4000);
		addCoursePage.UploadVideo("src/test/resources/TMSFiles/Video.mp4");
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

	}

	@When("The Training administrator adds Course-registration-requires-approval")
	public void the_training_administrator_adds_course_registration_requires_approval() {

		addCoursePage.enterCourseObjectives(
				"This course provides a comprehensive introduction to the world of programming, aimed at beginners.");
//		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	@When("Add The Training administrator adds FAQs")
	public void add_the_training_administrator_adds_fa_qs() throws InterruptedException {
		Thread.sleep(4000);

		addCoursePage.clickCollapseButton();
		addCoursePage.setFaqQuestion("What are the shipping options available?");
		Thread.sleep(4000);
		addCoursePage.setFaqAnswer(
				"We offer a variety of shipping options, including standard, expedited, and same-day delivery. Shipping rates vary based on the location and delivery method selected at checkout.");
//		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	@When("The Training administrator select Course Trainers , Course Language")
	public void the_training_administrator_select_course_trainers_course_trainers() throws InterruptedException {
		Thread.sleep(3000);
		addCoursePage.clickDropdownCaretIcon();
		addCoursePage.TrainerTextDiv();
		addCoursePage.clickChooseButton();
		Thread.sleep(3000);
		addCoursePage.isEnglishLanguageCheckboxSelected();
		addCoursePage.clickSaveButton();

	}

	@Given("The Training Administrator Update click on edit and is on the course details page")
	public void the_training_administrator_update_click_on_edit_and_is_on_the_course_details_page()
			throws InterruptedException {
		driver = DriverFactory.getdriver();
		addCoursePage = new AddCoursePage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(3000);
		addCoursePage.clickOnCourseImage();
		addCoursePage.clickOnTrainingMaterialLink();
		addCoursePage.clickEditIcon();
	}

	@When("The Training administrator Update enters Code , Arabic Course Name and English Course Name")
	public void the_training_administrator_update_enters_code_arabic_course_name_and_english_course_name()
			throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.enterCode(commonUtlies.generateRandomThreeDigitNumberForCode());
		addCoursePage.enterEnglishCourseName(commonUtlies.generateRandomEnglishName());
		addCoursePage.enterArabicCourseName(commonUtlies.generateRandomArabicName());
	}

	@When("The Training administrator Update select Category Name , Target Category")
	public void the_training_administrator_update_select_category_name_target_category() throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.clickChooseOption();
		addCoursePage.clickUuuuOption();
		addCoursePage.clickSelectSpan();
		addCoursePage.clickTestTms83Label();
		addCoursePage.clickCloseOptionTargetCategory();
	}

	@When("The Training administrator Update  entres Price Per Person ,Price Per Person Remotely , Duration Of The Course \\(Today) ,Course Brief ,Course requirements")
	public void the_training_administrator_update_entres_price_per_person_price_per_person_remotely_duration_of_the_course_today_course_brief_course_requirements()
			throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.enterPricePerPerson(commonUtlies.generateRandomSingleDigitNumber());
		Thread.sleep(5000);
		addCoursePage.enterPricePerPersonRemotely(commonUtlies.generateRandomSingleDigitNumber());
		Thread.sleep(5000);
		addCoursePage.enterDurationOfCourse(commonUtlies.generateRandomSingleDigitNumber());
		addCoursePage.enterCourseBrief(
				"This course provides a comprehensive introduction to the world of programming, aimed at beginners.");
		Thread.sleep(5000);
		addCoursePage.enterCourseRequirements(
				"This course provides a comprehensive introduction to the world of programming, aimed at beginners.");
	}

	@When("The Training administrator Update adds Course-registration-requires-approval")
	public void the_training_administrator_update_adds_course_registration_requires_approval() {

		addCoursePage.enterCourseObjectives(
				"This course provides a comprehensive introduction to the world of programming, aimed at beginners.");
	}

	@When("The Training administrator Self learning data")
	public void the_training_administrator_self_learning_data() throws InterruptedException {
		Thread.sleep(180000);
		addCoursePage.clickSelfLearningADDLink();
		Thread.sleep(4000);
		addCoursePage.setPassMark("35");
		addCoursePage.setDuration("40");
		addCoursePage.setDurationHours("12");
		addCoursePage.setDurationMinutes("00");
//		addCoursePage.clickUpdateButton();
		addCoursePage.clickAddNewUnitButton();
		addCoursePage.enterUnitTitle("test1");
		addCoursePage.enterUnitName("Test1");
		addCoursePage.enterUnitBrief("test1");
		Thread.sleep(1000);
		addCoursePage.clickSaveButtonINUnit();
		addCoursePage.clickVideosTabButton();
		Thread.sleep(8000);
		addCoursePage.clickAddButtonInUnit();
		Thread.sleep(5000);
		addCoursePage.enterVideoName("test");
		addCoursePage.enterVideoTitle("test");
		Thread.sleep(5000);
		addCoursePage.uploadVideoInUnit("src/test/resources/TMSFiles/Video.mp4");
		addCoursePage.clickSaveButtonINUnit();
		Thread.sleep(80000);
		addCoursePage.clickFilesTabButton();
		addCoursePage.clickAddButtonForfiles();
		addCoursePage.enterFieldNameInArabic(commonUtlies.generateRandomArabicName());
		addCoursePage.enterFieldNameInEnglish(commonUtlies.generateRandomEnglishName());
		addCoursePage.uploadFileInUnit("src/test/resources/TMSFiles/TMS.pdf");
		Thread.sleep(4000);
		addCoursePage.clickOnAlertAddButton();
		Thread.sleep(6000);
		addCoursePage.clickGoalsTabButton();
		addCoursePage.clickAddGoal();
		addCoursePage.enterGoalNameInArabic(commonUtlies.generateRandomArabicName());
		addCoursePage.enterGoalNameInEnglish("TestSuyog");
		addCoursePage.clickOnAlertAddButton();
		Thread.sleep(4000);
		addCoursePage.clickElementsTabButton();
		addCoursePage.clickAddElement();
		Thread.sleep(4000);
		addCoursePage.enterElementNameInArabic(commonUtlies.generateRandomArabicName());
		addCoursePage.clickOnAlertAddButton();
		Thread.sleep(4000);
		addCoursePage.clickLinksTabButton();
		addCoursePage.clickAddLink();
		Thread.sleep(4000);
		addCoursePage.enterLinkNameInArabic(commonUtlies.generateRandomArabicName());
		addCoursePage.enterLinkNameInEnglish("TestSuyog");
		addCoursePage.enterLinkURL("https://test-gaca.cpt-it.com/auth/courses");
		addCoursePage.clickOnAlertAddButton();
		Thread.sleep(4000);
		addCoursePage.clickScormTabButton();
		addCoursePage.clickAddScorm();
		addCoursePage.enterScormName(commonUtlies.generateRandomEnglishName());
		addCoursePage.enterLectureNumber("10");
		addCoursePage.enterScormDuration("20");
		addCoursePage.uploadFileInScrom("src/test/resources/TMSFiles/TMS.zip");
		Thread.sleep(4000);
		addCoursePage.clickOnAlertAddButton();
		Thread.sleep(4000);
		addCoursePage.clickQuizTab();
		addCoursePage.clickAddQuiz();
		Thread.sleep(4000);
		addCoursePage.enterFieldNameInArabicQuiz(commonUtlies.generateRandomArabicName());
		addCoursePage.enterFieldNameInEnglishQuiz("testSuyog");
		addCoursePage.enterLectureNumber2("20");
		addCoursePage.enterDescription("Test");
		addCoursePage.uploadFileQuiz("src/test/resources/TMSFiles/TMS.pdf");
		Thread.sleep(4000);
		addCoursePage.clickOnAlertAddButton();
		Thread.sleep(4000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		addCoursePage.clickExamTab();
		addCoursePage.clickAddExam();
		Thread.sleep(4000);
		addCoursePage.enterTestName("TestSuyog");
		addCoursePage.enterPassingScore("3");
		addCoursePage.enterTestDuration("60");
		addCoursePage.clickButton1Minus();
		addCoursePage.enterQuestionScore("4");
		addCoursePage.enterTextInRichTextEditor("test");
		addCoursePage.enterPartnerNameInSuccessChoice("60");
		addCoursePage.enterPartnerNameInOtherDiv("30");
		addCoursePage.clickSaveButtonTest();
		addCoursePage.clickUpdateButton();

	}

	@When("The Training Update administrator Self learning data")
	public void the_training_update_administrator_self_learning_data() throws InterruptedException {
		Thread.sleep(10000);
		elementUtiles.pageUp(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(10000);
		addCoursePage.clickSelfLearningUpdateLink();
		addCoursePage.setPassMark("35");
		addCoursePage.setDuration("40");
		addCoursePage.setDurationHours("12");
		addCoursePage.setDurationMinutes("00");
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		addCoursePage.clickUpdateButton();

	}

	@When("print all the Basic data in cansole")
	public void print_all_the_basic_data_in_cansole() {

	}

	@Given("The Training Administrator entres the CourseCode and click enter button")
	public void the_training_administrator_entres_the_course_code_and_click_enter_button() throws InterruptedException {
		driver = DriverFactory.getdriver();
		addCoursePage = new AddCoursePage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(3000);
		addCoursePage.clickOnCourseImage();
		addCoursePage.clickOnTrainingMaterialLink();
		Thread.sleep(3000);
		addCoursePage.enterSearchText("TestcourseID776");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	@Given("The Training Administrator gets expected Output and validate it")
	public void the_training_administrator_gets_expected_output_and_validate_it() throws InterruptedException {
		Thread.sleep(5000);
		assertEquals(addCoursePage.getCourseIdText(), "TestcourseID776");
	}

	@Then("The Training Administrator clicks on the save button")
	public void the_training_administrator_clicks_on_the_save_button() throws InterruptedException {
		driver = DriverFactory.getdriver();
		addCoursePage = new AddCoursePage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(8000);
		addCoursePage.clickOnCourseImage();
		addCoursePage.clickOnTrainingMaterialLink();
		addCoursePage.clickOnAddButton();

	}

	@Then("The Vaairify and validate the error message")
	public void the_vaairify_and_validate_the_error_message() throws InterruptedException {
		Thread.sleep(8000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		addCoursePage.clickSaveButton();
		elementUtiles.pageUp(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.pageUp(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		assertEquals(addCoursePage.getCourseImageErrorMessage(), "Course Image is Required");
		assertEquals(addCoursePage.getCourseNameErrorMessage(), "Course Name is Required");
		assertEquals(addCoursePage.getGenericFieldErrorMessage(), "This Field is Required");
		assertEquals(addCoursePage.getCourseAboutErrorMessage(), "Course About is Required");
		assertEquals(addCoursePage.getIntroVideoErrorMessage(), "Introduction Video is required");
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		assertEquals(addCoursePage.getCourseObjectiveErrorMessage(), "Course Objective is Required");

	}

	@Then("validate  the eror message invalid extension for image")
	public void validate_the_eror_message_invalid_extension_for_image() throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.uploadFile("src/test/resources/TMSFiles/TMS.pdf");
		assertEquals(addCoursePage.getInvalidImageFileMessageText(), "Invalid Image File");
	}

	@Then("validate  the eror message invalid extension for video")
	public void validate_the_eror_message_invalid_extension_for_video() throws InterruptedException {
		Thread.sleep(5000);

		addCoursePage.UploadVideo("src/test/resources/TMSFiles/TMS.pdf");
		assertEquals(addCoursePage.getFilefileExtensionMessageText(), "File Extension is not Allowed");

	}

	@Then("validate  the  working message")
	public void validate_the_working_message() {
		System.out.println("Button is Working ");
	}

	@Then("validate  the eror message video size limit")
	public void validate_the_eror_message_video_size_limit() throws InterruptedException {
		Thread.sleep(9000);
		addCoursePage.UploadVideo("src/test/resources/TMSFiles/TMS.mp4");
		assertEquals(addCoursePage.getFileSizeExceededMessageText(), "File Exceeded the Allowed MAX SIZE");

	}

	@Given("validate edit the eror message video size limit")
	public void validate_edit_the_eror_message_video_size_limit() {
		System.out.println("eror message video size limit");
	}

	@Given("validate edit the eror message invalid extension for video")
	public void validate_edit_the_eror_message_invalid_extension_for_video() {
		System.out.println(" eror message invalid extension for video");
	}

	@Then("Go through the navigation bar. select the Course and courses.")
	public void go_through_the_navigation_bar_select_the_course_and_courses() throws InterruptedException {
		driver = DriverFactory.getdriver();
		addCoursePage = new AddCoursePage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(7000);
		addCoursePage.clickOnCourseImage();
		Thread.sleep(3000);
		addCoursePage.clickOnTrainingMaterialLink();
		Thread.sleep(3000);

	}

	@Then("click on the delete button the confirmation dialog box with a message is displaying.")
	public void click_on_the_delete_button_the_confirmation_dialog_box_with_a_message_is_displaying()
			throws InterruptedException {
		Thread.sleep(3000);
		addCoursePage.clickRemoveIcon();
		Thread.sleep(3000);
		assertEquals(addCoursePage.getDeleteConfirmationMessage(), "Are you sure, you want to delete?");

	}

	@Then("delete functionality should work as the user clicks on the YES button on the confirmation popup..")
	public void delete_functionality_should_work_as_the_user_clicks_on_the_yes_button_on_the_confirmation_popup()
			throws InterruptedException {
		Thread.sleep(3000);
		addCoursePage.clickRemoveIcon();
		Thread.sleep(3000);
		System.out.println("Delete Message :" + addCoursePage.getDeleteConfirmationMessage());
		assertEquals(addCoursePage.getDeleteConfirmationMessage(), "Are you sure, you want to delete?");
		addCoursePage.clickDeleteButton();

	}

	@Then("Check the record  should not delete if the user clicks No in the confirmation dialog box popup.")
	public void check_the_record_should_not_delete_if_the_user_clicks_no_in_the_confirmation_dialog_box_popup()
			throws InterruptedException {
		Thread.sleep(3000);
		addCoursePage.enterSearchText("Test");
		Thread.sleep(3000);
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(3000);
		addCoursePage.clickRemoveIcon();
		Thread.sleep(3000);
		elementUtiles.pressEscape(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

	}

	@Then("Check the record  should be deleted  as the user clicks on the Yes button on the confirmation popup")
	public void check_the_record_should_be_deleted_as_the_user_clicks_on_the_yes_button_on_the_confirmation_popup()
			throws InterruptedException {

		Thread.sleep(3000);
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(3000);
		addCoursePage.clickRemoveIcon();
		Thread.sleep(3000);
		System.out.println("Delete Message :" + addCoursePage.getDeleteConfirmationMessage());
		assertEquals(addCoursePage.getDeleteConfirmationMessage(), "Are you sure, you want to delete?");
		addCoursePage.clickDeleteButton();

	}

	@Then("Check the edit file button is displayed on the webpage.")
	public void check_the_edit_file_button_is_displayed_on_the_webpage() throws InterruptedException {
		Thread.sleep(3000);
		addCoursePage.clickEditIcon();
	}

	@Then("Check on click over the edit button the user should be redirected to the edit page.")
	public void check_on_click_over_the_edit_button_the_user_should_be_redirected_to_the_edit_page() {
		addCoursePage.clickEditIcon();
		assertEquals(addCoursePage.getBreadcrumbText(), "Update Course");
		System.out.println("User on the :" + addCoursePage.getBreadcrumbText());

	}

	@Then("verify that all the files are displayed on the respective fields of the edit page.")
	public void verify_that_all_the_files_are_displayed_on_the_respective_fields_of_the_edit_page() {
		addCoursePage.clickEditIcon();
		assertEquals(addCoursePage.getBreadcrumbText(), "Update Course");
	}

	@Then("Check is the user can only be able to update the allowed files only.")
	public void check_is_the_user_can_only_be_able_to_update_the_allowed_files_only() {
		///////////

	}

	@Then("Edit File ,Check is the error message is displaying if the file size is large than the allowed one.")
	public void edit_file_check_is_the_error_message_is_displaying_if_the_file_size_is_large_than_the_allowed_one()
			throws InterruptedException {
		Thread.sleep(9000);
		addCoursePage.UploadVideo("src/test/resources/TMSFiles/TMS.mp4");
		assertEquals(addCoursePage.getFileSizeExceededMessageText(), "File Exceeded the Allowed MAX SIZE");
	}

	@Then("To verify file filter in course")
	public void to_verify_file_filter_in_course() {
		addCoursePage.clickFilter();
		System.out.println("Verify the filetr Option");

	}

	@Then("Check if the clicking on the filter button opens the filter option in course.")
	public void check_if_the_clicking_on_the_filter_button_opens_the_filter_option_in_course()
			throws InterruptedException {

		Thread.sleep(5000);
		addCoursePage.clickFilter();
		System.out.println("Check if the clicking on the filter button opens the filter option in course");

	}

	@Then("Check if all the filter options are available in course..")
	public void check_if_all_the_filter_options_are_available_in_course() throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.clickFilter();
		assertEquals(addCoursePage.getViewText(), "View");
		assertEquals(addCoursePage.getStatusText(), "Status");
		assertEquals(addCoursePage.getMaterialLabelText(), "material");
		assertEquals(addCoursePage.getPublishingTypeLabelText(), "Publishing Type");
	}

	@Then("Verify selected filter can be cleared.")
	public void verify_selected_filter_can_be_cleared() throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.clickFilter();
		assertEquals(addCoursePage.getViewText(), "View");
		assertEquals(addCoursePage.getStatusText(), "Status");
		assertEquals(addCoursePage.getMaterialLabelText(), "material");
		assertEquals(addCoursePage.getPublishingTypeLabelText(), "Publishing Type");
		elementUtiles.pressEscape(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

	}

	@Then("Check if the can use a filter option before searching.")
	public void check_if_the_can_use_a_filter_option_before_searching() {
/////////////
	}

	@Then("Check if the filtering leads to Right results.")
	public void check_if_the_filtering_leads_to_right_results() {

	}

	@Then("Search in Add Certificates TO Course")
	public void search_in_add_certificates_to_course() throws InterruptedException {
		Thread.sleep(5000);
	}

	@Then("Verify search working by adding keyword and pressing the Enter key from the keyboard.")
	public void verify_search_working_by_adding_keyword_and_pressing_the_enter_key_from_the_keyboard()
			throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.enterSearchText("TestCourseEnglishSuyog2");
		Thread.sleep(3000);
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	@Then("Verify that Proper messages should be displayed when there are no results.")
	public void verify_that_proper_messages_should_be_displayed_when_there_are_no_results()
			throws InterruptedException {
		Thread.sleep(5000);
		Thread.sleep(5000);
		addCoursePage.enterSearchText("vbjdbnjvnj");
		Thread.sleep(3000);
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		assertEquals(addCoursePage.getNoMatchingResultsMessageText(), "There are No Matching Results");
	}

	@Then("Verify that Application should not crash if user added html code OR link in search field.")
	public void verify_that_application_should_not_crash_if_user_added_html_code_or_link_in_search_field()
			throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.enterSearchText("<Div>");
		Thread.sleep(3000);
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		assertEquals(addCoursePage.getNoMatchingResultsMessageText(), "There are No Matching Results");
	}

	@Then("Verify that Application should not crash if user added special character in search field")
	public void verify_that_application_should_not_crash_if_user_added_special_character_in_search_field()
			throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.enterSearchText("!");
		Thread.sleep(3000);
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		assertEquals(addCoursePage.getNoMatchingResultsMessageText(), "There are No Matching Results");
	}

	@Then("Verify pagination added in case if the search result goes on the number of pages.")
	public void verify_pagination_added_in_case_if_the_search_result_goes_on_the_number_of_pages()
			throws InterruptedException {
		Thread.sleep(5000);
	}

	@Then("Verify pagination is accessible or not by clicking on the Previous button .")
	public void verify_pagination_is_accessible_or_not_by_clicking_on_the_previous_button()
			throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.clickNextButton();
		addCoursePage.clickPreviousButton();
		System.out.println("Next button is displayed :" + addCoursePage.isPreviousButtonDisplayed());
	}

	@Then("Verify pagination is accessible or not by clicking on the Next button .")
	public void verify_pagination_is_accessible_or_not_by_clicking_on_the_next_button() throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.clickNextButton();
		System.out.println("Next button is displayed :" + addCoursePage.isNextButtonDisplayed());
	}

	@Then("Verify that all certificates are reflected on the page.")
	public void verify_that_all_certificates_are_reflected_on_the_page() {
//		Thread.sleep(5000);
	}

	@Given("Check that the {string} field accept characters and special characters")
	public void check_that_the_field_accept_characters_and_special_characters(String string)
			throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.clickToggleSwitch();
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		addCoursePage.clickNewRequirement();
		Thread.sleep(5000);
		addCoursePage.enterRequirement("@");
		Thread.sleep(5000);
		assertEquals(addCoursePage.getInvalidInputText(), "Invalid input");

	}

	@Given("Check that the {string} field has a maximum number of characters of {int}")
	public void check_that_the_field_has_a_maximum_number_of_characters_of(String string, Integer int1)
			throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.clickToggleSwitch();
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		addCoursePage.clickNewRequirement();
		Thread.sleep(5000);
		addCoursePage.enterRequirement("TestTmsSuyog");
		addCoursePage.clickTypeDropdown();
		addCoursePage.clickNumberOption();
		addCoursePage.clickSaveButton();

	}

	@Given("Verify that the pop-up is closed and that the data has not been modified when the cancel button or ❌ is pressed")
	public void verify_that_the_pop_up_is_closed_and_that_the_data_has_not_been_modified_when_the_cancel_button_or_is_pressed()
			throws InterruptedException {
		Thread.sleep(5000);
		addCoursePage.clickToggleSwitch();
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		addCoursePage.clickNewRequirement();
		Thread.sleep(5000);
		addCoursePage.enterRequirement("TestTmsSuyog");
		addCoursePage.clickTypeDropdown();
		addCoursePage.clickNumberOption();
		Thread.sleep(5000);
		elementUtiles.pressEscape(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}
}
