package Pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.CommonUtlies;
import Utiles.ElementUtiles;

public class AddCoursePage {

	WebDriver driver;
	private ElementUtiles elementUtiles;

	/**
	 * Constructor to initialize the driver and PageFactory for the AddCoursePage
	 * class. This ensures that all the elements in this page are properly
	 * initialized and ready for interaction.
	 *
	 * @param driver WebDriver instance used to interact with the web page.
	 */
	public AddCoursePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize elements with PageFactory
		elementUtiles = new ElementUtiles(driver); // Initialize the utility class for common element actions
	}

	// Elements (Locators using @FindBy annotation)
	// 1. WebElement representing the image of a training course
	@FindBy(xpath = "//img[contains(@src, 'training-course-m.png')]")
	private WebElement courseImage;

	// 2. WebElement representing the link to the "Training Material" page
	@FindBy(xpath = "//a[@href='/auth/courses/training-material-view']")
	private WebElement trainingMaterialLink;

	// 3. WebElement representing the "Add" button to add a new course
	@FindBy(xpath = "//span[text()='Add']")
	private WebElement addButton;

	// 4. WebElement for the input field where course code is entered
	@FindBy(xpath = "//input[@placeholder='Code']")
	private WebElement codeInputField;

	// 5. WebElement for the input field where the Arabic course name is entered
	@FindBy(xpath = "//input[@placeholder='Arabic Course Name']")
	private WebElement arabicCourseNameInputField;

	// 6. WebElement for the input field where the English course name is entered
	@FindBy(xpath = "//input[@placeholder='English Course Name']")
	private WebElement englishCourseNameInputField;

	// 7. WebElement for the "Select" span, often used to trigger a dropdown or
	// selection menu
	@FindBy(xpath = "//span[text()='Select']")
	private WebElement selectSpan;

	// 8. WebElement for the dropdown element where course category can be selected
	@FindBy(xpath = "//select[@formcontrolname='CategoryId']")
	private WebElement chooseOption;

	// 9. WebElement for a specific option in the dropdown (option 'uuuu')
	@FindBy(xpath = "//select[@formcontrolname='CategoryId']/option[text()=' uuuu ']")
	private WebElement uuuuOption;

	// 10. WebElement for the label with text 'TestTMS83', representing a specific
	// label on the page
	@FindBy(xpath = "//label[text()='TestTMS83']")
	private WebElement testTms83Label;

	// 11. WebElement for the input field where the price per person is entered for
	// the course
	@FindBy(xpath = "//input[@placeholder='Price Per Person']")
	private WebElement pricePerPersonInput;

	// 12. WebElement for the input field where the duration of the course is
	// entered
	@FindBy(xpath = "//input[@placeholder='Duration Of The Course']")
	private WebElement durationOfCourseInput;

	// 13. WebElement for the textarea where a brief description of the course can
	// be entered
	@FindBy(xpath = "//textarea[@placeholder='Course Brief']")
	private WebElement courseBriefTextarea;

	// 14. WebElement for the textarea where the course requirements can be entered
	@FindBy(xpath = "//textarea[@placeholder='Course requirements']")
	private WebElement courseRequirementsTextarea;

	// 15. WebElement representing a close option in a category selection dropdown
	@FindBy(css = "#ngb-nav-0-panel > div:nth-child(1) > div:nth-child(5) > div > angular2-multiselect > div > div.selected-list > div")
	private WebElement closeOptionTargetCategory;

	// 16. WebElement for the input field where the price per person for remote
	// courses is entered
	@FindBy(xpath = "//input[@placeholder='Price Per Person Remotely']")
	private WebElement PricePerPersonRemotely;

	// 17. WebElement for the label with the id 'uploadBtn'
	@FindBy(xpath = "//input[@id='fileInput']")
	private WebElement uploadVideo;

	// 18. Used to interact with the upload button
	@FindBy(xpath = "//input[@type='file' and @accept='image/*']")
	private WebElement fileInput;

	// 19. WebElement for the input field where the partner name is entered
	@FindBy(xpath = "//div[@class='r-row']//input[@id='PartnerName']")
	private WebElement partnerNameInput;

	// 20. Finding the input field with placeholder 'Course General Objectives'
	@FindBy(xpath = "//input[@id='PartnerName' and @type='text' and @formcontrolname='Name' and @placeholder='Course General Objectives']")
	private WebElement courseObjectivesInput;

	// 21. Finding the dropdown caret (multiselect)
	@FindBy(xpath = "//span[contains(@class, 'dropdown-multiselect__caret')]")
	private WebElement dropdownCaretIcon;

	// 22. Finding the div with the text 'trainer تتس'
	@FindBy(xpath = "//div[contains(text(), 'trainer تتس')]")
	private WebElement trainerTextDiv;

	// 23. Finding the checkbox input with aria-label 'English'
	@FindBy(css = "#ngb-nav-0-panel > div.row.p-head.ng-star-inserted > div:nth-child(9) > div > ng-multiselect-dropdown > div > div.dropdown-list > ul.item1 > li.multiselect-item-checkbox.ng-star-inserted")
	private WebElement englishLanguageCheckbox;

	// 24. Using @FindBy to locate the span element with translate='' and
	// text='Save'
	@FindBy(xpath = "//span[@translate='' and text()='Save']")
	private WebElement saveButton;

	// 25. Using @FindBy to locate the "Choose" button inside the
	// ng-multiselect-dropdown
	@FindBy(xpath = "//ng-multiselect-dropdown[@formcontrolname='CourseLanguages']//span[text()='Choose']")
	private WebElement chooseButton;

	// 26. Locate the search input field using @FindBy
	@FindBy(xpath = "//input[@type='text' and @placeholder=' Search ...']")
	private WebElement searchInput;

	// 27. Locate the "edit" image using @FindBy
	@FindBy(xpath = "//img[@src='assets/img/edit.png' and @alt='edit']")
	private WebElement editIcon;

	// 28. Locate the "remove" image using @FindBy
	@FindBy(xpath = "//img[@src='assets/img/remove.png' and @alt='remove']")
	private WebElement removeIcon;

	// 29. PassMark Input Field
	@FindBy(xpath = "//input[@type='text' and @formcontrolname='PassingPercentage' and @placeholder='passMark']")
	private WebElement passMarkInput;

	// 30. Duration Input Field
	@FindBy(xpath = "//input[@type='number' and @id='PartnerName' and @formcontrolname='DurationOfCourseBerDay' and @placeholder='Duration of completion material(in days)']")
	private WebElement durationInput;

	// 31. Duration Hours Input Field
	@FindBy(xpath = "//input[@type='number' and @id='floatingHour' and @formcontrolname='DurationPerHours' and @min='0' and @required]")
	private WebElement durationHoursInput;

	// 32. Finding the <a> element with the ID "ngb-nav-3" and other attributes
	@FindBy(xpath = "//a[@id='ngb-nav-3' and @role='tab' and text()='Self Learning data']")
	private WebElement selfLearningLinkForADDCourse;

	// 33. Find the <span> element with the text 'Update'
	@FindBy(xpath = "//span[normalize-space(text())='Update']")
	private WebElement updateSpan;

	// 34. Find the "Self Learning data" link for update course
	@FindBy(xpath = "//a[text()='Self Learning data']")
	private WebElement selfLearningLinkForUpdateCourse;

	// 35. Using @FindBy with XPath to locate the <td> element by text
	@FindBy(xpath = "//td[text()='TestcourseID776']")
	private WebElement courseIdCell;

	// 36. Find the span element for "Course Image is Required"
	@FindBy(xpath = "//span[contains(text(), 'Course Image is Required')]")
	private WebElement courseImageError;

	// 37. Find the span element for "Course Name is Required"
	@FindBy(xpath = "//span[text()='Course Name is Required']")
	private WebElement courseNameError;

	// 38. Find the span element for "This Field is Required"
	@FindBy(xpath = "//span[contains(text(), 'This Field is Required')]")
	private WebElement genericFieldError;

	// 39. Find the span element for "Course About is Required"
	@FindBy(xpath = "//div[contains(text(), 'Course About is Required')]")
	private WebElement courseAboutError;

	// 40. Find the span element for "Introduction Video is required"
	@FindBy(xpath = "//span[contains(text(), 'Introduction Video is required')]")
	private WebElement introVideoError;

	// 41. Find the span element for "Course Objective is Required"
	@FindBy(xpath = "//span[contains(text(), 'Course Objective is Required')]")
	private WebElement courseObjectiveError;

	// 42. Duration Minutes Input Field
	@FindBy(xpath = "//input[@type='number' and @id='floatingMinute' and @formcontrolname='DurationPerMinutes' and @min='0' and @max='59' and @required]")
	private WebElement durationMinutesInput;

	// 43. Locating the button using XPath
	@FindBy(xpath = "//span[normalize-space()='First Question']")
	private WebElement collapseButton;

	// 44. Locating the FAQ Question input field using XPath
	@FindBy(xpath = "//input[@id='PartnerName' and @formcontrolname='QuestionTitle' and @placeholder='Question']")
	private WebElement faqQuestionInput;

	// 45. Locating the FAQ Answer textarea field using XPath
	@FindBy(css = "#ngb-panel-0 > div > div > div:nth-child(2) > div > textarea")
	private WebElement faqAnswerTextArea;

	// 46. Button "Add New Unit"
	@FindBy(xpath = "//button[normalize-space()='Add New Unit']")
	private WebElement addNewUnitButton;

	// 47. Input field for Partner Name
	@FindBy(xpath = "//input[@id='PartnerName0']")
	private WebElement unitTitle;

	// 48. Input field for Unit Name
	@FindBy(xpath = "//input[@placeholder='Unit Name']")
	private WebElement unitNameInput;

	// 49. Textarea for Unit Brief
	@FindBy(xpath = "//textarea[@placeholder='Unit Brief']")
	private WebElement unitBriefTextarea;

	// 50. Save button in Unit section
	@FindBy(xpath = "//button[normalize-space(text())='Save']")
	private WebElement saveButtonInUnit;

	// 51. Videos Tab Button
	@FindBy(xpath = "//button[@id='v-pills-videos-0-tab']")
	private WebElement videosTabButton;

	// 52. Anchor tag with modal toggle for add button in Unit
	@FindBy(xpath = "//a[@data-bs-toggle='modal']")
	private WebElement addButtonInUnit;

	// 53. Input for Video Name
	@FindBy(xpath = "//input[@placeholder='Video Name']")
	private WebElement videoNameInput;

	// 54. Input for Video Title
	@FindBy(xpath = "//input[@placeholder='Video Title']")
	private WebElement videoTitleInput;

	// 55. Input for file upload
	@FindBy(xpath = "//input[@class='file-input' and @accept='.mp4']")
	private WebElement AddVideoInUnit;

	// 56. Files Tab Button
	@FindBy(xpath = "//button[@id='v-pills-files-0-tab']")
	private WebElement filesTabButton;

	// 57. Add Button for Files
	@FindBy(xpath = "//div[@id='v-pills-files-0']//a[@class='btn btn-info ng-star-inserted'][normalize-space()='Add']")
	private WebElement addButtonForfiles;

	// 58. Input for Field name in Arabic
	@FindBy(xpath = "//input[@placeholder='Field name in Arabic']")
	private WebElement fieldNameArabicInput;

	// 59. Input for Field name in English
	@FindBy(xpath = "//input[@placeholder='Field name in English']")
	private WebElement fieldNameEnglishInput;

	// 60. Input for file input
	@FindBy(xpath = "//input[@type='file' and @id='fileInput']")
	private WebElement UploadFileInunit;

	// 61. Button "Save and Add"
	@FindBy(xpath = "//button[normalize-space()='save and Add']")
	private WebElement saveAndAddButton;

	// 62. Button for Goals Tab
	@FindBy(xpath = "//button[@id='v-pills-goals-0-tab']")
	private WebElement goalsTabButton;

	// 63. Input for Goal name in Arabic
	@FindBy(xpath = "//input[@placeholder='Goal name in Arabic']")
	private WebElement goalNameArabicInput;

	// 64. Input for Goal name in English
	@FindBy(xpath = "//input[@placeholder='Goal name in English']")
	private WebElement goalNameEnglishInput;

	// 65. Button for Elements Tab
	@FindBy(xpath = "//button[@id='v-pills-elements-0-tab']")
	private WebElement elementsTabButton;

	// 66. Input for Element name in Arabic
	@FindBy(xpath = "//input[@placeholder='Element name in Arabic']")
	private WebElement elementNameArabicInput;

	// 67. Button for Links Tab
	@FindBy(xpath = "//button[@id='v-pills-links-0-tab']")
	private WebElement linksTabButton;

	// 68. Input for Link name in Arabic
	@FindBy(xpath = "//input[@placeholder='Link name in Arabic']")
	private WebElement linkNameArabicInput;

	// 69. Input for Link name in English
	@FindBy(xpath = "//input[@placeholder='Link name in English']")
	private WebElement linkNameEnglishInput;

	// 70. Input for Link URL
	@FindBy(xpath = "//input[@placeholder='link']")
	private WebElement linkInput;

	// 71. Button for Scorm Tab
	@FindBy(xpath = "//button[@id='v-pills-scorms-0-tab']")
	private WebElement scormTabButton;

	// 72. Input for Scorm Name
	@FindBy(xpath = "//input[@placeholder='Scorm Name']")
	private WebElement scormNameInput;

	// 73. Input for Lecture Number
	@FindBy(xpath = "//input[@placeholder='Lecture Number']")
	private WebElement lectureNumberInput;

	// 74. Input for Duration of Scorm
	@FindBy(xpath = "//input[@placeholder='Duration Scorm']")
	private WebElement scormDurationInput;

	// 75. Input for Field name in Arabic (Quiz)
	@FindBy(xpath = "//input[@placeholder='Field name in Arabic']")
	private WebElement fieldNameArabicInputQuiz;

	// 76. Input for Field name in English (Quiz)
	@FindBy(xpath = "//input[@placeholder='Field name in English']")
	private WebElement fieldNameEnglishInputQuiz;

	// 77. Input for Lecture Number (2nd Input)
	@FindBy(xpath = "//input[@placeholder='Number-Lecture']")
	private WebElement lectureNumberInput2;

	// 78. Textarea for Description
	@FindBy(xpath = "//textarea[@name='Description']")
	private WebElement descriptionTextarea;

	// 79. Button for Exam Tab
	@FindBy(xpath = "//button[@id='v-pills-Exam-0-tab']")
	private WebElement examTabButton;

	// 80. Input for Test Name
	@FindBy(xpath = "//input[@placeholder='test-name']")
	private WebElement testNameInput;

	// 81. Input for Passing Score
	@FindBy(xpath = "//input[@placeholder='Passing score']")
	private WebElement passingScoreInput;

	// 82. 'Add' Button for Alerts
	@FindBy(xpath = "//button[normalize-space(text())='Add']")
	private WebElement ALERTaddButton;

	// 83. Add Goal Button
	@FindBy(xpath = "//div[@id='v-pills-goals-0']//a[@class='btn btn-info ng-star-inserted'][normalize-space()='Add']")
	private WebElement addGoalButton;

	// 84. Add Element Button
	@FindBy(xpath = "//div[@id='v-pills-elements-0']//a[@class='btn btn-info ng-star-inserted'][normalize-space()='Add']")
	private WebElement addElementButton;

	// 85. Add Link Button
	@FindBy(xpath = "//div[@id='v-pills-links-0']//a[@class='btn btn-info ng-star-inserted'][normalize-space()='Add']")
	private WebElement addLinkButton;

	// 86. Add Scorm Button
	@FindBy(xpath = "//div[@id='v-pills-scorms-0']//a[@class='btn btn-info ng-star-inserted'][normalize-space()='Add']")
	private WebElement addScormButton;

	// 87. File Input for .zip files
	@FindBy(xpath = "//input[@type='file' and @id='fileInput' and @accept='.zip']")
	private WebElement fileInputElement;

	// 88. Button for Quiz Tab
	@FindBy(xpath = "//button[@id='v-pills-quiz-0-tab']")
	private WebElement quizTabButton;

	// 89. Add Button for Quiz Section
	@FindBy(xpath = "//div[@id='v-pills-quiz-0']//a[@class='btn btn-info ng-star-inserted'][normalize-space()='Add']")
	private WebElement addQuizButton;

	// 90. Add Button for Exam Section
	@FindBy(xpath = "//div[@id='v-pills-Exam-0']//a[@class='btn btn-info ng-star-inserted'][normalize-space()='Add']")
	private WebElement addExamButton;

	// 91. File Input for .pdf and .docx files (Quiz)
	@FindBy(xpath = "//input[@type='file' and @id='fileInput' and @accept='.pdf,.docx']")
	private WebElement fileInputElementQuiz;

	// 92. Input for Duration of Test in Minutes
	@FindBy(xpath = "//input[@placeholder='duration of the test in minutes']")
	private WebElement durationInputField;

	// 93. Save Button in Test
	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement saveButtonInTest;

	// 94. Button '1 -'
	@FindBy(xpath = "//button[normalize-space()='1 -']")
	private WebElement button1Minus;

	// 95. Input for 'Question Score'
	@FindBy(xpath = "//input[@placeholder='Question score']")
	private WebElement questionScoreInputField;

	// 96. Rich Text Editor
	@FindBy(xpath = "//div[@aria-label='Rich Text Editor, main']")
	private WebElement richTextEditor;

	// 97. PartnerName Input inside 'success-choice' div
	@FindBy(xpath = "//div[@class='col-md-6 success-choice ng-star-inserted']//input[@id='PartnerName']")
	private WebElement partnerNameInputInSuccessChoice;

	// 98. PartnerName Input inside another div
	@FindBy(xpath = "//div[@class='col-md-6 ng-star-inserted']//input[@id='PartnerName']")
	private WebElement partnerNameInputInOtherDiv;

	// 99. Invalid Image File Message
	@FindBy(xpath = "//span[normalize-space()='Invalid Image File']")
	private WebElement invalidImageFileMessage;

	// 100. File Size Exceeded Message
	@FindBy(xpath = "//div[@aria-label='File Exceeded the Allowed MAX SIZE']")
	private WebElement fileSizeExceededMessage;

	// 101. Message displayed when the file extension is not allowed
	@FindBy(xpath = "//div[@aria-label='File Extension is not Allowed']")
	private WebElement fileExtensionMessage;

	// 102. Button to delete an item
	@FindBy(xpath = "//button[normalize-space(text())='Delete']")
	private WebElement deleteButton;

	// 103. Confirmation message asking if the user is sure they want to delete
	@FindBy(xpath = "//h4[text()='Are you sure, you want to delete?']")
	private WebElement deleteConfirmationMessage;

	// 104. Cell displaying the course name
	@FindBy(xpath = "//td[text()='TestCourseEnglishSuyog784']")
	private WebElement courseNameCell;

	// 105. Breadcrumb indicating the "Update Course" page
	@FindBy(xpath = "//li[text()='Update Course']")
	private WebElement updateCourseBreadcrumb;

	// 106. Message displayed when there are no matching results in the search
	@FindBy(xpath = "//td[normalize-space()='There are No Matching Results']")
	private WebElement noMatchingResultsMessage;

	// 107. Button to navigate to the next page
	@FindBy(xpath = "//span[normalize-space()='»']")
	private WebElement nextButton;

	// 108. Button to navigate to the previous page
	@FindBy(xpath = "//span[normalize-space()='«']")
	private WebElement previousButton;

	// 109. Button to apply the filter
	@FindBy(xpath = "//span[normalize-space()='Filter']")
	private WebElement filterButton;

	// 110. Label for the "View" column
	@FindBy(xpath = "//label[normalize-space()='View']")
	private WebElement viewLabel;

	// 111. Label for the "Status" column
	@FindBy(xpath = "//label[normalize-space()='Status']")
	private WebElement statusLabel;

	// 112. Label for the "Material" column
	@FindBy(xpath = "//label[normalize-space()='material']")
	private WebElement materialLabel;

	// 113. Label for the "Publishing Type" column
	@FindBy(xpath = "//label[normalize-space()='Publishing Type']")
	private WebElement publishingTypeLabel;

	// 101. Click on the course image
	/**
	 * This method clicks on the course image on the page, allowing the user to view
	 * more details or interact with the course. It uses a utility method to perform
	 * the click action, and applies an explicit wait for the specified amount of
	 * time to ensure the element is clickable before interacting.
	 */
	public void clickOnCourseImage() {
		elementUtiles.clickOnElement(courseImage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 102. Click on the "Training Material" link
	/**
	 * This method clicks on the "Training Material" link on the page, navigating
	 * the user to the section where training materials are displayed. It uses a
	 * utility method to perform the click action, and applies an explicit wait for
	 * the specified amount of time to ensure the link is clickable before
	 * interacting.
	 */
	public void clickOnTrainingMaterialLink() {
		elementUtiles.clickOnElement(trainingMaterialLink, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 103. Click on the "Add" button
	/**
	 * This method clicks on the "Add" button on the page, initiating the process to
	 * add a new course or item to the system. It uses a utility method to perform
	 * the click action, and applies an explicit wait for the specified amount of
	 * time to ensure the button is clickable before interacting.
	 */
	public void clickOnAddButton() {
		elementUtiles.clickOnElement(addButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 104. Enter text in the Code input field
	/**
	 * This method enters the provided course code into the Code input field,
	 * allowing the user to associate a specific code with the course. It uses a
	 * utility method to type the code into the field, and applies an explicit wait
	 * for the specified amount of time to ensure the field is ready for input.
	 */
	public void enterCode(String code) {
		elementUtiles.typeTextIntoElement(codeInputField, code, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 105. Enter text in the Arabic Course Name input field
	/**
	 * This method enters the provided Arabic course name into the Arabic Course
	 * Name input field. It uses a utility method to type the course name into the
	 * field, and applies an explicit wait for the specified amount of time to
	 * ensure the field is ready for input.
	 */
	public void enterArabicCourseName(String courseName) {
		elementUtiles.typeTextIntoElement(arabicCourseNameInputField, courseName,
				CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 106. Enter text in the English Course Name input field
	/**
	 * This method enters the provided English course name into the English Course
	 * Name input field. It uses a utility method to type the course name into the
	 * field, and applies an explicit wait for the specified amount of time to
	 * ensure the field is ready for input.
	 */
	public void enterEnglishCourseName(String courseName) {
		elementUtiles.typeTextIntoElement(englishCourseNameInputField, courseName,
				CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 107. Method to click on the 'Select' span
	/**
	 * This method clicks on the 'Select' span element on the page. It uses a
	 * utility method to click the element and applies an explicit wait for the
	 * specified amount of time to ensure the element is clickable.
	 */
	public void clickSelectSpan() {
		elementUtiles.clickOnElement(selectSpan, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 108. Method to click on the 'Choose' option
	/**
	 * This method clicks on the 'Choose' option on the page. It uses a utility
	 * method to click the option and applies an explicit wait for the specified
	 * amount of time to ensure the element is clickable.
	 */
	public void clickChooseOption() {
		elementUtiles.clickOnElement(chooseOption, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 109. Method to click on the 'uuuu' option
	/**
	 * This method clicks on the 'uuuu' option on the page. It uses a utility method
	 * to click the option and applies an explicit wait for the specified amount of
	 * time to ensure the element is clickable.
	 */
	public void clickUuuuOption() {
		elementUtiles.clickOnElement(uuuuOption, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 110. Method to click on the 'TestTMS83' label
	/**
	 * This method clicks on the 'TestTMS83' label on the page. It uses a utility
	 * method to click the label and applies an explicit wait for the specified
	 * amount of time to ensure the element is clickable.
	 */
	public void clickTestTms83Label() {
		elementUtiles.clickOnElement(testTms83Label, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 111. Method to enter text into "Price Per Person" input field
	/**
	 * This method enters the provided price per person into the "Price Per Person"
	 * input field. It uses a utility method to type the text into the field and
	 * applies an explicit wait for the specified amount of time to ensure the
	 * element is ready for interaction.
	 */
	public void enterPricePerPerson(String price) {
		elementUtiles.typeTextIntoElement(pricePerPersonInput, price, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 112. Method to enter text into "Duration Of The Course" input field
	/**
	 * This method enters the provided course duration into the "Duration Of The
	 * Course" input field. It uses a utility method to type the text into the field
	 * and applies an explicit wait for the specified amount of time to ensure the
	 * element is ready for interaction.
	 */
	public void enterDurationOfCourse(String duration) {
		elementUtiles.typeTextIntoElement(durationOfCourseInput, duration, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 113. Method to enter text into "Course Brief" textarea
	/**
	 * This method enters the provided course brief into the "Course Brief"
	 * textarea. It uses a utility method to type the text into the field and
	 * applies an explicit wait for the specified amount of time to ensure the
	 * element is ready for interaction.
	 */
	public void enterCourseBrief(String brief) {
		elementUtiles.typeTextIntoElement(courseBriefTextarea, brief, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 114. Method to enter text into "Course requirements" textarea
	/**
	 * This method enters the provided course requirements into the "Course
	 * requirements" textarea. It uses a utility method to scroll to the element
	 * first (if necessary) and then types the text into the field, applying an
	 * explicit wait for the specified amount of time to ensure the element is ready
	 * for interaction.
	 */
	public void enterCourseRequirements(String requirements) {
		elementUtiles.javaScriptScrollToElement(courseRequirementsTextarea, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.typeTextIntoElement(courseRequirementsTextarea, requirements,
				CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 115. Method to enter text into the "Price Per Person Remotely" input field
	/**
	 * This method enters the provided price per person remotely into the "Price Per
	 * Person Remotely" input field. It uses a utility method to type the text into
	 * the field and applies an explicit wait for the specified amount of time to
	 * ensure the element is ready for interaction.
	 */
	public void enterPricePerPersonRemotely(String price) {
		elementUtiles.typeTextIntoElement(PricePerPersonRemotely, price, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 116. Method to click on the "Close" option for the target category
	/**
	 * This method clicks on the "Close" option for the target category, typically
	 * used to dismiss or close a section. It uses a utility method to perform the
	 * click action with an explicit wait to ensure the element is ready for
	 * interaction.
	 */
	public void clickCloseOptionTargetCategory() {
		elementUtiles.clickOnElement(closeOptionTargetCategory, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 117. Method to enter text into the search input field
	/**
	 * This method enters the provided search text into the search input field. It
	 * uses a utility method to type the text into the field and applies an explicit
	 * wait for the specified amount of time to ensure the element is ready for
	 * interaction.
	 */
	public void enterSearchText(String searchText) {
		elementUtiles.typeTextIntoElement(searchInput, searchText, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 118. Method to click on the "Edit" icon
	/**
	 * This method clicks on the "Edit" icon, typically used to initiate the process
	 * of editing a particular item or field. It uses a utility method to perform
	 * the click action with an explicit wait to ensure the element is ready for
	 * interaction.
	 */
	public void clickEditIcon() {
		System.out.println("edit button is working :" + editIcon.isEnabled());
		elementUtiles.clickOnElement(editIcon, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

	}

	// 119. Method to click on the "Remove" icon
	/**
	 * This method clicks on the "Remove" icon, typically used to initiate the
	 * process of removing an item or field. It uses a utility method to perform the
	 * click action with an explicit wait to ensure the element is ready for
	 * interaction.
	 */
	public void clickRemoveIcon() {
		elementUtiles.clickOnElement(removeIcon, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 120. Method to click on the "Choose" button
	/**
	 * This method clicks on the "Choose" button, typically used for selecting or
	 * choosing an option. It uses a utility method to perform the click action with
	 * an explicit wait to ensure the element is ready for interaction.
	 */
	public void clickChooseButton() {
		elementUtiles.clickOnElement(chooseButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 121. Method to click on the "Save" button
	/**
	 * This method clicks on the "Save" button, typically used to save changes or
	 * submit a form. It uses a utility method to perform the click action and a
	 * JavaScript scroll to ensure the button is in view, followed by an explicit
	 * wait for the element to be ready for interaction.
	 */
	public void clickSaveButton() {
		elementUtiles.clickOnElement(saveButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.javaScriptScrollToElement(saveButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 123. Method to enter course objectives into the course objectives input field
	/**
	 * This method enters the provided course objectives into the course objectives
	 * input field. It first ensures that the field is in view by scrolling to it
	 * using JavaScript, and then types the provided objectives into the field. An
	 * explicit wait is applied to ensure the element is ready for interaction.
	 */
	public void enterCourseObjectives(String objectives) {
		elementUtiles.javaScriptScrollToElement(courseObjectivesInput, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.typeTextIntoElement(courseObjectivesInput, objectives, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 124. Method to click on the dropdown caret icon
	/**
	 * This method clicks on the dropdown caret icon to expand or collapse the
	 * dropdown menu. It ensures the dropdown caret icon is in view by scrolling to
	 * it using JavaScript, and then clicks on the element. An explicit wait is
	 * applied to ensure the element is ready for interaction.
	 */
	public void clickDropdownCaretIcon() {
		elementUtiles.javaScriptScrollToElement(dropdownCaretIcon, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.clickOnElement(dropdownCaretIcon, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 125. Method to click on the trainer text div
	/**
	 * This method clicks on the trainer text div to interact with or view
	 * additional information about the trainer. An explicit wait is applied to
	 * ensure the element is ready for interaction.
	 */
	public void TrainerTextDiv() {
		elementUtiles.clickOnElement(trainerTextDiv, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 126. Method to check if the "English Language" checkbox is selected
	/**
	 * This method clicks on the "English Language" checkbox to select it. It
	 * assumes the checkbox may not be selected initially. An explicit wait is
	 * applied to ensure the element is ready for interaction.
	 */
	public void isEnglishLanguageCheckboxSelected() {
		elementUtiles.clickOnElement(englishLanguageCheckbox, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 127. Method to enter the partner name into the partner name input field
	/**
	 * This method enters the provided partner name into the partner name input
	 * field. An explicit wait is applied to ensure the element is ready for
	 * interaction.
	 */
	public void enterPartnerName(String partnerName) {
		elementUtiles.typeTextIntoElement(partnerNameInput, partnerName, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 128. Method to get the error message for course image
	/**
	 * This method retrieves the error message displayed for the course image. It
	 * uses a utility method to extract the text from the element and applies an
	 * explicit wait to ensure the message is fully loaded.
	 * 
	 * @return The error message for the course image as a String.
	 */
	public String getCourseImageErrorMessage() {
		return elementUtiles.getTextFromElement(courseImageError, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 129. Method to get the error message for the course name
	/**
	 * This method retrieves the error message displayed for the course name field.
	 * It uses a utility method to extract the text from the element and applies an
	 * explicit wait to ensure the message is fully loaded.
	 * 
	 * @return The error message for the course name as a String.
	 */
	public String getCourseNameErrorMessage() {
		return elementUtiles.getTextFromElement(courseNameError, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 130. Method to get the error message for the generic field
	/**
	 * This method retrieves the error message displayed for a generic field (not
	 * specified). It uses a utility method to extract the text from the element and
	 * applies an explicit wait to ensure the message is fully loaded.
	 * 
	 * @return The error message for the generic field as a String.
	 */
	public String getGenericFieldErrorMessage() {
		return elementUtiles.getTextFromElement(genericFieldError, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 131. Method to get the error message for the course about field
	/**
	 * This method retrieves the error message displayed for the course about field.
	 * It uses a utility method to extract the text from the element and applies an
	 * explicit wait to ensure the message is fully loaded.
	 * 
	 * @return The error message for the course about field as a String.
	 */
	public String getCourseAboutErrorMessage() {
		return elementUtiles.getTextFromElement(courseAboutError, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 132. Method to get the error message for the introductory video
	/**
	 * This method retrieves the error message displayed for the introductory video
	 * field. It uses a utility method to extract the text from the element and
	 * applies an explicit wait to ensure the message is fully loaded.
	 * 
	 * @return The error message for the introductory video as a String.
	 */
	public String getIntroVideoErrorMessage() {
		return elementUtiles.getTextFromElement(introVideoError, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 133. Method to get the error message for the course objective field
	/**
	 * This method retrieves the error message displayed for the course objective
	 * field. It uses a utility method to extract the text from the element and
	 * applies an explicit wait to ensure the message is fully loaded.
	 * 
	 * @return The error message for the course objective as a String.
	 */
	public String getCourseObjectiveErrorMessage() {
		return elementUtiles.getTextFromElement(courseObjectiveError, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 134. Method to get the text of the course ID
	/**
	 * This method retrieves the course ID text from the specified element. It uses
	 * a utility method to extract the text from the element and applies an explicit
	 * wait to ensure the element is fully loaded.
	 * 
	 * @return The course ID text as a String.
	 */
	public String getCourseIdText() {
		return elementUtiles.getTextFromElement(courseIdCell, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 135. Method to click on the "Update" button
	/**
	 * This method clicks on the "Update" button to initiate the update process. It
	 * applies an explicit wait to ensure the element is fully loaded before
	 * interacting with it.
	 */
	public void clickUpdateButton() {
		elementUtiles.clickOnElement(updateSpan, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 136. Method to click on the "Self Learning Update" link
	/**
	 * This method clicks on the "Self Learning Update" link to navigate to the
	 * update section for self-learning courses. It uses a utility method to click
	 * on the element and applies an explicit wait to ensure the link is ready to be
	 * clicked.
	 */
	public void clickSelfLearningUpdateLink() {
		elementUtiles.clickOnElement(selfLearningLinkForUpdateCourse, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 137. Method to click on the "Self Learning Add" link
	/**
	 * This method clicks on the "Self Learning Add" link to navigate to the section
	 * where users can add a new self-learning course. It uses a utility method to
	 * click on the element and applies an explicit wait to ensure the link is ready
	 * to be clicked.
	 */
	public void clickSelfLearningADDLink() {
		elementUtiles.clickOnElement(selfLearningLinkForADDCourse, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 138. Method to set the pass mark for the course
	/**
	 * This method sets the pass mark for the course by typing the provided pass
	 * mark into the pass mark input field. It uses a utility method to type the
	 * text and applies an explicit wait to ensure the input field is ready.
	 * 
	 * @param passMark The pass mark value to be entered.
	 */
	public void setPassMark(String passMark) {
		elementUtiles.typeTextIntoElement(passMarkInput, passMark, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 139. Method to set the course duration
	/**
	 * This method sets the duration of the course by typing the provided duration
	 * into the duration input field. It uses a utility method to type the text and
	 * applies an explicit wait to ensure the input field is ready.
	 * 
	 * @param duration The duration value to be entered.
	 */
	public void setDuration(String duration) {
		elementUtiles.typeTextIntoElement(durationInput, duration, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 140. Method to set the duration in hours
	/**
	 * This method sets the course duration in hours by typing the provided value
	 * into the duration hours input field. It uses a utility method to type the
	 * text and applies an explicit wait to ensure the input field is ready.
	 * 
	 * @param hours The number of hours to be entered.
	 */
	public void setDurationHours(String hours) {
		elementUtiles.typeTextIntoElement(durationHoursInput, hours, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 141. Method to set the duration in minutes
	/**
	 * This method sets the course duration in minutes by typing the provided value
	 * into the duration minutes input field. It uses a utility method to type the
	 * text and applies an explicit wait to ensure the input field is ready.
	 * 
	 * @param minutes The number of minutes to be entered.
	 */
	public void setDurationMinutes(String minutes) {
		elementUtiles.typeTextIntoElement(durationMinutesInput, minutes, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 142. Method to set the FAQ question
	/**
	 * This method sets the FAQ question by typing the provided question into the
	 * FAQ question input field. It uses a utility method to type the text and
	 * applies an explicit wait to ensure the input field is ready.
	 * 
	 * @param question The FAQ question to be entered.
	 */
	public void setFaqQuestion(String question) {
		elementUtiles.javaScriptScrollToElement(faqQuestionInput, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.typeTextIntoElement(faqQuestionInput, question, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 143. Method to set the FAQ answer
	/**
	 * This method sets the FAQ answer by typing the provided answer into the FAQ
	 * answer text area. It uses a utility method to type the text and applies an
	 * explicit wait to ensure the input field is ready.
	 * 
	 * @param answer The FAQ answer to be entered.
	 */
	public void setFaqAnswer(String answer) {
		elementUtiles.javaScriptScrollToElement(faqAnswerTextArea, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		elementUtiles.typeTextIntoElement(faqAnswerTextArea, answer, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 144. Method to click the "Add New Unit" button
	/**
	 * This method clicks the "Add New Unit" button to initiate the process of
	 * adding a new unit. It uses a utility method to click the button and applies
	 * an explicit wait to ensure the button is ready to be clicked.
	 */
	public void clickAddNewUnitButton() {
		elementUtiles.clickOnElement(addNewUnitButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 145. Method to enter the unit name
	/**
	 * This method enters the provided unit name into the unit name input field. It
	 * uses a utility method to type the text and applies an explicit wait to ensure
	 * the input field is ready.
	 * 
	 * @param unitName The name of the unit to be entered.
	 */
	public void enterUnitName(String unitName) {
		elementUtiles.typeTextIntoElement(unitNameInput, unitName, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 146. Method to enter the unit brief
	/**
	 * This method enters the provided unit brief into the unit brief text area. It
	 * uses a utility method to type the text and applies an explicit wait to ensure
	 * the text area is ready.
	 * 
	 * @param unitBrief The brief description of the unit to be entered.
	 */
	public void enterUnitBrief(String unitBrief) {
		elementUtiles.typeTextIntoElement(unitBriefTextarea, unitBrief, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 147. Method to click the "Save" button in the unit section
	/**
	 * This method clicks the "Save" button within the unit section to save the
	 * current unit details. It uses a utility method to click the button and
	 * applies an explicit wait to ensure the button is ready to be clicked.
	 */
	public void clickSaveButtonINUnit() {
		elementUtiles.clickOnElement(saveButtonInUnit, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 148. Method to click the "Add" button in the unit section
	/**
	 * This method clicks the "Add" button within the unit section to add a new
	 * unit. It uses a utility method to click the button and applies an explicit
	 * wait to ensure the button is ready to be clicked.
	 */
	public void clickAddButtonInUnit() {
		elementUtiles.clickOnElement(addButtonInUnit, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 149. Method to click the "Videos" tab button
	/**
	 * This method clicks the "Videos" tab button to navigate to the video section
	 * of the course. It uses a utility method to click the button and applies an
	 * explicit wait to ensure the button is ready to be clicked.
	 */
	public void clickVideosTabButton() {
		elementUtiles.clickOnElement(videosTabButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 150. Method to enter the video name
	/**
	 * This method enters the provided video name into the video name input field.
	 * It uses a utility method to type the text and applies an explicit wait to
	 * ensure the input field is ready.
	 * 
	 * @param videoName The name of the video to be entered.
	 */
	public void enterVideoName(String videoName) {
		elementUtiles.typeTextIntoElement(videoNameInput, videoName, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 151. Method to enter the video title
	/**
	 * This method enters the provided video title into the video title input field.
	 * It uses a utility method to type the text and applies an explicit wait to
	 * ensure the input field is ready.
	 * 
	 * @param videoTitle The title of the video to be entered.
	 */
	public void enterVideoTitle(String videoTitle) {
		elementUtiles.typeTextIntoElement(videoTitleInput, videoTitle, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 152. Method to upload a video in the unit section
	/**
	 * This method uploads a video to the unit section by sending the absolute file
	 * path to the video upload field. It creates a File object from the provided
	 * file path and retrieves the absolute path to ensure compatibility with the
	 * upload field.
	 * 
	 * @param filePath The path to the video file to be uploaded.
	 */
	public void uploadVideoInUnit(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		AddVideoInUnit.sendKeys(absolutePath);
	}

	// 153. Method to click the "Files" tab button
	/**
	 * This method clicks the "Files" tab button to navigate to the files section of
	 * the unit. It uses a utility method to click the button and applies an
	 * explicit wait to ensure the button is ready to be clicked.
	 */
	public void clickFilesTabButton() {
		elementUtiles.clickOnElement(filesTabButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 154. Method to click the "Add" button in the files section
	/**
	 * This method clicks the "Add" button in the files section to initiate the
	 * process of adding a new file. It uses a utility method to click the button
	 * and applies an explicit wait to ensure the button is ready to be clicked.
	 */
	public void clickAddButtonForfiles() {
		elementUtiles.clickOnElement(addButtonForfiles, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 155. Method to enter the field name in Arabic
	/**
	 * This method enters the provided field name in Arabic into the corresponding
	 * input field. It uses a utility method to type the text and applies an
	 * explicit wait to ensure the input field is ready.
	 * 
	 * @param fieldNameArabic The Arabic field name to be entered.
	 */
	public void enterFieldNameInArabic(String fieldNameArabic) {
		elementUtiles.typeTextIntoElement(fieldNameArabicInput, fieldNameArabic, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 156. Method to enter the field name in English
	/**
	 * This method enters the provided field name in English into the corresponding
	 * input field. It uses a utility method to type the text and applies an
	 * explicit wait to ensure the input field is ready.
	 * 
	 * @param fieldNameEnglish The English field name to be entered.
	 */
	public void enterFieldNameInEnglish(String fieldNameEnglish) {
		elementUtiles.typeTextIntoElement(fieldNameEnglishInput, fieldNameEnglish,
				CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 157. Method to upload a file in the unit section
	/**
	 * This method uploads a file to the unit section by sending the absolute file
	 * path to the file upload field. It creates a File object from the provided
	 * file path and retrieves the absolute path to ensure compatibility with the
	 * upload field.
	 * 
	 * @param filePath The path to the file to be uploaded.
	 */
	public void uploadFileInUnit(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		UploadFileInunit.sendKeys(absolutePath);
	}

	// 158. Method to click the "Goals" tab button
	/**
	 * This method clicks the "Goals" tab button to navigate to the goals section of
	 * the unit. It uses a utility method to click the button and applies an
	 * explicit wait to ensure the button is ready to be clicked.
	 */
	public void clickGoalsTabButton() {
		elementUtiles.clickOnElement(goalsTabButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 159. Method to enter the goal name in Arabic
	/**
	 * This method enters the provided goal name in Arabic into the corresponding
	 * input field. It uses a utility method to type the text and applies an
	 * explicit wait to ensure the input field is ready.
	 * 
	 * @param goalNameArabic The Arabic goal name to be entered.
	 */
	public void enterGoalNameInArabic(String goalNameArabic) {
		elementUtiles.typeTextIntoElement(goalNameArabicInput, goalNameArabic, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 160. Method to enter the goal name in English
	/**
	 * This method enters the provided goal name in English into the corresponding
	 * input field. It uses a utility method to type the text and applies an
	 * explicit wait to ensure the input field is ready.
	 * 
	 * @param goalNameEnglish The English goal name to be entered.
	 */
	public void enterGoalNameInEnglish(String goalNameEnglish) {
		elementUtiles.typeTextIntoElement(goalNameEnglishInput, goalNameEnglish, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 161. Method to click the "Elements" tab button
	/**
	 * This method clicks the "Elements" tab button to navigate to the elements
	 * section of the unit. It uses a utility method to click the button and applies
	 * an explicit wait to ensure the button is ready to be clicked.
	 */
	public void clickElementsTabButton() {
		elementUtiles.clickOnElement(elementsTabButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 162. Method to enter element name in Arabic
	/**
	 * This method enters the provided element name in Arabic into the corresponding
	 * input field. It uses a utility method to type the text and applies an
	 * explicit wait to ensure the input field is ready.
	 * 
	 * @param elementNameArabic The Arabic element name to be entered.
	 */
	public void enterElementNameInArabic(String elementNameArabic) {
		elementUtiles.typeTextIntoElement(elementNameArabicInput, elementNameArabic,
				CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 163. Method to click the "Links" tab button
	/**
	 * This method clicks the "Links" tab button to navigate to the links section of
	 * the unit. It uses a utility method to click the button and applies an
	 * explicit wait to ensure the button is ready to be clicked.
	 */
	public void clickLinksTabButton() {
		elementUtiles.clickOnElement(linksTabButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 164. Method to enter link name in Arabic
	/**
	 * This method enters the provided link name in Arabic into the corresponding
	 * input field. It uses a utility method to type the text and applies an
	 * explicit wait to ensure the input field is ready.
	 * 
	 * @param linkNameArabic The Arabic link name to be entered.
	 */
	public void enterLinkNameInArabic(String linkNameArabic) {
		elementUtiles.typeTextIntoElement(linkNameArabicInput, linkNameArabic, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 165. Method to enter link name in English
	/**
	 * This method enters the provided link name in English into the corresponding
	 * input field. It uses a utility method to type the text and applies an
	 * explicit wait to ensure the input field is ready.
	 * 
	 * @param linkNameEnglish The English link name to be entered.
	 */
	public void enterLinkNameInEnglish(String linkNameEnglish) {
		elementUtiles.typeTextIntoElement(linkNameEnglishInput, linkNameEnglish, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 166. Method to enter link URL
	/**
	 * This method enters the provided URL into the link URL input field. It uses a
	 * utility method to type the text and applies an explicit wait to ensure the
	 * input field is ready.
	 * 
	 * @param url The URL to be entered.
	 */
	public void enterLinkURL(String url) {
		elementUtiles.typeTextIntoElement(linkInput, url, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 167. Method to click the "Scorm" tab button
	/**
	 * This method clicks the "Scorm" tab button to navigate to the Scorm section of
	 * the unit. It uses a utility method to click the button and applies an
	 * explicit wait to ensure the button is ready to be clicked.
	 */
	public void clickScormTabButton() {
		elementUtiles.clickOnElement(scormTabButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 168. Method to enter Scorm name
	/**
	 * This method enters the provided Scorm name into the corresponding input
	 * field. It uses a utility method to type the text and applies an explicit wait
	 * to ensure the input field is ready.
	 * 
	 * @param scormNcame The Scorm name to be entered.
	 */
	public void enterScormName(String scormNcame) {
		elementUtiles.typeTextIntoElement(scormNameInput, scormNcame, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 169. Method to enter lecture number
	/**
	 * This method enters the provided lecture number into the corresponding input
	 * field. It uses a utility method to type the text and applies an explicit wait
	 * to ensure the input field is ready.
	 * 
	 * @param lectureNumber The lecture number to be entered.
	 */
	public void enterLectureNumber(String lectureNumber) {
		elementUtiles.typeTextIntoElement(lectureNumberInput, lectureNumber, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 170. Method to enter Scorm duration
	/**
	 * This method enters the provided Scorm duration into the corresponding input
	 * field. It uses a utility method to type the text and applies an explicit wait
	 * to ensure the input field is ready.
	 * 
	 * @param scormDuration The Scorm duration to be entered.
	 */
	public void enterScormDuration(String scormDuration) {
		elementUtiles.typeTextIntoElement(scormDurationInput, scormDuration, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 171. Method to enter field name in Arabic for Quiz
	/**
	 * This method enters the provided field name in Arabic into the corresponding
	 * input field for the quiz. It uses a utility method to type the text and
	 * applies an explicit wait to ensure the input field is ready.
	 * 
	 * @param fieldNameArabic The Arabic field name to be entered.
	 */
	public void enterFieldNameInArabicQuiz(String fieldNameArabic) {
		elementUtiles.typeTextIntoElement(fieldNameArabicInputQuiz, fieldNameArabic,
				CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 172. Method to enter field name in English for Quiz
	/**
	 * This method enters the provided field name in English into the corresponding
	 * input field for the quiz. It uses a utility method to type the text and
	 * applies an explicit wait to ensure the input field is ready.
	 * 
	 * @param fieldNameEnglish The English field name to be entered.
	 */
	public void enterFieldNameInEnglishQuiz(String fieldNameEnglish) {
		elementUtiles.typeTextIntoElement(fieldNameEnglishInputQuiz, fieldNameEnglish,
				CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 173. Method to enter lecture number for the second input field
	/**
	 * This method enters the provided lecture number into the second lecture number
	 * input field. It uses a utility method to type the text and applies an
	 * explicit wait to ensure the input field is ready.
	 * 
	 * @param lectureNumber The lecture number to be entered.
	 */
	public void enterLectureNumber2(String lectureNumber) {
		elementUtiles.typeTextIntoElement(lectureNumberInput2, lectureNumber, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 174. Method to enter description
	/**
	 * This method enters the provided description into the description text area.
	 * It uses a utility method to type the text and applies an explicit wait to
	 * ensure the text area is ready.
	 * 
	 * @param description The description to be entered.
	 */
	public void enterDescription(String description) {
		elementUtiles.typeTextIntoElement(descriptionTextarea, description, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 175. Method to click on the "Exam" tab
	/**
	 * This method clicks the "Exam" tab button to navigate to the exam section of
	 * the unit. It uses a utility method to click the button and applies an
	 * explicit wait to ensure the button is ready to be clicked.
	 */
	public void clickExamTab() {
		elementUtiles.clickOnElement(examTabButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 176. Method to enter the test name
	/**
	 * This method enters the provided test name into the test name input field. It
	 * uses a utility method to type the text and applies an explicit wait to ensure
	 * the input field is ready.
	 * 
	 * @param testName The name of the test to be entered.
	 */
	public void enterTestName(String testName) {
		elementUtiles.typeTextIntoElement(testNameInput, testName, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 177. Method to enter the passing score
	/**
	 * This method enters the provided passing score into the passing score input
	 * field. It uses a utility method to type the text and applies an explicit wait
	 * to ensure the input field is ready.
	 * 
	 * @param passingScore The passing score to be entered.
	 */
	public void enterPassingScore(String passingScore) {
		elementUtiles.typeTextIntoElement(passingScoreInput, passingScore, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 178. Method to click on the "Add Goal" button
	/**
	 * This method clicks the "Add Goal" button to initiate the process of adding a
	 * new goal. It uses a utility method to click the button and applies an
	 * explicit wait to ensure the button is ready.
	 */
	public void clickAddGoal() {
		elementUtiles.clickOnElement(addGoalButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 179. Method to click on the "Add Element" button
	/**
	 * This method clicks the "Add Element" button to initiate the process of adding
	 * a new element. It uses a utility method to click the button and applies an
	 * explicit wait to ensure the button is ready.
	 */
	public void clickAddElement() {
		elementUtiles.clickOnElement(addElementButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 180. Method to click on the "Add Link" button
	/**
	 * This method clicks the "Add Link" button to initiate the process of adding a
	 * new link. It uses a utility method to click the button and applies an
	 * explicit wait to ensure the button is ready.
	 */
	public void clickAddLink() {
		elementUtiles.clickOnElement(addLinkButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 181. Method to click on the "Add Scorm" button
	/**
	 * This method clicks the "Add Scorm" button to initiate the process of adding a
	 * new Scorm package. It uses a utility method to click the button and applies
	 * an explicit wait to ensure the button is ready.
	 */
	public void clickAddScorm() {
		elementUtiles.clickOnElement(addScormButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 182. Method to upload a file in the Scorm section
	/**
	 * This method uploads the specified file to the Scorm section. It converts the
	 * given file path into an absolute path and sends it to the file input element.
	 * 
	 * @param filePath The path of the file to be uploaded.
	 */
	public void uploadFileInScrom(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		fileInputElement.sendKeys(absolutePath);
	}

	// 183. Method to click on the "Quiz" tab
	/**
	 * This method clicks the "Quiz" tab button to navigate to the quiz section of
	 * the page. It uses a utility method to click the button and applies an
	 * explicit wait to ensure the button is ready.
	 */
	public void clickQuizTab() {
		elementUtiles.clickOnElement(quizTabButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 184. Method to click on the "Add Quiz" button
	/**
	 * This method clicks the "Add Quiz" button to initiate the process of adding a
	 * new quiz. It uses a utility method to click the button and applies an
	 * explicit wait to ensure the button is ready.
	 */
	public void clickAddQuiz() {
		elementUtiles.clickOnElement(addQuizButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 185. Method to click on the "Add Exam" button
	/**
	 * This method clicks the "Add Exam" button to initiate the process of adding a
	 * new exam. It uses a utility method to click the button and applies an
	 * explicit wait to ensure the button is ready.
	 */
	public void clickAddExam() {
		elementUtiles.clickOnElement(addExamButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 186. Method to upload a file in the Quiz section
	/**
	 * This method uploads the specified file to the Quiz section. It converts the
	 * given file path into an absolute path and sends it to the file input element
	 * for the quiz.
	 * 
	 * @param filePath The path of the file to be uploaded.
	 */
	public void uploadFileQuiz(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		fileInputElementQuiz.sendKeys(absolutePath);
	}

	// 187. Method to enter the test duration
	/**
	 * This method enters the provided test duration into the test duration input
	 * field. It uses a utility method to type the text and applies an explicit wait
	 * to ensure the input field is ready.
	 * 
	 * @param duration The test duration to be entered.
	 */
	public void enterTestDuration(String duration) {
		elementUtiles.typeTextIntoElement(durationInputField, duration, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 188. Method to click on the "Save" button in the test section
	/**
	 * This method clicks the "Save" button in the test section to save the test
	 * details. It uses a utility method to click the button and applies an explicit
	 * wait to ensure the button is ready.
	 */
	public void clickSaveButtonTest() {
		elementUtiles.clickOnElement(saveButtonInTest, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 189. Method to click on the "1 Minus" button
	/**
	 * This method clicks the "1 Minus" button to perform an action related to the
	 * test. It uses a utility method to click the button and applies an explicit
	 * wait to ensure the button is ready.
	 */
	public void clickButton1Minus() {
		elementUtiles.clickOnElement(button1Minus, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 190. Method to enter the question score
	/**
	 * This method enters the provided question score into the question score input
	 * field. It uses a utility method to type the text and applies an explicit wait
	 * to ensure the input field is ready.
	 * 
	 * @param score The score to be entered for the question.
	 */
	public void enterQuestionScore(String score) {
		elementUtiles.typeTextIntoElement(questionScoreInputField, score, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 191. Method to enter partner name in the Success Choice section
	/**
	 * This method enters the provided partner name into the partner name input
	 * field in the Success Choice section. It uses a utility method to type the
	 * text and applies an explicit wait to ensure the input field is ready.
	 * 
	 * @param partnerName The partner name to be entered.
	 */
	public void enterPartnerNameInSuccessChoice(String partnerName) {
		elementUtiles.typeTextIntoElement(partnerNameInputInSuccessChoice, partnerName,
				CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 192. Method to enter partner name in another div
	/**
	 * This method enters the provided partner name into a different partner name
	 * input field located in another div. It uses a utility method to type the text
	 * and applies an explicit wait to ensure the input field is ready.
	 * 
	 * @param partnerName The partner name to be entered.
	 */
	public void enterPartnerNameInOtherDiv(String partnerName) {
		elementUtiles.typeTextIntoElement(partnerNameInputInOtherDiv, partnerName,
				CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 193. Method to enter text in a rich text editor
	/**
	 * This method enters the provided text into a rich text editor field. It uses a
	 * utility method to type the text and applies an explicit wait to ensure the
	 * editor is ready.
	 * 
	 * @param text The text to be entered into the rich text editor.
	 */
	public void enterTextInRichTextEditor(String text) {
		elementUtiles.typeTextIntoElement(richTextEditor, text, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 194. Method to click the "Add" button in an alert section
	/**
	 * This method clicks on the "Add" button located in an alert section. It uses a
	 * utility method to click the button and applies an explicit wait to ensure it
	 * is ready.
	 */
	public void clickOnAlertAddButton() {
		elementUtiles.clickOnElement(ALERTaddButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 195. Method to enter the unit title
	/**
	 * This method enters the provided unit title into the unit title input field.
	 * It uses a utility method to type the text and applies an explicit wait to
	 * ensure the input field is ready.
	 * 
	 * @param title The title to be entered for the unit.
	 */
	public void enterUnitTitle(String title) {
		elementUtiles.typeTextIntoElement(unitTitle, title, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 196. Method to click the collapse button
	/**
	 * This method clicks the collapse button to collapse a section. It uses a
	 * utility method to click the button and applies an explicit wait to ensure it
	 * is ready.
	 */
	public void clickCollapseButton() {
		elementUtiles.clickOnElement(collapseButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 197. Method to upload a file
	/**
	 * This method uploads the specified file to an input field. It converts the
	 * given file path into an absolute path and sends it to the file input element.
	 * 
	 * @param filePath The path of the file to be uploaded.
	 */
	public void uploadFile(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		fileInput.sendKeys(absolutePath);
	}

	// 198. Method to upload a video
	/**
	 * This method uploads a video file to the specified video upload field. It
	 * converts the given video file path into an absolute path and sends it to the
	 * video input element.
	 * 
	 * @param filePath The path of the video file to be uploaded.
	 */
	public void UploadVideo(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		uploadVideo.sendKeys(absolutePath);
	}

	// 199. Method to check if the video upload button is displayed
	/**
	 * This method checks whether the video upload button is displayed on the page.
	 * It uses a utility method to verify the visibility of the video upload button
	 * and applies an explicit wait to ensure it is ready.
	 * 
	 * @return true if the video upload button is displayed, false otherwise.
	 */
	public boolean checkvideoButton() {
		return elementUtiles.displayStatusOfElement(uploadVideo, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the "Invalid Image File" message. It uses
	 * a utility method to extract the text from the element and ensures the message
	 * is fully loaded before retrieving the text.
	 *
	 * @return The text of the "Invalid Image File" message as a String.
	 */
	public String getInvalidImageFileMessageText() {
		return elementUtiles.getTextFromElement(invalidImageFileMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the "File Exceeded the Allowed MAX SIZE"
	 * message. It uses a utility method to extract the text from the element and
	 * applies an explicit wait for the specified amount of time to ensure the
	 * message is fully loaded before attempting to retrieve the text.
	 *
	 * @return The text of the "File Exceeded the Allowed MAX SIZE" message as a
	 *         String.
	 */
	public String getFileSizeExceededMessageText() {
		return elementUtiles.getTextFromElement(fileSizeExceededMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the "File Extension Not Allowed" message.
	 * It uses a utility method to extract the text from the element and applies an
	 * explicit wait for the specified amount of time to ensure the message is fully
	 * loaded before attempting to retrieve the text.
	 *
	 * @return The text of the "File Extension Not Allowed" message as a String.
	 */
	public String getFilefileExtensionMessageText() {
		return elementUtiles.getTextFromElement(fileExtensionMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the breadcrumb element. It uses the
	 * `getText()` method to extract the text.
	 *
	 * @return The text of the breadcrumb as a String.
	 */
	public String getBreadcrumbText() {
		return elementUtiles.getTextFromElement(updateCourseBreadcrumb, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the course name cell. It uses the
	 * `getText()` method to extract the text.
	 *
	 * @return The text of the course name as a String.
	 */
	public String getCourseNameText() {
//		return courseNameCell.getText();
		return elementUtiles.getTextFromElement(courseNameCell, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the delete confirmation message. It uses
	 * the `getText()` method to extract the text.
	 *
	 * @return The text of the delete confirmation message as a String.
	 */
	public String getDeleteConfirmationMessage() {
//		return deleteConfirmationMessage.getText();
		return elementUtiles.getTextFromElement(deleteConfirmationMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the "No Matching Results" message. It
	 * uses a utility method to extract the text from the element and applies an
	 * explicit wait to ensure the message is fully loaded.
	 *
	 * @return The text of the "No Matching Results" message as a String.
	 */
	public String getNoMatchingResultsMessageText() {
		return elementUtiles.getTextFromElement(noMatchingResultsMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method clicks on the "Next" button to navigate to the next page. It uses
	 * the `clickOnElement()` utility method with an explicit wait to ensure the
	 * element is clickable before performing the action.
	 */
	public void clickNextButton() {
		elementUtiles.clickOnElement(nextButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method clicks on the "Previous" button to navigate to the previous page.
	 * It uses the `clickOnElement()` utility method with an explicit wait to ensure
	 * the element is clickable before performing the action.
	 */
	public void clickPreviousButton() {
		elementUtiles.clickOnElement(previousButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method checks if the "Next" button is currently displayed on the page.
	 * It uses the `displayStatusOfElement()` utility method with an explicit wait
	 * to ensure the element is visible before checking its display status.
	 *
	 * @return `true` if the "Next" button is displayed, `false` otherwise.
	 */
	public boolean isNextButtonDisplayed() {
		return elementUtiles.displayStatusOfElement(nextButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method checks if the "Previous" button is currently displayed on the
	 * page. It uses the `displayStatusOfElement()` utility method with an explicit
	 * wait to ensure the element is visible before checking its display status.
	 *
	 * @return `true` if the "Previous" button is displayed, `false` otherwise.
	 */
	public boolean isPreviousButtonDisplayed() {
		return elementUtiles.displayStatusOfElement(previousButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the "Material" label. It uses a utility
	 * method to extract the text from the element and applies an explicit wait for
	 * the specified amount of time to ensure the label is fully loaded before
	 * attempting to retrieve the text.
	 *
	 * @return The text of the "Material" label as a String.
	 */
	public String getMaterialLabelText() {
		return elementUtiles.getTextFromElement(materialLabel, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the "Publishing Type" label. It uses a
	 * utility method to extract the text from the element and applies an explicit
	 * wait for the specified amount of time to ensure the label is fully loaded
	 * before attempting to retrieve the text.
	 *
	 * @return The text of the "Publishing Type" label as a String.
	 */
	public String getPublishingTypeLabelText() {
		return elementUtiles.getTextFromElement(publishingTypeLabel, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickFilter() {
		filterButton.click();
		System.out.println("Filter button is working: " + filterButton.isEnabled());
	}

	/**
	 * This method retrieves the text from the "View" label. It uses a utility
	 * method to extract the text from the element and applies an explicit wait for
	 * the specified amount of time to ensure the label is fully loaded before
	 * attempting to retrieve the text.
	 *
	 * @return The text of the "View" label as a String.
	 */
	public String getViewText() {
		return elementUtiles.getTextFromElement(viewLabel, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method retrieves the text from the "Status" label. It uses a utility
	 * method to extract the text from the element and applies an explicit wait for
	 * the specified amount of time to ensure the label is fully loaded before
	 * attempting to retrieve the text.
	 *
	 * @return The text of the "Status" label as a String.
	 */
	public String getStatusText() {
		return elementUtiles.getTextFromElement(statusLabel, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * This method clicks on the "Delete" button. It uses the `click()` method to
	 * trigger the click action.
	 */
	public void clickDeleteButton() {
//		deleteButton.click(); 
		elementUtiles.clickOnElement(deleteButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Locators
	@FindBy(xpath = "(//div[@class='ng-toggle-switch-core'])[3]")
	private WebElement toggleSwitch;

	@FindBy(xpath = "//span[normalize-space()='new requirement']")
	private WebElement newRequirementSpan;

	@FindBy(xpath = "//input[@id='Requirement']")
	private WebElement requirementInput;

	@FindBy(xpath = "//select[@id='Type']")
	private WebElement typeDropdown;

	@FindBy(xpath = "//option[@value='Number']")
	private WebElement numberOption;

	@FindBy(xpath = "//span[contains(@class, 'text-danger') and contains(text(), 'Invalid input')]")
	private WebElement invalidInputSpan;

	// Methods
	public void clickToggleSwitch() {
		toggleSwitch.click();
	}

	public void clickNewRequirement() {
		newRequirementSpan.click();
	}

	public void enterRequirement(String requirement) {
		requirementInput.sendKeys(requirement);
	}

	public void clickTypeDropdown() {
		typeDropdown.click();
	}

	public void clickNumberOption() {
		numberOption.click();
	}

	public String getInvalidInputText() {
		return invalidInputSpan.getText();
	}
}
