package stepdfination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Pages.AddCoursePage;
import Pages.TrainerPage;
import Utiles.CommonUtlies;
import Utiles.ElementUtiles;
import factory.DriverFactory;
import io.cucumber.java.en.When;

public class TestTrainer {
	WebDriver driver;
	private TrainerPage trainerPage;
	private CommonUtlies commonUtlies;
	private ElementUtiles elementUtiles;

	@When("Training administrator click on Trainers from the sidebar menu")
	public void i_click_on_trainers_from_the_sidebar_menu() throws InterruptedException {
		driver = DriverFactory.getdriver();
		trainerPage = new TrainerPage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		trainerPage.clickChalkboardUserImage();
	}

	@When("Training administrator click on Add")
	public void i_click_on_add() throws InterruptedException {
		trainerPage.clickAddTrainerButton();

	}

	@When("Training administrator add the required information")
	public void i_add_the_required_information() throws InterruptedException {
		Thread.sleep(5000);
		trainerPage.uploadProfilePicture("src/test/resources/TMSFiles/TMS.jpg");
		Thread.sleep(5000);
		trainerPage.selectEgyptOption();
		Thread.sleep(5000);
		trainerPage.selectGenderMale();
		Thread.sleep(5000);
		trainerPage.selectMaritalStatusSingle();
		Thread.sleep(5000);
		trainerPage.selectEducationalLevelDiploma();
		Thread.sleep(5000);
		trainerPage.fillTrainerForm("TestTMs", "TestTMs", "TestTMs", "TestTMs", commonUtlies.generate10DigitNumber(),
				commonUtlies.generateEmail(), commonUtlies.generate10DigitNumber(), "Test12212", "Tms", "TMS");
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		trainerPage.uploadFile("src/test/resources/TMSFiles/TMS.pdf");
		Thread.sleep(5000);
		trainerPage.getRichTextEditorContent("TestSuyog");
		Thread.sleep(5000);
		trainerPage.clickAddButton();

	}

	@When("Training administrator click on edit")
	public void training_administrator_click_on_edit() throws InterruptedException {
		Thread.sleep(5000);
		trainerPage.clickCKEditorButton();

	}

	@When("Training administrator Update the required information")
	public void training_administrator_update_the_required_information() throws InterruptedException {
		Thread.sleep(5000);
		trainerPage.uploadProfilePicture("src/test/resources/TMSFiles/TMS.jpg");
		trainerPage.selectEgyptOption();
		Thread.sleep(5000);
		trainerPage.selectGenderMale();
		Thread.sleep(5000);
		trainerPage.selectMaritalStatusSingle();
		Thread.sleep(5000);
		trainerPage.selectEducationalLevelDiploma();
		Thread.sleep(5000);
		trainerPage.fillTrainerForm("TestTMs", "TestTMs", "TestTMs", "TestTMs", commonUtlies.generate10DigitNumber(),
				commonUtlies.generateEmail(), commonUtlies.generate10DigitNumber(), "Test12212", "Tms", "TMS");
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		trainerPage.uploadFile("src/test/resources/TMSFiles/TMS.pdf");
		Thread.sleep(5000);
		trainerPage.getRichTextEditorContent("TestSuyog");
		trainerPage.clickUpdateButton();
	}

	@When("Training administrator add the required information with duplicate phone number")
	public void training_administrator_add_the_required_information_with_duplicate_phone_number()
			throws InterruptedException {
		Thread.sleep(5000);
		trainerPage.uploadProfilePicture("src/test/resources/TMSFiles/TMS.jpg");
		Thread.sleep(5000);
		trainerPage.selectEgyptOption();
		Thread.sleep(5000);
		trainerPage.selectGenderMale();
		Thread.sleep(5000);
		trainerPage.selectMaritalStatusSingle();
		Thread.sleep(5000);
		trainerPage.selectEducationalLevelDiploma();
		Thread.sleep(5000);
		trainerPage.fillTrainerForm("TestTMsduplicatePhone", "TestTMsduplicatePhone", "TestTMsduplicatePhone",
				"TestTMsduplicatePhone", "0123450797", "TestSuyog1@Tms.com", "1234567891", "Test12212", "Tms", "TMS");
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		trainerPage.uploadFile("src/test/resources/TMSFiles/TMS.pdf");
		trainerPage.getRichTextEditorContent("TestSuyog");
		trainerPage.clickAddButton();
		Thread.sleep(5000);
		assertEquals(trainerPage.getPhoneNumberExistMessage(), "Phone Number Already Exist");
		System.out.println("Phone number duplicate message: " + trainerPage.getPhoneNumberExistMessage());

	}

