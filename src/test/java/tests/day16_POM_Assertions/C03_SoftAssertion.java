package tests.day16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_SoftAssertion {

    @Test
    public void hardAssertion(){
        /*
            Assert islemi ilk failed oldugunda
            Selenium calismayi durdurur
            ve  java.lang.AssertionError:   verir

            Eger bir test method'u icinde birden fazla assertion varsa
            ilk failed oldugunda calisma durur
            sonraki assertion'lar calismamis olur

            TestNG bu konuda da bize daha fazla kontrol yetkisi vermistir
            Istersek TestNg assertion failed olsa bile
            bizim istedigimiz satira kadar
            kodlarin calismaya devam etmesini saglar

            "artik rapor ver" dedigimizde ise
            failed olan tum assertion'lari raporlar
            ve failed olan varsa calismayi durdurur

         */

        int sayi = 23;

        Assert.assertTrue(sayi%2 ==0,"sayi cift sayi olmali"); // sayi cift sayi mi?

        Assert.assertTrue(sayi>100); // sayi 100'den buyuk mu?

        Assert.assertTrue(sayi<1000); // sayi 1000'den kucuk mu?

        Assert.assertFalse(sayi%3 == 0); // sayinin 3 ile bolunemedigini test edin

    }
    @Test
    public void softAssertionTesti(){
        /*
            SoftAssert class'i sayesinde
            assertAll()'nun calisacagi satira kadar
            failed olan olsa bile, tum assertion'lar calismaa devam eder.

            assertAll() calistiginda
            failed olan assertion'lara ait raporu verir
            ANCAK hangi satirda olduklarini vermez

            Selenium hata mesaji da assertAll()'un buldugu satiri isaret eder.

            Failed olan assertion'lari kolaylikla bulabilmemiz icin
         */
        int sayi = 36;

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(sayi%2 ==0,"sayi cift sayi olmali"); // sayi cift sayi mi?

        softAssert.assertTrue(sayi>100,"sayi 100'den buyuk olmali"); // sayi 100'den buyuk mu?

        softAssert.assertTrue(sayi<1000,"sayi 1000'den kucuk olmali"); // sayi 1000'den kucuk mu?

        softAssert.assertFalse(sayi%3 == 0, "sayi 3'e bolmemeli"); // sayinin 3 ile bolunemedigini test edin

        softAssert.assertAll();

        // softAssert objesi ile assertion'lari yaptiktan sonra
        // assertAll() kullanmazsaniz, test direk PASSED olur,
        // failed olan assertion'lar raprlanmaz

    }

}
