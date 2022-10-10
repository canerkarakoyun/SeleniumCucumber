package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@Background",
        dryRun = false

)

public class Runner {
    /*
    Runner class'i testNG'deki xml mantigi ile calisir. Calistirmak istedigimiz senaryolara tag
    belirtiriz ve belirttigimiz taglari calistirir.
    Yani xml'deki gibi istedigimiz testleri calistirmak icin kullaniriz.
    Runnner class bady'si bostur ve runner class'ini ekleyecegimiz notasyonlar aktive eder.

    Bu class'da kullanacagimiz 2 adet notasyon vardir;
    1. @RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi ekler
        Bu notasyon oldugu icin Cucumber framework'umuzde Junit kullanmayi tercih ederiz
    2. @cucumberOptions notasyonu icinde
    features    : Runner dosyanisinin feature dosyasini nereden bulacagini tarif eder
    glue        : stepDefinitions yolunu belirtiriz
    tags        : hangi tag'i calistimak istiyorsak onu belli eder
                  belirlenen tag ismini belirterek o grup elemanlari calistirilir. Istenirse en basa @All tagi
                  ile tum testler calistirilir.
                  birden fazla tag calistirmak istersek araya "or" yazariz. Or. "@gp1 or @gp2"
    dryRun : "false" dersek driver'i calistirir
    dryRun : "true" dersek driver'i calistirmadan testin sonucunu bize getirir.

     */
}
