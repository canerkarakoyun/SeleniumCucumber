@SOAll
Feature: US007 Scenario Outline Kullanimi

  Scenario Outline: TC01 configReader ile Scenario Outline kullanimi
    Given Kullanici "<arananUrl>" sayfasina gider
    Then 3 saniye bekler
    When Kullanici Url'in "<arananKelime>" icerdigini test eder
    And Kullanici sayfayi kapatir
    Examples:
      | arananUrl | arananKelime |
      | amazonUrl | amazon   |
      | faceUrl   | facebook |
      | brcUrl    | blue     |
      | google    | google   |



