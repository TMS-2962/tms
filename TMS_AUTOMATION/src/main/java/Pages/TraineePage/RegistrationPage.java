package Pages.TraineePage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mailosaur.models.Code;

import Utiles.CommonUtlies;
import Utiles.ElementUtiles;

public class RegistrationPage {
	WebDriver driver;
	private ElementUtiles elementUtiles;

	/**
	 * Constructor to initialize the WebDriver and PageFactory elements for the
	 * AddCategoryPage class.
	 * 
	 * This constructor sets up the WebDriver instance for this page object and
	 * initializes the WebElements defined in the class using the PageFactory. It
	 * also initializes an instance of the ElementUtiles class, which contains
	 * utility methods to interact with web elements.
	 * 
	 * @param driver The WebDriver instance used to interact with the browser.
	 */
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtiles = new ElementUtiles(driver);
	}

	@FindBy(xpath = "//a[contains(text(),'انشاء حساب جديد')]")
	private WebElement createNewAccountLink; // Link for "Create New Account"

	@FindBy(xpath = "//h3[contains(text(),'مستخدم')]")
	private WebElement userHeading; // Heading for "User"

	@FindBy(xpath = "//h3[contains(text(),'قطاع خاص')]")
	private WebElement privateSectorHeading; // Heading for "Private Sector"

	@FindBy(xpath = "//h3[contains(text(),'الجهات الحكومية')]")
	private WebElement governmentHeading; // Heading for "Government Entities"
	@FindBy(xpath = "(//input[@id='text'])[1]")
	private WebElement firstNameInput; // 1. First Name input field

	@FindBy(xpath = "(//input[@id='text'])[2]")
	private WebElement lastNameInput; // 2. Last Name input field

	@FindBy(xpath = "(//input[@id='email'])[1]")
	private WebElement emailInput; // 3. Email input field

	@FindBy(xpath = "(//input[@id='phone'])[1]")
	private WebElement primaryPhoneInput; // 4. Primary phone input field

	@FindBy(xpath = "(//input[@id='phone'])[2]")
	private WebElement secondaryPhoneInput; // 5. Secondary phone input field

	@FindBy(xpath = "(//input[@id='password'])[1]")
	private WebElement passwordInput; // 6. Password input field

	@FindBy(xpath = "(//input[@id='passwordconfirm'])[1]")
	private WebElement confirmPasswordInput; // 7. Confirm password input field

	@FindBy(xpath = "(//input[@id='inlineCheckbox2'])[1]")
	private WebElement termsCheckbox; // 8. Checkbox for agreeing to terms
	// Use @FindBy annotation to locate the checkbox
	// Find the iframe using the 'title' attribute
	@FindBy(xpath = "//iframe[@title='reCAPTCHA']")
	private WebElement iframeByTitle;
	// Find the reCAPTCHA checkbox using the provided CSS selector
	@FindBy(css = "#recaptcha-anchor > div.recaptcha-checkbox-border")
	private WebElement recaptchaCheckbox;
	// Locate the button using XPath by button text
	@FindBy(xpath = "//button[contains(text(),'انشاء حساب جديد')]")
	private WebElement createAccountButton;
	// Private WebElement variables with 'sector' included in the name

	@FindBy(xpath = "(//input[@id='email'])[1]")
	private WebElement privateSectorEmailField;

	@FindBy(xpath = "//input[@id='oTP']")
	private WebElement privateSectorOtpField;

	@FindBy(xpath = "(//input[@id='text'])[1]")
	private WebElement privateSectorFirstTextField;

	@FindBy(xpath = "(//input[@id='text'])[2]")
	private WebElement privateSectorSecondTextField;
	@FindBy(name = "CoordinatorNameAr")
	private WebElement coordinatorNameInput;

	@FindBy(xpath = "(//input[@placeholder='نشاط القطاع (عربى-انجليزى) '])[1]")
	private WebElement privateSectorActivityField;

	@FindBy(xpath = "//input[@placeholder='رقم السجل التجاري']")
	private WebElement privateSectorCommercialRegistrationNumberField;

	@FindBy(xpath = "//input[@placeholder='ارقام التواصل ']")
	private WebElement privateSectorContactNumbersField;

	@FindBy(xpath = "(//input[@accept='.pdf,.pptx,.docx,.jpg,.png'])[1]")
	private WebElement privateSectorFirstFileUploadField;

	@FindBy(xpath = "(//input[@id='fileInput'])[2]")
	private WebElement privateSectorSecondFileUploadField;

	@FindBy(xpath = "(//input[@id='fileInput'])[3]")
	private WebElement privateSectorThirdFileUploadField;
	// Locate the button using @FindBy
	@FindBy(xpath = "//button[@class='btn btn-success check-btn']")
	private WebElement checkButton;
	@FindBy(xpath = "//input[@name='otbMessege' and @type='text' and @placeholder='أدخل الكود المرسل لبريدك الإلكتروني']")
	private WebElement inputField;
	@FindBy(xpath = "//button[normalize-space(text())='تأكيد' and @type='button']")
	private WebElement confirmButton;

	public void clickConfirmButton() {
		confirmButton.click(); // Click the confirm button
	}

	// Method to send text to the input field
	public void enterVerificationCode(String code) {
		inputField.sendKeys(code); // Send the code to the input field
	}

	// Method to enter a name into the coordinator name input field
	public void enterCoordinatorName(String name) {
		coordinatorNameInput.sendKeys(name);
	}

	// Method to click the 'تحقق' button
	public void clickCheckButton() {
		checkButton.click();
	}

	public void enterEmail(String email) {
		privateSectorEmailField.sendKeys(email);
	}

	public void enterOtp(String getOTP) {

		privateSectorOtpField.sendKeys(getOTP);
	}

	public void enterFirstText(String text) {
		privateSectorFirstTextField.sendKeys(text);
	}

	public void enterSecondText(String text) {
		privateSectorSecondTextField.sendKeys(text);
	}

	public void enterSectorActivity(String activity) {
		privateSectorActivityField.sendKeys(activity);
	}

	public void enterCommercialRegistrationNumber(String registrationNumber) {
		privateSectorCommercialRegistrationNumberField.sendKeys(registrationNumber);
	}

	public void enterContactNumbers(String contactNumbers) {
		privateSectorContactNumbersField.sendKeys(contactNumbers);
	}

	public void uploadFirstFile(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		privateSectorFirstFileUploadField.sendKeys(absolutePath);

	}

	public void uploadSecondFile(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		privateSectorSecondFileUploadField.sendKeys(absolutePath);

	}

	public void uploadThirdFile(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		privateSectorThirdFileUploadField.sendKeys(absolutePath);

	}

	// Method to click the button
	public void clickCreateAccountButton() {
		createAccountButton.click();
	}

	// Method to click the reCAPTCHA checkbox
	public void clickRecaptchaCheckbox() {
		recaptchaCheckbox.click();
		driver.switchTo().defaultContent();
	}

	// Method to switch to iframe using the element found by title
	public void switchToIframeByTitle() {
		driver.switchTo().frame(iframeByTitle);

	}

	/**
	 * Sets the first name in the input field.
	 * 
	 * @param firstName The first name to set.
	 */
	public void setFirstName(String firstName) {
		firstNameInput.sendKeys(firstName);
	}

	/**
	 * Sets the last name in the input field.
	 * 
	 * @param lastName The last name to set.
	 */
	public void setLastName(String lastName) {
		lastNameInput.sendKeys(lastName);
	}

	/**
	 * Sets the email in the input field.
	 * 
	 * @param email The email to set.
	 */
	public void setEmail(String email) {
		emailInput.sendKeys(email);
	}

	/**
	 * Sets the primary phone number in the input field.
	 * 
	 * @param primaryPhone The primary phone number to set.
	 */
	public void setPrimaryPhone(String primaryPhone) {
		primaryPhoneInput.sendKeys(primaryPhone);
	}

	/**
	 * Sets the secondary phone number in the input field.
	 * 
	 * @param secondaryPhone The secondary phone number to set.
	 */
	public void setSecondaryPhone(String secondaryPhone) {
		secondaryPhoneInput.sendKeys(secondaryPhone);
	}

	/**
	 * Sets the password in the input field.
	 * 
	 * @param password The password to set.
	 */
	public void setPassword(String password) {
		passwordInput.sendKeys(password);
	}

	/**
	 * Sets the confirm password in the input field.
	 * 
	 * @param confirmPassword The confirm password to set.
	 */
	public void setConfirmPassword(String confirmPassword) {
		confirmPasswordInput.sendKeys(confirmPassword);
	}

	/**
	 * Clicks on the terms checkbox.
	 */
	public void clickTermsCheckbox() {
		elementUtiles.clickOnElement(termsCheckbox, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * Clicks on the "Create New Account" link.
	 */
	public void clickCreateNewAccountLink() {
		elementUtiles.clickOnElement(createNewAccountLink, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * Clicks on the "User" heading.
	 */
	public void clickUserHeading() {
		elementUtiles.clickOnElement(userHeading, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * Clicks on the "Private Sector" heading.
	 */
	public void clickPrivateSectorHeading() {
		elementUtiles.clickOnElement(privateSectorHeading, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * Clicks on the "Government Entities" heading.
	 */
	public void clickGovernmentHeading() {
		elementUtiles.clickOnElement(governmentHeading, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

}
