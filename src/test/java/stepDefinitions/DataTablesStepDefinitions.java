package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DtTbls;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDefinitions {
    DtTbls dataTables = new DtTbls();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("kullanici new butonuna basar")
    public void kullaniciNewButonunaBasar() {
        dataTables.newButton.click();
    }

    @And("Kullanici isim icin {string} girer")
    public void kullaniciIsimIcinGirer(String firstName) {
        dataTables.firstName.sendKeys(firstName);
    }

    @And("Kullanici soyisim icin {string} girer")
    public void kullaniciSoyisimIcinGirer(String lastName) {
        actions.sendKeys(Keys.TAB).sendKeys(lastName).perform();
    }

    @And("Kullanici pozisyon icin {string} girer")
    public void kullaniciPozisyonIcinGirer(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("Kullanici ofis bilgisi icin {string} girer")
    public void kullaniciOfisBilgisiIcinGirer(String office) {
        actions.sendKeys(Keys.TAB).sendKeys(office).perform();
    }

    @And("Kullanici extention icin {string} girer")
    public void kullaniciExtentionIcinGirer(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("Kullanici baslangic tarihi {string} girer")
    public void kullaniciBaslangicTarihiGirer(String startDate) {
        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();
    }

    @And("Kullanici ucret bilgisi {string} girer")
    public void kullaniciUcretBilgisiGirer(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("Kullanici Create tusuna basar")
    public void kullaniciCreateTusunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("Kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String expectedName) {
        dataTables.searchBox.sendKeys(expectedName);
    }

    @And("Kullanici isim bolumunde {string} oldugunu dogrular")
    public void kullaniciIsimBolumundeOldugunuDogrular(String firstName) {
        Assert.assertTrue(dataTables.actualName.getText().contains(firstName));
    }

    @And("Kullanici sayfayi kapatirr")
    public void kullaniciSayfayiKapatirr() {
       Driver.closeDriver();
    }
}
