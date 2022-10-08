Feature: Tutorial sepete urun ekleme

  Scenario: TC01 kullanici urunleri sepete ekleyebilmeli

//http://tutorialsninja.com/demo/index.php?route=common/home sayfasına gidiniz
    Given kullanici sayfaya gidebilmeli
    Then  Phones & PDAs'a tıklayınız
    And   Telefonların markalarını alınız
    And   Tüm öğeleri sepete ekleyiniz
    And   Sepete tıklayınız
    And   Sepetteki isimleri alınız
    And   Sepetteki ve sayfadaki ürünlerin doğru olduğunu karşılaştırınız
    And   Kullanici sayfayi kapatir
