package tests.day18_TestNGReports_ParalelCalistirma;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluAmazonSearch extends TestBaseRapor {
    // bir testin rapor verir hale getirmek icin once calismasi lazim
    // extentTest e deger atamak gerekli
    @Test
    public void test01(){
        extentTest = extentReports.createTest("Amazon arama Testi", "" +
                                                    "Kullanici istedigi kelimeyi aratabilmeli");
        // amazon'a gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl")); // bu satirda exeption vermez ise asagidaki satir calisir
        extentTest.info("Kullanici amazon anasayfaya gider");  // bu sebeple rapor u bu satira yaziyoruz

        // nutella icin arama yapin
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);
        extentTest.info("Arama kutusuna belirlenen aranacak kelimeyi yazar ve aratir");

        // arama sonuclarinin nutella icerdigini test edin
        String actualSonucYazisi =amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik = ConfigReader.getProperty("amazonExpectedIcerik");
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
        extentTest.pass("Belirlenen kelime '"+ConfigReader.getProperty("amazonAranacakKelime")+
                                "' aratildiginda, arama sonucunda expected icerik oldugu test edildi ");

        Driver.closeDriver();


    }
}
