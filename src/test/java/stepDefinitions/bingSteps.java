package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.bingPage;

public class bingSteps {
    WebDriver driver;
    TestContext testContext;
   bingPage bing;

    public bingSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        bing = new bingPage(driver);
    }

    @When("User Search for text {string} on Search Engine Bing")
    public void userSearchForTextOnSearchEngineBing(String arg0) {
        bing.bing_Search(arg0);
    }

    @Then("User should be able to validate the result with search text {string} on Bing")
    public void userShouldBeAbleToValidateTheResultWithSearchTextOnBing(String arg0) {
        String getActual = bing.bingResultsFirstText().toLowerCase();
        System.out.println(getActual);
        Assert.assertTrue("Actual is " + getActual + " and expected is " +arg0, getActual.contains(arg0.toLowerCase()));

    }
}
