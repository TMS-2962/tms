package Pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.CommonUtlies;
import Utiles.ElementUtiles;

public class CertificatePage {
	// Constructor to initialize the driver and PageFactory
	WebDriver driver;
	private ElementUtiles elementUtiles;

	/**
	 * Constructor for initializing the CertificatePage.
	 * 
	 * This constructor sets up the page by initializing the WebDriver instance and
	 * PageFactory elements, which allows the page's WebElements to be located and
	 * interacted with. Additionally, it initializes the utility class
	 * 'ElementUtiles' for performing common actions on the page.
	 * 
	 * @param driver The WebDriver instance used for interacting with the browser.
	 */
	public CertificatePage(WebDriver driver) {
		this.driver = driver; // Assign the provided WebDriver to the class's driver instance
		PageFactory.initElements(driver, this); // Initialize elements using the PageFactory design pattern
		elementUtiles = new ElementUtiles(driver); // Initialize ElementUtiles for reusability of common actions
	}

	// 1. Locates the certificate image element with the specific 'src' attribute.
	@FindBy(xpath = "//img[@src='assets/img/cer.png']")
	private WebElement certificateImage;

	// 2. Locates the span element with the text "Add certificate".
	@FindBy(xpath = "//span[normalize-space()='Add certificate']")
	private WebElement addCertificateButton;

	// 3. Locates the input field for the certificate's name.
	@FindBy(xpath = "//input[@formcontrolname='Name']")
	private WebElement nameInputField;

	// 4. Locates the input field for the English version of the certificate's name.
	@FindBy(xpath = "//input[@formcontrolname='EnglishName']")
	private WebElement englishNameInputField;

	// 5. Locates the input field for the certificate's address.
	@FindBy(xpath = "//input[@formcontrolname='Address']")
	private WebElement addressInputField;

	// 6. Locates the input field for the English version of the certificate's
	// address.
	@FindBy(xpath = "//input[@formcontrolname='EnglishAddress']")
	private WebElement englishAddressInputField;

	// 7. Locates the select dropdown element for selecting the certificate type.
	@FindBy(xpath = "//select[@name='CertificateType']")
	private WebElement certificateTypeSelect;

	// 8. Locates the input field for the president's name in the certificate.
	@FindBy(xpath = "//input[@name='PresidentName']")
	private WebElement presidentNameInputField;

	// 9. Locates the file input element to upload a certificate image for the
	// coach.
	@FindBy(xpath = "//input[@type='file' and @id='fileInput' and @name='file[]' and @class='file-input' and @accept='.jpg,.png,.svg,.jpeg']")
	private WebElement fileInputFieldCoach;

	// 10. Locates the option for "Passing Certificate" in the certificate type
	// dropdown.
	@FindBy(xpath = "//option[@value='Registeration Certificate']")
	private WebElement passingCertificateOption;

	// 11. Locates another file input element, presumably for uploading a
	// president's certificate image.
	@FindBy(xpath = "(//input[@name='file[]'])[2]")
	private WebElement fileInputFieldPrisdent;

	// 12. Locates the div element with the drag-and-drop file upload message.
	@FindBy(xpath = "//div[@class='content-top-text' and normalize-space(text())='اسحب الملف الى هنا او انقر للاختيار']")
	private WebElement fileDragText;

	// 13. Locates the "No Matching Results" message in the table.
	@FindBy(xpath = "//td[normalize-space()='There are No Matching Results']")
	private WebElement noMatchingResultsMessage;

	// 14. Locates the "Next" button for pagination.
	@FindBy(xpath = "//span[normalize-space()='»']")
	private WebElement nextButton;

	// 15. Locates the "Previous" button for pagination.
	@FindBy(xpath = "//span[normalize-space()='«']")
	private WebElement previousButton;

	// 16. Locates the search input field.
	@FindBy(xpath = "//input[@placeholder=' Search ...']")
	private WebElement searchInput;

	// 17. Locates the "Filter" button element.
	@FindBy(xpath = "//span[normalize-space()='Filter']")
	private WebElement filterButton;

	// 18. Locates the "View" label element.
	@FindBy(xpath = "//label[normalize-space()='View']")
	private WebElement viewLabel;

	// 19. Locates the "Status" label element.
	@FindBy(xpath = "//label[normalize-space()='Status']")
	private WebElement statusLabel;

