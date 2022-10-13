package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class HerokuappStepDefinition {
    HerokuappPage herokuappPage = new HerokuappPage(Driver.getDriver());
    @Given("{string} adresine gidilir")
    public void adresineGidilir(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("Add Element butonuna basilir")
    public void addElementButonunaBasilir() {
        herokuappPage.addElementButton.click();

    }

    @And("Delete butonu gorununceye kadar bekleyin")
    public void deleteButonuGorununceyeKadarBekleyin() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuappPage.deleteButton));
    }

    @And("Delete butonunun gorunur oldugunu test edin")
    public void deleteButonununGorunurOldugunuTestEdin() {
        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());

    }

    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
        herokuappPage.deleteButton.click();
    }

    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
        Assert.assertTrue(herokuappPage.deleteButtonList.isEmpty());
       // assert !herokuappPage.deleteButton.isDisplayed();
    }
}
