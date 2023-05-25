package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Arrays;

public class C20_Ortak {

    @Test
    public void test01(){

        GooglePage googlePage = new GooglePage();
        // Google a gidin
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        // Cookies i kabul et
        googlePage.cookiesGoogle.click();

        // arama kutusuna Iphone yaz ve ara
        googlePage.AramaKutusuElement.sendKeys(ConfigReader.getProperty("googleAranacakKelime"));
        googlePage.AramaKutusuElement.submit();

        // cikan sonucu yazdir ve arama sonuclarinin 6 milyon dan fazla oldugunu test edin

        System.out.println(googlePage.sonucElement.getText());

        String[] kelimeler = googlePage.sonucElement.getText().split(" ");
        System.out.println(Arrays.toString(kelimeler));

        String aramaSonucuSayisi = kelimeler[1];
        aramaSonucuSayisi= aramaSonucuSayisi.replaceAll("\\W","");
        int aramaSonucuSayisi2= Integer.parseInt(aramaSonucuSayisi);
        System.out.println(aramaSonucuSayisi);


        Integer expectedSayi= Integer.parseInt(ConfigReader.getProperty("googleExpectedsayi"));
        System.out.println(expectedSayi);

        Assert.assertTrue(expectedSayi<aramaSonucuSayisi2);

    }
}
