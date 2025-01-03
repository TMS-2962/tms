package stepdfination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Pages.SurveyPage;
import Utiles.CommonUtlies;
import Utiles.ElementUtiles;
import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSurveyPage {
	WebDriver driver;
	private SurveyPage surveyPage;
	private CommonUtlies commonUtlies;
	private ElementUtiles elementUtiles;

	@When("The Training administrator clicks on Surveys from the sidebar menu")
	public void the_training_administrator_clicks_on_surveys_from_the_sidebar_menu() throws InterruptedException {
		driver = DriverFactory.getdriver();
		surveyPage = new SurveyPage(driver);
		commonUtlies = new CommonUtlies();
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		surveyPage.clickOnSurveyOnNavBar();

	}

	@When("The Training administrator clicks on Add")
	public void the_training_administrator_clicks_on_add() throws InterruptedException {
		Thread.sleep(5000);
		surveyPage.clickOnAddSurvey();

	}

	@When("The Training administrator adds the required information")
	public void the_training_administrator_adds_the_required_information() throws InterruptedException {
		Thread.sleep(5000);
		surveyPage.enterQuestionnaireName(commonUtlies.getTextForAddTargetGroupName());
		surveyPage.clickOnDefaultForTrainee();
		surveyPage.clickOnDefaultForTrainer();
		surveyPage.clickOnAddQuestion();
		surveyPage.clickOnElementWithNgStarInserted();
		Thread.sleep(10000);
		surveyPage.enterStandardInput("The text is wrong?");

	}

	@Then("The Training administrator clicks on Save")
	public void the_training_administrator_clicks_on_save() throws InterruptedException {
		Thread.sleep(5000);
		surveyPage.clickOnSaveButton();

	}

	@Then("The added surveys are displayed")
	public void the_added_surveys_are_displayed() throws InterruptedException {
		Thread.sleep(7000);
		surveyPage.enterSearchText("test order");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		assertEquals(surveyPage.clickOnTdWithTextSeh(), "test order");
	}

	@When("The Training administrator clicks on Edit next to each survey")
	public void the_training_administrator_clicks_on_edit_next_to_each_survey() throws InterruptedException {
		Thread.sleep(5000);
		surveyPage.clickOnImageInsideAnchor();

	}

	@When("The Training administrator modifies the required information")
	public void the_training_administrator_modifies_the_required_information() throws InterruptedException {
		Thread.sleep(5000);
		surveyPage.enterQuestionnaireName(commonUtlies.getTextForAddTargetGroupName());
		surveyPage.clickOnDefaultForTrainee();

		surveyPage.clickOnAddQuestion();
		surveyPage.clickOnElementWithNgStarInserted();
		surveyPage.enterStandardInput("The XPath //span[normalize-space()='Update'] is used to locate a <s.");
	}

	@Then("The Training administrator clicks on Update")
	public void the_training_administrator_clicks_on_update() throws InterruptedException {
		Thread.sleep(5000);
		surveyPage.clickUpdateButton();

	}

	@When("The Training administrator clicks on Delete next to each survey")
	public void the_training_administrator_clicks_on_delete_next_to_each_survey() throws InterruptedException {
		Thread.sleep(5000);
		surveyPage.clickRemoveImage();
	}

	@When("The Training administrator clicks on View next to each survey")
	public void the_training_administrator_clicks_on_view_next_to_each_survey() throws InterruptedException {
		Thread.sleep(5000);
		surveyPage.clickOnImageInsideAnchor();
	}

	@When("The department administrator clicks on Search")
	public void the_department_administrator_clicks_on_search() throws InterruptedException {
		Thread.sleep(7000);
		surveyPage.enterSearchText("test order");

	}

	@Then("The survey matching the search criteria is displayed")
	public void the_survey_matching_the_search_criteria_is_displayed() throws InterruptedException {
		Thread.sleep(5000);
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		assertEquals(surveyPage.clickOnTdWithTextSeh(), "test order");
	}

	@Then("The Training administrator clicks delete survey")
	public void the_Training_administrator_clicks_delete_survey() throws InterruptedException {
		Thread.sleep(5000);
		surveyPage.clickRemoveImage();
		Thread.sleep(5000);
		surveyPage.clickDeleteButton();

	}

	@Then("Verify that alert message will be appear if try to delete survey in training course  completed")
	public void verify_that_alert_message_will_be_appear_if_try_to_delete_survey_in_training_course_completed()
			throws InterruptedException {
		Thread.sleep(8000);
		surveyPage.enterSearchText("seh");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		surveyPage.clickRemoveImage();
		Thread.sleep(5000);
		assertEquals(surveyPage.getDeleteQuestionnaireMessageText(), "Could Delete Questionnaire:seh");
		System.out.println("Delete Alert Message" + surveyPage.getDeleteQuestionnaireMessageText());

	}

	@When("verify that if delete a Survey is disappeared from")
	public void verify_that_if_delete_a_survey_is_disappeared_from() throws InterruptedException {
		Thread.sleep(5000);
		surveyPage.clickRemoveImage();
		Thread.sleep(5000);
		surveyPage.clickDeleteButton();
		System.out.println("delete Succesfully");
	}

	@When("verify that if delete a  Survey is disappeared from  Survey popup in add course page Turn on screen reader")
	public void verify_that_if_delete_a_survey_is_disappeared_from_survey_popup_in_add_course_page_turn_on_screen_reader() {
		System.out.println(" Survey is disappeared from  Survey popup in add course page ");
	}

	@Then("search filed is blank validate Survey Page")
	public void search_filed_is_blank_validate_survey_page() throws InterruptedException {
		Thread.sleep(8000);
		surveyPage.enterSearchText("seh");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		System.out.println("Search filed is blank");
	}

	@When("enter search result Survey Page")
	public void enter_search_result_survey_page() throws InterruptedException {
		Thread.sleep(8000);
		surveyPage.enterSearchText("swadx");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);

	}

	@Then("Proper messages should be displayed when there are no results Survey Page")
	public void proper_messages_should_be_displayed_when_there_are_no_results_survey_page()
			throws InterruptedException {
		Thread.sleep(5000);
		assertEquals(surveyPage.getNoMatchingResultsMessageText(), "There are No Matching Results");
	}

	@When("enter html code OR link in search field Survey Page .")
	public void enter_html_code_or_link_in_search_field_survey_page() throws InterruptedException {
		surveyPage.enterSearchText("https://test-gaca.cpt-it.com/auth/courses/questionnaires");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
//		assertEquals(surveyPage.getNoMatchingResultsMessageText(), "There are No Matching Results");
	}

	@When("the content should update to reflect the next page Survey Page")
	public void the_content_should_update_to_reflect_the_next_page_survey_page() throws InterruptedException {
		Thread.sleep(8000);
		surveyPage.clickNextButton();
		Thread.sleep(3000);
		System.out.println("Next button is displayed :" + surveyPage.isNextButtonDisplayed());
	}

	@When("the content should update to reflect the previous page Survey Page")
	public void the_content_should_update_to_reflect_the_previous_page_survey_page() throws InterruptedException {
		Thread.sleep(8000);
		surveyPage.clickNextButton();
		surveyPage.clickPreviousButton();
		Thread.sleep(3000);
		System.out.println("Previous button is displayed :" + surveyPage.isPreviousButtonDisplayed());
	}

}
