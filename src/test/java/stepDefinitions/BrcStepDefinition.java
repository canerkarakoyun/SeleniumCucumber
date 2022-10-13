package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BrcStepDefinition {
    BrcPage brcPage = new BrcPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("{string} ana sayfasina git")
    public void anaSayfasinaGit(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @And("{int} saniye bekle")
    public void saniyeBekle(int beklemeSuresi) throws InterruptedException {
        Thread.sleep(beklemeSuresi*1000);
    }

    @Then("Login yazisina tikla")
    public void loginYazisinaTikla() {
        brcPage.login.click();
    }

    @And("gecersiz {string} gir")
    public void gecersizGir(String userName) {
        brcPage.emailBox.sendKeys(userName);
    }

    @And("gecersiz {string} girer")
    public void gecersizGirer(String password) {
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
    }

    @And("Login butonuna bas")
    public void loginButonunaBas() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Then("sayfaya giris yapilamadigini kontrol et")
    public void sayfayaGirisYapilamadiginiKontrolEt() {
        Assert.assertTrue(brcPage.girisYapilamadi.isDisplayed());
    }

    @And("sayfayi kapat")
    public void sayfayiKapat() {
        Driver.closeDriver();
    }
}
