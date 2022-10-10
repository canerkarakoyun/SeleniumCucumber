@Background
Feature: US001 Background Kullanimi

  Background: Ortak adimlar
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici amazonda Nutella aratir
    Then Kullanici Nutella icin arama yapar
    And Kullanici sonuclarin Nutella icerdigini test eder

  Scenario: TC02 kullanici amazonda Selenium aratir
    Then Kullanici Selenium icin arama yapar
    And Kullanici sonuclarin Selenium icerdigini test eder

  Scenario: TC02 kullanici amazonda iphone aratir
    Then Kullanici iphone icin arama yapar
    And Kullanici sonuclarin iphone icerdigini test eder
    And Kullanici sayfayi kapatir