package tests.day18_TestNGReports_ParalelCalistirma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_RaporluSoftAssert_bitmedi extends TestBaseRapor {
    @Test
    public void test01() throws InterruptedException {
        extentTest = extentReports.createTest("Alert test",
                "Kullanici JS Alert'leri calistirabilmeli ve kapatabilmeli");
        // 1. Test
        //            -  https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        Driver.getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");
        extentTest.info("Kullanici herokaupp alerts sayfasina gider");
        //            - 1.alert'e tiklayin
        Thread.sleep(3000);
        WebElement ilkAlertElementi = Driver.getDriver().findElement(By.xpath("//*[text()='Click for JS Alert']"));
        ilkAlertElementi.click();
        extentTest.info("Ilk alert butonuna click yapar");
        //            -  Alert'deki yazinin "I am a JS Alert" oldugunu test edin
        Thread.sleep(3000);
        String expectedAlertYazisi = "I am a JS Alert";
        String actualAlertYazisi = Driver.getDriver().switchTo().alert().getText();

        SoftAssert softAssert = new SoftAssert(); // softAssert objesi olusturduysan, hemen assertAll'u sayfa sonuna yaz
        extentTest.info("Softassert ile alert yazisinin beklenen degere sahip oldugunu test eder");
        softAssert.assertEquals(actualAlertYazisi,expectedAlertYazisi,"alert'teki yazi belirlenenden farkli");
        //Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);

        //            -  OK tusuna basip alert'i kapatin
        Driver.getDriver().switchTo().alert().accept();
        extentTest.info("Alert'i kapatir");

        // alert'in kapatildigini test edin

        //Assert.assertTrue(ilkAlertElementi.isEnabled());
        softAssert.assertTrue(ilkAlertElementi.isEnabled(),"allert kapatilamadi");
        extentTest.info("softassert ile alert'in kapatildigini  test eder");

        softAssert.assertAll();
        extentTest.pass("softassert ile yapilan tum testlerin sonucunu raporlar");
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }
}
