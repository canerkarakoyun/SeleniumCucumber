package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuappPage {
    public HerokuappPage(WebDriver driver) {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[text()='Add Element']")
    public WebElement addElementButton;

    @FindBy(xpath="//*[@class='added-manually']")
    public WebElement deleteButton;

    @FindBy(xpath="//*[@class='added-manually']")
    public List<WebElement> deleteButtonList;


}
