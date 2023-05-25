package tests.day16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DriverClassSonHali {

    // 3 tane test methodu olusturalim
    // 1. method'da amazon'a gidip, url'in amazon icerdigini test edin
    @Test
    public void amazonTest(){
        //Driver.closeDriver();
        // eger driver'i acmadan kapatma ihtimaline binaen, closeDriver() methodunu if bady'sine aldik
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik = "amazon";
        String actualIcerik = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
        Driver.closeDriver();
    }

    // 2. method'da Wisequarter anasayfaya gidip, title'in wisequarter icerdigini test edin
    @Test
    public void wiseTest(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
        String expectedIcerik = "wisequarter";
        String actualIcerik = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
        Driver.closeDriver();
    }

    // 3. method'da facebook anasayfaya gidip, title'in facebook icerdigini test edin
    @Test
    public void facebookTest(){
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        String expectedIcerik = "facebook";
        String actualIcerik = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
        Driver.closeDriver();
    }

    // her method'da yeni driver olusturup, method sonunda driver'i kapatin
    // bu asamada Driver class daki closeDriver() methoduna gidip, driver'i null yaptik.
}
