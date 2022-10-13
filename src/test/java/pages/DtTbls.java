package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DtTbls {
    public DtTbls() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[text()='New']")
    public WebElement newButton;

    @FindBy(xpath="//*[@id='DTE_Field_first_name']")
    public WebElement firstName;

    @FindBy(xpath="//*[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath="//*[@class='sorting_1']")
    public WebElement actualName;
}