	// 20. Locates the "Save" button element.
	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement saveButton;
	// @FindBy annotations
	@FindBy(xpath = "//select[@id='selectlist']")
	private WebElement filterDropdown; // 1. Dropdown for selecting filter value
	@FindBy(xpath = "//div[@aria-label='Save Successfully']")
	private WebElement SaveSucessfully;
	// @FindBy annotations for filter options
	@FindBy(xpath = "//option[@value='5']")
	private WebElement filterOption5; // Option for selecting '5'

	@FindBy(xpath = "//option[@value='25']")
	private WebElement filterOption25; // Option for selecting '25'

	@FindBy(xpath = "//option[@value='50']")
	private WebElement filterOption50; // Option for selecting '50'

	@FindBy(xpath = "//option[@value='100']")
	private WebElement filterOption100; // Option for selecting '100'

	// @FindBy annotations for table rows
	@FindBy(xpath = "//td[normalize-space()='5']")
	private WebElement tableRowValue5; // Table row containing '5'

	@FindBy(xpath = "//td[normalize-space()='25']")
	private WebElement tableRowValue25; // Table row containing '25'

	@FindBy(xpath = "//td[normalize-space()='50']")
	private WebElement tableRowValue50; // Table row containing '50'

	@FindBy(xpath = "//td[normalize-space()='100']")
	private WebElement tableRowValue100; // Table row containing '100'
	@FindBy(xpath = "//option[@value='10']")
	private WebElement filterOption10; // 2. Option for selecting '10'

	@FindBy(xpath = "//td[normalize-space()='10']")
	private WebElement tableRowValue10; // 3. Table row containing '10'
	// 1. Method to enter text in the search input field

