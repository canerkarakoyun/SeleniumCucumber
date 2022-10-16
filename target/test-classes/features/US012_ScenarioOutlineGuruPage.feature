Feature: US011 Class Work

  @guru
  Scenario Outline: TC01_Kullanici sutun basligi ile liste alabilmeli

    Given Kullanici "guruUrl" adresine gider
    Then Kullanici "<Basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | current Close (Rs) |
      | % Change           |

  Scenario: Kullanici sayfayi kapatir
    Given kulllanici sayfayi kapatir