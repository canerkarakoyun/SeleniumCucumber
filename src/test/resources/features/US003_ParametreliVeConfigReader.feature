Feature: Parametreli ve ConfigReader Kullanimi

  Scenario: TC01 Parametre kullaniminda ConfigReader kullanimi
    Given Kullanici "faceUrl" sayfasina gider
    Then Kullanici Url'in "facebook" icerdigini test eder

  @gp2
  Scenario: TC03 Parametre kullaniminda ConfigReader kullanimi
    Given Kullanici "brcUrl" sayfasina gider
    Then 3 saniye bekler
    Then Kullanici Url'in "blue" icerdigini test eder

  Scenario: TC04 Parametre kullaniminda ConfigReader kullanimi
    Given Kullanici "amazonUrl" sayfasina gider
    Then 3 saniye bekler
    Then Kullanici Url'in "amazon" icerdigini test eder


  Scenario: TC05 Parametre kullaniminda ConfigReader kullanimi
    Given Kullanici "google" sayfasina gider
    Then 3 saniye bekler
    Then Kullanici Url'in "google" icerdigini test eder
    And Kullanici sayfayi kapatir


