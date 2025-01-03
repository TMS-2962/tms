package Pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.CommonUtlies;
import Utiles.ElementUtiles;

public class TrainerPage {
	WebDriver driver;
	private ElementUtiles elementUtiles;

	/* Constructor to initialize the WebDriver and PageFactory elements */
	public TrainerPage(WebDriver driver) {
		this.driver = driver;
		// Initializes all elements defined in this class using the current driver
		PageFactory.initElements(driver, this);
		elementUtiles = new ElementUtiles(driver);

	}

	/* WebElement XPaths for Trainer Page */

	// 1. Locator for the chalkboard user image
	@FindBy(xpath = "//a[@href='/auth/lms/trainer-view']")
	private WebElement chalkboardUserImage;

	// 2. Locator for the "Update" button
	@FindBy(xpath = "//button[normalize-space()='Update']")
	private WebElement updateButton;

	// 3. Locator for the search input field
	@FindBy(xpath = "//input[@placeholder=' Search ...']")
	private WebElement searchInput;

	// 4. Locator for the "Add Trainer" button
	@FindBy(xpath = "//span[normalize-space()='Add Trainer']")
	private WebElement addTrainerButton;

	// 5. Locator for the first name input field
	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstNameInput;

	// 6. Locator for the second name input field
	@FindBy(xpath = "//input[@placeholder='Second Name']")
	private WebElement secondNameInput;

	// 7. Locator for the third name input field
	@FindBy(xpath = "//input[@placeholder='Third Name']")
	private WebElement thirdNameInput;

	// 8. Locator for the last name input field
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastNameInput;

	// 9. Locator for the dropdown button
	@FindBy(xpath = "//span[@class='dropdown-btn']")
	private WebElement dropdownButton;

	// 10. Locator for the "Egypt" option in the dropdown
	@FindBy(xpath = "//div[normalize-space()='Egypt']")
	private WebElement egyptOption;

	// 11. Locator for the identity number input field
	@FindBy(xpath = "//input[@placeholder='Identity Number']")
	private WebElement identityNumberInput;

	// 12. Locator for the gender select dropdown
	@FindBy(xpath = "//select[@formcontrolname='Gender']")
	private WebElement genderSelectDropdown;

	// 13. Locator for the male gender option
	@FindBy(xpath = "//select[@formcontrolname='Gender']/option[@value='male']")
	private WebElement maleOption;

	// 14. Locator for the marital status select dropdown
	@FindBy(xpath = "//select[@formcontrolname='MaritalStatus']")
	private WebElement maritalStatusSelectDropdown;

	// 15. Locator for the single marital status option
	@FindBy(xpath = "//select[@formcontrolname='MaritalStatus']/option[@value='Single']")
	private WebElement singleOption;

	// 16. Locator for the email input field
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement emailInput;

	// 17. Locator for the phone number input field
	@FindBy(xpath = "//input[@placeholder='Phone number']")
	private WebElement phoneNumberInput;

	// 18. Locator for the address input field
	@FindBy(xpath = "//input[@placeholder='Address']")
	private WebElement addressInput;

	// 19. Locator for the educational level select dropdown
	@FindBy(xpath = "//select[@formcontrolname='EducationalLevel']")
	private WebElement educationalLevelSelectDropdown;

	// 20. Locator for the diploma educational level option
	@FindBy(xpath = "//select[@formcontrolname='EducationalLevel']/option[@value='Diploma']")
	private WebElement diplomaOption;

	// 21. Locator for the specialization input field
	@FindBy(xpath = "//input[@placeholder='Specialization']")
	private WebElement specializationInput;

	// 22. Locator for the field input field
	@FindBy(xpath = "//input[@placeholder='Field']")
	private WebElement fieldInput;

	// 23. Locator for the file uploader input field (PDF, PPTX, DOCX)
	@FindBy(xpath = "//input[@type='file' and @id='fileInput' and @accept='.pdf,.pptx,.docx']")
	private WebElement fileUploader;

	// 24. Locator for the CKEditor button
	@FindBy(xpath = "(//a[@tooltipclass='edit'])[1]")
	private WebElement ckEditorButton;

