package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C01_PagesIlkTest {

    @Test
    public void amazonTest(){

        // amazon ana sayfaya gidelim
        Driver.getDriver().get("https://www.amazon.com");


        // Nutella icin arama yapalim
        // Arama kutusunun locate'i pages sayfasinda
        // POM'de pages sayfasindaki locate'lere erismek icin
        // pages sayfalarindan bir obje olusturulur.
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


        // sonuclarin Nutella icerdigini test edelim
        String expecredIcerik ="Nutella";
        String actualAramaSonucuElementi = amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucuElementi.contains(expecredIcerik));

        // sayfayi kapatalim
        Driver.closeDriver();

    }
}
