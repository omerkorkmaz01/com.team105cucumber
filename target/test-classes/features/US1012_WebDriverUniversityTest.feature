Feature: US1012 Window Testi

  Scenario: TC17 Kullanici yeni acilan window'u test edebilmeli

    Given kullanici "wduUrl" anasayfaya gider
    Then Login portal elementine kadar asagı iner
    And Login portal a tiklar
    Then Acilan yeni window a tiklar
    And username kutusuna deger yazar
    And password kutusuna deger yazar
    Then webuniversity login butonuna basar
    And Popup ta cikan yazinin validation failed oldugunu test eder
    And OK diyerek popup i kapatir
    Then ilk sayfaya geri doner
    And ilk sayfaya dondugunu test eder
    And acilan tum sayfalari kapatir
