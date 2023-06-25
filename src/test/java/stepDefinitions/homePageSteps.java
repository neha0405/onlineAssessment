package stepDefinitions;


import cucumber.TestContext;
import io.cucumber.java.en.*;
import managers.FileReaderManager;
import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pageObjects.homePage;



public class homePageSteps {
    WebDriver driver;
    TestContext testContext;
    WebDriverManager webDriverManager;
    homePage homePage;

    public homePageSteps(TestContext context) {
        testContext = context;
        driver=testContext.getWebDriverManager().getDriver();
        homePage= new homePage(driver);
    }

    @Given("^User is on Search Engine \"([^\"]*)\"$")
    public void user_is_on_Search_Engine(String searchEngine) {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(searchEngine));
    }

    @When("^User Search for text \"([^\"]*)\" on Search Engine \"([^\"]*)\"$")
    public void user_Search_for_text_on_Search_Engine(String searchText, String searchEngine) {

        homePage.perform_Search(searchEngine, searchText);
    }



}

