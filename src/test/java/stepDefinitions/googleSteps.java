package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.googlePage;

public class googleSteps {
    WebDriver driver;
    TestContext testContext;
    googlePage google;

    public googleSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @When("User Search for text {string} on Search Engine Google")
    public void userSearchForTextOnSearchEngineGoogle(String searchText) {
        google = new googlePage(driver);
        google.google_Search(searchText);
    }

    @Then("User should be able to validate the result with search text {string} on Search Engine Google")
    public void userShouldBeAbleToValidateTheResultWithSearchTextOnSearchEngineGoogle(String arg0) {
        String getActual = google.googleResults().toLowerCase();
       System.out.println(getActual);
       Assert.assertTrue("Actual is " + getActual + " and expected is " +arg0, getActual.contains(arg0.toLowerCase()));

    }
}