	// 25. Locator for the rich text editor paragraph
	@FindBy(xpath = "//div[@role='textbox' and @aria-label='Rich Text Editor, main']")
	private WebElement richTextEditorParagraph;

	// 26. Locator for the "Add" button
	@FindBy(xpath = "//button[normalize-space()='Add']")
	private WebElement addButton;

	// 27. Locator for the photo upload input field
	@FindBy(xpath = "//input[@type='file' and @accept='image/*']")
	private WebElement photoPic;

	// 28. Locator for the phone number length validation message
	@FindBy(xpath = "//span[contains(text(),'phoneNumberLengthValidation')]")
	private WebElement phoneNumberLengthValidationMessage;

	// 29. Locator for the duplicate phone number error message
	@FindBy(xpath = "//div[@aria-label='Phone Number Already Exist']")
	private WebElement duplicatePhonenumber;

	// 30. Locator for the national number exists error message
	@FindBy(xpath = "//div[@aria-label='National Id is found']")
	private WebElement nationalNumberExistMessage;

	// 31. Locator for the email address exists error message
	@FindBy(xpath = "//div[@aria-label='Email Address Already Exist']")
	private WebElement emailAddressExistMessage;

	// 32. Locator for the required field error message
	@FindBy(xpath = "//span[normalize-space(text())='This Field is Required']")
	private WebElement requiredFieldMessage;

	// 33. Locator for the characters only validation message
	@FindBy(xpath = "//span[normalize-space(text())='You must enter characters only']")
	private WebElement charactersOnlyMessage;

	// 34. Locator for the file extension validation message
	@FindBy(xpath = "//span[normalize-space(text())='You must Enter Pdf file only']")
	private WebElement fileExtensionMessage;


