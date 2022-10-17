package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DemoPage;
import utilities.Driver;

public class DemoStepDefinition {
    Actions actions= new Actions(Driver.getDriver());
    DemoPage demoPage = new DemoPage();
    @When("kullanici Alerts buttonuna tiklar")
    public void kullaniciAlertsButtonunaTiklar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        demoPage.alertWE.click();
    }

    @And("kullanici On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar")
    public void kullaniciOnButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasar() {
        demoPage.timeClickME.click();
    }

    @And("kullanici Allertin gorunur olmasini bekler")
    public void kullaniciAllertinGorunurOlmasiniBekler() {
    }

    @And("kullanici Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder")
    public void kullaniciAllertUzerindekiYazininThisAlertAppearedAfterBesSecondsOldugunuTestEder() {
    }

    @And("kullanici ok diyerek alerti kapatir")
    public void kullaniciOkDiyerekAlertiKapatir() {
    }
}
