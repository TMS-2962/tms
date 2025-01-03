package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.CommonUtlies;
import Utiles.ElementUtiles;

public class SelfLearning {
	// Constructor to initialize the driver and PageFactory
	WebDriver driver;
	private ElementUtiles elementUtiles;

	public SelfLearning(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize elements with PageFactory
		elementUtiles = new ElementUtiles(driver);
	}

	/* WebElement XPaths for elements on the Self Learning page */

	// 1. Locator for the "Self Learning" link
	@FindBy(xpath = "//a[@href='/auth/courses/recorded-training-courses']")
	private WebElement selfLearningLink;

	// 2. Locator for the "Search" input field
	@FindBy(xpath = "//input[@placeholder=' Search ...']")
	private WebElement searchInputField;

	// 3. Locator for the second column in the first row of the table
	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	private WebElement secondColumnFirstRow;

	// 4. Locator for the third column in the first row of the table
	@FindBy(xpath = "//tbody/tr[1]/td[3]")
	private WebElement thirdColumnFirstRow;

	// 5. Locator for the fourth column in the first row of the table
	@FindBy(xpath = "//body[1]/app-root[1]/div[1]/app-home[1]/div[1]/div[1]/div[1]/div[1]/app-recorded-training-courses[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	private WebElement fourthColumnFirstRow;

	// 6. Locator for the "No Matching Results" message
	@FindBy(xpath = "//td[normalize-space()='There are No Matching Results']")
	private WebElement noMatchingResultsMessage;


	// Method to check if the "No Matching Results" message is displayed
	/*
	 * This method retrieves the text from the "No Matching Results" element and returns it.
	 * It uses an explicit wait to ensure the element is fully loaded before retrieving the text.
	 * The explicit wait time is configured by CommonUtlies.EXPLICIT_WAIT_BASIC_TIME.
	 */
	public String isNoMatchingResultsDisplayed() {
	    // Returns the text of the element using the utility method and explicit wait
	    return elementUtiles.getTextFromElement(noMatchingResultsMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Private methods to interact with the elements

	// Method to click on the "Self Learning" link
	/*
	 * This method clicks on the 'Self Learning' link element.
	 * An explicit wait is used to ensure the element is clickable before performing the action.
	 * The method ensures that the click action is performed only when the element is ready.
	 */
	public void clickSelfLearningLink() {
	    // Clicks on the element using the utility method and explicit wait
	    elementUtiles.clickOnElement(selfLearningLink, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to enter search text into the search input field
	/*
	 * This method enters the provided search text into the search input field.
	 * It waits for the element to be visible and interactable before entering the text.
	 * This ensures that the text is typed into the input field after it is fully ready for interaction.
	 */
	public void enterSearchText(String text) {
	    // Types the provided text into the search input field using the utility method and explicit wait
	    elementUtiles.typeTextIntoElement(searchInputField, text, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to get the text from the second column in the first row of the table
	/*
	 * This method retrieves the text from the second column of the first row in the table.
	 * It waits for the element to be visible before extracting the text.
	 * The explicit wait ensures that the method retrieves the text only after the element is ready.
	 */
	public String getTextFromSecondColumnFirstRow() {
	    // Retrieves the text from the second column first row using the utility method and explicit wait
	    return elementUtiles.getTextFromElement(secondColumnFirstRow, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to get the text from the third column in the first row of the table
	/*
	 * This method retrieves the text from the third column of the first row in the table.
	 * It waits for the element to be visible before extracting the text.
	 * An explicit wait is used to ensure the element is loaded before the text is retrieved.
	 */
	public String getTextFromThirdColumnFirstRow() {
	    // Retrieves the text from the third column first row using the utility method and explicit wait
	    return elementUtiles.getTextFromElement(thirdColumnFirstRow, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}



	// Method to click the first link containing "Zero" in the fourth column of the first row
	/*
	 * This method clicks on the first link that is located in the fourth column of the first row.
	 * The link is identified by the `fourthColumnFirstRow` WebElement.
	 * It ensures that the click action is performed only when the element is fully loaded and ready to be clicked.
	 * The explicit wait time is configured by CommonUtlies.EXPLICIT_WAIT_BASIC_TIME to wait for the element to be clickable.
	 */
	public void clickFirstLinkContainingZero() {
	    // Clicks on the element using the utility method and explicit wait
	    elementUtiles.clickOnElement(fourthColumnFirstRow, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

}
