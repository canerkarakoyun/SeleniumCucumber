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

public class BlueRentaCarStepDefinition {
    BrcPage brcPage = new BrcPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.login.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.emailBox.sendKeys("gecersiz@gmail.com");
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {

        actions.sendKeys(Keys.TAB)
                .sendKeys("gecersiz password")
                .perform();
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.girisYapilamadi.isDisplayed());
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int beklemeSuresi) {
        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
