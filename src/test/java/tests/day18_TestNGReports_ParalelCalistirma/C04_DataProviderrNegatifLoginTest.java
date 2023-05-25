package tests.day18_TestNGReports_ParalelCalistirma;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_DataProviderrNegatifLoginTest {
    @DataProvider
    public static Object[][] YanlisKullaniciAdlariListesi() {
        String[][] kullaniciBilgileriArrayi = {{"Memre","12345"},{"Mustafa","234567"},
                                                {"Mustafa","455"},{"Ali","4587"},
                                                {"Leyla","852"},{"Kadir","951"},
                                                {"Uluhan","753"},{"Osman","943761"},
                                                {"Lili","94382"},{"Lulu","456982"}};
        return kullaniciBilgileriArrayi;
    }
    // verilen 10 kullanici bilgisi ile
    // sisteme giris yapilamadigini test edin


    @Test(dataProvider = "YanlisKullaniciAdlariListesi")
    public void gecersizIsimSifreTesti(String kullaniciAdi,String password) {
        //Qualitydemy ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        //log in linkine tiklayin

        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLogInLinki.click();
        //gecersiz username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(kullaniciAdi);
        qualitydemyPage.passwordKutusu.sendKeys(password);

        //login butonuna basarak
        qualitydemyPage.ilkLogInLinki.click();

        //giris yapilmadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());
        //sayfayi kapatin
        Driver.closeDriver();
    }
}
