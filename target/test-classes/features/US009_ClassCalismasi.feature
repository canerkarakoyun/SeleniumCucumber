Feature: US009 Class calismasi

  Scenario Outline: TC01 Class calismasi
    Given Kullanici "dtTableUrl" adresine gider
    And kullanici new butonuna basar
    And Kullanici isim icin "<firstName>" girer
    And 1 saniye bekler
    And Kullanici soyisim icin "<lastName>" girer
    And 1 saniye bekler
    And Kullanici pozisyon icin "<position>" girer
    And 1 saniye bekler
    And Kullanici ofis bilgisi icin "<office>" girer
    And 1 saniye bekler
    And Kullanici extention icin "<extension>" girer
    And 1 saniye bekler
    And Kullanici baslangic tarihi "<startDate>" girer
    And 1 saniye bekler
    And Kullanici ucret bilgisi "<salary>" girer
    And 1 saniye bekler
    And Kullanici Create tusuna basar
    And 1 saniye bekler
    And Kullanici "<firstName>" ile arama yapar
    And 1 saniye bekler
    And Kullanici isim bolumunde "<firstName>" oldugunu dogrular
    And 1 saniye bekler
    And Kullanici sayfayi kapatirr
    Examples:
      | firstName | lastName | position | office   | extension | startDate  | salary |
      | Ali       | Veli     | QA       | Google   | Senior    | 2022-02-20 | 15000  |
      | Ahmet     | Mehmet   | QA       | Google   | Junior    | 2021-01-10 | 10500  |
      | Hasan     | Duman    | Dev      | Amazon   | Junior    | 2020-11-12 | 25000  |
      | Akin      | Alkan    | Dev      | Amazon   | Senior    | 2009-05-12 | 50000  |
      | Orhan     | Duman    | PO       | WallMart | Senior    | 2006-06-06 | 30000  |


    # Kullanici 5 farkli kullanici bilgisi girer