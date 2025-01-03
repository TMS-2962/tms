package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.CommonUtlies;
import Utiles.ElementUtiles;

public class SurveyPage {
	WebDriver driver;
	private ElementUtiles elementUtiles;

	// Constructor to initialize the driver and PageFactory
	public SurveyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize elements with PageFactory
		elementUtiles = new ElementUtiles(driver);
	}

	/* WebElement XPaths for elements on the Survey page */

	// 1. Locator for the survey icon on the navigation bar
	@FindBy(xpath = "//img[@src='assets/img/poll.png']")
	private WebElement surveyOnNavBar;

	// 2. Locator for the "Added Survey" button
	@FindBy(xpath = "//span[normalize-space()='Added Survey']")
	private WebElement addedSurveyAddButton;

	// 3. Locator for the questionnaire name input field
	@FindBy(xpath = "//input[@id='PartnerName']")
	private WebElement questionnaireNameInput;

	// 4. Locator for the "Default for Trainer" checkbox
	@FindBy(xpath = "//input[@id='inlineCheckbox1']")
	private WebElement defaultForTrainerCheckbox;

	// 5. Locator for the "Default for Trainee" checkbox
	@FindBy(xpath = "//input[@id='inlineCheckbox2']")
	private WebElement defaultForTraineeCheckbox;

	// 6. Locator for the "Add Question" button
	@FindBy(xpath = "//button[normalize-space()='Add Question']")
	private WebElement addQuestionButton;

	// 7. Locator for the standard input field
	@FindBy(xpath = "//input[@placeholder='Standard']")
	private WebElement standardInput;

	// 8. Locator for an element with the class 'ng-star-inserted'
	@FindBy(xpath = "//span[@class='ng-star-inserted']")
	private WebElement elementWithNgStarInserted;

	// 9. Locator for the table data with the text "test order"
	@FindBy(xpath = "//td[normalize-space()='test order']")
	private WebElement tdWithTextSeh;

	// 10. Locator for the image inside an anchor tag
	@FindBy(xpath = "//a[@class='btn-icon edit_m ng-star-inserted']//img")
	private WebElement imageInsideAnchor;

	// 11. Locator for the search input field
	@FindBy(xpath = "//input[@placeholder=' Search ...']")
	private WebElement searchInput;

	// 12. Locator for the remove image icon
	@FindBy(xpath = "//img[@src='assets/img/remove.png']")
	private WebElement removeImage;

	// 13. Locator for the "Update" button
	@FindBy(xpath = "//span[normalize-space()='Update']")
	private WebElement updateButton;

	// 14. Locator for the "Save" button
	@FindBy(xpath = "//span[normalize-space()='Save']")
	private WebElement saveButton;

	// 15. Locator for the "Delete" button
	@FindBy(xpath = "//button[normalize-space(text())='Delete']")
	private WebElement deleteButton;

	// 16. Locator for the message indicating the questionnaire could not be deleted
	@FindBy(xpath = "//div[@aria-label='Could Delete Questionnaire:seh']")
	private WebElement deleteQuestionnaireMessage;

	// 17. Locator for the "No Matching Results" message
	@FindBy(xpath = "//td[normalize-space()='There are No Matching Results']")
	private WebElement noMatchingResultsMessage;

	// 18. Locator for the "Next" button in pagination
	@FindBy(xpath = "//span[normalize-space()='»']")
	private WebElement nextButton;

	// 19. Locator for the "Previous" button in pagination
	@FindBy(xpath = "//span[normalize-space()='«']")
	private WebElement previousButton;

	public String getNoMatchingResultsMessageText() {
		return elementUtiles.getTextFromElement(noMatchingResultsMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
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

	// Method to get the text of the element
	public String getDeleteQuestionnaireMessageText() {
		return deleteQuestionnaireMessage.getText();
	}

	/**
	 * This method clicks on the "Delete" button.
	 */
	public void clickDeleteButton() {
		deleteButton.click(); // Click the "Delete" button
	}

	// Method to click on the update button
	public void clickUpdateButton() {
		elementUtiles.clickOnElement(updateButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to click on the remove image
	public void clickRemoveImage() {

		elementUtiles.clickOnElement(removeImage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to interact with the input field
	public void enterSearchText(String searchText) {
//		searchInput.sendKeys(searchText);
		elementUtiles.typeTextIntoElement(searchInput, searchText, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to interact with the element
	public void clickOnImageInsideAnchor() {
		elementUtiles.clickOnElement(imageInsideAnchor, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to interact with the element
	public String clickOnTdWithTextSeh() {
		return elementUtiles.getTextFromElement(tdWithTextSeh, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to interact with the element
	public void clickOnElementWithNgStarInserted() {
		elementUtiles.clickOnElement(elementWithNgStarInserted, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Methods to interact with the elements
	public void clickOnSurveyOnNavBar() {
		elementUtiles.clickOnElement(surveyOnNavBar, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnAddSurvey() {
		elementUtiles.clickOnElement(addedSurveyAddButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterQuestionnaireName(String name) {
		elementUtiles.typeTextIntoElement(questionnaireNameInput, name, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnDefaultForTrainer() {

		elementUtiles.clickOnElement(defaultForTrainerCheckbox, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnDefaultForTrainee() {

		elementUtiles.clickOnElement(defaultForTraineeCheckbox, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnAddQuestion() {

		elementUtiles.clickOnElement(addQuestionButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterStandardInput(String value) {

		elementUtiles.typeTextIntoElement(standardInput, value, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to click on the "Save" button
	public void clickOnSaveButton() {

		elementUtiles.clickOnElement(saveButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

}