	/**
	 * This method types the provided text into the search input field. It utilizes
	 * a utility method to perform the action with an explicit wait.
	 *
	 * @param searchText The text to be entered into the search field.
	 */
	public void enterSearchText(String searchText) {
		elementUtiles.typeTextIntoElement(searchInput, searchText, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 2. Method to get text from the "No Matching Results" message
	/**
	 * This method retrieves the text from the "No Matching Results" message. It
	 * uses a utility method to extract the text from the element with an explicit
	 * wait.
	 *
	 * @return The text of the "No Matching Results" message as a String.
	 */
	public String getNoMatchingResultsMessageText() {
		return elementUtiles.getTextFromElement(noMatchingResultsMessage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 3. Method to click the "Next" button
	/**
	 * This method clicks on the "Next" button. It uses a utility method to perform
	 * the click action with an explicit wait.
	 */
	public void clickNextButton() {
		elementUtiles.clickOnElement(nextButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 4. Method to click the "Previous" button
	/**
	 * This method clicks on the "Previous" button. It uses a utility method to
	 * perform the click action with an explicit wait.
	 */
	public void clickPreviousButton() {
		elementUtiles.clickOnElement(previousButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 5. Method to check if the "Next" button is displayed
	/**
	 * This method checks if the "Next" button is displayed on the page. It uses a
	 * utility method to determine the display status of the element with an
	 * explicit wait.
	 *
	 * @return A boolean indicating whether the "Next" button is displayed.
	 */
	public boolean isNextButtonDisplayed() {
		return elementUtiles.displayStatusOfElement(nextButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 6. Method to check if the "Previous" button is displayed
	/**
	 * This method checks if the "Previous" button is displayed on the page. It uses
	 * a utility method to determine the display status of the element with an
	 * explicit wait.
	 *
	 * @return A boolean indicating whether the "Previous" button is displayed.
	 */
	public boolean isPreviousButtonDisplayed() {
		return elementUtiles.displayStatusOfElement(previousButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 7. Method to click on the file drag text element
	/**
	 * This method clicks on the "File Drag Text" element. It uses a utility method
	 * to perform the click action with an explicit wait.
	 */
	public void clickFileDragText() {
		elementUtiles.clickOnElement(fileDragText, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to upload a file
	/**
	 * This method uploads a file by providing the file path to the file input
	 * field. It converts the relative file path to an absolute path before sending
	 * it to the input element.
	 *
	 * @param filePath The relative or absolute path of the file to be uploaded.
	 */
	public void FileInputFieldCoach(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		fileInputFieldCoach.sendKeys(absolutePath);
	}

	// Method to click on "Passing Certificate" option directly
	/**
	 * This method clicks on the "Passing Certificate" option. It uses a utility
	 * method to perform the click action with an explicit wait.
	 */
	public void clickPassingCertificateOption() {
		elementUtiles.clickOnElement(passingCertificateOption, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to click on the certificate image (if needed)
	/**
	 * This method clicks on the certificate image. It uses a utility method to
	 * perform the click action with an explicit wait.
	 */
	public void clickCertificateImage() {
		elementUtiles.clickOnElement(certificateImage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to click on the "Add Certificate" button
	/**
	 * This method clicks on the "Add Certificate" button. It uses a utility method
	 * to perform the click action with an explicit wait.
	 */
	public void clickAddCertificateButton() {
		elementUtiles.clickOnElement(addCertificateButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to send keys (text) to the Name input field
	/**
	 * This method enters the provided name into the Name input field. It uses a
	 * utility method to type text into the element with an explicit wait.
	 *
	 * @param name The name to be entered into the input field.
	 */
	public void enterName(String name) {
		elementUtiles.typeTextIntoElement(nameInputField, name, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to send keys (text) to the English Name input field
	/**
	 * This method enters the provided English name into the English Name input
	 * field. It uses a utility method to type text into the element with an
	 * explicit wait.
	 *
	 * @param englishName The English name to be entered into the input field.
	 */
	public void enterEnglishName(String englishName) {
		elementUtiles.typeTextIntoElement(englishNameInputField, englishName, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to send keys (text) to the Address input field
	/**
	 * This method enters the provided address into the Address input field. It uses
	 * a utility method to type text into the element with an explicit wait.
	 *
	 * @param address The address to be entered into the input field.
	 */
	public void enterAddress(String address) {
		elementUtiles.typeTextIntoElement(addressInputField, address, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to send keys (text) to the English Address input field
	/**
	 * This method enters the provided English address into the English Address
	 * input field. It uses a utility method to type text into the element with an
	 * explicit wait.
	 *
	 * @param englishAddress The English address to be entered into the input field.
	 */
	public void enterEnglishAddress(String englishAddress) {
		elementUtiles.typeTextIntoElement(englishAddressInputField, englishAddress,
				CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to click on the Certificate Type option
	/**
	 * This method clicks on the Certificate Type dropdown to open the options. It
	 * uses a utility method to perform the click action with an explicit wait.
	 */
	public void selectCertificateType() {
		elementUtiles.clickOnElement(certificateTypeSelect, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to send keys (text) to the President's Name input field
	/**
	 * This method enters the provided president's name into the President's Name
	 * input field. It uses a utility method to type text into the element with an
	 * explicit wait.
	 *
	 * @param presidentName The president's name to be entered into the input field.
	 */
	public void enterPresidentName(String presidentName) {
		elementUtiles.typeTextIntoElement(presidentNameInputField, presidentName,
				CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to upload a file (certificate image)
	/**
	 * This method uploads a certificate image file by providing the file path to
	 * the file input field. It converts the relative file path to an absolute path
	 * before sending it to the input element.
	 *
	 * @param filePath The relative or absolute path of the certificate image to be
	 *                 uploaded.
	 */
	public void FileInputFieldPrisdent(String filePath) {
		File file = new File(filePath);
		String absolutePath = file.getAbsolutePath();
		fileInputFieldPrisdent.sendKeys(absolutePath);
	}

	// Method to click on the "Save" button
	/**
	 * This method clicks on the "Save" button. It uses a utility method to perform
	 * the click action with an explicit wait.
	 */
	public void clickSaveButton() {
		elementUtiles.clickOnElement(saveButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to click the "Filter" button
	/**
	 * This method clicks on the "Filter" button. It uses a utility method to
	 * perform the click action with an explicit wait.
	 */
	public void clickFilter() {
		elementUtiles.clickOnElement(filterButton, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to get text from the "View" label
	/**
	 * This method retrieves the text from the "View" label. It uses a utility
	 * method to extract the text from the element with an explicit wait.
	 *
	 * @return The text of the "View" label as a String.
	 */
	public String getViewText() {
		return elementUtiles.getTextFromElement(viewLabel, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Method to get text from the "Status" label
	/**
	 * This method retrieves the text from the "Status" label. It uses a utility
	 * method to extract the text from the element with an explicit wait.
	 *
	 * @return The text of the "Status" label as a String.
	 */
	public String getStatusText() {
		return elementUtiles.getTextFromElement(statusLabel, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// Methods

	/**
	 * Method to click on the filter dropdown. Utilizes utility for clicking with
	 * explicit wait.
	 */
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

	// Method to get the text of the 'Save Successfully' element
	public String getSaveSuccessfullyText() {
		return elementUtiles.getTextFromElement(SaveSucessfully, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}
}
