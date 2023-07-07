package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class yahooPage {

    @FindBy(how = How.XPATH, using = "//*[@name='p']")
    private WebElement txt_YahooSearchField;

    @FindAll(@FindBy(how = How.XPATH, using = "//*[contains(@class,'reg searchCenterMiddle')]/li//h3[@class='title']"))
    private List<WebElement> list_YahooSearchedResultsText;

    public yahooPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void yahoo_Search(String searchText) {
        txt_YahooSearchField.sendKeys(searchText, Keys.ENTER);
    }

    public String yahooFirstResult() {
        String getActual = list_YahooSearchedResultsText.get(0).getText();
        return getActual;
    }
}
