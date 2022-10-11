Feature: US004 Parametre kullanimi
  Scenario: TC01 Parametre kullanimi
    Given Kullanici "https://hepsiburada.com" sayfasinda
    Then 3 saniye bekler
    When Kullanici Url'in "hepsi" icerdigini test eder
    And Kullanici sayfayi kapatir