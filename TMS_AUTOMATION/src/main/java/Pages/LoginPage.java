package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.CommonUtlies;
import Utiles.ElementUtiles;

public class LoginPage {

	WebDriver driver;
	private ElementUtiles elementUtiles;

	// Constructor to initialize the WebDriver and PageFactory elements
	/**
	 * This constructor initializes the LoginPage object with the WebDriver
	 * instance, and uses the PageFactory to initialize the elements defined in this
	 * class. It also creates an instance of ElementUtiles to provide utility
	 * methods for interacting with web elements in a more convenient manner, such
	 * as performing actions like click, type, and retrieve text.
	 *
	 * @param driver The WebDriver instance used for interacting with the browser.
	 */
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// Initializes the elements defined in this class with the WebDriver
		PageFactory.initElements(driver, this);
		elementUtiles = new ElementUtiles(driver);
	}

	/* WebElement XPaths for login page elements */

	// 1. Locator for the username input field
	@FindBy(xpath = "//input[@id='userName']")
	private WebElement enterUserName;

	// 2. Locator for the password input field
	@FindBy(xpath = "//input[@id='id_password']")
	private WebElement enterPassword;

	// 3. Locator for the checkbox element (e.g., "Remember me")
	@FindBy(xpath = "//input[@id='gridCheck']")
	private WebElement btnCheckBox;

	// 4. Locator for the login button
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;

	// 5. Locator for the error message when the account is locked
	@FindBy(xpath = "//div[ @aria-label='هذا الايميل مقفول']")
	private WebElement errorMessageForAccountLock;

	// 6. Locator for the general error message for invalid username or password
	@FindBy(xpath = "//div[@aria-label='.خطأ في اسم المستخدم أو كلمة المرور']")
	private WebElement errorMessage;

	// 7. Locator for the error message for a blank password
	@FindBy(xpath = "//span[normalize-space()='هذا الحقل مطلوب']")
	private WebElement errorMessageForBlankPassword;

	// 8. Locator for the error message for a blank username/email
	@FindBy(xpath = "//div[@class='col-md-12']//span[@class='ng-star-inserted'][contains(text(),'هذا الحقل مطلوب')]")
	private WebElement errorMessageForBlankUserEmail;

	// 9. Locator for the logout link
	@FindBy(xpath = "//a[contains(text(),'تسجيل الخروج')]")
	private WebElement logoutLink;

	// 10. Locator for the "تذكرني" label (Remember me)
	@FindBy(xpath = "//label[contains(text(),'تذكرني')]")
	private WebElement rememberMeLabel;

	// 11. Locator for the 'test test' span
	@FindBy(xpath = "//span[normalize-space()='test test']")
	private WebElement testTextSpan;

	// 12. Locator for the eye-slash icon, used for toggling password visibility
	@FindBy(xpath = "//i[@class='fa fa-eye-slash']")
	private WebElement eyeSlashIcon;

	/* Methods to interact with the elements above */

	// 1. Method to enter the username into the username field
	public void EnterUserName(String userName) {
		elementUtiles.typeTextIntoElement(enterUserName, userName, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 2. Method to enter the password into the password field
	public void EnterPassword(String password) {
		elementUtiles.typeTextIntoElement(enterPassword, password, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 3. Method to get the error message text
	public String getErrorMessageText() {
		return elementUtiles.getTextFromElement(errorMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 4. Method to click the login button
	public void BtnLogin() {
		System.out.println("Login button is working :" + btnLogin.isDisplayed());
		elementUtiles.clickOnElement(btnLogin, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 5. Method to click the checkbox (e.g., "Remember me" checkbox)
	public void BtnCheckBox() {
		elementUtiles.clickOnElement(btnCheckBox, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 6. Method to retrieve the error message for blank password
	public String getErrorMessageForBlankPassword() {
		return elementUtiles.getTextFromElement(errorMessageForBlankPassword, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 7. Method to retrieve the error message for blank user email
	public String getErrorMessageForBlankUserEmail() {
		return elementUtiles.getTextFromElement(errorMessageForBlankUserEmail, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 8. Method to perform login in a new tab
	public void performLoginInNewTab(String userName, String password) throws InterruptedException {
		// Open a new tab
		WebDriver newWindow = driver.switchTo().newWindow(WindowType.TAB);
		newWindow.get("https://test-gaca.cpt-it.com/login");

		// Perform login actions in the new tab
		elementUtiles.typeTextIntoElement(enterUserName, userName, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.typeTextIntoElement(enterPassword, password, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.clickOnElement(btnLogin, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

		Thread.sleep(5000);

		String pageTitle = newWindow.getTitle();

		if (pageTitle.contains("expectedTitle")) {
			System.out.println("Login successful in new tab");
		} else {
			System.out.println("Login failed in new tab");
		}
	}

	// 9. Method to click the Eye Slash icon for password visibility toggle
	public void clickEyeSlashIcon() {
		eyeSlashIcon.click();
	}

	// 10. Method to retrieve the text of the "تذكرني" (Remember Me) label
	public String getRememberMeLabelText() {
		return rememberMeLabel.getText();
	}

	// 11. Method to retrieve the error message for account lock
	public String getErrorMessageForAccountLock() {
		return errorMessageForAccountLock.getText();
	}

	// 12. Method to click on the 'تسجيل الخروج' (Log Out) link
	public void clickLogout() {
		logoutLink.click();
		System.out.println("LogOut button is working :" + logoutLink.isDisplayed());
	}

	// 13. Method to click on the 'test test' profile span
	public void clickOntheTestProfile() {
		testTextSpan.click();
	}

}
