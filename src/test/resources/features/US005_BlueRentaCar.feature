@BrcAll
Feature: US1009 Blue Rent a Car Login

  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici "brcUrl" ana sayfasinda
    And kullanici 1 saniye bekler
    Then Login yazisina tiklar
    And gecersiz username girer
    And kullanici 1 saniye bekler
    And gecersiz password girer
    And kullanici 1 saniye bekler
    And Login butonuna basar
    And kullanici 1 saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici 1 saniye bekler
    And kulllanici sayfayi kapatir