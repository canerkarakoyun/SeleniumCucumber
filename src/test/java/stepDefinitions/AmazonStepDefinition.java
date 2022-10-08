package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

import static utilities.Driver.getDriver;

public class AmazonStepDefinition {
    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get("https://www.amazon.com");
    }

    @Then("Kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
    }

    @And("Kullanici sonuclarin Nutella icerdigini test eder")
    public void kullaniciSonuclarinNutellaIcerdiginiTestEder() {
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@class='a-color-state a-text-bold']")).getText().contains("Nutella"));
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
