Feature: US011 Class Work
  @guru
  Scenario: TC01_Kullanici sutun basligi ile liste alabilmeli

    Given Kullanici "guruUrl" adresine gider
    Then Kullanici "% Change" sutunundaki tum degerleri yazdirir