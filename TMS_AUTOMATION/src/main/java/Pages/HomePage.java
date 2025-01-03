package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.CommonUtlies;
import Utiles.ElementUtiles;

public class HomePage {
	WebDriver driver;
	private ElementUtiles elementUtiles;

	// Constructor to initialize the WebDriver and initialize PageFactory elements
	/**
	 * This constructor initializes the WebDriver and sets up the PageFactory
	 * elements. It initializes the elements defined in this class using the
	 * provided WebDriver and also sets up an instance of ElementUtiles for further
	 * element interactions.
	 *
	 * @param driver The WebDriver instance used to interact with the browser.
	 */
	public HomePage(WebDriver driver) {
		this.driver = driver;
		// Initializes the elements defined in this class with the WebDriver
		PageFactory.initElements(driver, this);
		elementUtiles = new ElementUtiles(driver);
	}

	// 1. Locating web elements using @FindBy annotation
	// 1.1. Language dropdown element (Arabic)
	@FindBy(xpath = "//span[contains(text(), 'عربى')]")
	private WebElement drpChooseLanguage;

	// 1.2. Select English language option
	@FindBy(xpath = "//a[normalize-space()='English']")
	private WebElement chooseEnglishLanguage;

	// 1.3. Role dropdown for Administrator
	@FindBy(xpath = "//span[contains(text(), 'Adminstrator')]")
	private WebElement drpChooseRoleAdministrator;

	// 1.4. Role dropdown for Empowerment
	@FindBy(xpath = "//a[contains(text(), 'empowerment')]")
	private WebElement drpChooseRoleEmpowerment;

	// 1.5. Target Groups dropdown
	@FindBy(xpath = "//a[span[text()='Target Groups']]")
	private WebElement drpChooseTargetGroups;

	// 1.6. Trainer role option
	@FindBy(xpath = "//*[contains(text(), 'trainer')]")
	private WebElement drpChooseTrainer;

	// 1.7. Trainee role option
	@FindBy(xpath = "//*[contains(text(), 'trainee')]")
	private WebElement drpChooseTrainee;
	@FindBy(xpath = "(//div[@class='single-stats-title'])[1]")
	private WebElement statsTitle1; // 1. First stats title

	@FindBy(xpath = "(//div[@class='single-stats-title'])[2]")
	private WebElement statsTitle2; // 2. Second stats title

	@FindBy(xpath = "(//div[@class='single-stats-title'])[3]")
	private WebElement statsTitle3; // 3. Third stats title

	@FindBy(xpath = "(//div[@class='single-stats-title'])[4]")
	private WebElement statsTitle4; // 4. Fourth stats title

	@FindBy(xpath = "(//div[@class='single-stats-title'])[5]")
	private WebElement statsTitle5; // 5. Fifth stats title

	@FindBy(xpath = "(//div[@class='single-stats-title'])[6]")
	private WebElement statsTitle6; // 6. Sixth stats title

	// 1. Method to click on the 'Language' dropdown
	/**
	 * This method clicks on the 'Language' dropdown to display available language
	 * options. It uses the elementUtiles utility to perform the click action with
	 * an explicit wait for the element to become clickable.
	 */
	public void clickOndrpChooseLanguage() {
		elementUtiles.clickOnElement(drpChooseLanguage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 2. Method to click on the 'English' language option
	/**
	 * This method clicks on the 'English' language option from the language
	 * dropdown. It ensures that the click operation is performed after an explicit
	 * wait to ensure the element is clickable.
	 */
	public void clickOnchooseEnglishLanguage() {
		elementUtiles.clickOnElement(chooseEnglishLanguage, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 3. Method to click on the 'Administrator' role option
	/**
	 * This method selects the 'Administrator' role from the roles dropdown. The
	 * click operation is done after an explicit wait to make sure the element is
	 * ready for interaction.
	 */
	public void clickOndrpChooseRoleAdministrator() {
		elementUtiles.clickOnElement(drpChooseRoleAdministrator, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 4. Method to click on the 'Empowerment' role option
	/**
	 * This method clicks on the 'Empowerment' role option from the roles dropdown.
	 * An explicit wait is applied to ensure the element is available before
	 * performing the click.
	 */
	public void clickOndrpChooseRoleEmpowerment() {
		elementUtiles.clickOnElement(drpChooseRoleEmpowerment, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	// 5. Method to click on the 'Target Groups' option in the dropdown
	/**
	 * This method clicks on the 'Target Groups' option from the dropdown list. It
	 * uses an explicit wait to ensure the dropdown option is ready to be clicked.
	 */
	public void clickOnclickdrpChooseTargetGroups() {
		elementUtiles.clickOnElement(drpChooseTargetGroups, CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
	}

	/**
	 * Retrieves text from the first stats title.
	 * 
	 * @return The text of the first stats title.
	 */
	public String getStatsTitle1Text() {
		return statsTitle1.getText();
	}

	/**
	 * Retrieves text from the second stats title.
	 * 
	 * @return The text of the second stats title.
	 */
	public String getStatsTitle2Text() {
		return statsTitle2.getText();
	}

	/**
	 * Retrieves text from the third stats title.
	 * 
	 * @return The text of the third stats title.
	 */
	public String getStatsTitle3Text() {
		return statsTitle3.getText();
	}

	/**
	 * Retrieves text from the fourth stats title.
	 * 
	 * @return The text of the fourth stats title.
	 */
	public String getStatsTitle4Text() {
		return statsTitle4.getText();
	}

	/**
	 * Retrieves text from the fifth stats title.
	 * 
	 * @return The text of the fifth stats title.
	 */
	public String getStatsTitle5Text() {
		return statsTitle5.getText();
	}

	/**
	 * Retrieves text from the sixth stats title.
	 * 
	 * @return The text of the sixth stats title.
	 */
	public String getStatsTitle6Text() {
		return statsTitle6.getText();
	}

	/**
	 * Retrieves text from all six stats titles.
	 * 
	 * @return A list containing the text of all six stats titles.
	 */
	public List<String> getAllStatsTitlesText() {
		List<String> statsTexts = new ArrayList<>();
		statsTexts.add(statsTitle1.getText());
		statsTexts.add(statsTitle2.getText());
		statsTexts.add(statsTitle3.getText());
		statsTexts.add(statsTitle4.getText());
		statsTexts.add(statsTitle5.getText());
		statsTexts.add(statsTitle6.getText());
		return statsTexts;
	}
}
