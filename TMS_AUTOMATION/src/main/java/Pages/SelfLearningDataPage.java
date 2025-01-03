package Pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.CommonUtlies;
import Utiles.ElementUtiles;

public class SelfLearningDataPage {
	WebDriver driver;
	private ElementUtiles elementUtiles;

	// Constructor to initialize the driver and PageFactory
	public SelfLearningDataPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize elements with PageFactory
		elementUtiles = new ElementUtiles(driver);
	}

	/* WebElement XPaths for elements on the Survey page */

	// 1. Locator for the "Number of Choices" input field
	@FindBy(xpath = "//input[@placeholder='Number of Choices']")
	private WebElement numberOfChoicesInput;

	// 2. Locator for the Rich Text Editor field
	@FindBy(xpath = "//div[@aria-label='Rich Text Editor, main']//p")
	private WebElement richTextEditor;

	// 3. Locator for the "Question score" input field
	@FindBy(xpath = "//input[@placeholder='Question score']")
	private WebElement questionScoreInput;

	// 4. Locator for the MCQ Exam option
	@FindBy(xpath = "//option[@value='MCQExamQuestionType']")
	private WebElement mcqExamOption;

	// 5. Locator for the question type select dropdown
	@FindBy(xpath = "//select[@class='form-select form-control ng-valid ng-touched ng-dirty']")
	private WebElement questionTypeSelect;

	// 6. Locator for the "Add Question" button
	@FindBy(xpath = "//button[normalize-space()='Add Question']")
	private WebElement addQuestionButton;

	// 7. Locator for the "Number of Questions" input field
	@FindBy(xpath = "//input[@placeholder='Number of Questions']")
	private WebElement numberOfQuestionsInput;

	// 8. Locator for the "Duration of the test in minutes" input field
	@FindBy(xpath = "//input[@placeholder='duration of the test in minutes']")
	private WebElement durationInput;

	// 9. Locator for the "Passing score" input field
	@FindBy(xpath = "//input[@placeholder='Passing score']")
	private WebElement passingScoreInput;

	// 10. Locator for the "Test name" input field
	@FindBy(xpath = "//input[@placeholder='test-name']")
	private WebElement testNameInput;

	// 11. Locator for the "Add Exam" button
	@FindBy(xpath = "//span[normalize-space()='Add Exam']")
	private WebElement addExamSpan;

	// 12. Locator for the "Exams" button
	@FindBy(xpath = "//button[normalize-space()='Exams']")
	private WebElement examsButton;

	// 13. Locator for the file input form
	@FindBy(xpath = "body/ngb-modal-window[@role='dialog']/div[@role='document']/div[@class='modal-content']/app-file-form/div[@class='modal-body']/div[@class='uploader-wrapper']/div[@class='col-md-12']/div[@class='form-check form-check-inline']/input[1]")
	private WebElement fileFormInput;

	// 14. Locator for the inline checkbox 4
	@FindBy(xpath = "//div[@class='row']//input[@id='inlineCheckbox4']")
	private WebElement inlineCheckbox4;

	// 15. Locator for the content div
	@FindBy(xpath = "//div[@class='content ng-star-inserted']")
	private WebElement contentDiv;

	// 16. Locator for the file name input field
	@FindBy(xpath = "//input[@name='FileName']")
	private WebElement fileNameInput;

	// 17. Locator for the file select dropdown
	@FindBy(xpath = "//select[@class='form-select form-control ng-pristine ng-valid ng-star-inserted ng-touched']")
	private WebElement fileSelect;

	// 18. Locator for the "Add File" button
	@FindBy(xpath = "//span[normalize-space()='Add File']")
	private WebElement addFileSpan;

	// 19. Locator for the "Files" button
	@FindBy(xpath = "//button[normalize-space()='Files']")
	private WebElement filesButton;

	// 20. Locator for the "Choose All" text
	@FindBy(xpath = "//div[contains(text(),'اختيار الكل')]")
	private WebElement chooseAllText;

	// 21. Locator for the modal choose 1 input field
	@FindBy(xpath = "//input[@id='modal-choose1']")
	private WebElement modalChoose1Input;

	// 22. Locator for the certificate input field
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-valid ng-touched']")
	private WebElement certificateInput;

	// 23. Locator for the "Add certificate" button
	@FindBy(xpath = "//span[normalize-space()='Add certificate']")
	private WebElement addCertificateSpan;

	// 24. Locator for the "Certificates" button
	@FindBy(xpath = "//button[normalize-space()='Certificates']")
	private WebElement certificatesButton;

	// 25. Locator for the "Save" button
	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement saveButton;

	// 26. Locator for the input field with name 'chModal2'
	@FindBy(xpath = "//input[@name='chModal2'])[2]")
	private WebElement inputChModal2;

	// 27. Locator for the specific input field inside a table
	@FindBy(xpath = "body[1]/ngb-modal-window[1]/div[1]/div[1]/app-surveys[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/input[1]")
	private WebElement specificInput;

	// 28. Locator for the search icon
	@FindBy(xpath = "//div[@class='input-group']//i[@class='fas fa-search']")
	private WebElement searchIcon;

	// 29. Locator for the form control input field
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-valid ng-touched']")
	private WebElement formControlInput;

	// 30. Locator for the "Added Survey" span
	@FindBy(xpath = "//span[normalize-space()='Added Survey']")
	private WebElement addedSurveySpan;

	// 31. Locator for the "Surveys" button
	@FindBy(xpath = "//button[normalize-space()='Surveys']")
	private WebElement surveysButton;

	// 32. Locator for the dropdown element
	@FindBy(xpath = "//select[@class='form-select form-control ng-pristine ng-valid ng-star-inserted ng-touched']")
	private WebElement dropdown;

	// 33. Locator for the file input field
	@FindBy(id = "fileInput")
	private WebElement fileInput;

	// 34. Locator for the file preview title
	@FindBy(className = "file-preview-title")
	private WebElement filePreviewTitle;

	// 35. Locator for the file preview size
	@FindBy(xpath = "//div[@class='file-preview-size ng-star-inserted']")
	private WebElement filePreviewSize;
	// 9. Locator for the "No Matching Results" message
	@FindBy(xpath = "//td[normalize-space()='There are No Matching Results']")
	private WebElement noMatchingResultsMessage;

	// 10. Locator for the "Next" button in pagination
	@FindBy(xpath = "//span[normalize-space()='»']")
	private WebElement nextButton;

	// 11. Locator for the "Previous" button in pagination
	@FindBy(xpath = "//span[normalize-space()='«']")
	private WebElement previousButton;
	// 14. Locator for the "Filter" button
	@FindBy(xpath = "//span[normalize-space()='Filter']")
	private WebElement filterButton;

	// 15. Locator for the "View" label
	@FindBy(xpath = "//label[normalize-space()='View']")
	private WebElement viewLabel;

	// 12. Locator for the search input field
	@FindBy(xpath = "//div[@class='input-group']//input[contains(@placeholder,'Search ...')]")
	private WebElement searchInput;
	// 16. Locator for the "Status" label
	@FindBy(xpath = "//label[normalize-space()='Status']")
	private WebElement statusLabel;
	// Locator for the <option> element with text "Choose"
	@FindBy(xpath = "//option[@value='select' and text()='Choose']")
	private WebElement chooseOption;
	// Locator for the <option> element with value="theReviewer" and text="The
	// Reviewer"
	@FindBy(xpath = "//option[@value='theReviewer' and text()='The Reviewer']")
	private WebElement reviewerOption;
	// Locator for the <label> element with for="inlineCheckbox5"
	@FindBy(xpath = "//label[@for='inlineCheckbox5']")
	private WebElement checkboxLabel;
	@FindBy(xpath = "//div[@aria-label='Save Successfully']")
	private WebElement SaveSucessfully;

	// Method to get the text of the 'Save Successfully' element
	public String getSaveSuccessfullyText() {
		return elementUtiles.getTextFromElement(SaveSucessfully, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickCheckboxLabel() {
		checkboxLabel.click(); // Click on the label to toggle the checkbox
	}

	// Method to select the 'The Reviewer' option from a dropdown
	public void selectReviewerOption() {
		reviewerOption.click(); // Click the option directly (works if it's not part of a <select> dropdown)
	}

	// Method to select the 'Choose' option from a dropdown
	public void clickChooseOption() {
		chooseOption.click(); // This will click on the 'Choose' option if it's selectable
	}

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

	public void enterSearchText(String searchText) {
		elementUtiles.typeTextIntoElement(searchInput, searchText, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

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

	public String getFilePreviewSize() {
		return filePreviewSize.getText();
	}

	public String getFilePreviewTitle() {
		return filePreviewTitle.getText();
	}

	public void uploadFile(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		fileInput.sendKeys(absolutePath);
	}

	// Method for the Number of Choices input
	public void enterNumberOfChoices(String numberOfChoices) {
		numberOfChoicesInput.sendKeys(numberOfChoices);
	}

	// Method for the Rich Text Editor
	public void enterTextInRichTextEditor(String text) {
		richTextEditor.sendKeys(text);
	}

	// Method for the Question score input
	public void enterQuestionScore(String score) {
		questionScoreInput.sendKeys(score);
	}

	// Method for selecting the MCQ Exam option
	public void selectMCQExamOption() {
		mcqExamOption.click();
	}

	// Method for selecting the Question Type
	public void selectQuestionType() {
		questionTypeSelect.click();
	}

	// Method for clicking the Add Question button
	public void clickAddQuestionButton() {
		addQuestionButton.click();
	}

	// Method for entering the Number of Questions
	public void enterNumberOfQuestions(String numberOfQuestions) {
		numberOfQuestionsInput.sendKeys(numberOfQuestions);
	}

	// Method for entering the duration of the test in minutes
	public void enterTestDuration(String duration) {
		durationInput.sendKeys(duration);
	}

	// Method for entering the Passing Score
	public void enterPassingScore(String passingScore) {
		passingScoreInput.sendKeys(passingScore);
	}

	// Method for entering the Test Name
	public void enterTestName(String testName) {
		testNameInput.sendKeys(testName);
	}

	// Method for clicking the Add Exam span
	public void clickAddExamSpan() {
		addExamSpan.click();
	}

	// Method for clicking the Exams button
	public void clickExamsButton() {
		examsButton.click();
	}

	// Method for interacting with the File Form input
	public void interactWithFileFormInput() {
		fileFormInput.click();
	}

	// Method for clicking the Inline Checkbox
	public void clickInlineCheckbox4() {
		inlineCheckbox4.click();
	}

	// Method for interacting with the content div
	public void clickContentDiv() {
		contentDiv.click();
	}

	// Method for entering the File Name
	public void enterFileName(String fileName) {
		fileNameInput.sendKeys(fileName);
	}

	// Method for selecting the file
	public void selectFile() {
		fileSelect.click();
	}

	// Method for clicking the Add File span
	public void clickAddFileSpan() {
		addFileSpan.click();
		System.out.println(addFileSpan.isEnabled());

	}

	// Method for clicking the Files button
	public void clickFilesButton() {
		filesButton.click();
	}

	// Method for clicking the "اختيار الكل" text
	public void clickChooseAllText() {
		chooseAllText.click();
	}

	// Method for interacting with the modal-choose1 input
	public void interactWithModalChoose1Input() {
		modalChoose1Input.click();
	}

	// Method for entering the Certificate Name
	public void enterCertificateName(String certificateName) {
		certificateInput.sendKeys(certificateName);
	}

	// Method for clicking the Add Certificate span
	public void clickAddCertificateSpan() {
		addCertificateSpan.click();
	}

	// Method for clicking the Certificates button
	public void clickCertificatesButton() {
		certificatesButton.click();
	}

	// Method for clicking the Save button
	public void clickSaveButton() {
		saveButton.click();
	}

	// Method for interacting with the chModal2 input
	public void interactWithChModal2Input() {
		inputChModal2.click();
	}

	// Method for entering a value in the specific input field
	public void enterValueInSpecificInput(String value) {
		specificInput.sendKeys(value);
	}

	// Method for clicking the Search Icon
	public void clickSearchIcon() {
		searchIcon.click();
	}

	// Method for entering text in the Form Control input
	public void enterTextInFormControlInput(String text) {
		formControlInput.sendKeys(text);
	}

	// Method for clicking the Added Survey span
	public void clickAddedSurveySpan() {
		addedSurveySpan.click();
	}

	// Method for clicking the Surveys button
	public void clickSurveysButton() {
		surveysButton.click();
	}

}
