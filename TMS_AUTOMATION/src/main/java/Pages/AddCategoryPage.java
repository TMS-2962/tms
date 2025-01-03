package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.CommonUtlies;
import Utiles.ElementUtiles;

public class AddCategoryPage {
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
	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtiles = new ElementUtiles(driver);
	}

	// 1. Locator for the category image
	@FindBy(xpath = "//img[@src='assets/img/tags.png']")
	private WebElement imageCategory;

	// 2. Locator for the search input field
	@FindBy(xpath = "//input[@placeholder=' Search ...']")
	private WebElement searchInput;

	// 3. Locator for the "Add Category" button
	@FindBy(xpath = "//span[normalize-space()='Add Category']")
	private WebElement addCategoryButton;

	// 4. Locator for the category name input field
	@FindBy(xpath = "//input[@name='Name']")
	private WebElement nameInputField;

	// 5. Locator for the required field error message
	@FindBy(xpath = "//span[normalize-space()='This Field is Required']")
	private WebElement requiredFieldMessage;

	// 6. Locator for the "Add" button
	@FindBy(xpath = "//button[normalize-space()='Add']")
	private WebElement addButton;

	// 7. Locator for the category edit button/image
	@FindBy(xpath = "//img[@src='assets/img/edit.png']")
	private WebElement editImage;

	// 8. Locator for the "category already exists" error message
	@FindBy(xpath = "//div[@aria-label='The category you wish to add already exists. We hope to add a new category']")
	private WebElement categoryExistsMessage;

	// 9. Locator for the "Update" button
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement clickOnBtnUpdate;

	// 10. Locator for a specific category in the table
	@FindBy(xpath = "//td[text()='TestTMSSuyog72']")
	private WebElement yourElement;

	// 11. Locator for the special character error message
	@FindBy(xpath = "//span[contains(text(), 'Not allowed Use special characters')]")
	private WebElement specialCharacterMessage;

	// 12. Locator for the "active" status span element
	@FindBy(xpath = "//span[contains(text(),'active')]")
	private WebElement activeSpan;

	// 13. Locator for the "Filter" button
	@FindBy(xpath = "//span[normalize-space()='Filter']")
	private WebElement filterButton;

	// 14. Locator for the "View" label
	@FindBy(xpath = "//label[normalize-space()='View']")
	private WebElement viewLabel;

	// 15. Locator for the "Status" label
	@FindBy(xpath = "//label[normalize-space()='Status']")
	private WebElement statusLabel;

	// 16. Locator for the "No Matching Results" message
	@FindBy(xpath = "//td[normalize-space()='There are No Matching Results']")
	private WebElement noMatchingResultsMessage;

	// 17. Locator for the "Next" button in pagination
	@FindBy(xpath = "//span[normalize-space()='»']")
	private WebElement nextButton;

	// 18. Locator for the "Previous" button in pagination
	@FindBy(xpath = "//span[normalize-space()='«']")
	private WebElement previousButton;

	// 19. Locator for the dropdown menu used for filtering
	@FindBy(xpath = "//select[@id='selectlist']")
	private WebElement filterDropdown;

	// 20. Locator for the filter option to select '5'
	@FindBy(xpath = "//option[@value='5']")
	private WebElement filterOption5;

	// 21. Locator for the filter option to select '25'
	@FindBy(xpath = "//option[@value='25']")
	private WebElement filterOption25;

	// 22. Locator for the filter option to select '50'
	@FindBy(xpath = "//option[@value='50']")
	private WebElement filterOption50;

	// 23. Locator for the filter option to select '100'
	@FindBy(xpath = "//option[@value='100']")
	private WebElement filterOption100;

	// 24. Locator for the filter option to select '10'
	@FindBy(xpath = "//option[@value='10']")
	private WebElement filterOption10;

	// 25. Locator for the table row containing '5'
	@FindBy(xpath = "//td[normalize-space()='5']")
	private WebElement tableRowValue5;

	// 26. Locator for the table row containing '25'
	@FindBy(xpath = "//td[normalize-space()='25']")
	private WebElement tableRowValue25;

	// 27. Locator for the table row containing '50'
	@FindBy(xpath = "//td[normalize-space()='50']")
	private WebElement tableRowValue50;

	// 28. Locator for the table row containing '100'
	@FindBy(xpath = "//td[normalize-space()='100']")
	private WebElement tableRowValue100;

	// 29. Locator for the table row containing '10'
	@FindBy(xpath = "//td[normalize-space()='10']")
	private WebElement tableRowValue10;

	/**
	 * This method clicks on the "Add Category" button. It uses a utility method to
	 * perform the click action and waits for the button to be clickable before
	 * performing the click.
	 */
	public void clickAddCategory() {
		elementUtiles.clickOnElement(addCategoryButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method enters text into the "Name" input field. It uses a utility method
	 * to type the provided category name into the input field and waits for the
	 * field to be ready before entering the text.
	 *
	 * @param categoryName The name of the category to be entered into the input
	 *                     field.
	 */
	public void enterCategoryName(String categoryName) {
		elementUtiles.typeTextIntoElement(nameInputField, categoryName, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method clicks on the "Add" button to submit the form. It uses a utility
	 * method to click the button and waits for the button to be clickable before
	 * performing the click.
	 */
	public void clickAddButton() {
		elementUtiles.clickOnElement(addButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method clicks on the "Update" button to save changes to the category. It
	 * uses a utility method to click the button and waits for the button to be
	 * clickable before performing the click.
	 */
	public void ClickOnTheUpdate() {
		elementUtiles.clickOnElement(clickOnBtnUpdate, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text of the "This Field is Required" message. It
	 * checks if the required field message is displayed when a user fails to
	 * provide a category name.
	 *
	 * @return The text of the "This Field is Required" message as a String.
	 */
	public String isRequiredFieldMessageDisplayed() {
		return elementUtiles.getTextFromElement(requiredFieldMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text of the "Category exists" message. It checks if
	 * the category already exists when trying to add a new category.
	 *
	 * @return The text of the "Category exists" message as a String.
	 */
	public String isCategoryExistsMessageDisplayed() {
		return elementUtiles.getTextFromElement(categoryExistsMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method clicks on the "Edit" image, which may be used for editing an
	 * existing category. It uses a utility method to perform the click action and
	 * waits for the image to be clickable.
	 */
	public void clickEditImage() {
		elementUtiles.clickOnElement(editImage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method enters a search text into the search input field to search for a
	 * category. It uses a utility method to type the search text into the input
	 * field and waits for the field to be ready.
	 *
	 * @param searchText The text to be searched for in the category list.
	 */
	public void searchCategory(String searchText) {
		elementUtiles.typeTextIntoElement(searchInput, searchText, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method clicks on the "Tags" image, which may represent the category
	 * list. It uses a utility method to perform the click action and waits for the
	 * image to be clickable.
	 */
	public void clickOnCategory() {
		elementUtiles.clickOnElement(imageCategory, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the "Not allowed Use special characters"
	 * message. It uses a utility method to extract the text from the element and
	 * applies an explicit wait for the specified amount of time to ensure the
	 * message is fully loaded before attempting to retrieve the text.
	 *
	 * @return The text of the special character error message as a String.
	 */
	public String getSpecialCharacterMessageText() {
		return elementUtiles.getTextFromElement(specialCharacterMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from a specific element identified by the
	 * 'yourElement' locator. It uses a utility method to extract the text from the
	 * element and applies an explicit wait for the specified amount of time to
	 * ensure the element is fully loaded before retrieving the text.
	 *
	 * @return The text of the element as a String.
	 */
	public String getTextFromElement() {
		return elementUtiles.getTextFromElement(yourElement, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method toggles the active state of an element (for example, a switch or
	 * toggle). If the element is displayed and enabled, it clicks on it to change
	 * its state. If the element is not clickable or in a valid state, a message is
	 * printed.
	 */
	public void toggleActiveState() {
		if (activeSpan.isDisplayed() && activeSpan.isEnabled()) {
			activeSpan.click(); // Click to toggle the state
		} else {
			System.out.println("Element is not clickable or not in a valid state.");
		}
	}

	/**
	 * This method checks if the toggle is currently in the "active" state. It
	 * compares the text of the element to "active" (case-insensitive) and returns a
	 * boolean value.
	 *
	 * @return true if the toggle is active, false otherwise.
	 */
	public boolean isActive() {
		return activeSpan.getText().equalsIgnoreCase("active");
	}

	/**
	 * This method enables or disables the toggle by clicking on it to change its
	 * state. If the toggle is currently active, it will be disabled, and if it is
	 * inactive, it will be enabled.
	 */
	public void enableOrDisable() {
		if (isActive()) {
			System.out.println("The toggle is active. Disabling it...");
			toggleActiveState(); // Click to disable
		} else {
			System.out.println("The toggle is inactive. Enabling it...");
			toggleActiveState(); // Click to enable
		}
	}

	/**
	 * This method clicks the "Filter" button to open the filter options.
	 */
	public void clickFilter() {
		elementUtiles.clickOnElement(filterButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the "View" label.
	 * 
	 * @return The text from the "View" label.
	 */
	public String getViewText() {
		return elementUtiles.getTextFromElement(viewLabel, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the "Status" label.
	 * 
	 * @return The text from the "Status" label.
	 */
	public String getStatusText() {
		return elementUtiles.getTextFromElement(statusLabel, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
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

	public String getNoMatchingResultsMessageText() {
		return elementUtiles.getTextFromElement(noMatchingResultsMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickFilterDropdown() {
		elementUtiles.clickOnElement(filterDropdown, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectFilterOption(String optionValue) {
		WebElement option = null;
		switch (optionValue) {
		case "5":
			option = filterOption5;
			break;
		case "10":
			option = filterOption10;
			break;
		case "25":
			option = filterOption25;
			break;
		case "50":
			option = filterOption50;
			break;
		case "100":
			option = filterOption100;
			break;
		default:
			throw new IllegalArgumentException("Invalid filter option: " + optionValue);
		}
		elementUtiles.clickOnElement(option, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public String getTableRowValueText(String rowValue) {
		WebElement row = null;
		switch (rowValue) {
		case "5":
			row = tableRowValue5;
			break;
		case "10":
			row = tableRowValue10;
			break;
		case "25":
			row = tableRowValue25;
			break;
		case "50":
			row = tableRowValue50;
			break;
		case "100":
			row = tableRowValue100;
			break;
		default:
			throw new IllegalArgumentException("Invalid row value: " + rowValue);
		}
		return elementUtiles.getTextFromElement(row, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

}