	/**
	 * This method retrieves the text of the "You must enter characters only"
	 * message. It uses a utility method to get the text from the element and
	 * applies an explicit wait to ensure that the message is fully loaded before
	 * interacting with it.
	 *
	 * @return The validation message text as a String.
	 */
	public String getCharactersOnlyMessage() {
		return elementUtiles.getTextFromElement(charactersOnlyMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method types the provided text into the First Name input field.
	 * 
	 * @param firstName The first name text to enter in the field.
	 */
	public void enterFirstName(String firstName) {

		elementUtiles.typeTextIntoElement(firstNameInput, firstName, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text of the "This Field is Required" message. It
	 * uses a utility method to get the text from the element and applies an
	 * explicit wait to ensure that the message is fully loaded before interacting
	 * with it.
	 *
	 * @return The validation message text as a String.
	 */
	public String getRequiredFieldMessage() {
		return elementUtiles.getTextFromElement(requiredFieldMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text of the "Email Address Already Exist" message.
	 * It uses a utility method to get the text from the element and applies an
	 * explicit wait to ensure that the message is fully loaded before interacting
	 * with it.
	 *
	 * @return The validation message text as a String.
	 */
	public String getEmailAddressExistMessage() {
		return elementUtiles.getTextFromElement(emailAddressExistMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text of the "National Number Already Exist"
	 * message. It uses a utility method to get the text from the element and
	 * applies an explicit wait to ensure that the message is fully loaded before
	 * interacting with it.
	 *
	 * @return The validation message text as a String.
	 */
	public String getNationalNumberExistMessage() {
		return elementUtiles.getTextFromElement(nationalNumberExistMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text of the "Phone Number Already Exist" message.
	 * It uses a utility method to get the text from the element and applies an
	 * explicit wait to ensure that the message is fully loaded before interacting
	 * with it.
	 *
	 * @return The validation message text as a String.
	 */
	public String getPhoneNumberExistMessage() {
		return elementUtiles.getTextFromElement(duplicatePhonenumber, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text of the phone number length validation message.
	 * It uses a utility method to get the text from the validation message element
	 * and applies an explicit wait to ensure that the message is fully loaded.
	 *
	 * @return The validation message as a String.
	 */
	public String getPhoneNumberLengthValidationMessage() {
		return elementUtiles.getTextFromElement(phoneNumberLengthValidationMessage,
				CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to fill out the form
	/**
	 * This method enters the given phone number into the phone number input field.
	 * It uses the utility method to type the provided phone number into the input
	 * field and ensures that the field is ready before performing the action.
	 *
	 * @param phoneNumber The phone number to be entered in the input field.
	 */
	public void enterPhoneNumber(String phoneNumber) {
		elementUtiles.typeTextIntoElement(phoneNumberInput, phoneNumber, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * Fills in the trainer form with the provided details.
	 * 
	 * This method takes various personal and professional details as input
	 * parameters and enters them into the corresponding form fields on the web
	 * page. Each input field is filled one after the other using the
	 * `elementUtiles.typeTextIntoElement` method, with a specified wait time for
	 * each field to ensure that the page elements are ready for interaction.
	 *
	 * @param firstName      The first name of the trainer.
	 * @param secondName     The second name of the trainer.
	 * @param thirdName      The third name of the trainer (if applicable).
	 * @param lastName       The last name of the trainer.
	 * @param identityNumber The identity number of the trainer.
	 * @param email          The email address of the trainer.
	 * @param phone          The phone number of the trainer.
	 * @param address        The address of the trainer.
	 * @param specialization The specialization field of the trainer.
	 * @param field          The field of expertise of the trainer.
	 */
	public void fillTrainerForm(String firstName, String secondName, String thirdName, String lastName,
			String identityNumber, String email, String phone, String address, String specialization, String field) {

		// Fill out the first name field
		elementUtiles.typeTextIntoElement(firstNameInput, firstName, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

		// Fill out the second name field
		elementUtiles.typeTextIntoElement(secondNameInput, secondName, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

		// Fill out the third name field
		elementUtiles.typeTextIntoElement(thirdNameInput, thirdName, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

		// Fill out the last name field
		elementUtiles.typeTextIntoElement(lastNameInput, lastName, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

		// Fill out the identity number field
		elementUtiles.typeTextIntoElement(identityNumberInput, identityNumber, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

		// Fill out the email field
		elementUtiles.typeTextIntoElement(emailInput, email, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

		// Fill out the phone number field
		elementUtiles.typeTextIntoElement(phoneNumberInput, phone, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

		// Fill out the address field
		elementUtiles.typeTextIntoElement(addressInput, address, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

		// Fill out the specialization field
		elementUtiles.typeTextIntoElement(specializationInput, specialization, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

		// Fill out the field of expertise field
		elementUtiles.typeTextIntoElement(fieldInput, field, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to select the gender (Male)
	public void selectGenderMale() {

		elementUtiles.clickOnElement(genderSelectDropdown, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.clickOnElement(maleOption, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to select the marital status (Single)
	public void selectMaritalStatusSingle() {
		elementUtiles.javaScriptScrollToElement(maritalStatusSelectDropdown, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.clickOnElement(maritalStatusSelectDropdown, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.clickOnElement(singleOption, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to select the educational level (Diploma)
	public void selectEducationalLevelDiploma() {

		elementUtiles.clickOnElement(educationalLevelSelectDropdown, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.clickOnElement(diplomaOption, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

	}

	// Method to upload a file
	public void uploadFile(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		fileUploader.sendKeys(absolutePath);

	}

	// Method to click the "Add Trainer" button
	public void clickAddTrainerButton() {
		elementUtiles.clickOnElement(addTrainerButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to click the "Add" button
	public void clickAddButton() {
		elementUtiles.clickOnElement(addButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

	}

	// Method to interact with the rich text editor (for example, clicking the
	public void clickCKEditorButton() {
		elementUtiles.clickOnElement(ckEditorButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to set the profile picture
	public void uploadProfilePicture(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		photoPic.sendKeys(absolutePath);
	}

	// Method to select Egypt from the dropdown
	public void selectEgyptOption() {
		elementUtiles.clickOnElement(dropdownButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.clickOnElement(egyptOption, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to verify the rich text editor content (just an example of how you
	public void getRichTextEditorContent(String AddText) {
		elementUtiles.typeTextIntoElement(richTextEditorParagraph, AddText, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickChalkboardUserImage() {
		elementUtiles.clickOnElement(chalkboardUserImage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickUpdateButton() {
		updateButton.click();
	}

	public String getFilefileExtensionMessageText() {
		return elementUtiles.getTextFromElement(fileExtensionMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

}
