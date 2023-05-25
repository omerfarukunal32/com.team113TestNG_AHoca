package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_QualitydemyNegatifLogin {
    @Test
    public void gecersizIsimSifreTesti(){
        //Qualitydemy ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        //log in linkine tiklayin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLogInLinki.click();
        //gecersiz username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        //login butonuna basarak
        qualitydemyPage.ilkLogInLinki.click();
        //giris yapilmadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());
        //sayfayi kapatin
        Driver.closeDriver();

    }
    @Test(groups = "smoke")
    public void gecersizIsimTesti(){
        //Qualitydemy ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        //log in linkine tiklayin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLogInLinki.click();
        //gecersiz username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        //login butonuna basarak
        qualitydemyPage.ilkLogInLinki.click();
        //giris yapilmadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());
        //sayfayi kapatin
        Driver.closeDriver();

    }
    @Test
    public void gecersizSifreTesti(){
        //Qualitydemy ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        //log in linkine tiklayin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLogInLinki.click();
        //gecersiz username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        //login butonuna basarak
        qualitydemyPage.ilkLogInLinki.click();
        //giris yapilmadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());
        //sayfayi kapatin
        Driver.closeDriver();

    }
}
