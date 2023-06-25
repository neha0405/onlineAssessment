package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homePage {

    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@name='q']")
    private WebElement txt_googleBingSearchField;
    @FindBy(how = How.XPATH, using = "//*[@name='p']")
    private WebElement txt_YahooSearchField;

    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void perform_Search(String searchEngine, String searchText) {
        if ((searchEngine.equalsIgnoreCase("Google")) || (searchEngine.equalsIgnoreCase("Bing"))) {
            txt_googleBingSearchField.click();
            txt_googleBingSearchField.sendKeys(searchText, Keys.ENTER);
        }
        if (searchEngine.equalsIgnoreCase("yahoo"))
            txt_YahooSearchField.sendKeys(searchText, Keys.ENTER);

    }
}

