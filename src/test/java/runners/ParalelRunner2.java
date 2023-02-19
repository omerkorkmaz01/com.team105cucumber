package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class ParalelRunner2 {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin={"html:target/cucumber-reports-p2.html",
                    "json:target/json-reports/cucumberp2.json",
                    "junit:target/xml-report/cucumberp2.xml"
            },
            features ="src/test/resources/features",
            glue = "stepdefinitions",
            tags = "@p2",
            dryRun = false
    )
    public class Runner {
    /*
    Cucumber'da Runner class'i bos bir class'tir
    Runner class'ini diger class'lardan farkli kilan
    ve TestNg'deki xml dosylari gibi calismasini saglayan
    2 adet notasyon mevcuttur

     @RunWith notasyonu projemize cucumber junit dependency eklememizin sebebidir
     bu sayede runner class'larimizi cucumber ile calisir

     @CucumberOptions rotasyonu ile istedigimiz ozellikleri Runner class'ina ekleyebiliriz
     Raporlama gibi ekstra option'lari da ileride ekleyecegiz
     Ancak
     oncelikle gorevi features dosyalari ile stepdefinitions'da bulunan
     Java method'larini ilisiklendirmektir

     tags : features classoru icerisinde yazilan tag(lari) aratip
     buldugu tum feature veya scenario'lari calistirir

     dryRun : iki deger alabilir
     true : secilirse, verilen tag ile isaretli olan Feature veya Scenario'daki
             eksik stepdefinitions'lari bulup
             ilgili method'lari olusturur
             Hic bir sekilde testimizi calistirmaz
             eksik adim yoksa test passed olarak isaretler

     false : secilirse, verilen tag ile isaretlenen
                Feature veya Scenario'lari calistirir
     */
    }
}
