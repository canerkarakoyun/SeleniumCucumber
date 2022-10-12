Feature: US006 Kullanici amazonda verilen kelimeleri aratir

  Scenario Outline: TC01 Kullanici amazonda verilen kelimeleri aratir
    Given Kullanici "amazonUrl" sayfasina gider
    And Kullanici "<istenenKelime>" icin arama yapar
    And Kullanici sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And Kullanici sayfayi kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella              |
      | selenium      | selenium             |
      | SQL           | SQL                  |
