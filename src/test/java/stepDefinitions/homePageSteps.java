package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.*;
import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;

public class homePageSteps {
    WebDriver driver;
    TestContext testContext;

    public homePageSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @Given("^User is on Search Engine \"([^\"]*)\"$")
    public void user_is_on_Search_Engine(String searchEngine) {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(searchEngine));
    }

}

