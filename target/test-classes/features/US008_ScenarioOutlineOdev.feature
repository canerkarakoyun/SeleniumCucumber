Feature: US0087 Scenario Outline

  Scenario Outline: TC01 Kullanici gecersiz bilgilerle giris yapar
    Given "brcUrl" ana sayfasina git
    And 1 saniye bekle
    Then Login yazisina tikla
    And gecersiz "<username>" gir
    And 1 saniye bekle
    And gecersiz "<password>" girer
    And 1 saniye bekle
    And Login butonuna bas
    And 1 saniye bekle
    Then sayfaya giris yapilamadigini kontrol et
    And 1 saniye bekle
    And sayfayi kapat
    Examples:
      | username | password |
      | a@gmail.com | 134679 |
      | b@gmail.com | 134679 |
      | c@gmail.com | 134679 |
      | d@gmail.com | 134679 |
      | e@gmail.com | 134679 |
