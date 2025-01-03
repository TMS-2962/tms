package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utiles.CommonUtlies;
import Utiles.ElementUtiles;

public class TargetPage {
	WebDriver driver;
	private ElementUtiles elementUtiles;

	/* Constructor to initialize the WebDriver and PageFactory elements */
	public TargetPage(WebDriver driver) {
		this.driver = driver;
		// Initializes all elements defined in this class using the current driverF
		PageFactory.initElements(driver, this);
		elementUtiles = new ElementUtiles(driver);

	}

	/* WebElement XPaths for elements on the Target page */

	// 1. Locator for the "Add Category" button
	@FindBy(xpath = "//span[contains(text(), 'Add Category')]")
	private WebElement clickOnTheAddCategory;

	// 2. Locator for the input field to enter the category name
	@FindBy(xpath = "//input[@name='Name']")
	private WebElement enterTextInTheAddCategory;

	// 3. Locator for the "Add" button
	@FindBy(xpath = "//button[text()='Add']")
	private WebElement clickOnBtnAdd;

	// 4. Locator for the "Edit" button (image)
	@FindBy(xpath = "//img[@src='assets/img/edit.png']")
	private WebElement clickOnBtnEdit;

	// 5. Locator for the "Update" button
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement clickOnBtnUpdate;

	// 6. Locator for the "TestTMS28" element
	@FindBy(xpath = "//td[text()='TestTMS28']")
	private WebElement testTMS28Element;

	// 7. Locator for the alert message when category already exists
	@FindBy(xpath = "//div[@aria-label='The category you wish to add already exists. We hope to add a new category']")
	private WebElement alertMessage;

	// 8. Locator for the message when special characters are used
	@FindBy(xpath = "//span[contains(text(), 'Not allowed Use special characters')]")
	private WebElement specialCharacterMessage;

	// 9. Locator for the "No Matching Results" message
	@FindBy(xpath = "//td[normalize-space()='There are No Matching Results']")
	private WebElement noMatchingResultsMessage;

	// 10. Locator for the "Next" button in pagination
	@FindBy(xpath = "//span[normalize-space()='»']")
	private WebElement nextButton;

	// 11. Locator for the "Previous" button in pagination
	@FindBy(xpath = "//span[normalize-space()='«']")
	private WebElement previousButton;

	// 12. Locator for the search input field
	@FindBy(xpath = "//input[@placeholder=' Search ...']")
	private WebElement searchInput;

	// 13. Locator for the "This Field is Required" validation message
	@FindBy(xpath = "//span[normalize-space()='This Field is Required']")
	private WebElement fieldRequiredMessage;

	// 14. Locator for the "Filter" button
	@FindBy(xpath = "//span[normalize-space()='Filter']")
	private WebElement filterButton;

	// 15. Locator for the "View" label
	@FindBy(xpath = "//label[normalize-space()='View']")
	private WebElement viewLabel;

	// 16. Locator for the "Status" label
	@FindBy(xpath = "//label[normalize-space()='Status']")
	private WebElement statusLabel;


	// Method to click the "Filter" button
	public void clickFilter() {
		filterButton.click();
	}

	// Method to get text from the "View" label
	public String getViewText() {
		return viewLabel.getText();
	}

	// Method to get text from the "Status" label
	public String getStatusText() {
		return statusLabel.getText();
	}

	// Getter method for the WebElement
	public String getTestTMS28Element() {
		return elementUtiles.getTextFromElement(testTMS28Element, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to click the "Update" button
	public void ClickOnTheUpdate() {
		elementUtiles.clickOnElement(clickOnBtnUpdate, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to click the "Edit" button to modify an existing category
	public void ClickOnTheEdit() {
		elementUtiles.clickOnElement(clickOnBtnEdit, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to click the "Add Category" button
	public void ClickOnTheAddCategory() {
		elementUtiles.clickOnElement(clickOnTheAddCategory, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to enter text into the "Add Category" input field
	public void EnterTextInTheAddCategory(String EnterText) {
		elementUtiles.typeTextIntoElement(enterTextInTheAddCategory, EnterText, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to click the "Add" button to submit the new category
	public void ClickOnBtnAdd() {
		elementUtiles.clickOnElement(clickOnBtnAdd, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to click the "Next" button
	public void clickNextButton() {
		elementUtiles.clickOnElement(nextButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to click the "Previous" button
	public void clickPreviousButton() {
		elementUtiles.clickOnElement(previousButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to check if the "Next" button is displayed
	public boolean isNextButtonDisplayed() {
		return elementUtiles.displayStatusOfElement(nextButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to check if the "Previous" button is displayed
	public boolean isPreviousButtonDisplayed() {
		return elementUtiles.displayStatusOfElement(previousButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterSearchText(String searchText) {
		elementUtiles.typeTextIntoElement(searchInput, searchText, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public String getFieldRequiredMessageText() {
		return elementUtiles.getTextFromElement(fieldRequiredMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the "There are No Matching Results"
	 * message element on the page. It uses a utility method to extract the text
	 * from the element and applies an explicit wait for the specified amount of
	 * time to ensure that the message is fully loaded before attempting to retrieve
	 * the text.
	 *
	 * @return The text of the "No Matching Results" message as a String.
	 */
	public String getNoMatchingResultsMessageText() {
		return elementUtiles.getTextFromElement(noMatchingResultsMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from a special character message element on
	 * the page. It uses a utility method to extract the text from the element and
	 * applies an explicit wait for the specified amount of time to ensure that the
	 * special character message has fully loaded before attempting to retrieve the
	 * text.
	 *
	 * @return The text of the special character message as a String.
	 */
	public String getSpecialCharacterMessageText() {
		return elementUtiles.getTextFromElement(specialCharacterMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from an alert message element on the page. It
	 * uses a utility method to extract the text from the element and applies an
	 * implicit wait for the specified amount of time to ensure that the alert
	 * message has fully loaded before attempting to retrieve the text.
	 *
	 * @return The text of the alert message as a String.
	 */
	public String getAlertMessageText() {
		return elementUtiles.getTextFromElement(alertMessage, CommonUtlies.IMPLICIT_WAIT_TIME);
	}

	// Using XPath to locate the 'active' <span> element
	@FindBy(xpath = "//span[contains(text(),'active')]")
	private WebElement activeSpan;

	// Method to click on the toggle (to enable/disable)
	public void toggleActiveState() {
		if (activeSpan.isDisplayed() && activeSpan.isEnabled()) {
			activeSpan.click(); // Click to toggle the state
		} else {
			System.out.println("Element is not clickable or not in a valid state.");
		}
	}

	// Method to check if the toggle is "active"
	public boolean isActive() {
		return activeSpan.getText().equalsIgnoreCase("active");
	}

	// Method to disable or enable (clicking it to change state)
	public void enableOrDisable() {
		if (isActive()) {
			System.out.println("The toggle is active. Disabling it...");
			toggleActiveState(); // Click to disable
		} else {
			System.out.println("The toggle is inactive. Enabling it...");
			toggleActiveState(); // Click to enable
		}
	}

}
