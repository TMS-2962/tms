package stepdfination.Sprint2StepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Code;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

import Pages.TraineePage.RegistrationPage;
import Utiles.CommonUtlies;
import Utiles.ElementUtiles;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRegistration {
	WebDriver driver;
	private RegistrationPage registrationPage;
	private CommonUtlies commonUtlies;
	private ElementUtiles elementUtiles;
	String apiKey = "b6sxJfWcsDWs5lw9l0CYd31ZdqD74LRQ";
	String serverId = "61xg8nhr";
	String serverDomain = "61xg8nhr.mailosaur.net";

	@Given("The user opens The TMS application and Lands on The registration Page")
	public void the_user_opens_the_tms_application_and_lands_on_the_registration_page() throws InterruptedException {
		Thread.sleep(5000);
		driver = DriverFactory.getdriver();
		registrationPage = new RegistrationPage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		registrationPage.clickCreateNewAccountLink();

	}

	@Given("The user is on The registration page")
	public void the_user_is_on_the_registration_page() throws InterruptedException {
		Thread.sleep(5000);
		registrationPage.clickUserHeading();
	}

	@When("The user fills in The first name field")
	public void the_user_fills_in_the_first_name_field() throws InterruptedException {
		Thread.sleep(5000);
		registrationPage.setFirstName(commonUtlies.generateRandomEnglishNameForRegistraion());

	}

	@When("The user fills in The last name field")
	public void the_user_fills_in_the_last_name_field() throws InterruptedException {
		Thread.sleep(5000);
		registrationPage.setLastName(commonUtlies.generateRandomArabicNameForRegistration());

	}

	@When("The user fills in The email field")
	public void the_user_fills_in_the_email_field() {
		registrationPage.setEmail("tie-slip@61xg8nhr.mailosaur.net");

	}

	@When("The user fills in The primary phone field")
	public void the_user_fills_in_the_primary_phone_field() {
		registrationPage.setPrimaryPhone(commonUtlies.generate10DigitNumber());
	}

	@When("The user fills in The secondary phone field")
	public void the_user_fills_in_the_secondary_phone_field() {
		registrationPage.setSecondaryPhone(commonUtlies.generate10DigitNumber());
	}

	@When("The user fills in The password field")
	public void the_user_fills_in_the_password_field() {
		registrationPage.setPassword("Test@7713");

	}

	@When("The user fills in The confirm password field")
	public void the_user_fills_in_the_confirm_password_field() {
		registrationPage.setConfirmPassword("Test@7713");
	}

	@When("The user agrees to The terms by clicking The checkbox")
	public void the_user_agrees_to_the_terms_by_clicking_the_checkbox() {
		registrationPage.clickTermsCheckbox();
	}

	@Then("The user should see The form submitted successfully")
	public void the_user_should_see_the_form_submitted_successfully()
			throws InterruptedException, IOException, MailosaurException {
		Thread.sleep(5000);
		registrationPage.switchToIframeByTitle();
		Thread.sleep(5000);
		registrationPage.clickRecaptchaCheckbox();
		Thread.sleep(10000);
		registrationPage.clickCreateAccountButton();
		Thread.sleep(5000);
		MailosaurClient mailosaur = new MailosaurClient(apiKey);
		MessageSearchParams params = new MessageSearchParams();
		params.withServer(serverId);
		SearchCriteria criteria = new SearchCriteria();
		criteria.withSentTo("tie-slip@" + serverDomain);
		Message message = mailosaur.messages().get(params, criteria);
		System.out.println(message.to().get(0).email());
		System.out.println(message.from().get(0).email());
		Code getOTP = message.html().codes().get(0);
		String OTP = getOTP.value();
		System.out.println(getOTP.value());
		registrationPage.enterVerificationCode(OTP);
		Thread.sleep(10000);
		registrationPage.clickConfirmButton();

	}

	@Given("The private-sector user is on The registration page")
	public void the_private_sector_user_is_on_the_registration_page() throws InterruptedException {
		Thread.sleep(5000);
		registrationPage.clickPrivateSectorHeading();
	}

	@When("The Private Sector User enters the email")
	public void the_private_sector_user_enters_the_email() throws InterruptedException {
		Thread.sleep(5000);
		registrationPage.enterEmail("tie-slip@61xg8nhr.mailosaur.net");
		Thread.sleep(5000);
		registrationPage.clickCheckButton();
		Thread.sleep(5000);

	}

	@When("The Private Sector User enters the OTP")
	public void the_private_sector_user_enters_the_otp() throws IOException, MailosaurException, InterruptedException {

		MailosaurClient mailosaur = new MailosaurClient(apiKey);
		MessageSearchParams params = new MessageSearchParams();
		params.withServer(serverId);
		SearchCriteria criteria = new SearchCriteria();
		criteria.withSentTo("tie-slip@" + serverDomain);
		Message message = mailosaur.messages().get(params, criteria);
		System.out.println(message.to().get(0).email());
		System.out.println(message.from().get(0).email());
		Code getOTP = message.html().codes().get(0);
		String OTP = getOTP.value();
		System.out.println(getOTP.value());
		registrationPage.enterOtp(OTP);

	}

	@When("The Private Sector User enters the first text")
	public void the_private_sector_user_enters_the_first_text() throws InterruptedException {
		Thread.sleep(5000);
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		registrationPage.enterFirstText(commonUtlies.generateRandomArabicName());

	}

	@When("The Private Sector User enters the second text")
	public void the_private_sector_user_enters_the_second_text() throws InterruptedException {
		Thread.sleep(5000);
		registrationPage.enterSecondText("TestTMSSuyog");
	}

	@When("The Private Sector User enters the activity")
	public void the_private_sector_user_enters_the_activity() throws InterruptedException {
		Thread.sleep(5000);
		registrationPage.enterSectorActivity(commonUtlies.getTextForAddCategoryGroupName());
		Thread.sleep(5000);
		registrationPage.enterCoordinatorName(commonUtlies.getTextForAddCategoryGroupName());

	}

	@When("The Private Sector User enters the commercial registration number")
	public void the_private_sector_user_enters_the_commercial_registration_number() throws InterruptedException {
		Thread.sleep(5000);
		registrationPage.enterCommercialRegistrationNumber(commonUtlies.generate10DigitNumber());

	}

	@When("The Private Sector User enters the contact numbers")
	public void the_private_sector_user_enters_the_contact_numbers() throws InterruptedException {
		Thread.sleep(5000);
		registrationPage.enterContactNumbers(commonUtlies.generate10DigitNumber());
		elementUtiles.pageDown(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	@When("The Private Sector User uploads the first file")
	public void the_private_sector_user_uploads_the_first_file() throws InterruptedException {
		Thread.sleep(5000);
		registrationPage.uploadFirstFile("src/test/resources/TMSFiles/TMS.jpg");

	}

	@When("The Private Sector User uploads the second file")
	public void the_private_sector_user_uploads_the_second_file() throws InterruptedException {

		Thread.sleep(5000);
		registrationPage.uploadSecondFile("src/test/resources/TMSFiles/TMS.jpg");
	}

	@When("The Private Sector User uploads the third file")
	public void the_private_sector_user_uploads_the_third_file() throws InterruptedException {
		Thread.sleep(5000);
		registrationPage.uploadThirdFile("src/test/resources/TMSFiles/TMS.jpg");

	}

	@Then("The Private Sector User form should be successfully submitted")
	public void the_private_sector_user_form_should_be_successfully_submitted() throws InterruptedException {
		Thread.sleep(5000);
		registrationPage.switchToIframeByTitle();
		Thread.sleep(5000);
		registrationPage.clickRecaptchaCheckbox();
		Thread.sleep(10000);
	}
}
