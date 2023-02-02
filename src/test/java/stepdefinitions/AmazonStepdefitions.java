package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v104.input.model.DragData;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_anasayfaya_gider(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("amazon arama kutusuna Nutella yazip aratir")
    public void amazon_arama_kutusuna_Nutella_yazip_aratir() {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @And("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_Nutella_icerdigini_test_eder() {
        String actualAramaSonuc= amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Nutella";

        Assert.assertTrue(actualAramaSonuc.contains(expectedKelime));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
    @Then("amazon arama kutusuna Java yazip aratir")
    public void amazonAramaKutusunaJavaYazipAratir() {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);
    }
    @And("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String actualAramaSonuc= amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Java";

        Assert.assertTrue(actualAramaSonuc.contains(expectedKelime));
    }
    @Then("amazon arama kutusuna Samsung yazip aratir")
    public void amazon_arama_kutusuna_samsung_yazip_aratir() {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Samsung" + Keys.ENTER);

    }
    @Then("arama sonuclarinin Samsung icerdigini test eder")
    public void arama_sonuclarinin_samsung_icerdigini_test_eder() {
    String actualAramaSonuc= amazonPage.aramaSonucuElementi.getText();
    String expectedKelime="Samsung";

    Assert.assertTrue(actualAramaSonuc.contains(expectedKelime));

    }

    @Then("amazon arama kutusuna {string} yazip aratir")
    public void amazonAramaKutusunaYazipAratir(String aranacakKelime) {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);

    }

    @And("arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String arananKelime) {
        String actualAramaSonuc= amazonPage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualAramaSonuc.contains(arananKelime));

    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int arg0) {
    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("url de {string} oldugunu test eder")
    public void urlDeOldugunuTestEder(String arananKelime) {
        String actualUrl= Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(arananKelime));
    }
}
