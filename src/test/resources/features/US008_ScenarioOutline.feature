Feature: US0087 Scenario Outline

  Scenario Outline: TC01 Kullanici gecersiz bilgilerle giris yapar
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