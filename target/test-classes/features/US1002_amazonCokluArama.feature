Feature: US1002 Kullanici amazon ayasayfada birden fazla urun aratir

  Scenario: TC02 Kullanici urunleri aratip test edebilmeli

    Given kullanici amazon sayfasina gider
    Then amazon arama kutusuna Nutella yazip aratir
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir

    Given kullanici amazon sayfasina gider
    Then amazon arama kutusuna Java yazip aratir
    And arama sonuclarinin Java icerdigini test eder
    Then sayfayi kapatir

    Given kullanici amazon sayfasina gider
    Then amazon arama kutusuna Samsung yazip aratir
    And arama sonuclarinin Samsung icerdigini test eder
    Then sayfayi kapatir