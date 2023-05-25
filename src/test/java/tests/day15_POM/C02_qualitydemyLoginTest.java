package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C02_qualitydemyLoginTest {

    @Test(groups = "smoke")
    public void test01(){

        // qualitydemy anasayfaya gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        // Login linkine tiklayin
        qualitydemyPage.ilkLogInLinki.click();

        // gecerli username ve sifre'yi yazin
        // qdGecerliUsername = anevzatcelik@gmail.com
        //qdGecerliPassword = Nevzat152032
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");
        // login butonuna basin
        qualitydemyPage.ikinciLogin.click();

        // basarili olarak giris yapildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed());

        // sayfayi kapatin
        Driver.closeDriver();

    }
}
