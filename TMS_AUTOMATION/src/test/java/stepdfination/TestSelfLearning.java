package stepdfination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Pages.AddCoursePage;
import Pages.SelfLearning;
import Utiles.CommonUtlies;
import Utiles.ElementUtiles;
import factory.DriverFactory;
import io.cucumber.java.en.Then;

public class TestSelfLearning {
	WebDriver driver;
	private SelfLearning selfLearning;
	private CommonUtlies commonUtlies;
	private ElementUtiles elementUtiles;
	private AddCoursePage addCoursePage;

	@Then("Navigate through the navigation bar, select the Courses and Self Learning options.")
	public void navigate_through_the_navigation_bar_select_the_courses_and_self_learning_options()
			throws InterruptedException {
		driver = DriverFactory.getdriver();
		selfLearning = new SelfLearning(driver);
		commonUtlies = new CommonUtlies();
		addCoursePage = new AddCoursePage(driver);
		elementUtiles = new ElementUtiles(driver);
		Thread.sleep(5000);
		addCoursePage.clickOnCourseImage();
		selfLearning.clickSelfLearningLink();
	}

	@Then("Search for a course and validate the course name and course code.")
	public void search_for_a_course_and_validate_the_course_name_and_course_code() throws InterruptedException {
		Thread.sleep(5000);
		selfLearning.enterSearchText("Test Course");
		elementUtiles.pressEnter(CommonUtlies.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
		assertEquals(selfLearning.getTextFromSecondColumnFirstRow(), "Test Course");
		System.out.println("Courese Name :" + selfLearning.getTextFromSecondColumnFirstRow());
		Thread.sleep(5000);
		assertEquals(selfLearning.getTextFromThirdColumnFirstRow(), "Test Course");
		System.out.println("Course Id :" + selfLearning.getTextFromThirdColumnFirstRow());

	}

	@Then("Click on the Trainee  option.")
	public void click_on_the_trainee_option() throws InterruptedException {
		Thread.sleep(5000);
		selfLearning.clickFirstLinkContainingZero();
	}

	@Then("Validate all the information in the trainee section.")
	public void validate_all_the_information_in_the_trainee_section() throws InterruptedException {
		Thread.sleep(5000);
		assertEquals(selfLearning.isNoMatchingResultsDisplayed(), "There are No Matching Results");
		System.out.println("Error message" + selfLearning.isNoMatchingResultsDisplayed());
	}

}
