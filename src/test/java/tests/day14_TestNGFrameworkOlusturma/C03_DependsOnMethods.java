package tests.day14_TestNGFrameworkOlusturma;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_DependsOnMethods {
    /*
        DependsOnmethods oncelik sirasina karismaz

        dependsOnMethods bir test methodunun calismasini
        baska bir method'un calisip passed olmasina baglar

        baglanilan nethod calismaz ya da calisir ancak failed olursa
        baglanan method hic calismaz

        @Test notasyonu sayesinde her Test bagimsiz olarak calistirilabilir

        Ancak bir test dependsOnMethods ile baska bir method'a baglanmis ise
        tek basina calismasi istendiginde, once bagli oldugu test method'unu calistirir
        o method calisip passed olursa asil calistirmak istedigimiz method'da calisir

        Bu baglanti 3 veya daha fazla method arasinda olursa
        yani; calistirmak istedigimiz method baska bir method'a
        o da baska bir method'a bagli ise
        3'u birden calismaz
        "No tests were found" yazar ve hic bir test method'u calismaz
     */

    @Test(dependsOnMethods = "wiseTesti")
    public void youtubeTesti(){
        System.out.println("YouTube");

    }

    @Test (priority = 3)
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }
    @Test(dependsOnMethods = "youtubeTesti")
    public void amazonTesti(){   // priorty yazilmazsa 0 degeri alir
        System.out.println("Amazon");
    }

}