	@When("Training administrator add the required information with ID that was previously added")
	public void training_administrator_add_the_required_information_with_id_that_was_previously_added()
			throws InterruptedException {
		Thread.sleep(5000);
		trainerPage.uploadProfilePicture("src/test/resources/TMSFiles/TMS.jpg");
		trainerPage.selectEgyptOption();
		Thread.sleep(5000);
		trainerPage.selectGenderMale();
		Thread.sleep(5000);
		trainerPage.selectMaritalStatusSingle();
		Thread.sleep(5000);
		trainerPage.selectEducationalLevelDiploma();
		Thread.sleep(5000);
		trainerPage.fillTrainerForm("TestTMs", "TestTMs", "TestTMs", "TestTMs", "01234", "TestSuyog1@Tms.com",
				"9234567895", "Test12212", "Tms", "TMS");
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		trainerPage.uploadFile("src/test/resources/TMSFiles/TMS.pdf");
		trainerPage.getRichTextEditorContent("TestSuyog");
		trainerPage.clickAddButton();
		Thread.sleep(5000);
		assertEquals(trainerPage.getNationalNumberExistMessage(), "National Id is found");
		System.out.println("Duplicate National Number Exist message: " + trainerPage.getNationalNumberExistMessage());
	}

	@When("Training administrator add the required information with Email that was previously added")
	public void training_administrator_add_the_required_information_with_email_that_was_previously_added()
			throws InterruptedException {
		Thread.sleep(5000);
		trainerPage.uploadProfilePicture("src/test/resources/TMSFiles/TMS.jpg");
		Thread.sleep(5000);
		trainerPage.selectEgyptOption();
		Thread.sleep(5000);
		trainerPage.selectGenderMale();
		Thread.sleep(5000);
		trainerPage.selectMaritalStatusSingle();
		Thread.sleep(5000);
		trainerPage.selectEducationalLevelDiploma();
		trainerPage.fillTrainerForm("TestTMsduplicatePhone", "TestTMsduplicatePhone", "TestTMsduplicatePhone",
				"TestTMsduplicatePhone", "912345", "TestSuyog@Tms.com", "9234567891", "Test12212", "Tms", "TMS");
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		trainerPage.uploadFile("src/test/resources/TMSFiles/TMS.pdf");
		trainerPage.getRichTextEditorContent("TestSuyog");
		trainerPage.clickAddButton();
		Thread.sleep(5000);
		assertEquals(trainerPage.getEmailAddressExistMessage(), "Email Address Already Exist");
		System.out.println("Duplicate Email Exist message :" + trainerPage.getEmailAddressExistMessage());
	}

	@When("verify the all the error message")
	public void verify_the_all_the_error_message() throws InterruptedException {
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		trainerPage.clickAddButton();
		assertEquals(trainerPage.getRequiredFieldMessage(), "This Field is Required");

	}

	@When("enter the numeric name and verify the the error message")
	public void enter_the_numeric_name_and_verify_the_the_error_message() throws InterruptedException {
		trainerPage.enterFirstName("SuyogTest1");
		Thread.sleep(5000);
		assertEquals(trainerPage.getCharactersOnlyMessage(), "You must enter characters only");
	}

	@When("Verify that the placeholder text in the email field is added or not.")
	public void verify_that_the_placeholder_text_in_the_email_field_is_added_or_not() {

	}

	@When("erify if the length of the phone number is incorrect i.e. less than {int}.")
	public void erify_if_the_length_of_the_phone_number_is_incorrect_i_e_less_than(Integer int1)
			throws InterruptedException {
		trainerPage.enterPhoneNumber("123456789");
		Thread.sleep(5000);
		assertEquals(trainerPage.getPhoneNumberLengthValidationMessage(), "phoneNumberLengthValidation");
	}

	@When("Verify if the length of the phone number is incorrect i.e. more than {int}")
	public void verify_if_the_length_of_the_phone_number_is_incorrect_i_e_more_than(Integer int1)
			throws InterruptedException {
		trainerPage.enterPhoneNumber("12345678912333334");
		Thread.sleep(5000);
		assertEquals(trainerPage.getPhoneNumberLengthValidationMessage(), "phoneNumberLengthValidation");
	}

