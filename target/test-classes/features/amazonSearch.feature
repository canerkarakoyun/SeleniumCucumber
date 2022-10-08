Feature: Amazon Search

  Scenario: TC01 Kullanici amazonda Nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici Nutella icin arama yapar
    And Kullanici sonuclarin Nutella icerdigini test eder
    And Kullanici sayfayi kapatir