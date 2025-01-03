package Utiles;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtiles {

	WebDriver driver;

	// Constructor to initialize WebDriver
	public ElementUtiles(WebDriver driver) {
		this.driver = driver;
	}

	

	// Click on a given element with a wait for element to be clickable
	public void clickOnElement(WebElement element, long durationInSeconds) {
		WebElement webElement = waitForElement(element, durationInSeconds);
		webElement.click();
	}

	// Type text into a given element with clearing the existing text first
	public void typeTextIntoElement(WebElement element, String textToBeTyped, long durationInSeconds) {
		WebElement webElement = waitForElement(element, durationInSeconds);
		webElement.click(); // Click to focus on the input field
		webElement.clear(); // Clear any existing text
		webElement.sendKeys(textToBeTyped); // Type the provided text
	}

	// Wait for an element to be clickable for a given duration
	public WebElement waitForElement(WebElement element, long durationInSeconds) {
		WebElement webElement = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
			webElement = wait.until(ExpectedConditions.elementToBeClickable(element)); // Wait until the element is
																						// clickable
		} catch (Throwable e) {
			e.printStackTrace(); // Handle exceptions and print the error
		}
		return webElement;
	}

	// Select an option from a dropdown by its visible text
	public void selectOptionInDropdown(WebElement element, String dropDownOption, long durationInSeconds) {
		WebElement webElement = waitForElement(element, durationInSeconds);
		Select select = new Select(webElement);
		select.selectByVisibleText(dropDownOption); // Select the dropdown option
	}

	// Accept an alert dialog
	public void acceptAlert(long durationInSeconds) {
		Alert alert = waitForAlert(durationInSeconds);
		alert.accept(); // Accept the alert
	}

	// Dismiss an alert dialog
	public void dismissAlert(long durationInSeconds) {
		Alert alert = waitForAlert(durationInSeconds);
		alert.dismiss(); // Dismiss the alert
	}

	// Wait for an alert to appear
	public Alert waitForAlert(long durationInSeconds) {
		Alert alert = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
			alert = wait.until(ExpectedConditions.alertIsPresent()); // Wait for the alert to be present
		} catch (Throwable e) {
			e.printStackTrace(); // Handle exceptions and print the error
		}
		return alert;
	}

	// Hover over an element and click it using Actions class
	public void mouseHoverAndClick(WebElement element, long durationInSeconds) {
		WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);
		Actions actions = new Actions(driver);
		actions.moveToElement(webElement).click().build().perform(); // Perform hover and click
	}

	// Wait for an element to be visible for a given duration
	public WebElement waitForVisibilityOfElement(Object object, long durationInSeconds) {
		WebElement webElement = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
			webElement = wait.until(ExpectedConditions.visibilityOf((WebElement) object)); // Wait for the element to be
																							// visible
		} catch (Throwable e) {
			e.printStackTrace(); // Handle exceptions and print the error
		}
		return webElement;
	}

	// Use JavaScript to click on an element
	public void javaScriptClick(WebElement element, long durationInSeconds) {
		WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].click();", webElement); // JavaScript click
	}

	// Use JavaScript to type text into an element
	public void javaScriptType(WebElement element, long durationInSeconds, String textToBeTyped) {
		WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].value='" + textToBeTyped + "'", webElement); // JavaScript type text
	}

	// Get text from a web element
	public String getTextFromElement(WebElement element, long durationInSeconds) {
		WebElement webElement = waitForElement(element, durationInSeconds);
		return webElement.getText(); // Return the text from the element
	}

	// Check if an element is displayed on the page
	public boolean displayStatusOfElement(WebElement element, long durationInSeconds) {
		try {
			WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);
			return webElement.isDisplayed(); // Check if the element is displayed
		} catch (Throwable e) {
			return false; // If an exception occurs, return false
		}
	}

	// Method for simulating "Page Down" key press using Actions
	public void pageDown(long durationInSeconds) {
		Actions actions = new Actions(driver);
		actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform(); // Perform Page Down
	}

	// Method for simulating "Page Up" key press using Actions
	public void pageUp(long durationInSeconds) {
		Actions actions = new Actions(driver);
		actions.sendKeys(org.openqa.selenium.Keys.PAGE_UP).build().perform(); // Perform Page Up
	}

	// Method for simulating "Enter" key press using Actions
	public void pressEnter(long durationInSeconds) {
		Actions actions = new Actions(driver);
		actions.sendKeys(org.openqa.selenium.Keys.ENTER).build().perform(); // Perform Enter key press
	}

	// Method for simulating "ESC" key press using Actions
	public void pressEscape(long durationInSeconds) {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).perform(); // Perform ESC key press
	}

	public void javaScriptScrollToElement(WebElement element, long durationInSeconds) {
		// Wait for the visibility of the element
		WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);

		// Create a JavascriptExecutor instance
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Execute the script to scroll to the element
		jse.executeScript("arguments[0].scrollIntoView(true);", webElement);
	}

	/**
	 * Scrolls to the end of the web page using JavaScript.
	 */
	public void scrollToEndOfPage() {
		// Create a JavascriptExecutor instance
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Execute the script to scroll to the bottom of the page
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

}
