package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.yahooPage;

public class yahooSteps {
    WebDriver driver;
    TestContext testContext;
    yahooPage yahoo;

    public yahooSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        yahoo = new yahooPage(driver);
    }

    @When("User Search for text {string} on Search Engine Yahoo")
    public void userSearchForTextOnSearchEngineYahoo(String arg0) {
        yahoo.yahoo_Search(arg0);
    }

    @Then("User should be able to validate the result with search text {string} on Yahoo")
    public void userShouldBeAbleToValidateTheResultWithSearchTextOnYahoo(String searchText) {
        String getActual = yahoo.yahooFirstResult().toLowerCase();
        System.out.println(getActual);
        Assert.assertTrue("Actual is " + getActual + " and expected is " +searchText, getActual.contains(searchText.toLowerCase()));

    }
}
