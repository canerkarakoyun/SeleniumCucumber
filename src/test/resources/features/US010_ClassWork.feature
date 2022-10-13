Feature: US010 Class Work
  Scenario: TC01 Herokuapp add element testi
    Given "hrkUrl" adresine gidilir
    And Add Element butonuna basilir
    And Delete butonu gorununceye kadar bekleyin
    And Delete butonunun gorunur oldugunu test edin
    And 1 saniye bekler
    And Delete butonuna basarak butonu silin
    And 1 saniye bekler
    And Delete butonunun gorunmedigini test edin
    And Kullanici sayfayi kapatir