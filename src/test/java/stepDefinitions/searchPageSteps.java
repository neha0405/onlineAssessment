package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.searchPage;

public class searchPageSteps {
    TestContext testContext;
    WebDriver driver;
    searchPage searchPage;

    public searchPageSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        searchPage = new searchPage(driver);

    }

    @Then("^User should be able to validate the result with search text \"([^\"]*)\" on Search Engine \"([^\"]*)\"$")
    public void suer_should_be_able_to_validate_the_result_with_search_text(String SearchText, String searchEngine) {
        String getActual = searchPage.getFirstResultfromSearchPage(searchEngine).toLowerCase();
        System.out.println(getActual);
        Assert.assertTrue("Actual is " + getActual + " and expected is " + searchEngine, getActual.contains(SearchText.toLowerCase()));

    }

}
