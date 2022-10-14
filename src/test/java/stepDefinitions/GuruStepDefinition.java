package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {
    GuruPage guruPage = new GuruPage();
    @Then("Kullanici {string} sutunundaki tum degerleri yazdirir")
    public void kullaniciSutunundakiTumDegerleriYazdirir(String istenenBaslik) {
        int index=0;
        for (int i = 0; i < guruPage.basliklar.size(); i++) {
            if (guruPage.basliklar.get(i).getText().equals(istenenBaslik)) { // Feature'dan gelen string degeri i degerine esitledik
                System.out.println(guruPage.basliklar.get(i).getText()); // Feature'dan gelen basligi yazdirdik
                index = i+1; // Feature'dan gelen ve i degerine esitledigimiz stringi ayni degere sahip sutunlari da yazdirabilmek icin
                // bos bir container olusturup ona atadik. Listte index 0(sifir) dan basladigi icin ve webTable locate;imiz 1'den
                // basladigi icin i degerini 1 atadik.
                List<WebElement> sutunElement= Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
                // Sonrasinda webTable'daki bady'i locate edip esitledigimiz index'i baslik altindaki sutunu getirebilmesi icin
                // bu list'e koyduk.

                sutunElement.forEach(t-> System.out.println(t.getText()));
                // Lambda ile de o sutunu yazdirdik
            }

        }
    }
}
