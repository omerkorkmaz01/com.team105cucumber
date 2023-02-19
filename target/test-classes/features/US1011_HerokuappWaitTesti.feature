Feature: US1011 Kullanici herokuapp sayfasinda butonlarin gorunur oldugunu test eder

  Scenario: TC16 kullanici bekleyerek butonlarin gorunur olmasini saglamali
    
    Given kullanici "herokuappUrl" anasayfaya gider
    Then Add element butonuna basar
    And Delete butonu gorunur oluncaya kadar bekler
    And Delete butonun gorunur oldugunu test eder
    Then Delete butonuna basarak butonu siler
    And Delete butonunun  gorunmedigini test eder
