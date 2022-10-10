package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.getDriver;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();
    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));

    }

    @Then("Kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @And("Kullanici sonuclarin Nutella icerdigini test eder")
    public void kullaniciSonuclarinNutellaIcerdiginiTestEder() {
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@class='a-color-state a-text-bold']")).getText().contains("Nutella"));
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("Kullanici Selenium icin arama yapar")
    public void kullaniciSeleniumIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Selenium", Keys.ENTER);
    }

    @And("Kullanici sonuclarin Selenium icerdigini test eder")
    public void kullaniciSonuclarinSeleniumIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.aramaSonucElementi.getText().contains("Selenium"));
    }

    @Then("Kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @And("Kullanici sonuclarin iphone icerdigini test eder")
    public void kullaniciSonuclarinIphoneIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.aramaSonucElementi.getText().contains("iphone"));
    }
}
