Feature: US004 Parametre kullanimi
  @gp5
  Scenario: TC01 Parametre kullanimi
    Given Kullanici "https://trendyol.com" sayfasinda
    Then 3 saniye bekler
    When Kullanici Url'in "trend" icerdigini test eder
    And Kullanici sayfayi kapatir