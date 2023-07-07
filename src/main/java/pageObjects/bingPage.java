package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class bingPage {
    public bingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@name='q']")
    private WebElement txt_BingSearchField;

    @FindAll(@FindBy(how = How.XPATH, using = "//*[@aria-label='Search Results']//ol[@id='b_results']//li//h2/a"))
    private List<WebElement> list_BingSearchedResultsText;
    public void bing_Search( String searchText) {
        txt_BingSearchField.click();
        txt_BingSearchField.sendKeys(searchText, Keys.ENTER);
    }

    public String bingResultsFirstText() {
        String getActual = list_BingSearchedResultsText.get(0).getText();
        return getActual;
    }
}
