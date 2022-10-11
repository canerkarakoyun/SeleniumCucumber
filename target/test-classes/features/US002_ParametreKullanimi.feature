@parametre
Feature: US002 PArametre Kullanimi

  Background:
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici amazonda parametreli arama yapar
    Then Kullanici "nutella" icin arama yapar
    And Kullanici sonuclarin "nutella" icerdigini test eder

  Scenario: TC02 Kullanici amazonda parametreli arama yapar
    Then Kullanici "selenium" icin arama yapar
    And Kullanici sonuclarin "selenium" icerdigini test eder


    # Feture dosyasinda parametreli kod yazdigimizda "" icine aldigimiz degeri stepDefinition'da
  # bir kere parametreli method olusturur ve yeni bir arama ypmak istedigimizde tekrar method
  # olusturmadan "" icerisinde belirttigimiz string ifadeyi Future'dan degistirmemiz yeterli olacaktir.
  # Bu sekilde kodlarimiz dinamik olacaktir.

  Scenario: TC03 Kullanici amazonda parametreli arama yapar
    Then Kullanici "java" icin arama yapar
    And Kullanici sonuclarin "java" icerdigini test eder


  Scenario: TC04 Kullanici amazonda parametreli arama yapar
    Then Kullanici "SQL" icin arama yapar
    And Kullanici sonuclarin "SQL" icerdigini test eder
    Then Kullanici sayfayi kapatir