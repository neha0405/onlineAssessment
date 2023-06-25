package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class searchPage {

    @FindAll(@FindBy(how = How.XPATH, using = "//*[@id='search']//div[@id='rso']//a/h3"))
    private List<WebElement> list_GoogleSearchedResultsText;

    @FindAll(@FindBy(how = How.XPATH, using = "//*[@aria-label='Search Results']//ol[@id='b_results']//li//h2/a"))
    private List<WebElement> list_BingSearchedResultsText;

    @FindAll(@FindBy(how = How.XPATH, using = "//*[contains(@class,'reg searchCenterMiddle')]/li//h3[@class='title']"))
    private List<WebElement> list_YahooSearchedResultsText;

    public searchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getFirstResultfromSearchPage(String searchEngine) {
        String getActual = null;
        try {
            if (searchEngine.equalsIgnoreCase("Google"))
                getActual = list_GoogleSearchedResultsText.get(0).getText();
            if (searchEngine.equalsIgnoreCase("Bing"))
                getActual = list_BingSearchedResultsText.get(0).getText();
            if (searchEngine.equalsIgnoreCase("Yahoo"))
                getActual = list_YahooSearchedResultsText.get(0).getText();
        }
        catch (Exception e ){
            System.out.println("List of results cannot be empty "+e.getMessage());
        }
        return getActual;
    }

}
