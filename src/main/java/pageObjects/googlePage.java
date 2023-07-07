package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class googlePage {
    public googlePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@name='q']")
    private WebElement txt_googleSearchField;

    @FindAll(@FindBy(how = How.XPATH, using = "//*[@id='search']//div[@id='rso']//a/h3"))
    private List<WebElement> list_GoogleSearchedResultsText;

    public void google_Search(String searchText) {
        txt_googleSearchField.click();
        txt_googleSearchField.sendKeys(searchText, Keys.ENTER);
    }

    public String googleResults() {
        String getActual = list_GoogleSearchedResultsText.get(0).getText();
        return getActual;

    }
}