	@When("Check the phone number when passing alphanumeric data")
	public void check_the_phone_number_when_passing_alphanumeric_data() throws InterruptedException {
		Thread.sleep(5000);
		trainerPage.enterPhoneNumber("abcddghjjkjj");
	}

	@When("Check is the user can only be able to upload the allowed files \\(PDF).")
	public void check_is_the_user_can_only_be_able_to_upload_the_allowed_files_pdf() throws InterruptedException {
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		trainerPage.uploadFile("src/test/resources/TMSFiles/TMS.pdf");
		System.out.println("file has Uploded Succefully");
	}

	@When("Check is a proper error message should be shown in case the user tries to upload the file which is not allowed. File type not allowed.")
	public void check_is_a_proper_error_message_should_be_shown_in_case_the_user_tries_to_upload_the_file_which_is_not_allowed_file_type_not_allowed()
			throws InterruptedException {
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		trainerPage.uploadFile("src/test/resources/TMSFiles/TMS.jpg");
		assertEquals(trainerPage.getFilefileExtensionMessageText(), "You must Enter Pdf file only");
	}

	@When("Check is the error message is displaying if the file size is large than the allowed one\\(5mb).")
	public void check_is_the_error_message_is_displaying_if_the_file_size_is_large_than_the_allowed_one_5mb()
			throws InterruptedException {
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		trainerPage.uploadFile("src/test/resources/TMSFiles/TMSLarge.pdf");

	}

	@When("Check during uploading a file on click of cancel button window should be closed.")
	public void check_during_uploading_a_file_on_click_of_cancel_button_window_should_be_closed()
			throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Not Possible to Implemented by Automation");
	}

	@When("Verify that not allow Edit an item with a phone that was previously added")
	public void verify_that_not_allow_edit_an_item_with_a_phone_that_was_previously_added()
			throws InterruptedException {
		Thread.sleep(5000);
		trainerPage.uploadProfilePicture("src/test/resources/TMSFiles/TMS.jpg");
		trainerPage.selectEgyptOption();
		trainerPage.selectGenderMale();
		trainerPage.selectMaritalStatusSingle();
		trainerPage.selectEducationalLevelDiploma();
		trainerPage.fillTrainerForm("TestTMs", "TestTMs", "TestTMs", "TestTMs", "01234", "TestSuyog@Tms.com",
				"9234567891", "Test12212", "Tms", "TMS");
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		trainerPage.uploadFile("src/test/resources/TMSFiles/TMS.pdf");
		trainerPage.getRichTextEditorContent("TestSuyog");
		trainerPage.clickUpdateButton();
	}

	@When("Verify that not allow Edit an item with a ID that was previously added")
	public void verify_that_not_allow_edit_an_item_with_a_id_that_was_previously_added() throws InterruptedException {
		Thread.sleep(5000);
		trainerPage.uploadProfilePicture("src/test/resources/TMSFiles/TMS.jpg");
		trainerPage.selectEgyptOption();
		trainerPage.selectGenderMale();
		trainerPage.selectMaritalStatusSingle();
		trainerPage.selectEducationalLevelDiploma();
		trainerPage.fillTrainerForm("TestTMs", "TestTMs", "TestTMs", "TestTMs", "012345", "TestSuyog@Tms.com",
				"1234567891", "Test12212", "Tms", "TMS");
		Thread.sleep(5000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		trainerPage.uploadFile("src/test/resources/TMSFiles/TMS.pdf");
		trainerPage.getRichTextEditorContent("TestSuyog");
		trainerPage.clickUpdateButton();
	}

	@When("Verify that not allow Edit an item with en Email that was previously added")
	public void verify_that_not_allow_edit_an_item_with_en_email_that_was_previously_added()
			throws InterruptedException {
		Thread.sleep(10000);
		trainerPage.uploadProfilePicture("src/test/resources/TMSFiles/TMS.jpg");
		trainerPage.selectEgyptOption();
		trainerPage.selectGenderMale();
		trainerPage.selectMaritalStatusSingle();
		trainerPage.selectEducationalLevelDiploma();
		trainerPage.fillTrainerForm("TestTMs", "TestTMs", "TestTMs", "TestTMs", "01234", "TestSuyog1@Tms.com",
				"1234567891", "Test12212", "Tms", "TMS");
		Thread.sleep(8000);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(6000);
		trainerPage.uploadFile("src/test/resources/TMSFiles/TMS.pdf");
		trainerPage.getRichTextEditorContent("TestSuyog");
		trainerPage.clickUpdateButton();
	}

}
