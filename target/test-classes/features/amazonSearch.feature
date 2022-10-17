
@All
Feature: Amazon Search
  @gp1
  Scenario: TC01 Kullanici amazonda Nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici Nutella icin arama yapar
    And Kullanici sonuclarin Nutella icerdigini test eder



    Scenario: TC02 kullanici amazonda Selenium aratir

      Given Kullanici amazon sayfasina gider
      Then Kullanici Selenium icin arama yapar
      And Kullanici sonuclarin Selenium icerdigini test eder


  Scenario: TC02 kullanici amazonda iphone aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici iphone icin arama yapar
    And Kullanici sonuclarin iphone icerdigini test eder
    And Kullanici sayfayi kapatir