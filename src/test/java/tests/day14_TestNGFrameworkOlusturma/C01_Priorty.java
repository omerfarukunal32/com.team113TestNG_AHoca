package tests.day14_TestNGFrameworkOlusturma;

import org.testng.annotations.Test;

public class C01_Priorty {
    /*
        JUnit framework'de testlerin calisma sirasi
        ONGORULEMEZ ve DUZENLENEMEZ

        TestNG testleri harf sirasina gore calistirir(ongorulebilir)

        Ayrica priority degeri girerek testleri istedigimiz sira ile calistirabiliriz
        (Kontrol edilebilir siralama)

        priorty sayisal olarak kucukten buyuge dogru testleri calistirir
        eger priorty degeri ayni olan birden fazla test varsa, yine harf sirasina bakar
     */

    @Test(groups = "minireg1")
    public void youtubeTesti(){
        System.out.println("YouTube");
    }

    @Test (priority = 3)
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }
    @Test(groups = {"smoke","minireg1"})
    public void amazonTesti(){   // priorty yazilmazsa 0 degeri alir
        System.out.println("Amazon");
    }
}
